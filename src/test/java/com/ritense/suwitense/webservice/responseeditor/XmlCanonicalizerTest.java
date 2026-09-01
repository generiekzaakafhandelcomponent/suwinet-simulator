package com.ritense.suwitense.webservice.responseeditor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmlCanonicalizerTest {

    private final XmlCanonicalizer canonicalizer = new XmlCanonicalizer();

    @Test
    void stripsNamespacePrefixes() throws Exception {
        String xml = "<ns1:Root xmlns:ns1=\"http://example.com\"><ns1:Child>val</ns1:Child></ns1:Root>";
        String result = canonicalizer.canonicalize(xml);
        assertFalse(result.contains("ns1:"), "Namespace prefix should be stripped");
        assertTrue(result.contains("<Root>") && result.contains("<Child>"));
    }

    @Test
    void sortsAttributes() throws Exception {
        String xml = "<Root z=\"2\" a=\"1\" m=\"5\"/>";
        String result = canonicalizer.canonicalize(xml);
        int posA = result.indexOf("a=");
        int posM = result.indexOf("m=");
        int posZ = result.indexOf("z=");
        assertTrue(posA < posM && posM < posZ, "Attributes should be sorted alphabetically");
    }

    @Test
    void equivalentXmlsWithDifferentWhitespaceProduceSameOutput() throws Exception {
        String compact = "<Root><Child>value</Child></Root>";
        String indented = "<Root>\n  <Child>  value  </Child>\n</Root>";
        assertEquals(canonicalizer.canonicalize(compact), canonicalizer.canonicalize(indented));
    }

    @Test
    void equivalentXmlsWithDifferentNamespacePrefixesProduceSameOutput() throws Exception {
        String prefixA = "<a:Root xmlns:a=\"http://x\"><a:Child>v</a:Child></a:Root>";
        String prefixB = "<b:Root xmlns:b=\"http://x\"><b:Child>v</b:Child></b:Root>";
        assertEquals(canonicalizer.canonicalize(prefixA), canonicalizer.canonicalize(prefixB));
    }

    @Test
    void throwsOnMalformedXml() {
        assertThrows(Exception.class, () -> canonicalizer.canonicalize("<unclosed>"));
    }
}
