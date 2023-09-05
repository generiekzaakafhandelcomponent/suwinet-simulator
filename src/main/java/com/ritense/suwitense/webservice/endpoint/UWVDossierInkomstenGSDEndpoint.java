package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200.ObjectFactory;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200.UWVPersoonsIkvInfoResponse;
import nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200.UWVPersoonsIkvInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;

@Endpoint
public class UWVDossierInkomstenGSDEndpoint extends SuwinetEndpoint {

    public static final String UWVPERSOONSIKVINFO_XML = "build/resources/main/suwinet/data/Responses/UWVDossierInkomstenGSD_UWVPersoonsIkvInfo_999996769.xml";
    Logger logger = LoggerFactory.getLogger(UWVDossierInkomstenGSDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200";
    private static final String incomingSchema = "build/resources/main/suwinet/Diensten/UWVDossierInkomstenGSD/v0200-b02/BodyAction.xsd";
    private static final String outGoingSchema = "build/resources/main/suwinet/Diensten/UWVDossierInkomstenGSD/v0200-b02/BodyReaction.xsd";
    ObjectFactory dossierObjectFactory;

    private static final Class[] incomingClasses = {UWVPersoonsIkvInfo.class};
    private static final Class[] outGoingClasses = {ObjectFactory.class};

    private static String servicePrefix = "UWVDossierInkomstenGSD";
    @Autowired
    public UWVDossierInkomstenGSDEndpoint() {dossierObjectFactory = new ObjectFactory();}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UWVPersoonsIkvInfo")
    @ResponsePayload
    public UWVPersoonsIkvInfoResponse getUWVPersoonsIkvInfo(@RequestPayload UWVPersoonsIkvInfo request) throws JAXBException, SAXException {
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