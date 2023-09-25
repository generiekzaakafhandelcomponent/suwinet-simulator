package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200.AanvraagPersoonResponse;
import nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200.ObjectFactory;
import nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class BRPDossierPersoonGSDEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(BRPDossierPersoonGSDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200";

    @Value("suwinet/BRPDossierPersoonGSD/Diensten/BRPDossierPersoonGSD/v0200-b02/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/BRPDossierPersoonGSD/Diensten/BRPDossierPersoonGSD/v0200-b02/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private static final Class[] INCOMING_CLASSES = {
        Request.class
    };
    private static Class[] OUT_GOING_CLASSES = {ObjectFactory.class};

    private final static String servicePrefix = "BRPDossierPersoonGSD";

    ObjectFactory objectFactory;

    @Autowired
    public BRPDossierPersoonGSDEndpoint() {objectFactory = new ObjectFactory();}


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AanvraagPersoon")
    @ResponsePayload
    public AanvraagPersoonResponse getAanvraagPersoon(@RequestPayload Request request) throws JAXBException, SAXException, IOException {

        String xmlFilename = servicePrefix + "_AanvraagPersoon_" + request.getBurgerservicenr() + ".xml";
        Resource resource = readResponseDirectory(xmlFilename);
        logger.info("looking for: " + xmlFilename);
        AanvraagPersoonResponse response;
        if(resource == null) {
            response = objectFactory.createAanvraagPersoonResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (AanvraagPersoonResponse) unmarshal(AanvraagPersoonResponse.class,resource);
        }

        return response;
    }
}