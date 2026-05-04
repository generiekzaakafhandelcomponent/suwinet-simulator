package com.ritense.suwitense.webservice.responseeditor;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

@Service
public class ResponseFileService {

    private static final Logger logger = LoggerFactory.getLogger(ResponseFileService.class);

    /**
     * Element names we surface as columns in the index. First match wins per file.
     * Lower-cased for case-insensitive matching.
     */
    private static final Set<String> METADATA_FIELDS = Set.of(
            "burgerservicenr",
            "voornamen",
            "voorletters",
            "voorvoegsel",
            "significantdeelvandeachternaam",
            "geboortedat",
            "geslacht",
            "postcd",
            "woonplaatsnaam",
            "straatnaam",
            "huisnr",
            "kentekenvoertuig",
            "merkvoertuig",
            "cdkadastralegemeente",
            "kadastraalperceelnr"
    );

    /**
     * Sub-entity containers we do NOT descend into for index metadata extraction.
     * These represent OTHER persons or entities (employer, partner, child, parent,
     * historical address, ...) — their fields would otherwise leak into the
     * index columns of the queried persoon and be misleading.
     */
    private static final Set<String> SUB_ENTITY_CONTAINERS = Set.of(
            "Inkomstenverhouding",
            "Partner",
            "PartnerAanvraagUitkering",
            "Kind",
            "Ouder1",
            "Ouder2",
            "Huwelijk",
            "PersoonAdministratieveEenheid",
            "RechtspersoonAdministratieveEenh",
            "AdministratieveEenheid",
            "Aansprakelijke",
            "VerblijfplaatsHistorisch",
            "AanvraagUitkering",
            "BeslissingOpAanvraagUitkering",
            "Eigendom",
            "OnroerendeZaak"
    );

    private final Path baseDir;
    private final DocumentBuilderFactory documentBuilderFactory;

