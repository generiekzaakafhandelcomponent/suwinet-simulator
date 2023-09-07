package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200.UWVPersoonsIkvInfo;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200.ObjectFactory;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200.UWVPersoonsIkvInfoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;

import java.io.IOException;

@Endpoint
public class UWVDossierInkomstenGSDDigitaleDienstenEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(UWVDossierInkomstenGSDDigitaleDienstenEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200";
    private static final String incomingSchema = "build/resources/main/suwinet/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200-b01/BodyAction.xsd";
    private static final String outGoingSchema = "build/resources/main/suwinet/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200-b01/BodyReaction.xsd";
    ObjectFactory dossierObjectFactory;

    private static final Class[] incomingClasses = {UWVPersoonsIkvInfo.class};
    private static final Class[] outGoingClasses = {ObjectFactory.class};

    private final static String servicePrefix = "UWVDossierInkomstenGSDDigitaleDiensten";

    @Autowired
    public UWVDossierInkomstenGSDDigitaleDienstenEndpoint() {dossierObjectFactory = new ObjectFactory();}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UWVPersoonsIkvInfo")
    @ResponsePayload
    public UWVPersoonsIkvInfoResponse getKentekenInfo(@RequestPayload UWVPersoonsIkvInfo request) throws JAXBException, SAXException, IOException {

        logger.debug("request: " + printPayload(request, incomingClasses, incomingSchema));
        String xmlFilename = servicePrefix + "_UWVPersoonsIkvInfo_" + request.getBurgerservicenr() + ".xml";
        logger.info("looking for: " + xmlFilename);
        String responseFile = readResponseDirectory(xmlFilename);

        UWVPersoonsIkvInfoResponse response;
        if(responseFile.isEmpty()) {
            response = dossierObjectFactory.createUWVPersoonsIkvInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (UWVPersoonsIkvInfoResponse) unmarshal(UWVPersoonsIkvInfoResponse.class,responseFile);
        }

        logger.debug("response: " + printPayload(response,outGoingClasses, outGoingSchema));

        return response;
    }
}