
package nl.bkwi.suwiml.diensten.uwvdossierwerknemersverzekeringengsd.v0200;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.uwvdossierwerknemersverzekeringengsd.v0200 package. 
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

    private static final QName _UWVPersoonsWvInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.uwvdossierwerknemersverzekeringengsd.v0200
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse }
     */
    public UWVPersoonsWvInfoResponse createUWVPersoonsWvInfoResponse() {
        return new UWVPersoonsWvInfoResponse();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi createUWVPersoonsWvInfoResponseClientSuwi() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhouding() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiode() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingSectorBeroepsEnBedrijfsleven() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingSectorBeroepsEnBedrijfslevenPartijSuwi() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering createUWVPersoonsWvInfoResponseClientSuwiAanvraagUitkering() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfo }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfo }
     */
    public UWVPersoonsWvInfo createUWVPersoonsWvInfo() {
        return new UWVPersoonsWvInfo();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.ArbeidsgeschiktheidClient }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.ArbeidsgeschiktheidClient }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.ArbeidsgeschiktheidClient createUWVPersoonsWvInfoResponseClientSuwiArbeidsgeschiktheidClient() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.ArbeidsgeschiktheidClient();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.WerkloosheidClient }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.WerkloosheidClient }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.WerkloosheidClient createUWVPersoonsWvInfoResponseClientSuwiWerkloosheidClient() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.WerkloosheidClient();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingSzWet() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingSpecifiekeGegevensWwUitkering() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensWwUitkering();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.RedenMaatregelMbtUitkeringUwv }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.RedenMaatregelMbtUitkeringUwv }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.RedenMaatregelMbtUitkeringUwv createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeRedenMaatregelMbtUitkeringUwv() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.RedenMaatregelMbtUitkeringUwv();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedrag }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedrag }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedrag createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeBrutoUitkeringsbedrag() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.BrutoUitkeringsbedrag();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi createUWVPersoonsWvInfoResponseClientSuwiUitkeringsverhoudingSectorBeroepsEnBedrijfslevenPartijSuwiKolomSuwi() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.Uitkeringsverhouding.SectorBeroepsEnBedrijfsleven.PartijSuwi.KolomSuwi();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet createUWVPersoonsWvInfoResponseClientSuwiAanvraagUitkeringSzWet() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.SzWet();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw createUWVPersoonsWvInfoResponseClientSuwiAanvraagUitkeringAanvraagWw() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.AanvraagWw();
    }

    /**
     * Create an instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
     * 
     * @return
     *     the new instance of {@link UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
     */
    public UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering createUWVPersoonsWvInfoResponseClientSuwiAanvraagUitkeringBeslissingOpAanvraagUitkering() {
        return new UWVPersoonsWvInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UWVPersoonsWvInfoResponse.ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UWVPersoonsWvInfoResponse.ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = UWVPersoonsWvInfoResponse.class)
    public JAXBElement<UWVPersoonsWvInfoResponse.ClientSuwi> createUWVPersoonsWvInfoResponseClientSuwi(UWVPersoonsWvInfoResponse.ClientSuwi value) {
        return new JAXBElement<>(_UWVPersoonsWvInfoResponseClientSuwi_QNAME, UWVPersoonsWvInfoResponse.ClientSuwi.class, UWVPersoonsWvInfoResponse.class, value);
    }

}
