package com.ritense.suwitense.webservice.responseeditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Hardened {@link DocumentBuilderFactory} used by every XML reader/writer in the editor.
 * Enables FEATURE_SECURE_PROCESSING and disables DOCTYPE declarations to block XXE and
 * entity-expansion attacks.
 */
final class SecureXml {

    private static final Logger logger = LoggerFactory.getLogger(SecureXml.class);

    private SecureXml() {}

    static DocumentBuilderFactory hardenedDocumentBuilderFactory() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (ParserConfigurationException e) {
            logger.warn("Could not harden XML parser: {}", e.getMessage());
        }
        return factory;
    }
}
