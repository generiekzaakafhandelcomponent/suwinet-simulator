
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientSuwi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClientSuwi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
 *         <element name="CdBrpGegevensGeheim" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}CdBrpGegevensGeheim" minOccurs="0"/>
 *         <element name="ANr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}ANr" minOccurs="0"/>
 *         <element name="AanduidingNaamgebruik" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AanduidingNaamgebruik" minOccurs="0"/>
 *         <element name="Geslacht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Geslacht" minOccurs="0"/>
 *         <element name="CdGeboortegemeente" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGemeenteGba" minOccurs="0"/>
 *         <element name="Geboorteplaats" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN40" minOccurs="0"/>
 *         <element name="Geboorteland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdLandGba" minOccurs="0"/>
 *         <element name="Titulatuur" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}TitulatuurPersoon" minOccurs="0"/>
 *         <element name="OnderzoekGegPersoon" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="GeldigheidGegevensPersoon" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Geldigheid" minOccurs="0"/>
 *         <element name="ClientSuwiHistorisch" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}ClientSuwiHistorisch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Nationaliteit" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Nationaliteit" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NationaliteitHistorisch" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}NationaliteitHistorisch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Verblijfstitel" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Verblijfstitel" minOccurs="0"/>
 *         <element name="VerblijfstitelHistorisch" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}VerblijfstitelHistorisch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DomicilieAdres" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Straatadres" minOccurs="0"/>
 *         <element name="Correspondentieadres" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Straatadres" minOccurs="0"/>
 *         <element name="FeitelijkAdresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}FeitelijkAdresBuitenland" minOccurs="0"/>
 *         <element name="Immigratie" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Immigratie" minOccurs="0"/>
 *         <element name="AangifteAdreshoudingBrp" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}AangifteAdreshoudingBrp" minOccurs="0"/>
 *         <element name="OnderzoekGegVerblijfplaats" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="VerblijfplaatsHistorisch" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}VerblijfplaatsHistorisch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Overlijden" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Overlijden" minOccurs="0"/>
 *         <element name="Ouder1" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Ouder1" minOccurs="0"/>
 *         <element name="Ouder2" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Ouder2" minOccurs="0"/>
 *         <element name="Huwelijk" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Huwelijk" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HuwelijkHistorisch" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}HuwelijkHistorisch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Kind" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Kind" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Gezagsverhouding" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Gezagsverhouding" minOccurs="0"/>
 *         <element name="InschrijvingsgegevensBrp" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}InschrijvingsgegevensBrp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientSuwi", propOrder = {
    "voornamen",
    "voorvoegsel",
    "significantDeelVanDeAchternaam",
    "geboortedat",
    "burgerservicenr",
    "cdBrpGegevensGeheim",
    "aNr",
    "aanduidingNaamgebruik",
    "geslacht",
    "cdGeboortegemeente",
    "geboorteplaats",
    "geboorteland",
    "titulatuur",
    "onderzoekGegPersoon",
    "geldigheidGegevensPersoon",
    "clientSuwiHistorisch",
    "nationaliteit",
    "nationaliteitHistorisch",
    "verblijfstitel",
    "verblijfstitelHistorisch",
    "domicilieAdres",
    "correspondentieadres",
    "feitelijkAdresBuitenland",
    "immigratie",
    "aangifteAdreshoudingBrp",
    "onderzoekGegVerblijfplaats",
    "verblijfplaatsHistorisch",
    "overlijden",
    "ouder1",
    "ouder2",
    "huwelijk",
    "huwelijkHistorisch",
    "kind",
    "gezagsverhouding",
    "inschrijvingsgegevensBrp"
})
public class ClientSuwi {

