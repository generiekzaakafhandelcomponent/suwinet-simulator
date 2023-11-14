
package nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200 package. 
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

    private static final QName _SVBPersoonsInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse }
     */
    public SVBPersoonsInfoResponse createSVBPersoonsInfoResponse() {
        return new SVBPersoonsInfoResponse();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi }
     */
    public SVBPersoonsInfoResponse.ClientSuwi createSVBPersoonsInfoResponseClientSuwi() {
        return new SVBPersoonsInfoResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding createSVBPersoonsInfoResponseClientSuwiUitkeringsverhouding() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode createSVBPersoonsInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiode() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering createSVBPersoonsInfoResponseClientSuwiAanvraagUitkering() {
        return new SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Kind }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Kind }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Kind createSVBPersoonsInfoResponseClientSuwiKind() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Kind();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfo }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfo }
     */
    public SVBPersoonsInfo createSVBPersoonsInfo() {
        return new SVBPersoonsInfo();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet createSVBPersoonsInfoResponseClientSuwiUitkeringsverhoudingSzWet() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensRemigratiewet }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensRemigratiewet }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensRemigratiewet createSVBPersoonsInfoResponseClientSuwiUitkeringsverhoudingSpecifiekeGegevensRemigratiewet() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensRemigratiewet();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow createSVBPersoonsInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeSpecifiekeGegevensAow() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.SpecifiekeGegevensAow();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedr }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedr }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedr createSVBPersoonsInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeBrutoUitkeringsbedr() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedr();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.NettoUitkeringsbedr }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.NettoUitkeringsbedr }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.NettoUitkeringsbedr createSVBPersoonsInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeNettoUitkeringsbedr() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.NettoUitkeringsbedr();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet createSVBPersoonsInfoResponseClientSuwiAanvraagUitkeringSzWet() {
        return new SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.SzWet();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering createSVBPersoonsInfoResponseClientSuwiAanvraagUitkeringBeslissingOpAanvraagUitkering() {
        return new SVBPersoonsInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering();
    }

    /**
     * Create an instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag }
     * 
     * @return
     *     the new instance of {@link SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag }
     */
    public SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag createSVBPersoonsInfoResponseClientSuwiKindSpecifiekeGegevensKinderbijslag() {
        return new SVBPersoonsInfoResponse.ClientSuwi.Kind.SpecifiekeGegevensKinderbijslag();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SVBPersoonsInfoResponse.ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SVBPersoonsInfoResponse.ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = SVBPersoonsInfoResponse.class)
    public JAXBElement<SVBPersoonsInfoResponse.ClientSuwi> createSVBPersoonsInfoResponseClientSuwi(SVBPersoonsInfoResponse.ClientSuwi value) {
        return new JAXBElement<>(_SVBPersoonsInfoResponseClientSuwi_QNAME, SVBPersoonsInfoResponse.ClientSuwi.class, SVBPersoonsInfoResponse.class, value);
    }

}
