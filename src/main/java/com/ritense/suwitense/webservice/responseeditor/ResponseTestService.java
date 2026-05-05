package com.ritense.suwitense.webservice.responseeditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * Fires a SOAP request against the simulator's own {@code /ws/...} endpoints and reports back
 * what came out, optionally diffed against the expected response file on disk.
 *
 * <p>The service does an in-process loopback HTTP call (rather than invoking the endpoint bean
 * directly) so that the entire WS stack runs — including the message dispatcher, the
 * {@link org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor},
 * security, and JAXB marshalling. That's the whole point of the test: verify the round-trip,
 * not just the file contents.
 */
@Service
public class ResponseTestService {

    private static final Logger logger = LoggerFactory.getLogger(ResponseTestService.class);

    private static final String SOAP_NS = "http://schemas.xmlsoap.org/soap/envelope/";

    private final ServiceCatalog catalog;
    private final ResponseFileService fileService;
    private final HttpClient http;
    private final XmlCanonicalizer canonicalizer;
    private final DocumentBuilderFactory builderFactory;

    private final String username;
    private final String password;
    private final int port;

    public ResponseTestService(
            ServiceCatalog catalog,
            ResponseFileService fileService,
            @Value("${simulator.username}") String username,
            @Value("${simulator.password}") String password,
            @Value("${server.port:8090}") int port) {
        this.catalog = catalog;
        this.fileService = fileService;
        this.username = username;
        this.password = password;
        this.port = port;
        this.canonicalizer = new XmlCanonicalizer();
        this.builderFactory = SecureXml.hardenedDocumentBuilderFactory();
        this.http = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .authenticator(new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password.toCharArray());
                    }
                })
                .build();
    }

    public List<ServiceCatalog.Operation> catalog() {
        return catalog.all();
    }

    /**
     * Send one SOAP request to the simulator and return what came back.
     *
     * @param dienst        e.g. {@code "UWVDossierInkomstenGSD"}
     * @param operatie      e.g. {@code "UWVPersoonsIkvInfo"}
     * @param keyValues     parts of the lookup key, in the order declared by the catalog
     *                      (single BSN, single kenteken, or [gemeente, perceelnr] for kadaster)
     * @param compareToFile when true, find the matching XML file on disk and diff it against
     *                      the response body
     */
    public TestResult test(String dienst, String operatie, List<String> keyValues, boolean compareToFile) {
        ServiceCatalog.Operation op = catalog.find(dienst, operatie)
                .orElseThrow(() -> new ApiException(400, "Unknown service operation: " + dienst + "/" + operatie));

        if (keyValues == null || keyValues.size() != op.keys().size()) {
            throw new ApiException(400, "Operation " + op.dienst() + "/" + op.operatie()
                    + " expects " + op.keys().size() + " key parts, got "
                    + (keyValues == null ? 0 : keyValues.size()));
        }
        for (String v : keyValues) {
            if (v == null || v.isBlank()) {
                throw new ApiException(400, "Empty key value not allowed");
            }
        }

        String envelope = buildEnvelope(op, keyValues);
        URI uri = URI.create("http://localhost:" + port + op.endpointPath());

        long t0 = System.nanoTime();
        HttpResponse<String> resp;
        try {
            HttpRequest req = HttpRequest.newBuilder(uri)
                    .timeout(Duration.ofSeconds(15))
                    .header("Content-Type", "text/xml; charset=utf-8")
                    .header("SOAPAction", "\"\"")
                    .header("Authorization", basicAuth())
                    .POST(HttpRequest.BodyPublishers.ofString(envelope, StandardCharsets.UTF_8))
                    .build();
            resp = http.send(req, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        } catch (Exception e) {
            logger.warn("Test call to {} failed: {}", uri, e.getMessage());
            return TestResult.transportFailure(op, keyValues, e.getMessage(), durationMs(t0));
        }

        long durationMs = durationMs(t0);
        String body = resp.body() == null ? "" : resp.body();
        Optional<String> innerOpt = extractSoapBodyChild(body);

        if (resp.statusCode() >= 400 || innerOpt.isEmpty()) {
            return TestResult.httpFailure(op, keyValues, resp.statusCode(), body, durationMs);
        }

        String inner = innerOpt.get();
        boolean nietGevonden = isNietsGevonden(inner);

        String expectedFilename = op.filenameFor(keyValues);
        String expectedXml = null;
        String expectedCanonical = null;
        String actualCanonical;
        try {
            actualCanonical = canonicalizer.canonicalize(inner);
        } catch (Exception e) {
            logger.warn("Canonicalize actual failed: {}", e.getMessage());
            actualCanonical = inner; // fall back to raw
        }

        boolean fileExists = false;
        Boolean match = null;
        if (compareToFile && !nietGevonden) {
            try {
                expectedXml = fileService.read(expectedFilename);
                fileExists = true;
                expectedCanonical = canonicalizer.canonicalize(expectedXml);
                match = canonicalEquals(expectedCanonical, actualCanonical);
            } catch (ResponseFileService.ResponseFileNotFoundException nf) {
                fileExists = false;
            } catch (Exception e) {
                logger.warn("Canonicalize expected failed for {}: {}", expectedFilename, e.getMessage());
            }
        }

        return new TestResult(
                op.dienst(), op.operatie(), keyValues,
                resp.statusCode(),
                durationMs,
                /* outcome */ deriveOutcome(nietGevonden, match, fileExists, compareToFile),
                /* nietGevonden */ nietGevonden,
                /* expectedFile */ expectedFilename,
                /* expectedFileExists */ fileExists,
                /* match */ match,
                /* actualXml */ actualCanonical,
                /* expectedXml */ expectedCanonical,
                /* requestEnvelope */ envelope,
                /* errorMessage */ null
        );
    }

    /**
     * Run every BSN-keyed operation in the catalog for one BSN. Used by the "Test alle diensten"
     * button on the person-detail. Operations execute sequentially so the simulator isn't
     * hammered, but the duration is bounded by the per-call HTTP timeout.
     */
    public List<TestResult> testAllForBsn(String bsn, boolean compareToFile) {
        if (bsn == null || bsn.isBlank()) {
            throw new ApiException(400, "BSN is required");
        }
        return catalog.bsnOperations().stream()
                .map(op -> test(op.dienst(), op.operatie(), List.of(bsn), compareToFile))
                .toList();
    }

    /* ---------- internals ---------- */

    private String basicAuth() {
        String token = username + ":" + password;
        return "Basic " + Base64.getEncoder().encodeToString(token.getBytes(StandardCharsets.UTF_8));
    }

    private long durationMs(long t0) {
        return (System.nanoTime() - t0) / 1_000_000L;
    }

    private String buildEnvelope(ServiceCatalog.Operation op, List<String> keyValues) {
        StringBuilder sb = new StringBuilder(512);
        sb.append("<soap:Envelope xmlns:soap=\"").append(SOAP_NS).append("\">");
        sb.append("<soap:Body>");
        sb.append("<ns:").append(op.operatie()).append(" xmlns:ns=\"").append(op.namespace()).append("\">");
        for (int i = 0; i < op.keys().size(); i++) {
            ServiceCatalog.KeyField kf = op.keys().get(i);
            sb.append('<').append(kf.elementName()).append('>');
            sb.append(escape(keyValues.get(i)));
            sb.append("</").append(kf.elementName()).append('>');
        }
        sb.append("</ns:").append(op.operatie()).append('>');
        sb.append("</soap:Body>");
        sb.append("</soap:Envelope>");
        return sb.toString();
    }

    private static String escape(String v) {
        return v.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }

    /**
     * Pull the first element child of the SOAP {@code <Body>} out of the response.
     */
    private Optional<String> extractSoapBodyChild(String soapEnvelope) {
        try {
            DocumentBuilder b = builderFactory.newDocumentBuilder();
            Document doc = b.parse(new InputSource(new StringReader(soapEnvelope)));
            Element envelope = doc.getDocumentElement();
            if (envelope == null) return Optional.empty();
            Element body = findFirstChild(envelope, "Body");
            if (body == null) return Optional.empty();
            Element bodyChild = firstElementChild(body);
            if (bodyChild == null) return Optional.empty();
            return Optional.of(serializeNode(bodyChild));
        } catch (Exception e) {
            logger.debug("extractSoapBodyChild failed: {}", e.getMessage());
            return Optional.empty();
        }
    }

    private Element findFirstChild(Element parent, String localName) {
        NodeList kids = parent.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            Node n = kids.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                String ln = n.getLocalName() != null ? n.getLocalName() : n.getNodeName();
                if (localName.equals(ln)) return (Element) n;
            }
        }
        return null;
    }

    private Element firstElementChild(Element parent) {
        NodeList kids = parent.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            Node n = kids.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) return (Element) n;
        }
        return null;
    }

    private String serializeNode(Node node) throws Exception {
        javax.xml.transform.Transformer t = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(javax.xml.transform.OutputKeys.OMIT_XML_DECLARATION, "yes");
        java.io.StringWriter sw = new java.io.StringWriter();
        t.transform(new javax.xml.transform.dom.DOMSource(node), new javax.xml.transform.stream.StreamResult(sw));
        return sw.toString();
    }

    private boolean isNietsGevonden(String responseXml) {
        // Empty Response with a single <NietsGevonden> child is the simulator's "not found" signal.
        // Lowercase check covers both <NietsGevonden> and <ns:NietsGevonden> variants.
        return responseXml != null
                && responseXml.toLowerCase(Locale.ROOT).contains("nietsgevonden");
    }

    private boolean canonicalEquals(String a, String b) {
        if (a == null || b == null) return false;
        return a.equals(b);
    }

    private TestResult.Outcome deriveOutcome(
            boolean nietGevonden, Boolean match, boolean fileExists, boolean compareRequested) {
        if (nietGevonden) return TestResult.Outcome.NIET_GEVONDEN;
        if (!compareRequested) return TestResult.Outcome.OK;
        if (!fileExists) return TestResult.Outcome.NO_EXPECTED_FILE;
        if (Boolean.TRUE.equals(match)) return TestResult.Outcome.MATCH;
        return TestResult.Outcome.MISMATCH;
    }
}
