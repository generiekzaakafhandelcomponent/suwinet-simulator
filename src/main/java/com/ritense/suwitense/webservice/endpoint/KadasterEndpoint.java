package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfoResponse;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfo;
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

    private static final String PERSOONSINFO_XML = "build/resources/main/suwinet/responses/kadaster_persoonsinfo.xml";

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300";

    private static final String INCOMING_SCHEMA = "build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyAction.xsd";
    private static final String OUT_GOING_SCHEMA = "build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd";

    private static final Class[] INCOMING_CLASSES = {
            nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfo.class
    };
    private static Class[] OUT_GOING_CLASSES = {
            nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
            nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory.class
    };

    ObjectFactory objectFactory;

    @Autowired
    public KadasterEndpoint() {
        objectFactory = new nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersoonsInfo")
    @ResponsePayload
    public PersoonsInfoResponse getPersoonsInfo(@RequestPayload PersoonsInfo request) throws JAXBException, SAXException {

        logger.info("request.getBurgerservicenr(): " + request.getBurgerservicenr());
        logger.info("request: " + printPayload(request, INCOMING_CLASSES, INCOMING_SCHEMA));

        PersoonsInfoResponse response = null;
        if(request.getBurgerservicenr().isEmpty()) {
            response = objectFactory.createPersoonsInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (PersoonsInfoResponse) unmarshal(PersoonsInfoResponse.class,PERSOONSINFO_XML);
        }
        logger.info("response: " + printPayload(response, OUT_GOING_CLASSES, OUT_GOING_SCHEMA));

        return response;
    }
}