
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _FWI_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "FWI");

    private static final QName _AanvraagPersoon_QNAME = new QName("http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", "AanvraagPersoon");
    private static final QName _AanvraagPersoonResponseClientSuwi_QNAME = new QName("", "ClientSuwi");

    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
    public JAXBElement<FWI> createFWI(FWI value) {
        return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Request }
     * 
     * @return
     *     the new instance of {@link Request }
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link AanvraagPersoonResponse }
     * 
     * @return
     *     the new instance of {@link AanvraagPersoonResponse }
     */
    public AanvraagPersoonResponse createAanvraagPersoonResponse() {
        return new AanvraagPersoonResponse();
    }

    /**
     * Create an instance of {@link ClientSuwi }
     * 
     * @return
     *     the new instance of {@link ClientSuwi }
     */
    public ClientSuwi createClientSuwi() {
        return new ClientSuwi();
    }

    /**
     * Create an instance of {@link ClientSuwiHistorisch }
     * 
     * @return
     *     the new instance of {@link ClientSuwiHistorisch }
     */
    public ClientSuwiHistorisch createClientSuwiHistorisch() {
        return new ClientSuwiHistorisch();
    }

    /**
     * Create an instance of {@link AangifteAdreshoudingBrp }
     * 
     * @return
     *     the new instance of {@link AangifteAdreshoudingBrp }
     */
    public AangifteAdreshoudingBrp createAangifteAdreshoudingBrp() {
        return new AangifteAdreshoudingBrp();
    }

    /**
     * Create an instance of {@link AangifteAdreshoudingBrpHistorisch }
     * 
     * @return
     *     the new instance of {@link AangifteAdreshoudingBrpHistorisch }
     */
    public AangifteAdreshoudingBrpHistorisch createAangifteAdreshoudingBrpHistorisch() {
        return new AangifteAdreshoudingBrpHistorisch();
    }

    /**
     * Create an instance of {@link Immigratie }
     * 
     * @return
     *     the new instance of {@link Immigratie }
     */
    public Immigratie createImmigratie() {
        return new Immigratie();
    }

    /**
     * Create an instance of {@link ImmigratieHistorisch }
     * 
     * @return
     *     the new instance of {@link ImmigratieHistorisch }
     */
    public ImmigratieHistorisch createImmigratieHistorisch() {
        return new ImmigratieHistorisch();
    }

    /**
     * Create an instance of {@link InschrijvingsgegevensBrp }
     * 
     * @return
     *     the new instance of {@link InschrijvingsgegevensBrp }
     */
    public InschrijvingsgegevensBrp createInschrijvingsgegevensBrp() {
        return new InschrijvingsgegevensBrp();
    }

    /**
     * Create an instance of {@link RniDeelnemer }
     * 
     * @return
     *     the new instance of {@link RniDeelnemer }
     */
    public RniDeelnemer createRniDeelnemer() {
        return new RniDeelnemer();
    }

    /**
     * Create an instance of {@link VerificatieRni }
     * 
     * @return
     *     the new instance of {@link VerificatieRni }
     */
    public VerificatieRni createVerificatieRni() {
        return new VerificatieRni();
    }

    /**
     * Create an instance of {@link FeitelijkAdresBuitenland }
     * 
     * @return
     *     the new instance of {@link FeitelijkAdresBuitenland }
     */
    public FeitelijkAdresBuitenland createFeitelijkAdresBuitenland() {
        return new FeitelijkAdresBuitenland();
    }

    /**
     * Create an instance of {@link FeitelijkAdresBuitenlandHistorisch }
     * 
     * @return
     *     the new instance of {@link FeitelijkAdresBuitenlandHistorisch }
     */
    public FeitelijkAdresBuitenlandHistorisch createFeitelijkAdresBuitenlandHistorisch() {
        return new FeitelijkAdresBuitenlandHistorisch();
    }

    /**
     * Create an instance of {@link Gezagsverhouding }
     * 
     * @return
     *     the new instance of {@link Gezagsverhouding }
     */
    public Gezagsverhouding createGezagsverhouding() {
        return new Gezagsverhouding();
    }

    /**
     * Create an instance of {@link Huwelijk }
     * 
     * @return
     *     the new instance of {@link Huwelijk }
     */
    public Huwelijk createHuwelijk() {
        return new Huwelijk();
    }

    /**
     * Create an instance of {@link HuwelijkHistorisch }
     * 
     * @return
     *     the new instance of {@link HuwelijkHistorisch }
     */
    public HuwelijkHistorisch createHuwelijkHistorisch() {
        return new HuwelijkHistorisch();
    }

    /**
     * Create an instance of {@link Kind }
     * 
     * @return
     *     the new instance of {@link Kind }
     */
    public Kind createKind() {
        return new Kind();
    }

    /**
     * Create an instance of {@link Nationaliteit }
     * 
     * @return
     *     the new instance of {@link Nationaliteit }
     */
    public Nationaliteit createNationaliteit() {
        return new Nationaliteit();
    }

    /**
     * Create an instance of {@link NationaliteitHistorisch }
     * 
     * @return
     *     the new instance of {@link NationaliteitHistorisch }
     */
    public NationaliteitHistorisch createNationaliteitHistorisch() {
        return new NationaliteitHistorisch();
    }

    /**
     * Create an instance of {@link Ouder1 }
     * 
     * @return
     *     the new instance of {@link Ouder1 }
     */
    public Ouder1 createOuder1() {
        return new Ouder1();
    }

    /**
     * Create an instance of {@link Ouder2 }
     * 
     * @return
     *     the new instance of {@link Ouder2 }
     */
    public Ouder2 createOuder2() {
        return new Ouder2();
    }

    /**
     * Create an instance of {@link Overlijden }
     * 
     * @return
     *     the new instance of {@link Overlijden }
     */
    public Overlijden createOverlijden() {
        return new Overlijden();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     * @return
     *     the new instance of {@link Partner }
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link PartnerHistorisch }
     * 
     * @return
     *     the new instance of {@link PartnerHistorisch }
     */
    public PartnerHistorisch createPartnerHistorisch() {
        return new PartnerHistorisch();
    }

    /**
     * Create an instance of {@link Straatadres }
     * 
     * @return
     *     the new instance of {@link Straatadres }
     */
    public Straatadres createStraatadres() {
        return new Straatadres();
    }

    /**
     * Create an instance of {@link StraatadresHistorisch }
     * 
     * @return
     *     the new instance of {@link StraatadresHistorisch }
     */
    public StraatadresHistorisch createStraatadresHistorisch() {
        return new StraatadresHistorisch();
    }

    /**
     * Create an instance of {@link VerblijfplaatsHistorisch }
     * 
     * @return
     *     the new instance of {@link VerblijfplaatsHistorisch }
     */
    public VerblijfplaatsHistorisch createVerblijfplaatsHistorisch() {
        return new VerblijfplaatsHistorisch();
    }

    /**
     * Create an instance of {@link Verblijfstitel }
     * 
     * @return
     *     the new instance of {@link Verblijfstitel }
     */
    public Verblijfstitel createVerblijfstitel() {
        return new Verblijfstitel();
    }

    /**
     * Create an instance of {@link VerblijfstitelHistorisch }
     * 
     * @return
     *     the new instance of {@link VerblijfstitelHistorisch }
     */
    public VerblijfstitelHistorisch createVerblijfstitelHistorisch() {
        return new VerblijfstitelHistorisch();
    }

    /**
     * Create an instance of {@link TitulatuurPersoon }
     * 
     * @return
     *     the new instance of {@link TitulatuurPersoon }
     */
    public TitulatuurPersoon createTitulatuurPersoon() {
        return new TitulatuurPersoon();
    }

    /**
     * Create an instance of {@link TitulatuurOuder1 }
     * 
     * @return
     *     the new instance of {@link TitulatuurOuder1 }
     */
    public TitulatuurOuder1 createTitulatuurOuder1() {
        return new TitulatuurOuder1();
    }

    /**
     * Create an instance of {@link TitulatuurOuder2 }
     * 
     * @return
     *     the new instance of {@link TitulatuurOuder2 }
     */
    public TitulatuurOuder2 createTitulatuurOuder2() {
        return new TitulatuurOuder2();
    }

    /**
     * Create an instance of {@link TitulatuurHuwelijk }
     * 
     * @return
     *     the new instance of {@link TitulatuurHuwelijk }
     */
    public TitulatuurHuwelijk createTitulatuurHuwelijk() {
        return new TitulatuurHuwelijk();
    }

    /**
     * Create an instance of {@link TitulatuurKind }
     * 
     * @return
     *     the new instance of {@link TitulatuurKind }
     */
    public TitulatuurKind createTitulatuurKind() {
        return new TitulatuurKind();
    }

    /**
     * Create an instance of {@link OnderzoekGeg }
     * 
     * @return
     *     the new instance of {@link OnderzoekGeg }
     */
    public OnderzoekGeg createOnderzoekGeg() {
        return new OnderzoekGeg();
    }

    /**
     * Create an instance of {@link OnjuistGeg }
     * 
     * @return
     *     the new instance of {@link OnjuistGeg }
     */
    public OnjuistGeg createOnjuistGeg() {
        return new OnjuistGeg();
    }

    /**
     * Create an instance of {@link Geldigheid }
     * 
     * @return
     *     the new instance of {@link Geldigheid }
     */
    public Geldigheid createGeldigheid() {
        return new Geldigheid();
    }

    /**
     * Create an instance of {@link Documentindicatie }
     * 
     * @return
     *     the new instance of {@link Documentindicatie }
     */
    public Documentindicatie createDocumentindicatie() {
        return new Documentindicatie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     */
    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", name = "AanvraagPersoon")
    public JAXBElement<Request> createAanvraagPersoon(Request value) {
        return new JAXBElement<>(_AanvraagPersoon_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = AanvraagPersoonResponse.class)
    public JAXBElement<ClientSuwi> createAanvraagPersoonResponseClientSuwi(ClientSuwi value) {
        return new JAXBElement<>(_AanvraagPersoonResponseClientSuwi_QNAME, ClientSuwi.class, AanvraagPersoonResponse.class, value);
    }

}
