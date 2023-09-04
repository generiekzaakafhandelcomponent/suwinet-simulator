
package nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200 package. 
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
    private static final QName _UWVPersoonsIkvInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");
    private static final QName _UWVPersoonsIkvInfoResponsePeriodeGegevensleveringIko_QNAME = new QName("", "PeriodeGegevensleveringIko");

    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
    public JAXBElement<FWI> createFWI(FWI value) {
        return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200
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
