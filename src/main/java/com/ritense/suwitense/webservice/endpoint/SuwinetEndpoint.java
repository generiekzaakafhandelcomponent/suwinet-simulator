package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import nl.bkwi.suwiml.fwi.v0205.ObjectFactory;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;

public class SuwinetEndpoint {

    ObjectFactory objectFactory;

    public SuwinetEndpoint() {
        objectFactory = new ObjectFactory();
    }

    <T> String printPayload(final T response, final Class[] contextClasses, final String actionSchema) throws JAXBException, SAXException {
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
    void addPersoonNietGevonden(List responseList) {
        responseList.add(objectFactory.createNietsGevonden("nope die ken ik niet"));
    }
}
