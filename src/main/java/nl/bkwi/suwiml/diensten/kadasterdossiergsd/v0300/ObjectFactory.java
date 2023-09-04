
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300 package. 
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

    private static final QName _PersoonsInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");
    private static final QName _ObjectInfoKadastraleAanduidingResponseOnroerendeZaak_QNAME = new QName("", "OnroerendeZaak");

    private static final QName _FWI_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "FWI");
    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
    public JAXBElement<FWI> createFWI(FWI value) {
        return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostadresKadaster }
     * 
     * @return
     *     the new instance of {@link PostadresKadaster }
     */
    public PostadresKadaster createPostadresKadaster() {
        return new PostadresKadaster();
    }

    /**
     * Create an instance of {@link PubliekrechtelijkeBeperking }
     * 
     * @return
     *     the new instance of {@link PubliekrechtelijkeBeperking }
     */
    public PubliekrechtelijkeBeperking createPubliekrechtelijkeBeperking() {
        return new PubliekrechtelijkeBeperking();
    }

    /**
     * Create an instance of {@link Gerechtigde }
     * 
     * @return
     *     the new instance of {@link Gerechtigde }
     */
    public Gerechtigde createGerechtigde() {
        return new Gerechtigde();
    }

    /**
     * Create an instance of {@link Gerechtigde.NietNatuurlijkPersoon }
     * 
     * @return
     *     the new instance of {@link Gerechtigde.NietNatuurlijkPersoon }
     */
    public Gerechtigde.NietNatuurlijkPersoon createGerechtigdeNietNatuurlijkPersoon() {
        return new Gerechtigde.NietNatuurlijkPersoon();
    }

    /**
     * Create an instance of {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst }
     * 
     * @return
     *     the new instance of {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst }
     */
    public Gerechtigde.NietNatuurlijkPersoon.OndernemingInst createGerechtigdeNietNatuurlijkPersoonOndernemingInst() {
        return new Gerechtigde.NietNatuurlijkPersoon.OndernemingInst();
    }

    /**
     * Create an instance of {@link ClientSuwiPersoonsInfo }
     * 
     * @return
     *     the new instance of {@link ClientSuwiPersoonsInfo }
     */
    public ClientSuwiPersoonsInfo createClientSuwiPersoonsInfo() {
        return new ClientSuwiPersoonsInfo();
    }

    /**
     * Create an instance of {@link PersoonsInfo }
     * 
     * @return
     *     the new instance of {@link PersoonsInfo }
     */
    public PersoonsInfo createPersoonsInfo() {
        return new PersoonsInfo();
    }

    /**
     * Create an instance of {@link ObjectInfoKadastraleAanduiding }
     * 
     * @return
     *     the new instance of {@link ObjectInfoKadastraleAanduiding }
     */
    public ObjectInfoKadastraleAanduiding createObjectInfoKadastraleAanduiding() {
        return new ObjectInfoKadastraleAanduiding();
    }

    /**
     * Create an instance of {@link ObjectInfoLocatieOZ }
     * 
     * @return
     *     the new instance of {@link ObjectInfoLocatieOZ }
     */
    public ObjectInfoLocatieOZ createObjectInfoLocatieOZ() {
        return new ObjectInfoLocatieOZ();
    }

    /**
     * Create an instance of {@link PersoonsInfoResponse }
     * 
     * @return
     *     the new instance of {@link PersoonsInfoResponse }
     */
    public PersoonsInfoResponse createPersoonsInfoResponse() {
        return new PersoonsInfoResponse();
    }

    /**
     * Create an instance of {@link ObjectInfoKadastraleAanduidingResponse }
     * 
     * @return
     *     the new instance of {@link ObjectInfoKadastraleAanduidingResponse }
     */
    public ObjectInfoKadastraleAanduidingResponse createObjectInfoKadastraleAanduidingResponse() {
        return new ObjectInfoKadastraleAanduidingResponse();
    }

    /**
     * Create an instance of {@link KadastraalObject }
     * 
     * @return
     *     the new instance of {@link KadastraalObject }
     */
    public KadastraalObject createKadastraalObject() {
        return new KadastraalObject();
    }

    /**
     * Create an instance of {@link ObjectInfoLocatieOZResponse }
     * 
     * @return
     *     the new instance of {@link ObjectInfoLocatieOZResponse }
     */
    public ObjectInfoLocatieOZResponse createObjectInfoLocatieOZResponse() {
        return new ObjectInfoLocatieOZResponse();
    }

    /**
     * Create an instance of {@link OnroerendeZaak }
     * 
     * @return
     *     the new instance of {@link OnroerendeZaak }
     */
    public OnroerendeZaak createOnroerendeZaak() {
        return new OnroerendeZaak();
    }

    /**
     * Create an instance of {@link KadastraleAanduiding }
     * 
     * @return
     *     the new instance of {@link KadastraleAanduiding }
     */
    public KadastraleAanduiding createKadastraleAanduiding() {
        return new KadastraleAanduiding();
    }

    /**
     * Create an instance of {@link NatuurlijkPersoon }
     * 
     * @return
     *     the new instance of {@link NatuurlijkPersoon }
     */
    public NatuurlijkPersoon createNatuurlijkPersoon() {
        return new NatuurlijkPersoon();
    }

    /**
     * Create an instance of {@link Rechtspersoon }
     * 
     * @return
     *     the new instance of {@link Rechtspersoon }
     */
    public Rechtspersoon createRechtspersoon() {
        return new Rechtspersoon();
    }

    /**
     * Create an instance of {@link StraatadresBag }
     * 
     * @return
     *     the new instance of {@link StraatadresBag }
     */
    public StraatadresBag createStraatadresBag() {
        return new StraatadresBag();
    }

    /**
     * Create an instance of {@link WijzeVerkrijgingEigendom }
     * 
     * @return
     *     the new instance of {@link WijzeVerkrijgingEigendom }
     */
    public WijzeVerkrijgingEigendom createWijzeVerkrijgingEigendom() {
        return new WijzeVerkrijgingEigendom();
    }

    /**
     * Create an instance of {@link ZakelijkRecht }
     * 
     * @return
     *     the new instance of {@link ZakelijkRecht }
     */
    public ZakelijkRecht createZakelijkRecht() {
        return new ZakelijkRecht();
    }

    /**
     * Create an instance of {@link Locatie }
     * 
     * @return
     *     the new instance of {@link Locatie }
     */
    public Locatie createLocatie() {
        return new Locatie();
    }

    /**
     * Create an instance of {@link AdresKadaster }
     * 
     * @return
     *     the new instance of {@link AdresKadaster }
     */
    public AdresKadaster createAdresKadaster() {
        return new AdresKadaster();
    }

    /**
     * Create an instance of {@link GeneriekAdresBuitenland }
     * 
     * @return
     *     the new instance of {@link GeneriekAdresBuitenland }
     */
    public GeneriekAdresBuitenland createGeneriekAdresBuitenland() {
        return new GeneriekAdresBuitenland();
    }

    /**
     * Create an instance of {@link PostadresKadaster.Postbusadres }
     * 
     * @return
     *     the new instance of {@link PostadresKadaster.Postbusadres }
     */
    public PostadresKadaster.Postbusadres createPostadresKadasterPostbusadres() {
        return new PostadresKadaster.Postbusadres();
    }

    /**
     * Create an instance of {@link PubliekrechtelijkeBeperking.AantekeningKadastraalObject }
     * 
     * @return
     *     the new instance of {@link PubliekrechtelijkeBeperking.AantekeningKadastraalObject }
     */
    public PubliekrechtelijkeBeperking.AantekeningKadastraalObject createPubliekrechtelijkeBeperkingAantekeningKadastraalObject() {
        return new PubliekrechtelijkeBeperking.AantekeningKadastraalObject();
    }

    /**
     * Create an instance of {@link PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan }
     * 
     * @return
     *     the new instance of {@link PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan }
     */
    public PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan createPubliekrechtelijkeBeperkingBetrokkenPersoonBestuursorgaan() {
        return new PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan();
    }

    /**
     * Create an instance of {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst }
     * 
     * @return
     *     the new instance of {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst }
     */
    public Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst createGerechtigdeNietNatuurlijkPersoonOndernemingInstNaamOndernemingInst() {
        return new Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst();
    }

    /**
     * Create an instance of {@link ClientSuwiPersoonsInfo.Eigendom }
     * 
     * @return
     *     the new instance of {@link ClientSuwiPersoonsInfo.Eigendom }
     */
    public ClientSuwiPersoonsInfo.Eigendom createClientSuwiPersoonsInfoEigendom() {
        return new ClientSuwiPersoonsInfo.Eigendom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientSuwiPersoonsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientSuwiPersoonsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = PersoonsInfoResponse.class)
    public JAXBElement<ClientSuwiPersoonsInfo> createPersoonsInfoResponseClientSuwi(ClientSuwiPersoonsInfo value) {
        return new JAXBElement<>(_PersoonsInfoResponseClientSuwi_QNAME, ClientSuwiPersoonsInfo.class, PersoonsInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KadastraalObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KadastraalObject }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "OnroerendeZaak", scope = ObjectInfoKadastraleAanduidingResponse.class)
    public JAXBElement<KadastraalObject> createObjectInfoKadastraleAanduidingResponseOnroerendeZaak(KadastraalObject value) {
        return new JAXBElement<>(_ObjectInfoKadastraleAanduidingResponseOnroerendeZaak_QNAME, KadastraalObject.class, ObjectInfoKadastraleAanduidingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnroerendeZaak }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnroerendeZaak }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "OnroerendeZaak", scope = ObjectInfoLocatieOZResponse.class)
    public JAXBElement<OnroerendeZaak> createObjectInfoLocatieOZResponseOnroerendeZaak(OnroerendeZaak value) {
        return new JAXBElement<>(_ObjectInfoKadastraleAanduidingResponseOnroerendeZaak_QNAME, OnroerendeZaak.class, ObjectInfoLocatieOZResponse.class, value);
    }

}
