package com.example.producingwebservice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ClientSuwiPersoonsInfo;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfoResponse;
import nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PostadresKadaster;
import nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.KentekenInfo;
import nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.KentekenInfoResponse;
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
public class RWDEndpoint {

    Logger logger = LoggerFactory.getLogger(RWDEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200";

    nl.bkwi.suwiml.fwi.v0205.ObjectFactory fwiObjectFactory;
    nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.ObjectFactory dossierObjectFactory;

    @Autowired
    public RWDEndpoint() {
        fwiObjectFactory = new nl.bkwi.suwiml.fwi.v0205.ObjectFactory();
        dossierObjectFactory = new nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.ObjectFactory();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "KentekenInfo")
    @ResponsePayload
    public KentekenInfoResponse getKentekenInfo(@RequestPayload KentekenInfo request) throws JAXBException, SAXException {

        logger.info("request.getKentekenVoertuig(): " + request.getKentekenVoertuig());
        printRequest(request);

        KentekenInfoResponse response = createResponse();

        if(request.getKentekenVoertuig().isEmpty()) {
            addPersoonNietGevonden(response);
        } else {
            addClientSuwiPersoonsInfo(request, response);
        }
        printResponse(response);

        return response;
    }

    private void addPersoonNietGevonden(KentekenInfoResponse response) {
        response.getContent().add(fwiObjectFactory.createNietsGevonden("nope die ken ik niet"));
    }

    private KentekenInfoResponse createResponse() {
        return dossierObjectFactory.createKentekenInfoResponse();
    }

    private void addClientSuwiPersoonsInfo(KentekenInfo request, KentekenInfoResponse response) {


        KentekenInfoResponse.ClientSuwi kentekenInfoResponseClientSuwi = dossierObjectFactory.createKentekenInfoResponseClientSuwi();
        kentekenInfoResponseClientSuwi.setBurgerservicenr("123456782");
        kentekenInfoResponseClientSuwi.setVoorletters("J");
        kentekenInfoResponseClientSuwi.setSignificantDeelVanDeAchternaam("Janssen");
        kentekenInfoResponseClientSuwi.setGeboortedat("19641031");

//        clientSuwiPersoonsInfo.setBurgerservicenr(request.getBurgerservicenr());
//        clientSuwiPersoonsInfo.setGeboortedat("19520524");
//        ClientSuwiPersoonsInfo.Eigendom eigendom = new ClientSuwiPersoonsInfo.Eigendom();
//        eigendom.setIndEigendomOZVerleden("1");
//        clientSuwiPersoonsInfo.setDatToestandKadaster("19920526");
//        clientSuwiPersoonsInfo.setDatFiatteringKadaster("19720127");
//        clientSuwiPersoonsInfo.setEigendom(eigendom);
//        PostadresKadaster postAdres = dossierObjectFactory.createPostadresKadaster();
//        postAdres.setGeneriekAdresBuitenland(null);
//        PostadresKadaster.Postbusadres postbusadres = new PostadresKadaster.Postbusadres();
//        postbusadres.setGemeentenaam("gemeentenaam");
//        postbusadres.setLocatieoms("locatieoms");
//        postbusadres.setPostbusnr(BigInteger.valueOf(12345));
//        postbusadres.setPostcd("1111wx");
//        postbusadres.setWoonplaatsnaam("awdawdawd");
//        postAdres.setPostbusadres(postbusadres);
//        postAdres.setStraatadresBag(null);
//        clientSuwiPersoonsInfo.setCorrespondentieadres(postAdres);
        JAXBElement<ClientSuwiPersoonsInfo> jaxbElement =  new JAXBElement(
                new QName("ClientSuwi"), KentekenInfoResponse.ClientSuwi.class, kentekenInfoResponseClientSuwi);

        response.getContent().add(jaxbElement);
    }

    private void printRequest(KentekenInfo request) throws JAXBException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] {KentekenInfo.class});

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyAction.xsd"));

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
                        nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.ObjectFactory.class
                });

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd"));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setSchema(schema);
        logger.info("-------- response start ------------");
        logger.info("-------- JaxB content element size: " + response.getContent().size());
        marshaller.marshal(response, System.out);
        logger.info("\n-------- response end ------------");
    }
}