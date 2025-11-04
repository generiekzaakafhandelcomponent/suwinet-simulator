package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500.BijstandsregelingenInfoResponse;

import nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500.BijstandsregelingenInfo_Type;
import nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;

import java.io.IOException;

@Endpoint
public class BijstandsregelingenEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(BijstandsregelingenEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/Bijstandsregelingen/v0500";

    @Value("suwinet/Bijstandsregelingen/Diensten/Bijstandsregelingen/v0500-b04/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/Bijstandsregelingen/Diensten/Bijstandsregelingen/v0500-b04/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private static final Class[] INCOMING_CLASSES = {
            BijstandsregelingenInfo_Type.class
    };
    private static Class[] OUT_GOING_CLASSES = {ObjectFactory.class};

    private final static String servicePrefix = "Bijstandsregelingen";

    ObjectFactory objectFactory;

    public BijstandsregelingenEndpoint() {objectFactory = new ObjectFactory();}


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BijstandsregelingenInfo")
    @ResponsePayload
    public BijstandsregelingenInfoResponse getBijstandsregelingenInfo(@RequestPayload BijstandsregelingenInfo_Type request) throws JAXBException, SAXException, IOException {

        String xmlFilename = servicePrefix + "_BijstandsregelingenInfo_" + request.getBurgerservicenr() + ".xml";
        Resource resource = readResponseDirectory(xmlFilename);
        logger.info("looking for: " + xmlFilename);
        BijstandsregelingenInfoResponse response;
        if(resource == null) {
            response = objectFactory.createBijstandsregelingenInfoResponse();

            addNietGevonden(response.getContent());
        } else {
            response = (BijstandsregelingenInfoResponse) unmarshal(BijstandsregelingenInfoResponse.class,resource);
        }

        return response;
    }
}
