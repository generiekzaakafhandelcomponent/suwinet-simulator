
package nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *         <element name="PeriodeGegevensvraagIko" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DatBPeriode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                   <element name="DatEPeriode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "burgerservicenr",
    "periodeGegevensvraagIko"
})
@XmlRootElement(name = "UWVPersoonsIkvInfo")
public class UWVPersoonsIkvInfo {

    @XmlElement(name = "Burgerservicenr", required = true)
    protected String burgerservicenr;
    @XmlElement(name = "PeriodeGegevensvraagIko")
    protected UWVPersoonsIkvInfo.PeriodeGegevensvraagIko periodeGegevensvraagIko;

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
     * Gets the value of the periodeGegevensvraagIko property.
     * 
     * @return
     *     possible object is
     *     {@link UWVPersoonsIkvInfo.PeriodeGegevensvraagIko }
     *     
     */
    public UWVPersoonsIkvInfo.PeriodeGegevensvraagIko getPeriodeGegevensvraagIko() {
        return periodeGegevensvraagIko;
    }

    /**
     * Sets the value of the periodeGegevensvraagIko property.
     * 
     * @param value
     *     allowed object is
     *     {@link UWVPersoonsIkvInfo.PeriodeGegevensvraagIko }
     *     
     */
    public void setPeriodeGegevensvraagIko(UWVPersoonsIkvInfo.PeriodeGegevensvraagIko value) {
        this.periodeGegevensvraagIko = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="DatBPeriode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *         <element name="DatEPeriode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datBPeriode",
        "datEPeriode"
    })
    public static class PeriodeGegevensvraagIko {

        @XmlElement(name = "DatBPeriode")
        protected String datBPeriode;
        @XmlElement(name = "DatEPeriode")
        protected String datEPeriode;

        /**
         * Gets the value of the datBPeriode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatBPeriode() {
            return datBPeriode;
        }

        /**
         * Sets the value of the datBPeriode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatBPeriode(String value) {
            this.datBPeriode = value;
        }

        /**
         * Gets the value of the datEPeriode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatEPeriode() {
            return datEPeriode;
        }

        /**
         * Sets the value of the datEPeriode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatEPeriode(String value) {
            this.datEPeriode = value;
        }

    }

}