    @XmlElement(name = "Voornamen")
    protected String voornamen;
    @XmlElement(name = "Voorvoegsel")
    protected String voorvoegsel;
    @XmlElement(name = "SignificantDeelVanDeAchternaam")
    protected String significantDeelVanDeAchternaam;
    @XmlElement(name = "Geboortedat")
    protected String geboortedat;
    @XmlElement(name = "Burgerservicenr")
    protected String burgerservicenr;
    @XmlElement(name = "CdBrpGegevensGeheim")
    protected String cdBrpGegevensGeheim;
    @XmlElement(name = "ANr")
    protected String aNr;
    @XmlElement(name = "AanduidingNaamgebruik")
    protected String aanduidingNaamgebruik;
    @XmlElement(name = "Geslacht")
    protected String geslacht;
    @XmlElement(name = "CdGeboortegemeente")
    protected String cdGeboortegemeente;
    @XmlElement(name = "Geboorteplaats")
    protected String geboorteplaats;
    @XmlElement(name = "Geboorteland")
    protected String geboorteland;
    @XmlElement(name = "Titulatuur")
    protected TitulatuurPersoon titulatuur;
    @XmlElement(name = "OnderzoekGegPersoon")
    protected OnderzoekGeg onderzoekGegPersoon;
    @XmlElement(name = "GeldigheidGegevensPersoon")
    protected Geldigheid geldigheidGegevensPersoon;
    @XmlElement(name = "ClientSuwiHistorisch")
    protected List<ClientSuwiHistorisch> clientSuwiHistorisch;
    @XmlElement(name = "Nationaliteit")
    protected List<Nationaliteit> nationaliteit;
    @XmlElement(name = "NationaliteitHistorisch")
    protected List<NationaliteitHistorisch> nationaliteitHistorisch;
    @XmlElement(name = "Verblijfstitel")
    protected Verblijfstitel verblijfstitel;
    @XmlElement(name = "VerblijfstitelHistorisch")
    protected List<VerblijfstitelHistorisch> verblijfstitelHistorisch;
    @XmlElement(name = "DomicilieAdres")
    protected Straatadres domicilieAdres;
    @XmlElement(name = "Correspondentieadres")
    protected Straatadres correspondentieadres;
    @XmlElement(name = "FeitelijkAdresBuitenland")
    protected FeitelijkAdresBuitenland feitelijkAdresBuitenland;
    @XmlElement(name = "Immigratie")
    protected Immigratie immigratie;
    @XmlElement(name = "AangifteAdreshoudingBrp")
    protected AangifteAdreshoudingBrp aangifteAdreshoudingBrp;
    @XmlElement(name = "OnderzoekGegVerblijfplaats")
    protected OnderzoekGeg onderzoekGegVerblijfplaats;
    @XmlElement(name = "VerblijfplaatsHistorisch")
    protected List<VerblijfplaatsHistorisch> verblijfplaatsHistorisch;
    @XmlElement(name = "Overlijden")
    protected Overlijden overlijden;
    @XmlElement(name = "Ouder1")
    protected Ouder1 ouder1;
    @XmlElement(name = "Ouder2")
    protected Ouder2 ouder2;
    @XmlElement(name = "Huwelijk")
    protected List<Huwelijk> huwelijk;
    @XmlElement(name = "HuwelijkHistorisch")
    protected List<HuwelijkHistorisch> huwelijkHistorisch;
    @XmlElement(name = "Kind")
    protected List<Kind> kind;
    @XmlElement(name = "Gezagsverhouding")
    protected Gezagsverhouding gezagsverhouding;
    @XmlElement(name = "InschrijvingsgegevensBrp")
    protected InschrijvingsgegevensBrp inschrijvingsgegevensBrp;

