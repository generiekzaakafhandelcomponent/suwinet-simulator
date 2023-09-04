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
public class RWEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(RWEndpoint.class);

    private static final String KENTEKENINFO_XML = "build/resources/main/suwinet/responses/rdw_KentekenInfoResponse.xml";

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200";
    private static final String incomingSchema = "build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyAction.xsd";
    private static final String outGoingSchema = "build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd";
    ObjectFactory dossierObjectFactory;

    private static final Class[] incomingClasses = {KentekenInfo.class};
    private static final Class[] outGoingClasses = {ObjectFactory.class};

    @Autowired
    public RWEndpoint() {dossierObjectFactory = new ObjectFactory();}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "KentekenInfo")
    @ResponsePayload
    public KentekenInfoResponse getKentekenInfo(@RequestPayload KentekenInfo request) throws JAXBException, SAXException {

        logger.info("request.getKentekenVoertuig(): " + request.getKentekenVoertuig());
        logger.debug("request: " + printPayload(request, incomingClasses, incomingSchema));

        KentekenInfoResponse response = null;

        if(request.getKentekenVoertuig().isEmpty()) {
            response = dossierObjectFactory.createKentekenInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (KentekenInfoResponse) unmarshal(KentekenInfoResponse.class,KENTEKENINFO_XML);
        }
        logger.debug("response: " + printPayload(response,outGoingClasses, outGoingSchema));

        return response;
    }
}