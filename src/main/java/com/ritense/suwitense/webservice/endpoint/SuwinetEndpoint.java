package com.ritense.suwitense.webservice.endpoint;

import com.ritense.suwitense.webservice.DynamicDateProcessor;
import jakarta.xml.bind.*;
import nl.bkwi.suwiml.fwi.v0205.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(SuwinetEndpoint.class);

    /*
     * De Response Editor schrijft XML naar het pad uit `simulator.responses.path`,
     * maar deze endpoint las de responses voorheen alleen uit de classpath
     * (`@Value("classpath:suwinet/data/Responses/*")`, eenmalig ingelezen bij
     * startup). Daardoor zagen SOAP-clients (zoals GZAC) editor-wijzigingen
     * pas terug na een rebuild + restart, en alleen als de classpath uit
     * dezelfde worktree kwam als waar de editor naartoe schreef.
     *
     * We resolven het pad nu dynamisch per request via DefaultResourceLoader,
     * met dezelfde classpath-locatie als default — dus backwards-compatible
     * voor wie de override niet zet. Een `simulator.responses.path` op een
     * filesystem-pad wordt automatisch met `file:` geprefixed.
     */
    @Value("${simulator.responses.path:classpath:suwinet/data/Responses}")
    private String responsesPath;

    private final ResourceLoader resourceLoader = new DefaultResourceLoader();

    Resource readResponseDirectory(String filename) throws IOException {
        String base = responsesPath.endsWith("/") ? responsesPath : responsesPath + "/";
        String location = base + filename;
        if (!location.startsWith("classpath:") && !location.startsWith("file:")) {
            location = "file:" + location;
        }
        Resource resource = resourceLoader.getResource(location);
        return resource.exists() ? resource : null;
    }
    Object unmarshal(Type xmlClass, Resource resource) {
        try {
            Class<?> clazz = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(xmlClass);
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller un = context.createUnmarshaller();
            return un.unmarshal(applyDynamicDates(resource));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private InputStream applyDynamicDates(Resource resource) throws IOException {
        try (InputStream raw = resource.getInputStream()) {
            byte[] bytes = raw.readAllBytes();
            String xml = new String(bytes, StandardCharsets.UTF_8);
            String processed = DynamicDateProcessor.process(xml);
            if (processed == xml) {
                return new ByteArrayInputStream(bytes);
            }
            return new ByteArrayInputStream(processed.getBytes(StandardCharsets.UTF_8));
        }
    }

    <T> String printPayload(final T response, Class[] contextClasses, final ClassPathResource actionSchema) throws JAXBException, SAXException, IOException {

        JAXBContext jaxbContext = JAXBContext.newInstance(contextClasses);
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(actionSchema.getURL());

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setSchema(schema);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(response, stream);
        return stream.toString();
    }

    void addPersoonNietGevonden(List<JAXBElement<?>> responseList) {
        ObjectFactory objectFactory = new ObjectFactory();
        responseList.add(objectFactory.createNietsGevonden("Niet gevonden"));
    }

    void addNietGevonden(List<JAXBElement<?>> responseList) {
        var objectFactory = new ObjectFactory();
        responseList.add(objectFactory.  createNietsGevonden("Niet gevonden"));
    }
}
