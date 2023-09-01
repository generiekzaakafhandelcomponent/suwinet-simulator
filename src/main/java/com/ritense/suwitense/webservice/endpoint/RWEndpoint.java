package com.ritense.suwitense.webservice.endpoint;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import nl.bkwi.suwiml.basisschema.v0801.StandaardBedr;
import nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.*;
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
public class RWEndpoint extends SuwinetEndpoint {

    Logger logger = LoggerFactory.getLogger(RWEndpoint.class);

    private static final String NAMESPACE_URI = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200";
    private static final String incomingSchema = "build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyAction.xsd";
    private static final String outGoingSchema = "build/resources/main/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd";
    nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.ObjectFactory dossierObjectFactory;

    private static final Class[] incomingClasses = {KentekenInfo.class};
    private static final Class[] outGoingClasses = {
            nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
            nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.ObjectFactory.class
    };

    @Autowired
    public RWEndpoint() {
        super();
        dossierObjectFactory = new nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.ObjectFactory();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "KentekenInfo")
    @ResponsePayload
    public KentekenInfoResponse getKentekenInfo(@RequestPayload KentekenInfo request) throws JAXBException, SAXException {

        logger.info("request.getKentekenVoertuig(): " + request.getKentekenVoertuig());
        logger.info("request: " + printPayload(request, incomingClasses, incomingSchema));

        KentekenInfoResponse response = createResponse();

        if(request.getKentekenVoertuig().isEmpty()) {
            addPersoonNietGevonden(response.getContent());
        } else {
            KentekenInfoResponse.ClientSuwi clientSuwi = createClientSuwiPersoonsInfo(request);
            JAXBElement<KentekenInfoResponse.ClientSuwi> jaxbElement =  new JAXBElement(
                    new QName("ClientSuwi"), KentekenInfoResponse.ClientSuwi.class, clientSuwi);

            response.getContent().add(jaxbElement);

        }
        logger.info("response: " + printPayload(response,outGoingClasses, outGoingSchema));

        return response;
    }

    private KentekenInfoResponse createResponse() {
        return dossierObjectFactory.createKentekenInfoResponse();
    }

    private KentekenInfoResponse.ClientSuwi createClientSuwiPersoonsInfo(KentekenInfo request) {

        /* base fields */
        KentekenInfoResponse.ClientSuwi clientSuwi = dossierObjectFactory.createKentekenInfoResponseClientSuwi();
        clientSuwi.setBurgerservicenr("123456782");
        clientSuwi.setVoorletters("J");
        clientSuwi.setSignificantDeelVanDeAchternaam("Janssen");
        clientSuwi.setGeboortedat("19641031");

        /* RDW adres */
        KentekenInfoResponse.ClientSuwi.RdwAdres rdwAdres = dossierObjectFactory.createKentekenInfoResponseClientSuwiRdwAdres();

        /* RDW adres FeitelijkAdres */
        KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres feitelijkAdres = new KentekenInfoResponse.ClientSuwi.RdwAdres.FeitelijkAdres();
        Straatadres straatadres = new Straatadres();
        straatadres.setPostcd("2511BT");
        straatadres.setHuisnr(BigInteger.valueOf(70));
        straatadres.setWoonplaatsnaam("'s-Gravenhage");
        straatadres.setStraatnaam("Spui");
        feitelijkAdres.setStraatadres(straatadres);
        rdwAdres.setFeitelijkAdres(feitelijkAdres);
        clientSuwi.getRdwAdres().add(rdwAdres);

        /* aansprakelijke */
        KentekenInfoResponse.ClientSuwi.Aansprakelijke aansprakelijke = dossierObjectFactory.createKentekenInfoResponseClientSuwiAansprakelijke();
        clientSuwi.getAansprakelijke().add(aansprakelijke);
        aansprakelijke.setDatEAansprakelijkheid("20230123");
        aansprakelijke.setTijdBAansprakelijkheid("13520000");

        /* aansprakelijke voertuig */
        KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig voertuig = dossierObjectFactory.createKentekenInfoResponseClientSuwiAansprakelijkeVoertuig();
        aansprakelijke.setVoertuig(voertuig);
        voertuig.setCdSrtVoertuig("P");
        voertuig.setKentekenVoertuig(request.getKentekenVoertuig());
        voertuig.setMerkVoertuig("MAZDA");
        voertuig.setTypeVoertuig("MAZDA 5; 1.8");
        voertuig.setHoofdkleurVoertuig("GRIJS");
        voertuig.setDatEersteInschrijvingVoertuigInt("20080104");
        voertuig.setDatEersteInschrijvingVoertuigNat("20080104");

        /* aansprakelijke voertuig bedrBpm */
        StandaardBedr bedrBpm = new StandaardBedr();
        bedrBpm.setWaardeBedr(new BigInteger("685100"));
        bedrBpm.setCdMunteenheid("EUR");
        voertuig.setBedrBpm(bedrBpm);

        /* aansprakelijke voertuig keuring */
        KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring keuring = new KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig.Keuring();
        keuring.setDatEGeldigheidApk("20240714");
        voertuig.getKeuring().add(keuring);

        /* aansprakelijke voertuig verzekering */
        setVerzekering(voertuig);
        return clientSuwi;
    }