    /**
     * Gets the value of the voornamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoornamen() {
        return voornamen;
    }

    /**
     * Sets the value of the voornamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoornamen(String value) {
        this.voornamen = value;
    }

    /**
     * Gets the value of the voorvoegsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorvoegsel() {
        return voorvoegsel;
    }

    /**
     * Sets the value of the voorvoegsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorvoegsel(String value) {
        this.voorvoegsel = value;
    }

    /**
     * Gets the value of the significantDeelVanDeAchternaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantDeelVanDeAchternaam() {
        return significantDeelVanDeAchternaam;
    }

    /**
     * Sets the value of the significantDeelVanDeAchternaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantDeelVanDeAchternaam(String value) {
        this.significantDeelVanDeAchternaam = value;
    }

    /**
     * Gets the value of the geboortedat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboortedat() {
        return geboortedat;
    }

    /**
     * Sets the value of the geboortedat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboortedat(String value) {
        this.geboortedat = value;
    }

    /**
     * Gets the value of the burgerservicenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurgerservicenr() {
        return burgerservicenr;
    }

    /**
     * Sets the value of the burgerservicenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurgerservicenr(String value) {
        this.burgerservicenr = value;
    }

    /**
     * Gets the value of the cdBrpGegevensGeheim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBrpGegevensGeheim() {
        return cdBrpGegevensGeheim;
    }

    /**
     * Sets the value of the cdBrpGegevensGeheim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBrpGegevensGeheim(String value) {
        this.cdBrpGegevensGeheim = value;
    }

    /**
     * Gets the value of the aNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANr() {
        return aNr;
    }

    /**
     * Sets the value of the aNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANr(String value) {
        this.aNr = value;
    }

    /**
     * Gets the value of the aanduidingNaamgebruik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanduidingNaamgebruik() {
        return aanduidingNaamgebruik;
    }

    /**
     * Sets the value of the aanduidingNaamgebruik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanduidingNaamgebruik(String value) {
        this.aanduidingNaamgebruik = value;
    }

    /**
     * Gets the value of the geslacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslacht() {
        return geslacht;
    }

    /**
     * Sets the value of the geslacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslacht(String value) {
        this.geslacht = value;
    }

    /**
     * Gets the value of the cdGeboortegemeente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGeboortegemeente() {
        return cdGeboortegemeente;
    }

    /**
     * Sets the value of the cdGeboortegemeente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGeboortegemeente(String value) {
        this.cdGeboortegemeente = value;
    }

    /**
     * Gets the value of the geboorteplaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboorteplaats() {
        return geboorteplaats;
    }

    /**
     * Sets the value of the geboorteplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboorteplaats(String value) {
        this.geboorteplaats = value;
    }

    /**
     * Gets the value of the geboorteland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboorteland() {
        return geboorteland;
    }

    /**
     * Sets the value of the geboorteland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboorteland(String value) {
        this.geboorteland = value;
    }

    /**
     * Gets the value of the titulatuur property.
     * 
     * @return
     *     possible object is
     *     {@link TitulatuurPersoon }
     *     
     */
    public TitulatuurPersoon getTitulatuur() {
        return titulatuur;
    }

    /**
     * Sets the value of the titulatuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitulatuurPersoon }
     *     
     */
    public void setTitulatuur(TitulatuurPersoon value) {
        this.titulatuur = value;
    }

    /**
     * Gets the value of the onderzoekGegPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegPersoon() {
        return onderzoekGegPersoon;
    }

    /**
     * Sets the value of the onderzoekGegPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegPersoon(OnderzoekGeg value) {
        this.onderzoekGegPersoon = value;
    }

    /**
     * Gets the value of the geldigheidGegevensPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link Geldigheid }
     *     
     */
    public Geldigheid getGeldigheidGegevensPersoon() {
        return geldigheidGegevensPersoon;
    }

    /**
     * Sets the value of the geldigheidGegevensPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geldigheid }
     *     
     */
    public void setGeldigheidGegevensPersoon(Geldigheid value) {
        this.geldigheidGegevensPersoon = value;
    }

    /**
     * Gets the value of the clientSuwiHistorisch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clientSuwiHistorisch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientSuwiHistorisch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientSuwiHistorisch }
     * 
     * 
     * @return
     *     The value of the clientSuwiHistorisch property.
     */
    public List<ClientSuwiHistorisch> getClientSuwiHistorisch() {
        if (clientSuwiHistorisch == null) {
            clientSuwiHistorisch = new ArrayList<>();
        }
        return this.clientSuwiHistorisch;
    }

    /**
     * Gets the value of the nationaliteit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nationaliteit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationaliteit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nationaliteit }
     * 
     * 
     * @return
     *     The value of the nationaliteit property.
     */
    public List<Nationaliteit> getNationaliteit() {
        if (nationaliteit == null) {
            nationaliteit = new ArrayList<>();
        }
        return this.nationaliteit;
    }

