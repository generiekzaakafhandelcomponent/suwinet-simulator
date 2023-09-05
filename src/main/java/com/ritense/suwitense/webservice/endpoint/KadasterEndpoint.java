package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;

@Endpoint
public class KadasterEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(KadasterEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300";

    private static final String INCOMING_SCHEMA = "build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyAction.xsd";
    private static final String OUT_GOING_SCHEMA = "build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd";

    private static final Class[] INCOMING_CLASSES = {
            PersoonsInfo.class,
            ObjectInfoKadastraleAanduiding.class
    };
    private static Class[] OUT_GOING_CLASSES = {ObjectFactory.class};

    ObjectFactory objectFactory;

    @Autowired
    public KadasterEndpoint() {objectFactory = new ObjectFactory();}

    private static String servicePrefix = "KadasterDossierGSD";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersoonsInfo")
    @ResponsePayload
    public PersoonsInfoResponse getPersoonsInfo(@RequestPayload PersoonsInfo request) throws JAXBException, SAXException {

        String xmlFilename = servicePrefix + "_PersoonsInfo_" + request.getBurgerservicenr() + ".xml";
        String responseFile = readResponseDirectory(xmlFilename);
        logger.info("looking for: " + xmlFilename);
        logger.debug("request: " + printPayload(request, INCOMING_CLASSES, INCOMING_SCHEMA));
        PersoonsInfoResponse response;
        if(responseFile.isEmpty()) {
            response = objectFactory.createPersoonsInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (PersoonsInfoResponse) unmarshal(PersoonsInfoResponse.class,responseFile);
        }
        logger.debug("response: " + printPayload(response, OUT_GOING_CLASSES, OUT_GOING_SCHEMA));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ObjectInfoKadastraleAanduiding")
    @ResponsePayload
    public ObjectInfoKadastraleAanduidingResponse getObjectInfoKadastraleAanduiding(@RequestPayload ObjectInfoKadastraleAanduiding request) throws JAXBException, SAXException {

        String xmlFilename = servicePrefix + "_ObjectInfoKadastraleAanduiding_" +
                request.getCdKadastraleGemeente() + "_" +
                request.getKadastraalPerceelnr() + ".xml";

        logger.info("getObjectInfoKadastraleAanduiding looking for: " + xmlFilename);
        String responseFile = readResponseDirectory(xmlFilename);

        logger.debug("getObjectInfoKadastraleAanduiding request: " + printPayload(request, INCOMING_CLASSES, INCOMING_SCHEMA));
        ObjectInfoKadastraleAanduidingResponse response;
        if(responseFile.isEmpty()) {
            response = objectFactory.createObjectInfoKadastraleAanduidingResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (ObjectInfoKadastraleAanduidingResponse) unmarshal(ObjectInfoKadastraleAanduidingResponse.class, responseFile);
        }
        logger.debug("response: " + printPayload(response, OUT_GOING_CLASSES, OUT_GOING_SCHEMA));

        return response;
    }
}