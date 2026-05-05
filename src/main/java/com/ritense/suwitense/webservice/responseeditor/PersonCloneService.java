package com.ritense.suwitense.webservice.responseeditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonCloneService {

    private static final Logger logger = LoggerFactory.getLogger(PersonCloneService.class);

    /** Street names cycled across historical addresses. */
    private static final String[] HIST_STREETS = { "Kerkstraat", "Dorpstraat", "Schoolstraat" };

    private final ResponseFileService responseFileService;
    private final DocumentBuilderFactory builderFactory;
    private final TransformerFactory transformerFactory;

    public PersonCloneService(ResponseFileService responseFileService) {
        this.responseFileService = responseFileService;
        this.builderFactory = SecureXml.hardenedDocumentBuilderFactory();
        this.transformerFactory = TransformerFactory.newInstance();
    }

    public CloneResult clone(CloneRequest req) throws IOException {
        validate(req);

        Path baseDir = responseFileService.baseDir();
        List<Path> sourceFiles = findSourceFiles(baseDir, req.sourceBsn(), req.includeFiles());

        // Determine target filenames first so we can detect conflicts up-front.
        record Mapping(Path source, Path target, String filename) {}
        List<Mapping> mappings = new ArrayList<>();
        List<String> conflicts = new ArrayList<>();
        for (Path src : sourceFiles) {
            String newName = src.getFileName().toString().replace(req.sourceBsn(), req.targetBsn());
            Path tgt = baseDir.resolve(newName);
            mappings.add(new Mapping(src, tgt, newName));
            if (Files.exists(tgt)) {
                conflicts.add(newName);
            }
        }

        if (!conflicts.isEmpty() && req.conflictMode() == CloneRequest.ConflictMode.ABORT) {
            throw new ConflictException(conflicts);
        }

        List<String> created = new ArrayList<>();
        List<String> overwritten = new ArrayList<>();
        List<String> skipped = new ArrayList<>();
        List<CloneResult.FileError> errors = new ArrayList<>();

        for (Mapping m : mappings) {
            try {
                if (Files.exists(m.target())) {
                    if (req.conflictMode() == CloneRequest.ConflictMode.SKIP) {
                        skipped.add(m.filename());
                        continue;
                    }
                    overwritten.add(m.filename());
                } else {
                    created.add(m.filename());
                }
                processFile(m.source(), m.target(), req);
            } catch (Exception e) {
                logger.warn("Clone failed for {}: {}", m.filename(), e.getMessage());
                errors.add(new CloneResult.FileError(m.filename(), e.getMessage()));
            }
        }

        return new CloneResult(created, overwritten, skipped, errors);
    }

    private void validate(CloneRequest req) {
        if (req.sourceBsn() == null || req.sourceBsn().isBlank()) {
            throw new IllegalArgumentException("sourceBsn is required");
        }
        if (req.targetBsn() == null || !BsnUtil.isValid(req.targetBsn())) {
            throw new IllegalArgumentException("targetBsn is missing or fails the elfproef");
        }
        if (req.targetBsn().equals(req.sourceBsn())) {
            throw new IllegalArgumentException("targetBsn must differ from sourceBsn");
        }
        if (req.newAddress() == null) {
            throw new IllegalArgumentException("newAddress is required");
        }
        if (req.conflictMode() == null) {
            throw new IllegalArgumentException("conflictMode is required");
        }
    }

    private List<Path> findSourceFiles(Path baseDir, String sourceBsn, List<String> includeFiles) throws IOException {
        try (var stream = Files.list(baseDir)) {
            return stream
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().contains("_" + sourceBsn))
                    .filter(p -> includeFiles == null || includeFiles.isEmpty()
                            || includeFiles.contains(p.getFileName().toString()))
                    .toList();
        }
    }

    private void processFile(Path source, Path target, CloneRequest req) throws Exception {
        Document doc = parse(source);
        Element root = doc.getDocumentElement();
        Element clientSuwi = findClientSuwi(root);

        // Replace BSN everywhere it equals sourceBsn (up the whole tree, including comments references avoided).
        replaceBsn(root, req.sourceBsn(), req.targetBsn());

        // Replace persoon-level fields (skip into sub-entity containers handled by walkers).
        if (clientSuwi != null) {
            // Optional name & A-nr changes (persoon-level only)
            if (req.newName() != null) {
                replacePersoonText(clientSuwi, "Voornamen", req.newName().voornamen());
                replacePersoonText(clientSuwi, "Voorvoegsel", req.newName().voorvoegsel());
                replacePersoonText(clientSuwi, "SignificantDeelVanDeAchternaam", req.newName().achternaam());
            }
            if (req.newAnr() != null && !req.newAnr().isBlank()) {
                replacePersoonText(clientSuwi, "ANr", req.newAnr());
            }

            // Current address: every "address-like" container that's NOT inside a sub-entity or VerblijfplaatsHistorisch.
            applyCurrentAddress(clientSuwi, req.newAddress());

            // Replace gemeente codes wherever they appear at persoon-level (also covers AangifteAdreshoudingBrp).
            replacePersoonText(clientSuwi, "CdGemeenteVanInschrijving", req.newAddress().gemeentecode());

            // Historical addresses (BRP-specific, but harmless if missing elsewhere).
            applyHistoricalAddresses(clientSuwi, req.newAddress());
        }

        writeAtomically(doc, target);
    }

    private Element findClientSuwi(Element root) {
        // ClientSuwi is typically the only child of the response root.
        NodeList kids = root.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            Node n = kids.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE && "ClientSuwi".equals(((Element) n).getLocalName())) {
                return (Element) n;
            }
        }
        // Fall back to root itself.
        return root;
    }

    /** Replace text content of any &lt;Burgerservicenr&gt; whose text equals sourceBsn, anywhere in the doc. */
    private void replaceBsn(Node node, String sourceBsn, String targetBsn) {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element el = (Element) node;
            if ("Burgerservicenr".equals(el.getLocalName()) && sourceBsn.equals(el.getTextContent().trim())) {
                setText(el, targetBsn);
            }
        }
        NodeList kids = node.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            replaceBsn(kids.item(i), sourceBsn, targetBsn);
        }
    }

    /**
     * Set the text content of every direct or indirect child with the given local name,
     * skipping subtrees inside sub-entity containers and inside VerblijfplaatsHistorisch.
     */
    private void replacePersoonText(Element start, String localName, String value) {
        if (value == null) return;
        walkSkippingSubEntities(start, true, el -> {
            if (localName.equals(el.getLocalName())) {
                setText(el, value);
            }
        });
    }

    /**
     * Apply the new current address everywhere outside historical/sub-entity blocks: replace
     * Postcd, Woonplaatsnaam, Straatnaam, Huisnr, NaamOpenbareRuimte, Gemeentenaam.
     */
    private void applyCurrentAddress(Element start, CloneRequest.AddressSpec addr) {
        walkSkippingSubEntities(start, true, el -> {
            String name = el.getLocalName();
            switch (name) {
                case "Postcd" -> setText(el, addr.postcd());
                case "Woonplaatsnaam" -> setText(el, addr.woonplaatsnaam());
                case "Gemeentenaam" -> setText(el, addr.woonplaatsnaam());
                case "Straatnaam" -> setText(el, addr.straatnaam());
                case "NaamOpenbareRuimte" -> setText(el, addr.straatnaam());
                case "Huisnr" -> setText(el, addr.huisnr());
                default -> { /* no-op */ }
            }
        });
    }

    /**
     * For each VerblijfplaatsHistorisch descendant of ClientSuwi, replace its address fields
     * with the new city values but with a cycled street and postcode-letter pair (AA, BB, CC...).
     */
    private void applyHistoricalAddresses(Element clientSuwi, CloneRequest.AddressSpec addr) {
        List<Element> hist = findChildren(clientSuwi, "VerblijfplaatsHistorisch");
        String digits = addr.postcd() != null && addr.postcd().length() >= 4
                ? addr.postcd().substring(0, 4)
                : "0000";
        for (int i = 0; i < hist.size(); i++) {
            Element h = hist.get(i);
            String street = HIST_STREETS[i % HIST_STREETS.length];
            char letter = (char) ('A' + (i % 26));
            String letters = "" + letter + letter;
            String pc = digits + letters;

            walkSkippingSubEntities(h, false, el -> {
                String name = el.getLocalName();
                switch (name) {
                    case "Postcd" -> setText(el, pc);
                    case "Woonplaatsnaam", "Gemeentenaam" -> setText(el, addr.woonplaatsnaam());
                    case "Straatnaam", "NaamOpenbareRuimte" -> setText(el, street);
                    case "CdGemeenteVanInschrijving" -> setText(el, addr.gemeentecode());
                    default -> { /* no-op; huisnr stays */ }
                }
            });
        }
    }

    private List<Element> findChildren(Element parent, String localName) {
        List<Element> out = new ArrayList<>();
        NodeList kids = parent.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            Node n = kids.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE && localName.equals(((Element) n).getLocalName())) {
                out.add((Element) n);
            }
        }
        return out;
    }

    /**
     * Walk the subtree rooted at start, invoking the visitor on each Element.
     * Skips descending into SUB_ENTITY_CONTAINERS, and (when skipHistorical=true) into VerblijfplaatsHistorisch.
     */
    private void walkSkippingSubEntities(Element start, boolean skipHistorical,
                                          java.util.function.Consumer<Element> visitor) {
        visitor.accept(start);
        NodeList kids = start.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            Node n = kids.item(i);
            if (n.getNodeType() != Node.ELEMENT_NODE) continue;
            Element child = (Element) n;
            String name = child.getLocalName();
            if (SuwiSubEntities.MUTATION.contains(name)) continue;
            if (skipHistorical && "VerblijfplaatsHistorisch".equals(name)) continue;
            walkSkippingSubEntities(child, skipHistorical, visitor);
        }
    }

    private void setText(Element el, String value) {
        // Remove existing children, then append a single text node.
        while (el.getFirstChild() != null) el.removeChild(el.getFirstChild());
        if (value != null) {
            el.appendChild(el.getOwnerDocument().createTextNode(value));
        }
    }

    private Document parse(Path file) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        try (var in = Files.newInputStream(file)) {
            return builder.parse(new InputSource(in));
        }
    }

    private void writeAtomically(Document doc, Path target) throws IOException, TransformerException {
        // Remove whitespace-only text nodes so the indenting transformer can produce clean output.
        stripWhitespace(doc.getDocumentElement());
        Transformer t = transformerFactory.newTransformer();
        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        StringWriter sw = new StringWriter();
        t.transform(new DOMSource(doc), new StreamResult(sw));
        byte[] bytes = sw.toString().getBytes(StandardCharsets.UTF_8);
        Path tmp = target.resolveSibling(target.getFileName() + ".tmp");
        Files.write(tmp, bytes);
        Files.move(tmp, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    }

    private void stripWhitespace(Node node) {
        NodeList kids = node.getChildNodes();
        // Iterate from the back so removals don't disturb the indices.
        for (int i = kids.getLength() - 1; i >= 0; i--) {
            Node child = kids.item(i);
            if (child.getNodeType() == Node.TEXT_NODE && child.getNodeValue().trim().isEmpty()) {
                node.removeChild(child);
            } else if (child.getNodeType() == Node.ELEMENT_NODE) {
                stripWhitespace(child);
            }
        }
    }

    public static class ConflictException extends RuntimeException {
        private final List<String> conflicts;
        public ConflictException(List<String> conflicts) {
            super("Conflicts: " + conflicts);
            this.conflicts = conflicts;
        }
        public List<String> conflicts() { return conflicts; }
    }
}
