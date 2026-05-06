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

    // Value 'X' is not facet-valid with respect to pattern/maxLength '...' for type 'T'
    private static final Pattern FACET_VIOLATION = Pattern.compile(
        "Value '([^']*)' is not facet-valid with respect to (?:pattern|maxLength|minLength|length) '[^']*' for type '([^']*)'"
    );

    // Value 'X' is not a valid value of/for the (union|atomic) type 'T'
    private static final Pattern NOT_VALID_VALUE = Pattern.compile(
        "Value '([^']*)' is not a valid value"
    );

    private final Map<String, Optional<Schema>> schemaCache = new ConcurrentHashMap<>();

    public record Issue(String message, String hint) {
        public Issue(String message) { this(message, null); }
    }

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

        // Verkeerde elementvolgorde of onbekend element
        Matcher m = INVALID_ELEM.matcher(raw);
        if (m.find()) {
            String elem = m.group(1);
            if (raw.contains("is expected")) {
                return new Issue(
                    "Element '" + elem + "' staat op een ongeldige positie.",
                    "De XSD schrijft een vaste volgorde voor. Verplaats '" + elem + "' naar de juiste positie (zie XSD-sequence)."
                );
            }
            return new Issue(
                "Veld '" + elem + "' bestaat niet in het XSD-schema.",
                "De simulator negeert dit element — het wordt niet teruggegeven door de SOAP-service. Verwijder het veld uit het bestand."
            );
        }

        // Ongeldige waarde (patroon- of lengtebeperking)
        Matcher facet = FACET_VIOLATION.matcher(raw);
        if (facet.find()) {
            String value = facet.group(1);
            String type = facet.group(2).toLowerCase();
            return facetHint(value, type);
        }

        // Ongeldig type (bijv. nonNegativeInteger met letter-prefix)
        Matcher nv = NOT_VALID_VALUE.matcher(raw);
        if (nv.find()) {
            String value = nv.group(1);
            if (value.matches("[A-Za-z]\\d+")) {
                return new Issue(
                    "Waarde '" + value + "' is ongeldig (letter-prefix niet toegestaan).",
                    "Verwijder de letter en gebruik alleen het cijfergedeelte: '" + value.substring(1) + "'."
                );
            }
        }

        return new Issue(raw);
    }

    private static Issue facetHint(String value, String typeLower) {
        // J/N voor ja/nee-velden (StdIndJN)
        if ((value.equals("J") || value.equals("N")) && typeLower.contains("indjn")) {
            return new Issue(
                "Waarde '" + value + "' is ongeldig voor een ja/nee-veld.",
                "Gebruik '1' voor ja en '0' voor nee — de SOAP-service retourneert cijfercodes, niet letters."
            );
        }

        // v/m voor geslacht
        if ((value.equalsIgnoreCase("v") || value.equalsIgnoreCase("m")) && typeLower.contains("geslacht")) {
            String correct = value.equalsIgnoreCase("v") ? "2" : "1";
            return new Issue(
                "Geslacht '" + value + "' is ongeldig.",
                "Gebruik '1' (man), '2' (vrouw) of '9' (onbekend) — de BRP-standaard gebruikt cijfercodes."
                    + " Correcte waarde hier: '" + correct + "'."
            );
        }

        // Letter-prefix op een code (K401, P401, V401)
        if (value.matches("[A-Za-z]\\d+")) {
            return new Issue(
                "Code '" + value + "' heeft een letter-prefix die niet geldig is.",
                "Verwijder de letter en gebruik alleen het cijfergedeelte: '" + value.substring(1) + "'."
                    + " Een letter-prefix veroorzaakt een stille JAXB-fout — het veld wordt dan leeg teruggegeven."
            );
        }

        // Tweedelig eencijfer-code (bijv. '01' in een veld met maxLength 1)
        if (value.matches("0\\d")) {
            return new Issue(
                "Waarde '" + value + "' is te lang (maximaal 1 teken).",
                "Gebruik '" + value.substring(1) + "' — eencijfer-codes beginnen zonder voorloopnul."
            );
        }

        // Punt in voorletters (bijv. 'C.')
        if (value.matches("[A-Z]+\\.") && typeLower.contains("voorletter")) {
            String clean = value.replace(".", "");
            return new Issue(
                "Voorletters '" + value + "' mogen geen punt bevatten.",
                "Gebruik '" + clean + "' — het XSD-patroon staat óf hoofdletters óf één punt toe, niet gecombineerd."
            );
        }

        return new Issue("Ongeldige waarde '" + value + "' (voldoet niet aan XSD-patroon of lengte).");
    }
}
