package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.*;
import nl.bkwi.suwiml.fwi.v0205.ObjectFactory;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SuwinetEndpoint {

    private static final String RESOURCES_SUWINET_RESPONSES = "build/resources/main/suwinet/data/Responses/";
    String readResponseDirectory(String filenameFilter) {
        Optional<String> first = Stream.of(new File(RESOURCES_SUWINET_RESPONSES).listFiles())
                .filter(file -> !file.isDirectory() && file.getName().endsWith(filenameFilter))
                .map(File::getAbsolutePath)
                .findFirst();

        return first.isPresent() ? first.get() : "";
    }

    Object unmarshal(Type xmlClass, String xmlFilename) {
        try {
            Class<?> clazz = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(xmlClass);
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller un = context.createUnmarshaller();
            return un.unmarshal(new File(xmlFilename));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    <T> String printPayload(final T response, Class[] contextClasses, final String actionSchema) throws JAXBException, SAXException {

        JAXBContext jaxbContext = JAXBContext.newInstance(contextClasses);
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File(actionSchema));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setSchema(schema);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(response, stream);
        return stream.toString();
    }
    void addPersoonNietGevonden(List<JAXBElement<?>> responseList) {
        ObjectFactory objectFactory = new ObjectFactory();
        responseList.add(objectFactory.createNietsGevonden("nope die ken ik niet"));
    }
}
