package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.*;
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
public class RDWEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(RDWEndpoint.class);

    @Value("suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200";
    ObjectFactory dossierObjectFactory;

    private static final Class[] incomingClasses = {KentekenInfo.class};
    private static final Class[] outGoingClasses = {ObjectFactory.class};

    private final static String servicePrefix = "RDWDossierGSD";

    @Autowired
    public RDWEndpoint() {dossierObjectFactory = new ObjectFactory();}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "KentekenInfo")
    @ResponsePayload
    public KentekenInfoResponse getKentekenInfo(@RequestPayload KentekenInfo request) throws JAXBException, SAXException, IOException {

        logger.debug("request: " + printPayload(request, incomingClasses, resourceBodyAction));
        String xmlFilename = servicePrefix + "_KentekenInfo_" + request.getKentekenVoertuig() + ".xml";
        logger.info("looking for: " + xmlFilename);
        Resource resource = readResponseDirectory(xmlFilename);

        KentekenInfoResponse response;
        if(resource == null) {
            response = dossierObjectFactory.createKentekenInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (KentekenInfoResponse) unmarshal(KentekenInfoResponse.class,resource);
        }
        logger.debug("response: " + printPayload(response,outGoingClasses, resourceBodyReaction));

        return response;
    }
}