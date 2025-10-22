
package nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500 package. 
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
    private static final QName _BijstandsregelingenInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.bijstandsregelingen.v0500
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse }
     */
    public BijstandsregelingenInfoResponse createBijstandsregelingenInfoResponse() {
        return new BijstandsregelingenInfoResponse();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi createBijstandsregelingenInfoResponseClientSuwi() {
        return new BijstandsregelingenInfoResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhouding() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiode() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeMaatregelMbtUitkering() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeMaatregelMbtUitkeringRedenMaatregelMbtBijstandUitk() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand createBijstandsregelingenInfoResponseClientSuwiSpecifiekeGegevensBijzBijstand() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Vordering createBijstandsregelingenInfoResponseClientSuwiVordering() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Vordering();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering createBijstandsregelingenInfoResponseClientSuwiAanvraagUitkering() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfo_Type }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfo_Type }
     */
    public BijstandsregelingenInfo_Type createBijstandsregelingenInfo_Type() {
        return new BijstandsregelingenInfo_Type();
    }

    /**
     * Create an instance of {@link Bron }
     * 
     * @return
     *     the new instance of {@link Bron }
     */
    public Bron createBron() {
        return new Bron();
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
     * Create an instance of {@link Partner }
     * 
     * @return
     *     the new instance of {@link Partner }
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link PartnerBijstand }
     * 
     * @return
     *     the new instance of {@link PartnerBijstand }
     */
    public PartnerBijstand createPartnerBijstand() {
        return new PartnerBijstand();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting createBijstandsregelingenInfoResponseClientSuwiHuisvesting() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Huisvesting();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht createBijstandsregelingenInfoResponseClientSuwiSchendingInlichtingenplicht() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.SchendingInlichtingenplicht();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd createBijstandsregelingenInfoResponseClientSuwiDossierGsd() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.DossierGsd();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingSzWet() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SzWet();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingSpecifiekeGegevensBijstandUitk() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.SpecifiekeGegevensBijstandUitk();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.InkomstenInvloedOpBijstandUitk }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.InkomstenInvloedOpBijstandUitk }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.InkomstenInvloedOpBijstandUitk createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingInkomstenInvloedOpBijstandUitk() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.InkomstenInvloedOpBijstandUitk();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingVrijstellingArbeidsplicht() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.VrijstellingArbeidsplicht();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingPartnerUitkeringsverhouding() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.PartnerUitkeringsverhouding();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeInkomstenBijstandUitkering() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.InkomstenBijstandUitkering();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.Normbedrag }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.Normbedrag }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.Normbedrag createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeNormbedrag() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.Normbedrag();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk createBijstandsregelingenInfoResponseClientSuwiUitkeringsverhoudingUitkeringsperiodeMaatregelMbtUitkeringRedenMaatregelMbtBijstandUitkGevolgenMaatregelMbtBijstandUitk() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Uitkeringsverhouding.Uitkeringsperiode.MaatregelMbtUitkering.RedenMaatregelMbtBijstandUitk.GevolgenMaatregelMbtBijstandUitk();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet createBijstandsregelingenInfoResponseClientSuwiSpecifiekeGegevensBijzBijstandSzWet() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.SzWet();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand createBijstandsregelingenInfoResponseClientSuwiSpecifiekeGegevensBijzBijstandPartnerBijzBijstand() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.SpecifiekeGegevensBijzBijstand.PartnerBijzBijstand();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet createBijstandsregelingenInfoResponseClientSuwiVorderingSzWet() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Vordering.SzWet();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.PartnerVordering }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.PartnerVordering }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Vordering.PartnerVordering createBijstandsregelingenInfoResponseClientSuwiVorderingPartnerVordering() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Vordering.PartnerVordering();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude createBijstandsregelingenInfoResponseClientSuwiVorderingFraude() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.Vordering.Fraude();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet createBijstandsregelingenInfoResponseClientSuwiAanvraagUitkeringSzWet() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.SzWet();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering createBijstandsregelingenInfoResponseClientSuwiAanvraagUitkeringBeslissingOpAanvraagUitkering() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.BeslissingOpAanvraagUitkering();
    }

    /**
     * Create an instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering }
     * 
     * @return
     *     the new instance of {@link BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering }
     */
    public BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering createBijstandsregelingenInfoResponseClientSuwiAanvraagUitkeringPartnerAanvraagUitkering() {
        return new BijstandsregelingenInfoResponse.ClientSuwi.AanvraagUitkering.PartnerAanvraagUitkering();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BijstandsregelingenInfoResponse.ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BijstandsregelingenInfoResponse.ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = BijstandsregelingenInfoResponse.class)
    public JAXBElement<BijstandsregelingenInfoResponse.ClientSuwi> createBijstandsregelingenInfoResponseClientSuwi(BijstandsregelingenInfoResponse.ClientSuwi value) {
        return new JAXBElement<>(_BijstandsregelingenInfoResponseClientSuwi_QNAME, BijstandsregelingenInfoResponse.ClientSuwi.class, BijstandsregelingenInfoResponse.class, value);
    }

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
}