    public ResponseFileService(@Value("${simulator.responses.path}") String responsesPath) {
        this.baseDir = Paths.get(responsesPath).toAbsolutePath().normalize();
        this.documentBuilderFactory = DocumentBuilderFactory.newInstance();
        this.documentBuilderFactory.setNamespaceAware(true);
        try {
            this.documentBuilderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            this.documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (ParserConfigurationException e) {
            logger.warn("Could not harden XML parser: {}", e.getMessage());
        }
    }

    @PostConstruct
    void logConfig() {
        logger.info("ResponseFileService base dir: {} (exists={})", baseDir, Files.isDirectory(baseDir));
    }

    public Path baseDir() {
        return baseDir;
    }

    public List<ResponseFile> list() throws IOException {
        if (!Files.isDirectory(baseDir)) {
            return List.of();
        }
        List<Path> all;
        try (Stream<Path> stream = Files.list(baseDir)) {
            all = stream
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".xml"))
                    .toList();
        }
        Map<String, String> brpNames = buildBrpNameLookup(all);
        return all.stream()
                .map(p -> summarize(p, brpNames))
                .sorted((a, b) -> a.filename().compareToIgnoreCase(b.filename()))
                .toList();
    }

    private Map<String, String> buildBrpNameLookup(List<Path> files) {
        Map<String, String> map = new HashMap<>();
        for (Path p : files) {
            String name = p.getFileName().toString();
            if (!name.startsWith("BRPDossierPersoonGSD_AanvraagPersoon_")) continue;
            try {
                Map<String, String> meta = extractMetadata(p);
                String bsn = meta.get("burgerservicenr");
                if (bsn == null || bsn.isBlank()) continue;
                String full = formatPersonName(meta);
                if (!full.isBlank()) {
                    map.put(bsn, full);
                }
            } catch (Exception e) {
                logger.debug("BRP name lookup failed for {}: {}", name, e.getMessage());
            }
        }
        return map;
    }

    private static String formatPersonName(Map<String, String> meta) {
        String first = meta.getOrDefault("voornamen", meta.getOrDefault("voorletters", ""));
        String tussen = meta.getOrDefault("voorvoegsel", "");
        String last = meta.getOrDefault("significantdeelvandeachternaam", "");
        StringBuilder sb = new StringBuilder();
        if (!first.isBlank()) sb.append(first);
        if (!tussen.isBlank()) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(tussen);
        }
        if (!last.isBlank()) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(last);
        }
        return sb.toString().trim();
    }

    public String read(String filename) throws IOException {
        Path file = resolveSafe(filename);
        if (!Files.isRegularFile(file)) {
            throw new ResponseFileNotFoundException(filename);
        }
        return Files.readString(file, StandardCharsets.UTF_8);
    }

    public void write(String filename, String xml) throws IOException {
        if (xml == null || xml.isBlank()) {
            throw new InvalidXmlException("Empty payload");
        }
        validateWellFormed(xml);
        Path file = resolveSafe(filename);
        if (!Files.isRegularFile(file)) {
            throw new ResponseFileNotFoundException(filename);
        }
        Path tmp = file.resolveSibling(file.getFileName() + ".tmp");
        Files.writeString(tmp, xml, StandardCharsets.UTF_8);
        Files.move(tmp, file, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    }

    public void create(String filename, String xml) throws IOException {
        if (xml == null || xml.isBlank()) {
            throw new InvalidXmlException("Empty payload");
        }
        validateWellFormed(xml);
        Path file = resolveSafe(filename);
        if (Files.exists(file)) {
            throw new ResponseFileExistsException(filename);
        }
        Path tmp = file.resolveSibling(file.getFileName() + ".tmp");
        Files.writeString(tmp, xml, StandardCharsets.UTF_8);
        Files.move(tmp, file, StandardCopyOption.ATOMIC_MOVE);
    }

    private Path resolveSafe(String filename) {
        if (filename == null || filename.isBlank()) {
            throw new IllegalArgumentException("filename required");
        }
        if (filename.contains("/") || filename.contains("\\") || filename.contains("..")) {
            throw new IllegalArgumentException("Invalid filename: " + filename);
        }
        Path resolved = baseDir.resolve(filename).normalize();
        if (!resolved.startsWith(baseDir)) {
            throw new IllegalArgumentException("Path escapes base directory");
        }
        return resolved;
    }

    private ResponseFile summarize(Path path, Map<String, String> brpNames) {
        String filename = path.getFileName().toString();
        ParsedName parsed = parseFilename(filename);
        Map<String, String> metadata;
        try {
            metadata = new LinkedHashMap<>(extractMetadata(path));
        } catch (Exception e) {
            logger.debug("Could not parse {}: {}", filename, e.getMessage());
            metadata = new LinkedHashMap<>();
            metadata.put("_error", e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage());
        }
        boolean hasOwnName = metadata.containsKey("voornamen")
                || metadata.containsKey("voorletters")
                || metadata.containsKey("significantdeelvandeachternaam");
        if (!hasOwnName) {
            String bsn = metadata.get("burgerservicenr");
            if (bsn != null) {
                String borrowed = brpNames.get(bsn);
                if (borrowed != null) {
                    metadata.put("naam_uit_brp", borrowed);
                }
            }
        }
        return new ResponseFile(
                filename,
                parsed.dienst,
                parsed.operatie,
                parsed.sleutel,
                parsed.isRequest,
                metadata
        );
    }

    private record ParsedName(String dienst, String operatie, String sleutel, boolean isRequest) {
    }

    private ParsedName parseFilename(String filename) {
        String stem = filename.endsWith(".xml") ? filename.substring(0, filename.length() - 4) : filename;
        boolean isRequest = stem.endsWith("-request");
        if (isRequest) {
            stem = stem.substring(0, stem.length() - "-request".length());
        }
        String[] parts = stem.split("_", 3);
        String dienst = parts.length > 0 ? parts[0] : "";
        String operatie = parts.length > 1 ? parts[1] : "";
        String sleutel = parts.length > 2 ? parts[2] : "";
        return new ParsedName(dienst, operatie, sleutel, isRequest);
    }

    private Map<String, String> extractMetadata(Path path) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc;
        try (var in = Files.newInputStream(path)) {
            doc = builder.parse(in);
        }
        Map<String, String> out = new LinkedHashMap<>();
        walk(doc.getDocumentElement(), out);
        return out;
    }

    private void walk(Node node, Map<String, String> out) {
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) continue;
            String localName = child.getLocalName() != null ? child.getLocalName() : child.getNodeName();
            String key = localName.toLowerCase(Locale.ROOT);
            if (METADATA_FIELDS.contains(key) && !out.containsKey(key)) {
                String text = child.getTextContent();
                if (text != null && !text.isBlank()) {
                    out.put(key, text.trim());
                }
            }
            if (!SUB_ENTITY_CONTAINERS.contains(localName)) {
                walk(child, out);
            }
        }
    }

    private void validateWellFormed(String xml) {
        try {
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            builder.parse(new InputSource(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8))));
        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw new InvalidXmlException(e.getMessage());
        }
    }

    public static class ResponseFileNotFoundException extends RuntimeException {
        public ResponseFileNotFoundException(String filename) {
            super("Not found: " + filename);
        }
    }

    public static class ResponseFileExistsException extends RuntimeException {
        public ResponseFileExistsException(String filename) {
            super("Already exists: " + filename);
        }
    }

    public static class InvalidXmlException extends RuntimeException {
        public InvalidXmlException(String message) {
            super(message);
        }
    }
}
