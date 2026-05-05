package com.ritense.suwitense.webservice.responseeditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class XsdValidationService {

    private static final Logger logger = LoggerFactory.getLogger(XsdValidationService.class);

    private static final Map<String, String> REACTION_XSD = Map.of(
        "BRPDossierPersoonGSD",          "suwinet/BRPDossierPersoonGSD/Diensten/BRPDossierPersoonGSD/v0200-b02/BodyReaction.xsd",
        "Bijstandsregelingen",           "suwinet/Bijstandsregelingen/Diensten/Bijstandsregelingen/v0500-b04/BodyReaction.xsd",
        "DUODossierPersoonGSD",          "suwinet/DUODossierPersoonGSD/Diensten/DUODossierPersoonGSD/v0300-b01/BodyReaction.xsd",
        "DUODossierStudiefinancieringGSD","suwinet/DUODossierStudiefinancieringGSD/Diensten/DUODossierStudiefinancieringGSD/v0200-b01/BodyReaction.xsd",
        "KadasterDossierGSD",            "suwinet/KadasterDossierGSD/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd",
        "RDWDossierGSD",                 "suwinet/RDWDossierGSD/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd",
        "SVBDossierPersoonGSD",          "suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/BodyReaction.xsd",
        "UWVDossierInkomstenGSD",        "suwinet/UWVDossierInkomstenGSD/Diensten/UWVDossierInkomstenGSD/v0200-b02/BodyReaction.xsd"
    );

    // Matches: Invalid content was found starting with element '{"":SomeElement}'
    // or:      Invalid content was found starting with element 'SomeElement'
    private static final Pattern INVALID_ELEM = Pattern.compile(
        "starting with element '(?:\\{[^}]*\\})?([^']+)'"
    );

    private final Map<String, Optional<Schema>> schemaCache = new ConcurrentHashMap<>();

    public record Issue(String message) {}

    public List<Issue> validate(String dienst, String xml) {
        Optional<Schema> schema = schemaCache.computeIfAbsent(dienst, this::loadSchema);
        if (schema.isEmpty()) return List.of();

        List<Issue> issues = new ArrayList<>();
        try {
            var validator = schema.get().newValidator();
            validator.setErrorHandler(new org.xml.sax.ErrorHandler() {
                @Override public void warning(SAXParseException e) {}
                @Override public void error(SAXParseException e) { issues.add(format(e)); }
                @Override public void fatalError(SAXParseException e) { issues.add(format(e)); }
            });
            validator.validate(new StreamSource(new StringReader(xml)));
        } catch (Exception e) {
            logger.debug("XSD validation error for {}: {}", dienst, e.getMessage());
        }
        return issues;
    }

    private Optional<Schema> loadSchema(String dienst) {
        String path = REACTION_XSD.get(dienst);
        if (path == null) return Optional.empty();
        try {
            URL url = new ClassPathResource(path).getURL();
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            return Optional.of(factory.newSchema(url));
        } catch (Exception e) {
            logger.warn("Kon XSD niet laden voor {}: {}", dienst, e.getMessage());
            return Optional.empty();
        }
    }

    private static Issue format(SAXParseException e) {
        String raw = e.getMessage();
        if (raw == null) return new Issue("Onbekende schemafout");
        Matcher m = INVALID_ELEM.matcher(raw);
        if (m.find()) {
            String elem = m.group(1);
            // "is expected" indicates a sequence/ordering violation rather than an unknown element
            if (raw.contains("is expected")) {
                return new Issue("Element '" + elem + "' staat op een ongeldige positie — controleer de XSD-volgorde.");
            }
            return new Issue("Veld '" + elem + "' staat niet in het XSD-schema (wordt niet teruggegeven door de SOAP-service).");
        }
        return new Issue(raw);
    }
}
