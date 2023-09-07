package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.*;
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
public class KadasterEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(KadasterEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300";

    @Value("suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private static final String INCOMING_SCHEMA = "suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyAction.xsd";
    private static final String OUT_GOING_SCHEMA = "suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd";

    private static final Class[] INCOMING_CLASSES = {
            PersoonsInfo.class,
            ObjectInfoKadastraleAanduiding.class
    };
    private static Class[] OUT_GOING_CLASSES = {ObjectFactory.class};

    private final static String servicePrefix = "KadasterDossierGSD";

    ObjectFactory objectFactory;

    @Autowired
    public KadasterEndpoint() {objectFactory = new ObjectFactory();}


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersoonsInfo")
    @ResponsePayload
    public PersoonsInfoResponse getPersoonsInfo(@RequestPayload PersoonsInfo request) throws JAXBException, SAXException, IOException {

        String xmlFilename = servicePrefix + "_PersoonsInfo_" + request.getBurgerservicenr() + ".xml";
        logger.info("request: " + printPayload3(request, INCOMING_CLASSES, resourceBodyAction));
        Resource resource = readResponseDirectory2(xmlFilename);
        PersoonsInfoResponse response;
        if(resource == null) {
            response = objectFactory.createPersoonsInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (PersoonsInfoResponse) unmarshal2(PersoonsInfoResponse.class,resource);
        }
        logger.info("response: " + printPayload3(response, OUT_GOING_CLASSES, resourceBodyReaction));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ObjectInfoKadastraleAanduiding")
    @ResponsePayload
    public ObjectInfoKadastraleAanduidingResponse getObjectInfoKadastraleAanduiding(@RequestPayload ObjectInfoKadastraleAanduiding request) throws JAXBException, SAXException, IOException {

        String xmlFilename = servicePrefix + "_ObjectInfoKadastraleAanduiding_" +
                request.getCdKadastraleGemeente() + "_" +
                request.getKadastraalPerceelnr() + ".xml";

        logger.info("getObjectInfoKadastraleAanduiding looking for: " + xmlFilename);
        String responseFile = readResponseDirectory(xmlFilename);

        logger.debug("getObjectInfoKadastraleAanduiding request: " + printPayload2(request, INCOMING_CLASSES, resourceBodyReaction.getFile()));
        ObjectInfoKadastraleAanduidingResponse response;
        if(responseFile.isEmpty()) {
            response = objectFactory.createObjectInfoKadastraleAanduidingResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (ObjectInfoKadastraleAanduidingResponse) unmarshal(ObjectInfoKadastraleAanduidingResponse.class, responseFile);
        }
        logger.debug("response: " + printPayload2(response, OUT_GOING_CLASSES, resourceBodyReaction.getFile()));

        return response;
    }
}