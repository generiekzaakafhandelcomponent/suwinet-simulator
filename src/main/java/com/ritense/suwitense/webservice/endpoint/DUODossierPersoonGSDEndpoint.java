package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300.DUOPersoonsInfo;
import nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300.DUOPersoonsInfoResponse;
import nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300.ObjectFactory;
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
public class DUODossierPersoonGSDEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(DUODossierPersoonGSDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300";

    @Value("suwinet/DUODossierPersoonGSD/Diensten/DUODossierPersoonGSD/v0300-b01/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/DUODossierPersoonGSD/Diensten/DUODossierPersoonGSD/v0300-b01/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private static final Class[] INCOMING_CLASSES = {
            DUOPersoonsInfo.class
    };
    private static Class[] OUT_GOING_CLASSES = {ObjectFactory.class};

    private final static String servicePrefix = "DUODossierPersoonGSD";

    ObjectFactory objectFactory;

    @Autowired
    public DUODossierPersoonGSDEndpoint() {objectFactory = new ObjectFactory();}


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DUOPersoonsInfo")
    @ResponsePayload
    public DUOPersoonsInfoResponse getAanvraagPersoon(@RequestPayload DUOPersoonsInfo request) throws JAXBException, SAXException, IOException {

        String xmlFilename = servicePrefix + "_DUOPersoonsInfo_" + request.getBurgerservicenr() + ".xml";
        Resource resource = readResponseDirectory(xmlFilename);
        logger.info("looking for: " + xmlFilename);
        DUOPersoonsInfoResponse response;
        if(resource == null) {
            response = objectFactory.createDUOPersoonsInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (DUOPersoonsInfoResponse) unmarshal(DUOPersoonsInfoResponse.class,resource);
        }

        return response;
    }
}