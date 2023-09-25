
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerblijfplaatsHistorisch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VerblijfplaatsHistorisch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DomicilieAdres" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}StraatadresHistorisch" minOccurs="0"/>
 *         <element name="Correspondentieadres" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}StraatadresHistorisch" minOccurs="0"/>
 *         <element name="FeitelijkAdresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}FeitelijkAdresBuitenlandHistorisch" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Immigratie" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}ImmigratieHistorisch" minOccurs="0"/>
 *         <element name="AangifteAdreshoudingBrp" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}AangifteAdreshoudingBrpHistorisch" minOccurs="0"/>
 *         <element name="OnderzoekGegVerblijfplaats" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="OnjuistGegVerblijfplaats" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnjuistGeg" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerblijfplaatsHistorisch", propOrder = {
    "domicilieAdres",
    "correspondentieadres",
    "feitelijkAdresBuitenland",
    "immigratie",
    "aangifteAdreshoudingBrp",
    "onderzoekGegVerblijfplaats",
    "onjuistGegVerblijfplaats"
})
public class VerblijfplaatsHistorisch {

    @XmlElement(name = "DomicilieAdres")
    protected StraatadresHistorisch domicilieAdres;
    @XmlElement(name = "Correspondentieadres")
    protected StraatadresHistorisch correspondentieadres;
    @XmlElement(name = "FeitelijkAdresBuitenland")
    protected List<FeitelijkAdresBuitenlandHistorisch> feitelijkAdresBuitenland;
    @XmlElement(name = "Immigratie")
    protected ImmigratieHistorisch immigratie;
    @XmlElement(name = "AangifteAdreshoudingBrp")
    protected AangifteAdreshoudingBrpHistorisch aangifteAdreshoudingBrp;
    @XmlElement(name = "OnderzoekGegVerblijfplaats")
    protected OnderzoekGeg onderzoekGegVerblijfplaats;
    @XmlElement(name = "OnjuistGegVerblijfplaats")
    protected OnjuistGeg onjuistGegVerblijfplaats;

    /**
     * Gets the value of the domicilieAdres property.
     * 
     * @return
     *     possible object is
     *     {@link StraatadresHistorisch }
     *     
     */
    public StraatadresHistorisch getDomicilieAdres() {
        return domicilieAdres;
    }

    /**
     * Sets the value of the domicilieAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link StraatadresHistorisch }
     *     
     */
    public void setDomicilieAdres(StraatadresHistorisch value) {
        this.domicilieAdres = value;
    }

    /**
     * Gets the value of the correspondentieadres property.
     * 
     * @return
     *     possible object is
     *     {@link StraatadresHistorisch }
     *     
     */
    public StraatadresHistorisch getCorrespondentieadres() {
        return correspondentieadres;
    }

    /**
     * Sets the value of the correspondentieadres property.
     * 
     * @param value
     *     allowed object is
     *     {@link StraatadresHistorisch }
     *     
     */
    public void setCorrespondentieadres(StraatadresHistorisch value) {
        this.correspondentieadres = value;
    }

    /**
     * Gets the value of the feitelijkAdresBuitenland property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the feitelijkAdresBuitenland property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeitelijkAdresBuitenland().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeitelijkAdresBuitenlandHistorisch }
     * 
     * 
     * @return
     *     The value of the feitelijkAdresBuitenland property.
     */
    public List<FeitelijkAdresBuitenlandHistorisch> getFeitelijkAdresBuitenland() {
        if (feitelijkAdresBuitenland == null) {
            feitelijkAdresBuitenland = new ArrayList<>();
        }
        return this.feitelijkAdresBuitenland;
    }

    /**
     * Gets the value of the immigratie property.
     * 
     * @return
     *     possible object is
     *     {@link ImmigratieHistorisch }
     *     
     */
    public ImmigratieHistorisch getImmigratie() {
        return immigratie;
    }

    /**
     * Sets the value of the immigratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmigratieHistorisch }
     *     
     */
    public void setImmigratie(ImmigratieHistorisch value) {
        this.immigratie = value;
    }

    /**
     * Gets the value of the aangifteAdreshoudingBrp property.
     * 
     * @return
     *     possible object is
     *     {@link AangifteAdreshoudingBrpHistorisch }
     *     
     */
    public AangifteAdreshoudingBrpHistorisch getAangifteAdreshoudingBrp() {
        return aangifteAdreshoudingBrp;
    }

    /**
     * Sets the value of the aangifteAdreshoudingBrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AangifteAdreshoudingBrpHistorisch }
     *     
     */
    public void setAangifteAdreshoudingBrp(AangifteAdreshoudingBrpHistorisch value) {
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
     * Gets the value of the onjuistGegVerblijfplaats property.
     * 
     * @return
     *     possible object is
     *     {@link OnjuistGeg }
     *     
     */
    public OnjuistGeg getOnjuistGegVerblijfplaats() {
        return onjuistGegVerblijfplaats;
    }

    /**
     * Sets the value of the onjuistGegVerblijfplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnjuistGeg }
     *     
     */
    public void setOnjuistGegVerblijfplaats(OnjuistGeg value) {
        this.onjuistGegVerblijfplaats = value;
    }

}
