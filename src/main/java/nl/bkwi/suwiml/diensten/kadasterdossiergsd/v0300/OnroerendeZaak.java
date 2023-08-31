
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import nl.bkwi.suwiml.basisschema.v0801.StandaardBedr;


/**
 * <p>Java class for OnroerendeZaak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OnroerendeZaak">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatToestandKadaster" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatFiatteringKadaster" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="CdTypeOnroerendeZaak" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}CdTypeOnroerendeZaak" minOccurs="0"/>
 *         <element name="DatOntstaan" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="KadastraleAanduiding" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}KadastraleAanduiding"/>
 *         <element name="OmsKadastraalObject" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN200" minOccurs="0"/>
 *         <element name="ZakelijkRecht" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}ZakelijkRecht" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LocatieOZ" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}Locatie" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PubliekrechtelijkeBeperking" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}PubliekrechtelijkeBeperking" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BedrKoopsom" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *         <element name="JaarAankoop" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}JaartalN4" minOccurs="0"/>
 *         <element name="WijzeVerkrijgingEigendom" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}WijzeVerkrijgingEigendom" minOccurs="0"/>
 *         <element name="IndMeerGerechtigden" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnroerendeZaak", propOrder = {
    "datToestandKadaster",
    "datFiatteringKadaster",
    "cdTypeOnroerendeZaak",
    "datOntstaan",
    "kadastraleAanduiding",
    "omsKadastraalObject",
    "zakelijkRecht",
    "locatieOZ",
    "publiekrechtelijkeBeperking",
    "bedrKoopsom",
    "jaarAankoop",
    "wijzeVerkrijgingEigendom",
    "indMeerGerechtigden"
})
public class OnroerendeZaak {

    @XmlElement(name = "DatToestandKadaster")
    protected String datToestandKadaster;
    @XmlElement(name = "DatFiatteringKadaster")
    protected String datFiatteringKadaster;
    @XmlElement(name = "CdTypeOnroerendeZaak")
    @XmlSchemaType(name = "string")
    protected CdTypeOnroerendeZaak cdTypeOnroerendeZaak;
    @XmlElement(name = "DatOntstaan")
    protected String datOntstaan;
    @XmlElement(name = "KadastraleAanduiding", required = true)
    protected KadastraleAanduiding kadastraleAanduiding;
    @XmlElement(name = "OmsKadastraalObject")
    protected String omsKadastraalObject;
    @XmlElement(name = "ZakelijkRecht")
    protected List<ZakelijkRecht> zakelijkRecht;
    @XmlElement(name = "LocatieOZ")
    protected List<Locatie> locatieOZ;
    @XmlElement(name = "PubliekrechtelijkeBeperking")
    protected List<PubliekrechtelijkeBeperking> publiekrechtelijkeBeperking;
    @XmlElement(name = "BedrKoopsom")
    protected StandaardBedr bedrKoopsom;
    @XmlElement(name = "JaarAankoop")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger jaarAankoop;
    @XmlElement(name = "WijzeVerkrijgingEigendom")
    protected WijzeVerkrijgingEigendom wijzeVerkrijgingEigendom;
    @XmlElement(name = "IndMeerGerechtigden", required = true)
    protected String indMeerGerechtigden;

    /**
     * Gets the value of the datToestandKadaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatToestandKadaster() {
        return datToestandKadaster;
    }

    /**
     * Sets the value of the datToestandKadaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatToestandKadaster(String value) {
        this.datToestandKadaster = value;
    }

    /**
     * Gets the value of the datFiatteringKadaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatFiatteringKadaster() {
        return datFiatteringKadaster;
    }

    /**
     * Sets the value of the datFiatteringKadaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatFiatteringKadaster(String value) {
        this.datFiatteringKadaster = value;
    }

    /**
     * Gets the value of the cdTypeOnroerendeZaak property.
     * 
     * @return
     *     possible object is
     *     {@link CdTypeOnroerendeZaak }
     *     
     */
    public CdTypeOnroerendeZaak getCdTypeOnroerendeZaak() {
        return cdTypeOnroerendeZaak;
    }

    /**
     * Sets the value of the cdTypeOnroerendeZaak property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdTypeOnroerendeZaak }
     *     
     */
    public void setCdTypeOnroerendeZaak(CdTypeOnroerendeZaak value) {
        this.cdTypeOnroerendeZaak = value;
    }

    /**
     * Gets the value of the datOntstaan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatOntstaan() {
        return datOntstaan;
    }

    /**
     * Sets the value of the datOntstaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatOntstaan(String value) {
        this.datOntstaan = value;
    }

    /**
     * Gets the value of the kadastraleAanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public KadastraleAanduiding getKadastraleAanduiding() {
        return kadastraleAanduiding;
    }

    /**
     * Sets the value of the kadastraleAanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public void setKadastraleAanduiding(KadastraleAanduiding value) {
        this.kadastraleAanduiding = value;
    }

    /**
     * Gets the value of the omsKadastraalObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsKadastraalObject() {
        return omsKadastraalObject;
    }

    /**
     * Sets the value of the omsKadastraalObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsKadastraalObject(String value) {
        this.omsKadastraalObject = value;
    }

    /**
     * Gets the value of the zakelijkRecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the zakelijkRecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZakelijkRecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZakelijkRecht }
     * 
     * 
     * @return
     *     The value of the zakelijkRecht property.
     */
    public List<ZakelijkRecht> getZakelijkRecht() {
        if (zakelijkRecht == null) {
            zakelijkRecht = new ArrayList<>();
        }
        return this.zakelijkRecht;
    }

    /**
     * Gets the value of the locatieOZ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the locatieOZ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocatieOZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Locatie }
     * 
     * 
     * @return
     *     The value of the locatieOZ property.
     */
    public List<Locatie> getLocatieOZ() {
        if (locatieOZ == null) {
            locatieOZ = new ArrayList<>();
        }
        return this.locatieOZ;
    }

    /**
     * Gets the value of the publiekrechtelijkeBeperking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the publiekrechtelijkeBeperking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubliekrechtelijkeBeperking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubliekrechtelijkeBeperking }
     * 
     * 
     * @return
     *     The value of the publiekrechtelijkeBeperking property.
     */
    public List<PubliekrechtelijkeBeperking> getPubliekrechtelijkeBeperking() {
        if (publiekrechtelijkeBeperking == null) {
            publiekrechtelijkeBeperking = new ArrayList<>();
        }
        return this.publiekrechtelijkeBeperking;
    }

    /**
     * Gets the value of the bedrKoopsom property.
     * 
     * @return
     *     possible object is
     *     {@link StandaardBedr }
     *     
     */
    public StandaardBedr getBedrKoopsom() {
        return bedrKoopsom;
    }

    /**
     * Sets the value of the bedrKoopsom property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandaardBedr }
     *     
     */
    public void setBedrKoopsom(StandaardBedr value) {
        this.bedrKoopsom = value;
    }

    /**
     * Gets the value of the jaarAankoop property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJaarAankoop() {
        return jaarAankoop;
    }

    /**
     * Sets the value of the jaarAankoop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJaarAankoop(BigInteger value) {
        this.jaarAankoop = value;
    }

    /**
     * Gets the value of the wijzeVerkrijgingEigendom property.
     * 
     * @return
     *     possible object is
     *     {@link WijzeVerkrijgingEigendom }
     *     
     */
    public WijzeVerkrijgingEigendom getWijzeVerkrijgingEigendom() {
        return wijzeVerkrijgingEigendom;
    }

    /**
     * Sets the value of the wijzeVerkrijgingEigendom property.
     * 
     * @param value
     *     allowed object is
     *     {@link WijzeVerkrijgingEigendom }
     *     
     */
    public void setWijzeVerkrijgingEigendom(WijzeVerkrijgingEigendom value) {
        this.wijzeVerkrijgingEigendom = value;
    }

    /**
     * Gets the value of the indMeerGerechtigden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndMeerGerechtigden() {
        return indMeerGerechtigden;
    }

    /**
     * Sets the value of the indMeerGerechtigden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndMeerGerechtigden(String value) {
        this.indMeerGerechtigden = value;
    }

}
