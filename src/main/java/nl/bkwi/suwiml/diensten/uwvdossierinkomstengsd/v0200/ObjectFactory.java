
package nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200 package. 
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

    private static final QName _UWVPersoonsIkvInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");
    private static final QName _UWVPersoonsIkvInfoResponsePeriodeGegevensleveringIko_QNAME = new QName("", "PeriodeGegevensleveringIko");

    private static final QName _FWI_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "FWI");

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FWI }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FWI }{@code >}
     */
    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
    public JAXBElement<FWI> createFWI(FWI value) {
        return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfo }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfo }
     */
    public UWVPersoonsIkvInfo createUWVPersoonsIkvInfo() {
        return new UWVPersoonsIkvInfo();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse }
     */
    public UWVPersoonsIkvInfoResponse createUWVPersoonsIkvInfoResponse() {
        return new UWVPersoonsIkvInfoResponse();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi createUWVPersoonsIkvInfoResponseClientSuwi() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhouding() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingSectorRisicogroepIkv() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingAdministratieveEenheid() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingAdministratieveEenheidPersoonAdministratieveEenheid() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfo.PeriodeGegevensvraagIko }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfo.PeriodeGegevensvraagIko }
     */
    public UWVPersoonsIkvInfo.PeriodeGegevensvraagIko createUWVPersoonsIkvInfoPeriodeGegevensvraagIko() {
        return new UWVPersoonsIkvInfo.PeriodeGegevensvraagIko();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko }
     */
    public UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko createUWVPersoonsIkvInfoResponsePeriodeGegevensleveringIko() {
        return new UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko();
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
     * Create an instance of {@link StraatadresBuitenland }
     * 
     * @return
     *     the new instance of {@link StraatadresBuitenland }
     */
    public StraatadresBuitenland createStraatadresBuitenland() {
        return new StraatadresBuitenland();
    }

    /**
     * Create an instance of {@link Postbusadres }
     * 
     * @return
     *     the new instance of {@link Postbusadres }
     */
    public Postbusadres createPostbusadres() {
        return new Postbusadres();
    }

    /**
     * Create an instance of {@link PostbusadresBuitenland }
     * 
     * @return
     *     the new instance of {@link PostbusadresBuitenland }
     */
    public PostbusadresBuitenland createPostbusadresBuitenland() {
        return new PostbusadresBuitenland();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingInkomstenperiode() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingInkomstenopgave() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingSectorRisicogroepIkvSectorBeroepsEnBedrijfsleven() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingAdministratieveEenheidRechtspersoonAdministratieveEenh() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingAdministratieveEenheidFeitelijkAdresAeh() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.CorrespondentieadresAeh }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.CorrespondentieadresAeh }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.CorrespondentieadresAeh createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingAdministratieveEenheidCorrespondentieadresAeh() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.CorrespondentieadresAeh();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.FeitelijkAdresPersoonAeh }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.FeitelijkAdresPersoonAeh }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.FeitelijkAdresPersoonAeh createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingAdministratieveEenheidPersoonAdministratieveEenheidFeitelijkAdresPersoonAeh() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.FeitelijkAdresPersoonAeh();
    }

    /**
     * Create an instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.CorrespondentieadresPersoonAeh }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.CorrespondentieadresPersoonAeh }
     */
    public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.CorrespondentieadresPersoonAeh createUWVPersoonsIkvInfoResponseClientSuwiInkomstenverhoudingAdministratieveEenheidPersoonAdministratieveEenheidCorrespondentieadresPersoonAeh() {
        return new UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.CorrespondentieadresPersoonAeh();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UWVPersoonsIkvInfoResponse.ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UWVPersoonsIkvInfoResponse.ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = UWVPersoonsIkvInfoResponse.class)
    public JAXBElement<UWVPersoonsIkvInfoResponse.ClientSuwi> createUWVPersoonsIkvInfoResponseClientSuwi(UWVPersoonsIkvInfoResponse.ClientSuwi value) {
        return new JAXBElement<>(_UWVPersoonsIkvInfoResponseClientSuwi_QNAME, UWVPersoonsIkvInfoResponse.ClientSuwi.class, UWVPersoonsIkvInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PeriodeGegevensleveringIko", scope = UWVPersoonsIkvInfoResponse.class)
    public JAXBElement<UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko> createUWVPersoonsIkvInfoResponsePeriodeGegevensleveringIko(UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko value) {
        return new JAXBElement<>(_UWVPersoonsIkvInfoResponsePeriodeGegevensleveringIko_QNAME, UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko.class, UWVPersoonsIkvInfoResponse.class, value);
    }

}
