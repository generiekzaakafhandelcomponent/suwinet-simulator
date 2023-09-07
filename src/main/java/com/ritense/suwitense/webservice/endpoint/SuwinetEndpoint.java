package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.*;
import nl.bkwi.suwiml.fwi.v0205.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.NotDirectoryException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(SuwinetEndpoint.class);

    @Value("classpath:suwinet/data/Responses/")
    Resource resourceSuwinetResponses;
    String readResponseDirectory(String filenameFilter) throws IOException {

        if(!resourceSuwinetResponses.exists()) {
            logger.error("resourceSuwinetResponses does not exit");
            throw new FileNotFoundException("classpath:suwinet/data/Responses/");
        } else if (!resourceSuwinetResponses.getFile().isDirectory()) {
            throw new NotDirectoryException("classpath:suwinet/data/Responses/");
        }
        File[] files = resourceSuwinetResponses.getFile().listFiles();

        Optional<String> first = Stream.of(files)
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
    <T> String printPayload2(final T response, Class[] contextClasses, final File actionSchema) throws JAXBException, SAXException, IOException {

        JAXBContext jaxbContext = JAXBContext.newInstance(contextClasses);
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(actionSchema);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setSchema(schema);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(response, stream);
        return stream.toString();
    }

    <T> String printPayload(final T response, Class[] contextClasses, final String actionSchema) throws JAXBException, SAXException, IOException {

        JAXBContext jaxbContext = JAXBContext.newInstance(contextClasses);
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        String bla = "file:"+actionSchema;
        logger.info("looking for resource " + bla);
        Resource resourceSchema = new ClassPathResource(bla);
        Schema schema = schemaFactory.newSchema(resourceSchema.getFile());

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