    private void setVerzekering(KentekenInfoResponse.ClientSuwi.Aansprakelijke.Voertuig voertuig) {
        /* verzekering voertuig */
        Verzekering verzekering = new Verzekering();
        voertuig.setVerzekering(verzekering);

        /* verzekering basis velden */
        verzekering.setCdSrtDekking("WAM");
        verzekering.setPolisnr("11138000002");
        verzekering.setDatBVerzekering("20230401");
        verzekering.setDatEVerzekering("20240401");

        /* verzekering Verzekeringsmaatschappij */
        Verzekering.Verzekeringsmaatschappij verzekeringsMaatschappij = new Verzekering.Verzekeringsmaatschappij();
        verzekering.setVerzekeringsmaatschappij(verzekeringsMaatschappij);
        verzekeringsMaatschappij.setCdVerzekeringsmaatschappijRdw("NowG");
        verzekeringsMaatschappij.setNaamVerzekeringsmaatschappijRdw("NowGo");

        /* verzekering Verzekeringsmaatschappij adres */
        Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw adresverzekeringsMaatschappij = new Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw();
        StraatadresVerkort straatadresVerzekeringsMaatschappij = new StraatadresVerkort();
        straatadresVerzekeringsMaatschappij.setWoonplaatsnaam("Meppel");
        straatadresVerzekeringsMaatschappij.setStraatnaam("Kerkstraat");
        straatadresVerzekeringsMaatschappij.setPostcd("2312RE");
        straatadresVerzekeringsMaatschappij.setHuisnrtoevoeging("II");
        straatadresVerzekeringsMaatschappij.setHuisnr(BigInteger.valueOf(82));
        adresverzekeringsMaatschappij.setStraatadres(straatadresVerzekeringsMaatschappij);
        verzekeringsMaatschappij.setAdresVerzekeringsmaatschappijRdw(adresverzekeringsMaatschappij);

        /* verzekering Verzekeringsmaatschappij gevolmachtigde */
        Verzekering.Verzekeringsmaatschappij.Gevolmachtigde gevolmachtigde = new Verzekering.Verzekeringsmaatschappij.Gevolmachtigde();
        verzekeringsMaatschappij.setGevolmachtigde(gevolmachtigde);
        gevolmachtigde.setNaamGevolmachtigde("Bert");
        gevolmachtigde.setCdGevolmachtigde("CODE");
        Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde adresGevolmachtigde = new Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde();
        gevolmachtigde.setAdresGevolmachtigde(adresGevolmachtigde);

        StraatadresVerkort straatadresgevolmachtigde = new StraatadresVerkort();
        straatadresgevolmachtigde.setStraatnaam("Dorpstraat");
        straatadresgevolmachtigde.setPostcd("3434TE");
        straatadresgevolmachtigde.setHuisnr(BigInteger.valueOf(63));
        straatadresgevolmachtigde.setWoonplaatsnaam("Boxtel");
        adresGevolmachtigde.setStraatadres(straatadresgevolmachtigde);
    }
}