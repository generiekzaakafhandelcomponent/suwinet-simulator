package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200.ObjectFactory;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200.UWVPersoonsIkvInfoResponse;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200.UWVPersoonsIkvInfo;
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
public class UWVDossierInkomstenGSDEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(UWVDossierInkomstenGSDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200";
    @Value("suwinet/UWVDossierInkomstenGSD/Diensten/UWVDossierInkomstenGSD/v0200-b02/BodyAction.xsd")
    ClassPathResource resourceBodyAction;

    @Value("suwinet/UWVDossierInkomstenGSD/Diensten/UWVDossierInkomstenGSD/v0200-b02/BodyReaction.xsd")
    ClassPathResource resourceBodyReaction;

    private final ObjectFactory dossierObjectFactory = new ObjectFactory();

    private static final Class[] incomingClasses = {UWVPersoonsIkvInfo.class};
    private static final Class[] outGoingClasses = {ObjectFactory.class};

    private final static String servicePrefix = "UWVDossierInkomstenGSD";
    @Autowired
    public UWVDossierInkomstenGSDEndpoint() {}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UWVPersoonsIkvInfo")
    @ResponsePayload
    public UWVPersoonsIkvInfoResponse getUWVPersoonsIkvInfo(@RequestPayload UWVPersoonsIkvInfo request) throws JAXBException, SAXException, IOException {
        logger.debug("request: " + printPayload(request, incomingClasses, resourceBodyAction));
        String xmlFilename = servicePrefix + "_UWVPersoonsIkvInfo_" + request.getBurgerservicenr() + ".xml";
        Resource resource = readResponseDirectory(xmlFilename);

        UWVPersoonsIkvInfoResponse response;
        if(resource == null) {
            response = dossierObjectFactory.createUWVPersoonsIkvInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (UWVPersoonsIkvInfoResponse) unmarshal(UWVPersoonsIkvInfoResponse.class,resource);
        }

        logger.debug("response: " + printPayload(response,outGoingClasses, resourceBodyReaction));

        return response;
    }
}