    /**
     * Gets the value of the nationaliteitHistorisch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nationaliteitHistorisch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationaliteitHistorisch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationaliteitHistorisch }
     * 
     * 
     * @return
     *     The value of the nationaliteitHistorisch property.
     */
    public List<NationaliteitHistorisch> getNationaliteitHistorisch() {
        if (nationaliteitHistorisch == null) {
            nationaliteitHistorisch = new ArrayList<>();
        }
        return this.nationaliteitHistorisch;
    }

    /**
     * Gets the value of the verblijfstitel property.
     * 
     * @return
     *     possible object is
     *     {@link Verblijfstitel }
     *     
     */
    public Verblijfstitel getVerblijfstitel() {
        return verblijfstitel;
    }

    /**
     * Sets the value of the verblijfstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verblijfstitel }
     *     
     */
    public void setVerblijfstitel(Verblijfstitel value) {
        this.verblijfstitel = value;
    }

    /**
     * Gets the value of the verblijfstitelHistorisch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the verblijfstitelHistorisch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerblijfstitelHistorisch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerblijfstitelHistorisch }
     * 
     * 
     * @return
     *     The value of the verblijfstitelHistorisch property.
     */
    public List<VerblijfstitelHistorisch> getVerblijfstitelHistorisch() {
        if (verblijfstitelHistorisch == null) {
            verblijfstitelHistorisch = new ArrayList<>();
        }
        return this.verblijfstitelHistorisch;
    }

    /**
     * Gets the value of the domicilieAdres property.
     * 
     * @return
     *     possible object is
     *     {@link Straatadres }
     *     
     */
    public Straatadres getDomicilieAdres() {
        return domicilieAdres;
    }

    /**
     * Sets the value of the domicilieAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Straatadres }
     *     
     */
    public void setDomicilieAdres(Straatadres value) {
        this.domicilieAdres = value;
    }

    /**
     * Gets the value of the correspondentieadres property.
     * 
     * @return
     *     possible object is
     *     {@link Straatadres }
     *     
     */
    public Straatadres getCorrespondentieadres() {
        return correspondentieadres;
    }

    /**
     * Sets the value of the correspondentieadres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Straatadres }
     *     
     */
    public void setCorrespondentieadres(Straatadres value) {
        this.correspondentieadres = value;
    }

    /**
     * Gets the value of the feitelijkAdresBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link FeitelijkAdresBuitenland }
     *     
     */
    public FeitelijkAdresBuitenland getFeitelijkAdresBuitenland() {
        return feitelijkAdresBuitenland;
    }

    /**
     * Sets the value of the feitelijkAdresBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeitelijkAdresBuitenland }
     *     
     */
    public void setFeitelijkAdresBuitenland(FeitelijkAdresBuitenland value) {
        this.feitelijkAdresBuitenland = value;
    }

    /**
     * Gets the value of the immigratie property.
     * 
     * @return
     *     possible object is
     *     {@link Immigratie }
     *     
     */
    public Immigratie getImmigratie() {
        return immigratie;
    }

    /**
     * Sets the value of the immigratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Immigratie }
     *     
     */
    public void setImmigratie(Immigratie value) {
        this.immigratie = value;
    }

    /**
     * Gets the value of the aangifteAdreshoudingBrp property.
     * 
     * @return
     *     possible object is
     *     {@link AangifteAdreshoudingBrp }
     *     
     */
    public AangifteAdreshoudingBrp getAangifteAdreshoudingBrp() {
        return aangifteAdreshoudingBrp;
    }

    /**
     * Sets the value of the aangifteAdreshoudingBrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AangifteAdreshoudingBrp }
     *     
     */
    public void setAangifteAdreshoudingBrp(AangifteAdreshoudingBrp value) {
        this.aangifteAdreshoudingBrp = value;
    }

