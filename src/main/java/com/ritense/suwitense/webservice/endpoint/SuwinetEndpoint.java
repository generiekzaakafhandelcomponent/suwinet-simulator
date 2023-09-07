package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.*;
import nl.bkwi.suwiml.fwi.v0205.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
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
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(SuwinetEndpoint.class);

    @Value("classpath:suwinet/data/Responses/*")
    private Resource[] resources;

    String readResponseDirectory(String filenameFilter) throws IOException {

        Optional<String> first = Arrays.stream(resources)
                .filter(resource -> resource.getFilename().equals(filenameFilter))
                .map(Resource::getFilename)
                .findFirst();

        return first.isPresent() ? first.get() : "";
    }

    Resource readResponseDirectory2(String filenameFilter) throws IOException {

        Optional<Resource> first = Arrays.stream(resources)
                .filter(resource -> resource.getFilename().equals(filenameFilter))
                .findFirst();

        return first.isPresent() ? first.get() : null;
    }
    Object unmarshal2(Type xmlClass, Resource resource) {
        try {
            Class<?> clazz = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(xmlClass);
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller un = context.createUnmarshaller();
            return un.unmarshal(resource.getInputStream());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
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

    <T> String printPayload3(final T response, Class[] contextClasses, final ClassPathResource actionSchema) throws JAXBException, SAXException, IOException {

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
