
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PubliekrechtelijkeBeperking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PubliekrechtelijkeBeperking">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AantekeningKadastraalObject" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DatEAantekeningKadastraalObject" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                   <element name="OmsAantekeningKadastraalObject" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN200" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="BetrokkenPersoonBestuursorgaan" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="NatuurlijkPersoon" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}NatuurlijkPersoon"/>
 *                   <element name="Rechtspersoon" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}Rechtspersoon"/>
 *                 </choice>
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
@XmlType(name = "PubliekrechtelijkeBeperking", propOrder = {
    "aantekeningKadastraalObject",
    "betrokkenPersoonBestuursorgaan"
})
public class PubliekrechtelijkeBeperking {

    @XmlElement(name = "AantekeningKadastraalObject")
    protected PubliekrechtelijkeBeperking.AantekeningKadastraalObject aantekeningKadastraalObject;
    @XmlElement(name = "BetrokkenPersoonBestuursorgaan")
    protected PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan betrokkenPersoonBestuursorgaan;

    /**
     * Gets the value of the aantekeningKadastraalObject property.
     * 
     * @return
     *     possible object is
     *     {@link PubliekrechtelijkeBeperking.AantekeningKadastraalObject }
     *     
     */
    public PubliekrechtelijkeBeperking.AantekeningKadastraalObject getAantekeningKadastraalObject() {
        return aantekeningKadastraalObject;
    }

    /**
     * Sets the value of the aantekeningKadastraalObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubliekrechtelijkeBeperking.AantekeningKadastraalObject }
     *     
     */
    public void setAantekeningKadastraalObject(PubliekrechtelijkeBeperking.AantekeningKadastraalObject value) {
        this.aantekeningKadastraalObject = value;
    }

    /**
     * Gets the value of the betrokkenPersoonBestuursorgaan property.
     * 
     * @return
     *     possible object is
     *     {@link PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan }
     *     
     */
    public PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan getBetrokkenPersoonBestuursorgaan() {
        return betrokkenPersoonBestuursorgaan;
    }

    /**
     * Sets the value of the betrokkenPersoonBestuursorgaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan }
     *     
     */
    public void setBetrokkenPersoonBestuursorgaan(PubliekrechtelijkeBeperking.BetrokkenPersoonBestuursorgaan value) {
        this.betrokkenPersoonBestuursorgaan = value;
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
     *         <element name="DatEAantekeningKadastraalObject" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *         <element name="OmsAantekeningKadastraalObject" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN200" minOccurs="0"/>
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
        "datEAantekeningKadastraalObject",
        "omsAantekeningKadastraalObject"
    })
    public static class AantekeningKadastraalObject {

        @XmlElement(name = "DatEAantekeningKadastraalObject")
        protected String datEAantekeningKadastraalObject;
        @XmlElement(name = "OmsAantekeningKadastraalObject")
        protected String omsAantekeningKadastraalObject;

        /**
         * Gets the value of the datEAantekeningKadastraalObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatEAantekeningKadastraalObject() {
            return datEAantekeningKadastraalObject;
        }

        /**
         * Sets the value of the datEAantekeningKadastraalObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatEAantekeningKadastraalObject(String value) {
            this.datEAantekeningKadastraalObject = value;
        }

        /**
         * Gets the value of the omsAantekeningKadastraalObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOmsAantekeningKadastraalObject() {
            return omsAantekeningKadastraalObject;
        }

        /**
         * Sets the value of the omsAantekeningKadastraalObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOmsAantekeningKadastraalObject(String value) {
            this.omsAantekeningKadastraalObject = value;
        }

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
     *       <choice>
     *         <element name="NatuurlijkPersoon" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}NatuurlijkPersoon"/>
     *         <element name="Rechtspersoon" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}Rechtspersoon"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "natuurlijkPersoon",
        "rechtspersoon"
    })
    public static class BetrokkenPersoonBestuursorgaan {

        @XmlElement(name = "NatuurlijkPersoon")
        protected NatuurlijkPersoon natuurlijkPersoon;
        @XmlElement(name = "Rechtspersoon")
        protected Rechtspersoon rechtspersoon;

        /**
         * Gets the value of the natuurlijkPersoon property.
         * 
         * @return
         *     possible object is
         *     {@link NatuurlijkPersoon }
         *     
         */
        public NatuurlijkPersoon getNatuurlijkPersoon() {
            return natuurlijkPersoon;
        }

        /**
         * Sets the value of the natuurlijkPersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link NatuurlijkPersoon }
         *     
         */
        public void setNatuurlijkPersoon(NatuurlijkPersoon value) {
            this.natuurlijkPersoon = value;
        }

        /**
         * Gets the value of the rechtspersoon property.
         * 
         * @return
         *     possible object is
         *     {@link Rechtspersoon }
         *     
         */
        public Rechtspersoon getRechtspersoon() {
            return rechtspersoon;
        }

        /**
         * Sets the value of the rechtspersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rechtspersoon }
         *     
         */
        public void setRechtspersoon(Rechtspersoon value) {
            this.rechtspersoon = value;
        }

    }

}
