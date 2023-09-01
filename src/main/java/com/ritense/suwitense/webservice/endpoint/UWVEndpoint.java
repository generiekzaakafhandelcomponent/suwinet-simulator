package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBElement;
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

import javax.xml.namespace.QName;

@Endpoint
public class UWVEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(UWVEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200";
    private static final String incomingSchema = "build/resources/main/suwinet/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200-b01/BodyAction.xsd";
    private static final String outGoingSchema = "build/resources/main/suwinet/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200-b01/BodyReaction.xsd";
    ObjectFactory dossierObjectFactory;

    private static final Class[] incomingClasses = {UWVPersoonsIkvInfo.class};
    private static final Class[] outGoingClasses = {
            nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
            ObjectFactory.class
    };

    @Autowired
    public UWVEndpoint() {
        super();
        dossierObjectFactory = new ObjectFactory();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UWVPersoonsIkvInfo")
    @ResponsePayload
    public UWVPersoonsIkvInfoResponse getKentekenInfo(@RequestPayload UWVPersoonsIkvInfo request) throws JAXBException, SAXException {

        logger.info("request bsn: " + request.getBurgerservicenr());
        logger.info("request: " + printPayload(request, incomingClasses, incomingSchema));

        UWVPersoonsIkvInfoResponse response = createResponse();

        if(request.getBurgerservicenr().isEmpty()) {
            addPersoonNietGevonden(response.getContent());
        } else {
            UWVPersoonsIkvInfoResponse.ClientSuwi clientSuwi = createClientSuwiPersoonsInfo(request);
            JAXBElement<UWVPersoonsIkvInfoResponse.ClientSuwi> jaxbElement =  new JAXBElement(
                    new QName("ClientSuwi"), UWVPersoonsIkvInfoResponse.ClientSuwi.class, clientSuwi);

            response.getContent().add(jaxbElement);
        }
        logger.info("response: " + printPayload(response,outGoingClasses, outGoingSchema));

        return response;
    }

    private UWVPersoonsIkvInfoResponse.ClientSuwi createClientSuwiPersoonsInfo(UWVPersoonsIkvInfo request) {
        UWVPersoonsIkvInfoResponse.ClientSuwi clientSuwi = dossierObjectFactory.createUWVPersoonsIkvInfoResponseClientSuwi();
        clientSuwi.setBurgerservicenr(request.getBurgerservicenr());

        return clientSuwi;
    }

    private UWVPersoonsIkvInfoResponse createResponse() {
        return dossierObjectFactory.createUWVPersoonsIkvInfoResponse();
    }

}