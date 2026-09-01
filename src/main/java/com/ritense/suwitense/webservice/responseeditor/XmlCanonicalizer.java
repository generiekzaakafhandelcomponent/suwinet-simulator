package com.ritense.suwitense.webservice.responseeditor;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Re-formats an XML document into a deterministic, indented, namespace-prefix-stripped form
 * so that two snippets that are structurally equal but lexically different (whitespace,
 * prefix names, attribute order) produce the same string.
 *
 * <p>Used by the response tester to compare the expected response (file on disk) to the
 * actual response (out of the simulator) without flagging cosmetic differences as bugs.
 */
final class XmlCanonicalizer {

    private final DocumentBuilderFactory builderFactory;
    private final TransformerFactory transformerFactory;

    XmlCanonicalizer() {
        this.builderFactory = SecureXml.hardenedDocumentBuilderFactory();
        this.transformerFactory = TransformerFactory.newInstance();
    }

    String canonicalize(String xml) throws Exception {
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document src = builder.parse(new InputSource(new StringReader(xml)));
        Document dst = builder.newDocument();
        Element rebuilt = (Element) rebuild(src.getDocumentElement(), dst);
        dst.appendChild(rebuilt);
        return serialize(dst);
    }

    private Node rebuild(Node srcNode, Document dst) {
        Element s = (Element) srcNode;
        String name = s.getLocalName() != null ? s.getLocalName() : s.getNodeName();
        Element d = dst.createElement(name);

        // Collect non-namespace attributes, sort by local name, re-set.
        List<String[]> attrs = new ArrayList<>();
        for (int i = 0; i < s.getAttributes().getLength(); i++) {
            Node a = s.getAttributes().item(i);
            String n = a.getNodeName();
            if (n.equals("xmlns") || n.startsWith("xmlns:")) continue;
            String aLocal = a.getLocalName() != null ? a.getLocalName() : a.getNodeName();
            attrs.add(new String[]{aLocal, a.getNodeValue()});
        }
        Collections.sort(attrs, (a, b) -> a[0].compareTo(b[0]));
        for (String[] a : attrs) {
            d.setAttribute(a[0], a[1]);
        }

        NodeList kids = s.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            Node k = kids.item(i);
            if (k.getNodeType() == Node.ELEMENT_NODE) {
                d.appendChild(rebuild(k, dst));
            } else if (k.getNodeType() == Node.TEXT_NODE) {
                String text = k.getNodeValue();
                if (text != null && !text.trim().isEmpty()) {
                    d.appendChild(dst.createTextNode(text.trim()));
                }
            }
        }
        return d;
    }

    private String serialize(Document doc) throws Exception {
        Transformer t = transformerFactory.newTransformer();
        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        StringWriter sw = new StringWriter();
        t.transform(new DOMSource(doc), new StreamResult(sw));
        return sw.toString().trim();
    }
}
