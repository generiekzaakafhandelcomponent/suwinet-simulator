package com.example.producingwebservice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.math.BigInteger;

@Endpoint
@XmlSeeAlso({ nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,nl.bkwi.suwiml.fwi.v0205.FWI.class })
public class PersoonsInfoEndpoint {

    Logger logger = LoggerFactory.getLogger(PersoonsInfoEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300";

    nl.bkwi.suwiml.fwi.v0205.ObjectFactory fwiObjectFactory;
    nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory kadasterdossiergsdFactory;

    @Autowired
    public PersoonsInfoEndpoint() {
        fwiObjectFactory = new nl.bkwi.suwiml.fwi.v0205.ObjectFactory();
        kadasterdossiergsdFactory = new nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersoonsInfo")
    @ResponsePayload
    public PersoonsInfoResponse getPersoonsInfo(@RequestPayload PersoonsInfo request) throws JAXBException, SAXException {

        logger.info("request.getBurgerservicenr(): " + request.getBurgerservicenr());
        printRequest(request);

        PersoonsInfoResponse response = createPersoonsInfoResponse(request);
        addClientSuwiPersoonsInfo(request, response);
//        addPersoonNietGevonden(response);

        printResponse(response);

        return response;
    }

    private void addPersoonNietGevonden(PersoonsInfoResponse response) {
        response.getContent().add(fwiObjectFactory.createNietsGevonden("nope die ken ik niet"));
    }

    private PersoonsInfoResponse createPersoonsInfoResponse(PersoonsInfo request) {
        return kadasterdossiergsdFactory.createPersoonsInfoResponse();
    }

    private void addClientSuwiPersoonsInfo(PersoonsInfo request, PersoonsInfoResponse response) {


        ClientSuwiPersoonsInfo clientSuwiPersoonsInfo = kadasterdossiergsdFactory.createClientSuwiPersoonsInfo();
        clientSuwiPersoonsInfo.setBurgerservicenr(request.getBurgerservicenr());
        clientSuwiPersoonsInfo.setGeboortedat("19520524");
        ClientSuwiPersoonsInfo.Eigendom eigendom = new ClientSuwiPersoonsInfo.Eigendom();
        eigendom.setIndEigendomOZVerleden("1");
        clientSuwiPersoonsInfo.setDatToestandKadaster("19920526");
        clientSuwiPersoonsInfo.setDatFiatteringKadaster("19720127");
        clientSuwiPersoonsInfo.setEigendom(eigendom);
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
        clientSuwiPersoonsInfo.setCorrespondentieadres(postAdres);
        JAXBElement<ClientSuwiPersoonsInfo> jaxbElement =  new JAXBElement(
                new QName("ClientSuwi"), ClientSuwiPersoonsInfo.class, clientSuwiPersoonsInfo);

        response.getContent().add(jaxbElement);
    }

    private void printRequest(PersoonsInfo request) throws JAXBException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] {PersoonsInfo.class});

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyAction.xsd"));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setSchema(schema);
        logger.info("-------- request start ------------");
        marshaller.marshal(request, System.out);
        logger.info("\n-------- request end ------------");
    }

    private void printResponse(PersoonsInfoResponse response) throws JAXBException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(
                new Class[] {
                        nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
                        nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory.class
                });

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("build/resources/main/suwinet/Diensten/KadasterDossierGSD/v0300-b02/BodyReaction.xsd"));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setSchema(schema);
        logger.info("-------- response start ------------");
        logger.info("-------- JaxB content element size: " + response.getContent().size());
        marshaller.marshal(response, System.out);
        logger.info("\n-------- response end ------------");
    }
}