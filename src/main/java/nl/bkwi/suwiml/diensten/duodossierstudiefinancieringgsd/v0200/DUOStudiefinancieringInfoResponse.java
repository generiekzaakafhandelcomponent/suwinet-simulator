
package nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import nl.bkwi.suwiml.fwi.v0205.FWI;


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
 *         <sequence>
 *           <element name="ClientSuwi">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *                     <element name="Studiefinanciering" maxOccurs="unbounded">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DatBToekenningsperiodeStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                               <element name="DatEToekenningsperiodeStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="CdToekenningBasisbeursStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdToekenningBasisbeursStufi" minOccurs="0"/>
 *                               <element name="IndAanvullendeBeursStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                               <element name="CdStatusPartnertoeslagStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdStatusPartnertoeslagStufi" minOccurs="0"/>
 *                               <element name="CdStatusEenOudertoeslagStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdStatusEenOudertoeslagStufi" minOccurs="0"/>
 *                               <element name="IndToekenningWtosVo18" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI" minOccurs="0"/>
 *         </sequence>
 *         <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI"/>
 *         <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}NietsGevonden"/>
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
    "content"
})
@XmlRootElement(name = "DUOStudiefinancieringInfoResponse")
public class DUOStudiefinancieringInfoResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "ClientSuwi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FWI", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NietsGevonden", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "FWI" is used by two different parts of a schema. See: 
     * line 41 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/DUODossierStudiefinancieringGSD/Diensten/DUODossierStudiefinancieringGSD/v0200-b01/BodyReaction.xsd
     * line 39 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/DUODossierStudiefinancieringGSD/Diensten/DUODossierStudiefinancieringGSD/v0200-b01/BodyReaction.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link DUOStudiefinancieringInfoResponse.ClientSuwi }{@code >}
     * {@link JAXBElement }{@code <}{@link FWI }{@code >}
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
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
     *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
     *         <element name="Studiefinanciering" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DatBToekenningsperiodeStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                   <element name="DatEToekenningsperiodeStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="CdToekenningBasisbeursStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdToekenningBasisbeursStufi" minOccurs="0"/>
     *                   <element name="IndAanvullendeBeursStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                   <element name="CdStatusPartnertoeslagStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdStatusPartnertoeslagStufi" minOccurs="0"/>
     *                   <element name="CdStatusEenOudertoeslagStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdStatusEenOudertoeslagStufi" minOccurs="0"/>
     *                   <element name="IndToekenningWtosVo18" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
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
        "studiefinanciering"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr", required = true)
        protected String burgerservicenr;
        @XmlElement(name = "Studiefinanciering", required = true)
        protected List<DUOStudiefinancieringInfoResponse.ClientSuwi.Studiefinanciering> studiefinanciering;

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
         * Gets the value of the studiefinanciering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the studiefinanciering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStudiefinanciering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DUOStudiefinancieringInfoResponse.ClientSuwi.Studiefinanciering }
         * 
         * 
         * @return
         *     The value of the studiefinanciering property.
         */
        public List<DUOStudiefinancieringInfoResponse.ClientSuwi.Studiefinanciering> getStudiefinanciering() {
            if (studiefinanciering == null) {
                studiefinanciering = new ArrayList<>();
            }
            return this.studiefinanciering;
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
         *         <element name="DatBToekenningsperiodeStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *         <element name="DatEToekenningsperiodeStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="CdToekenningBasisbeursStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdToekenningBasisbeursStufi" minOccurs="0"/>
         *         <element name="IndAanvullendeBeursStufi" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *         <element name="CdStatusPartnertoeslagStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdStatusPartnertoeslagStufi" minOccurs="0"/>
         *         <element name="CdStatusEenOudertoeslagStufi" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200}CdStatusEenOudertoeslagStufi" minOccurs="0"/>
         *         <element name="IndToekenningWtosVo18" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
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
            "datBToekenningsperiodeStufi",
            "datEToekenningsperiodeStufi",
            "cdToekenningBasisbeursStufi",
            "indAanvullendeBeursStufi",
            "cdStatusPartnertoeslagStufi",
            "cdStatusEenOudertoeslagStufi",
            "indToekenningWtosVo18"
        })
        public static class Studiefinanciering {

            @XmlElement(name = "DatBToekenningsperiodeStufi", required = true)
            protected String datBToekenningsperiodeStufi;
            @XmlElement(name = "DatEToekenningsperiodeStufi")
            protected String datEToekenningsperiodeStufi;
            @XmlElement(name = "CdToekenningBasisbeursStufi")
            protected String cdToekenningBasisbeursStufi;
            @XmlElement(name = "IndAanvullendeBeursStufi")
            protected String indAanvullendeBeursStufi;
            @XmlElement(name = "CdStatusPartnertoeslagStufi")
            protected String cdStatusPartnertoeslagStufi;
            @XmlElement(name = "CdStatusEenOudertoeslagStufi")
            protected String cdStatusEenOudertoeslagStufi;
            @XmlElement(name = "IndToekenningWtosVo18")
            protected String indToekenningWtosVo18;

            /**
             * Gets the value of the datBToekenningsperiodeStufi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatBToekenningsperiodeStufi() {
                return datBToekenningsperiodeStufi;
            }

            /**
             * Sets the value of the datBToekenningsperiodeStufi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatBToekenningsperiodeStufi(String value) {
                this.datBToekenningsperiodeStufi = value;
            }

            /**
             * Gets the value of the datEToekenningsperiodeStufi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEToekenningsperiodeStufi() {
                return datEToekenningsperiodeStufi;
            }

            /**
             * Sets the value of the datEToekenningsperiodeStufi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEToekenningsperiodeStufi(String value) {
                this.datEToekenningsperiodeStufi = value;
            }

            /**
             * Gets the value of the cdToekenningBasisbeursStufi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdToekenningBasisbeursStufi() {
                return cdToekenningBasisbeursStufi;
            }

            /**
             * Sets the value of the cdToekenningBasisbeursStufi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdToekenningBasisbeursStufi(String value) {
                this.cdToekenningBasisbeursStufi = value;
            }

            /**
             * Gets the value of the indAanvullendeBeursStufi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndAanvullendeBeursStufi() {
                return indAanvullendeBeursStufi;
            }

            /**
             * Sets the value of the indAanvullendeBeursStufi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndAanvullendeBeursStufi(String value) {
                this.indAanvullendeBeursStufi = value;
            }

            /**
             * Gets the value of the cdStatusPartnertoeslagStufi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdStatusPartnertoeslagStufi() {
                return cdStatusPartnertoeslagStufi;
            }

            /**
             * Sets the value of the cdStatusPartnertoeslagStufi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdStatusPartnertoeslagStufi(String value) {
                this.cdStatusPartnertoeslagStufi = value;
            }

            /**
             * Gets the value of the cdStatusEenOudertoeslagStufi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdStatusEenOudertoeslagStufi() {
                return cdStatusEenOudertoeslagStufi;
            }

            /**
             * Sets the value of the cdStatusEenOudertoeslagStufi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdStatusEenOudertoeslagStufi(String value) {
                this.cdStatusEenOudertoeslagStufi = value;
            }

            /**
             * Gets the value of the indToekenningWtosVo18 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndToekenningWtosVo18() {
                return indToekenningWtosVo18;
            }

            /**
             * Sets the value of the indToekenningWtosVo18 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndToekenningWtosVo18(String value) {
                this.indToekenningWtosVo18 = value;
            }

        }

    }

}
