package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300.DUOPersoonsInfo;
import nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200.DUOStudiefinancieringInfo;
import nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200.DUOStudiefinancieringInfoResponse;
import nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200.ObjectFactory;
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
public class DUODossierStudiefinancieringGSDEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(DUODossierStudiefinancieringGSDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200";

    @Value("suwinet/DUODossierStudiefinancieringGSD/Diensten/DUODossierStudiefinancieringGSD/v0200-b01/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/DUODossierStudiefinancieringGSD/Diensten/DUODossierStudiefinancieringGSD/v0200-b01/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private static final Class[] INCOMING_CLASSES = {
            DUOStudiefinancieringInfo.class
    };
    private static Class[] OUT_GOING_CLASSES = {ObjectFactory.class};

    private final static String servicePrefix = "DUODossierStudiefinancieringGSD";

    ObjectFactory objectFactory;

    @Autowired
    public DUODossierStudiefinancieringGSDEndpoint() {objectFactory = new ObjectFactory();}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DUOStudiefinancieringInfo")
    @ResponsePayload
    public DUOStudiefinancieringInfoResponse getDUOStudiefinancieringInfo(@RequestPayload DUOStudiefinancieringInfo request) throws JAXBException, SAXException, IOException {

        String xmlFilename = servicePrefix + "_DUOStudiefinancieringInfo_" + request.getBurgerservicenr() + ".xml";
        Resource resource = readResponseDirectory(xmlFilename);
        logger.info("looking for: " + xmlFilename);
        DUOStudiefinancieringInfoResponse response;
        if(resource == null) {
            response = objectFactory.createDUOStudiefinancieringInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (DUOStudiefinancieringInfoResponse) unmarshal(DUOStudiefinancieringInfoResponse.class,resource);
        }

        return response;
    }
}