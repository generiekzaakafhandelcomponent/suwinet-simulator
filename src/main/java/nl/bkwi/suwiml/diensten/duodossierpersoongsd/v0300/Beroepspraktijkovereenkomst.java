
package nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Beroepspraktijkovereenkomst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Beroepspraktijkovereenkomst">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatBBeroepspraktijkvorming" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *         <element name="DatEBeroepspraktijkvormWerkelijk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatAfslBeroepspraktijkovereenk" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beroepspraktijkovereenkomst", propOrder = {
    "datBBeroepspraktijkvorming",
    "datEBeroepspraktijkvormWerkelijk",
    "datAfslBeroepspraktijkovereenk"
})
public class Beroepspraktijkovereenkomst {

    @XmlElement(name = "DatBBeroepspraktijkvorming", required = true)
    protected String datBBeroepspraktijkvorming;
    @XmlElement(name = "DatEBeroepspraktijkvormWerkelijk")
    protected String datEBeroepspraktijkvormWerkelijk;
    @XmlElement(name = "DatAfslBeroepspraktijkovereenk", required = true)
    protected String datAfslBeroepspraktijkovereenk;

    /**
     * Gets the value of the datBBeroepspraktijkvorming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBBeroepspraktijkvorming() {
        return datBBeroepspraktijkvorming;
    }

    /**
     * Sets the value of the datBBeroepspraktijkvorming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBBeroepspraktijkvorming(String value) {
        this.datBBeroepspraktijkvorming = value;
    }

    /**
     * Gets the value of the datEBeroepspraktijkvormWerkelijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEBeroepspraktijkvormWerkelijk() {
        return datEBeroepspraktijkvormWerkelijk;
    }

    /**
     * Sets the value of the datEBeroepspraktijkvormWerkelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEBeroepspraktijkvormWerkelijk(String value) {
        this.datEBeroepspraktijkvormWerkelijk = value;
    }

    /**
     * Gets the value of the datAfslBeroepspraktijkovereenk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatAfslBeroepspraktijkovereenk() {
        return datAfslBeroepspraktijkovereenk;
    }

    /**
     * Sets the value of the datAfslBeroepspraktijkovereenk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatAfslBeroepspraktijkovereenk(String value) {
        this.datAfslBeroepspraktijkovereenk = value;
    }

}
