package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200.ObjectFactory;
import nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200.SVBPersoonsInfo;
import nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200.SVBPersoonsInfoResponse;
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
public class SvbDossierPersoonGSDEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(SvbDossierPersoonGSDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200";

    @Value("suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private static final Class[] INCOMING_CLASSES = {
            SVBPersoonsInfo.class
    };
    private static Class[] OUT_GOING_CLASSES = {ObjectFactory.class};

    private final static String servicePrefix = "SVBDossierPersoonGSD";

    ObjectFactory objectFactory;

    @Autowired
    public SvbDossierPersoonGSDEndpoint() {objectFactory = new ObjectFactory();}


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SVBPersoonsInfo")
    @ResponsePayload
    public SVBPersoonsInfoResponse getSVBPersoonsInfo(@RequestPayload SVBPersoonsInfo request) throws JAXBException, SAXException, IOException {

        String xmlFilename = servicePrefix + "_SVBPersoonsInfo_" + request.getBurgerservicenr() + ".xml";
        Resource resource = readResponseDirectory(xmlFilename);
        logger.info("looking for: " + xmlFilename);
        SVBPersoonsInfoResponse response;
        if(resource == null) {
            response = objectFactory.createSVBPersoonsInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (SVBPersoonsInfoResponse) unmarshal(SVBPersoonsInfoResponse.class,resource);
        }

        return response;
    }
}