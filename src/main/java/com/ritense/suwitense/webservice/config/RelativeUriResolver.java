package com.ritense.suwitense.webservice.config;

import org.apache.ws.commons.schema.resolver.URIResolver;
import org.xml.sax.InputSource;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;

/**
 * Resolves xsd imports/includes relative to the importing schema's own location.
 *
 * Spring-WS' default resolver asks the web application's ServletContext to resolve relative
 * paths (like "../../Basisschema/x.xsd"), which newer Tomcat versions reject with an exception.
 */
public class RelativeUriResolver implements URIResolver {

    @Override
    public InputSource resolveEntity(String namespace, String schemaLocation, String baseUri) {
        try {
            URL url = baseUri != null ? new URL(new URL(baseUri), schemaLocation) : new URL(schemaLocation);
            InputSource source = new InputSource(url.openStream());
            source.setSystemId(url.toString());
            return source;
        } catch (IOException e) {
            throw new UncheckedIOException("Could not resolve schema " + schemaLocation + " from " + baseUri, e);
        }
    }
}
