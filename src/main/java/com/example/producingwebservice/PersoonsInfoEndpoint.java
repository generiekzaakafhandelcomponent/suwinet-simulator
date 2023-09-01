package com.example.producingwebservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ClientSuwiPersoonsInfo;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfoResponse;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfo;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PostadresKadaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;
import javax.xml.namespace.QName;
import java.math.BigInteger;

@Endpoint
public class PersoonsInfoEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(PersoonsInfoEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300";

    private static final String INCOMING_SCHEMA = "build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyAction.xsd";
    private static final String OUT_GOING_SCHEMA = "build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd";

    private static final Class[] INCOMING_CLASSES = {
            nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfo.class
    };
    private static final Class[] OUT_GOING_CLASSES = {
            nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
            nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory.class
    };


    nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory kadasterdossiergsdFactory;

    @Autowired
    public PersoonsInfoEndpoint() {
        super();
        kadasterdossiergsdFactory = new nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersoonsInfo")
    @ResponsePayload
    public PersoonsInfoResponse getPersoonsInfo(@RequestPayload PersoonsInfo request) throws JAXBException, SAXException {

        logger.info("request.getBurgerservicenr(): " + request.getBurgerservicenr());
        logger.info("request: " + printPayload(request, INCOMING_CLASSES, INCOMING_SCHEMA));

        PersoonsInfoResponse response = createResponse();
        if(! request.getBurgerservicenr().isEmpty() ) {
            ClientSuwiPersoonsInfo clientSuwiPersoonsInfo = createClientSuwiPersoonsInfo(request);
            JAXBElement<ClientSuwiPersoonsInfo> jaxbElement = new JAXBElement(
                    new QName("ClientSuwi"),
                    ClientSuwiPersoonsInfo.class,
                    clientSuwiPersoonsInfo
            );

            response.getContent().add(jaxbElement);

        } else {
            addPersoonNietGevonden(response.getContent());
        }
        logger.info("response: " + printPayload(response, OUT_GOING_CLASSES, OUT_GOING_SCHEMA));

        return response;
    }

    private PersoonsInfoResponse createResponse() {
        return kadasterdossiergsdFactory.createPersoonsInfoResponse();
    }

    private ClientSuwiPersoonsInfo createClientSuwiPersoonsInfo(PersoonsInfo request) {

        ClientSuwiPersoonsInfo clientSuwi = kadasterdossiergsdFactory.createClientSuwiPersoonsInfo();
        clientSuwi.setBurgerservicenr(request.getBurgerservicenr());
        clientSuwi.setGeboortedat("19520524");
        ClientSuwiPersoonsInfo.Eigendom eigendom = new ClientSuwiPersoonsInfo.Eigendom();
        eigendom.setIndEigendomOZVerleden("1");
        clientSuwi.setDatToestandKadaster("19920526");
        clientSuwi.setDatFiatteringKadaster("19720127");
        clientSuwi.setEigendom(eigendom);
        PostadresKadaster postAdres = kadasterdossiergsdFactory.createPostadresKadaster();
        postAdres.setGeneriekAdresBuitenland(null);
        PostadresKadaster.Postbusadres postbusadres = new PostadresKadaster.Postbusadres();
        postbusadres.setGemeentenaam("gemeentenaam");
        postbusadres.setLocatieoms("locatieoms");
        postbusadres.setPostbusnr(BigInteger.valueOf(12345));
        postbusadres.setPostcd("1111wx");
        postbusadres.setWoonplaatsnaam("awdawdawd");
        postAdres.setPostbusadres(postbusadres);
        postAdres.setStraatadresBag(null);
        clientSuwi.setCorrespondentieadres(postAdres);
        return clientSuwi;
    }
}