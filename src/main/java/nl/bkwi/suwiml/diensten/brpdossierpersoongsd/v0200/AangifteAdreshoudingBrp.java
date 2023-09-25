
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AangifteAdreshoudingBrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AangifteAdreshoudingBrp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdGemeenteVanInschrijving" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGemeenteGba" minOccurs="0"/>
 *         <element name="DatVanInschrijvingBijGemeente" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatBAdreshoudingBrp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AangifteAdreshoudingBrp", propOrder = {
    "cdGemeenteVanInschrijving",
    "datVanInschrijvingBijGemeente",
    "datBAdreshoudingBrp"
})
public class AangifteAdreshoudingBrp {

    @XmlElement(name = "CdGemeenteVanInschrijving")
    protected String cdGemeenteVanInschrijving;
    @XmlElement(name = "DatVanInschrijvingBijGemeente")
    protected String datVanInschrijvingBijGemeente;
    @XmlElement(name = "DatBAdreshoudingBrp")
    protected String datBAdreshoudingBrp;

    /**
     * Gets the value of the cdGemeenteVanInschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGemeenteVanInschrijving() {
        return cdGemeenteVanInschrijving;
    }

    /**
     * Sets the value of the cdGemeenteVanInschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGemeenteVanInschrijving(String value) {
        this.cdGemeenteVanInschrijving = value;
    }

    /**
     * Gets the value of the datVanInschrijvingBijGemeente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatVanInschrijvingBijGemeente() {
        return datVanInschrijvingBijGemeente;
    }

    /**
     * Sets the value of the datVanInschrijvingBijGemeente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatVanInschrijvingBijGemeente(String value) {
        this.datVanInschrijvingBijGemeente = value;
    }

    /**
     * Gets the value of the datBAdreshoudingBrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBAdreshoudingBrp() {
        return datBAdreshoudingBrp;
    }

    /**
     * Sets the value of the datBAdreshoudingBrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBAdreshoudingBrp(String value) {
        this.datBAdreshoudingBrp = value;
    }

}
