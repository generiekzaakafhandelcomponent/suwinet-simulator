package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;

@Endpoint
public class RDWEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(RDWEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200";
    private static final String incomingSchema = "build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyAction.xsd";
    private static final String outGoingSchema = "build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd";
    ObjectFactory dossierObjectFactory;

    private static final Class[] incomingClasses = {KentekenInfo.class};
    private static final Class[] outGoingClasses = {ObjectFactory.class};

    private static String servicePrefix = "RDWDossierGSD";

    @Autowired
    public RDWEndpoint() {dossierObjectFactory = new ObjectFactory();}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "KentekenInfo")
    @ResponsePayload
    public KentekenInfoResponse getKentekenInfo(@RequestPayload KentekenInfo request) throws JAXBException, SAXException {

        logger.debug("request: " + printPayload(request, incomingClasses, incomingSchema));
        String xmlFilename = servicePrefix + "_KentekenInfo_" + request.getKentekenVoertuig() + ".xml";
        logger.info("looking for: " + xmlFilename);
        String responseFile = readResponseDirectory(xmlFilename);

        KentekenInfoResponse response;
        if(responseFile.isEmpty()) {
            response = dossierObjectFactory.createKentekenInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (KentekenInfoResponse) unmarshal(KentekenInfoResponse.class,responseFile);
        }
        logger.debug("response: " + printPayload(response,outGoingClasses, outGoingSchema));

        return response;
    }
}