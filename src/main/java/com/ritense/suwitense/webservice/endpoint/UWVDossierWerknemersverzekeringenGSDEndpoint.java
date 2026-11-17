package com.ritense.suwitense.webservice.endpoint;

import nl.bkwi.suwiml.diensten.uwvdossierwerknemersverzekeringengsd.v0200.ObjectFactory;
import nl.bkwi.suwiml.diensten.uwvdossierwerknemersverzekeringengsd.v0200.UWVPersoonsWvInfo;
import nl.bkwi.suwiml.diensten.uwvdossierwerknemersverzekeringengsd.v0200.UWVPersoonsWvInfoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.io.IOException;

@Endpoint
public class UWVDossierWerknemersverzekeringenGSDEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(UWVDossierWerknemersverzekeringenGSDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/UWVDossierWerknemersverzekeringenGSD/v0200";

    private static final String servicePrefix = "UWVDossierWerknemersverzekeringenGSD";

    private final ObjectFactory objectFactory = new ObjectFactory();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UWVPersoonsWvInfo")
    @ResponsePayload
    public UWVPersoonsWvInfoResponse getUWVPersoonsWvInfo(@RequestPayload UWVPersoonsWvInfo request) throws IOException {

        String xmlFilename = servicePrefix + "_UWVPersoonsWvInfo_" + request.getBurgerservicenr() + ".xml";
        logger.info("looking for: " + xmlFilename);
        Resource resource = readResponseDirectory(xmlFilename);
        UWVPersoonsWvInfoResponse response;
        if (resource == null) {
            response = objectFactory.createUWVPersoonsWvInfoResponse();
            addPersoonNietGevonden(response.getContent());
        } else {
            response = (UWVPersoonsWvInfoResponse) unmarshal(UWVPersoonsWvInfoResponse.class, resource);
        }
        return response;
    }
}