    /**
     * Gets the value of the onderzoekGegVerblijfplaats property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegVerblijfplaats() {
        return onderzoekGegVerblijfplaats;
    }

    /**
     * Sets the value of the onderzoekGegVerblijfplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegVerblijfplaats(OnderzoekGeg value) {
        this.onderzoekGegVerblijfplaats = value;
    }

    /**
     * Gets the value of the verblijfplaatsHistorisch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the verblijfplaatsHistorisch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerblijfplaatsHistorisch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerblijfplaatsHistorisch }
     * 
     * 
     * @return
     *     The value of the verblijfplaatsHistorisch property.
     */
    public List<VerblijfplaatsHistorisch> getVerblijfplaatsHistorisch() {
        if (verblijfplaatsHistorisch == null) {
            verblijfplaatsHistorisch = new ArrayList<>();
        }
        return this.verblijfplaatsHistorisch;
    }

    /**
     * Gets the value of the overlijden property.
     * 
     * @return
     *     possible object is
     *     {@link Overlijden }
     *     
     */
    public Overlijden getOverlijden() {
        return overlijden;
    }

    /**
     * Sets the value of the overlijden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overlijden }
     *     
     */
    public void setOverlijden(Overlijden value) {
        this.overlijden = value;
    }

    /**
     * Gets the value of the ouder1 property.
     * 
     * @return
     *     possible object is
     *     {@link Ouder1 }
     *     
     */
    public Ouder1 getOuder1() {
        return ouder1;
    }

    /**
     * Sets the value of the ouder1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ouder1 }
     *     
     */
    public void setOuder1(Ouder1 value) {
        this.ouder1 = value;
    }

    /**
     * Gets the value of the ouder2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ouder2 }
     *     
     */
    public Ouder2 getOuder2() {
        return ouder2;
    }

    /**
     * Sets the value of the ouder2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ouder2 }
     *     
     */
    public void setOuder2(Ouder2 value) {
        this.ouder2 = value;
    }

    /**
     * Gets the value of the huwelijk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the huwelijk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHuwelijk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Huwelijk }
     * 
     * 
     * @return
     *     The value of the huwelijk property.
     */
    public List<Huwelijk> getHuwelijk() {
        if (huwelijk == null) {
            huwelijk = new ArrayList<>();
        }
        return this.huwelijk;
    }

    /**
     * Gets the value of the huwelijkHistorisch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the huwelijkHistorisch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHuwelijkHistorisch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HuwelijkHistorisch }
     * 
     * 
     * @return
     *     The value of the huwelijkHistorisch property.
     */
    public List<HuwelijkHistorisch> getHuwelijkHistorisch() {
        if (huwelijkHistorisch == null) {
            huwelijkHistorisch = new ArrayList<>();
        }
        return this.huwelijkHistorisch;
    }

    /**
     * Gets the value of the kind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the kind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kind }
     * 
     * 
     * @return
     *     The value of the kind property.
     */
    public List<Kind> getKind() {
        if (kind == null) {
            kind = new ArrayList<>();
        }
        return this.kind;
    }

    /**
     * Gets the value of the gezagsverhouding property.
     * 
     * @return
     *     possible object is
     *     {@link Gezagsverhouding }
     *     
     */
    public Gezagsverhouding getGezagsverhouding() {
        return gezagsverhouding;
    }

    /**
     * Sets the value of the gezagsverhouding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gezagsverhouding }
     *     
     */
    public void setGezagsverhouding(Gezagsverhouding value) {
        this.gezagsverhouding = value;
    }

    /**
     * Gets the value of the inschrijvingsgegevensBrp property.
     * 
     * @return
     *     possible object is
     *     {@link InschrijvingsgegevensBrp }
     *     
     */
    public InschrijvingsgegevensBrp getInschrijvingsgegevensBrp() {
        return inschrijvingsgegevensBrp;
    }

    /**
     * Sets the value of the inschrijvingsgegevensBrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InschrijvingsgegevensBrp }
     *     
     */
    public void setInschrijvingsgegevensBrp(InschrijvingsgegevensBrp value) {
        this.inschrijvingsgegevensBrp = value;
    }

}
