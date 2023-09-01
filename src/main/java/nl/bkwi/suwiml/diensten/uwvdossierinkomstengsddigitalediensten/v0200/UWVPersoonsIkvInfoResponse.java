
package nl.bkwi.suwiml.diensten.uwvdossierinkomstengsddigitalediensten.v0200;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import nl.bkwi.suwiml.basisschema.v0801.StandaardBedr;
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
 *                     <element name="Inkomstenverhouding" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="VolgnrIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}VolgnrIkv" minOccurs="0"/>
 *                               <element name="AanduidingIkvWerkgever" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AanduidingIkvWerkgever" minOccurs="0"/>
 *                               <element name="DatBIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="DatEIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="Inkomstenperiode" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatBIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                         <element name="DatEIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="CdSrtIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtInkomstenverhouding" minOccurs="0"/>
 *                                         <element name="IndVerzekerdWaoIvaWga" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="IndVerzekerdWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="IndVerzekerdZw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Inkomstenopgave" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatBIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                         <element name="DatEIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="AantSvDagenIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN3" minOccurs="0"/>
 *                                         <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200}AantVerloondeUrenIko" minOccurs="0"/>
 *                                         <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
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
 *           <element name="PeriodeGegevensleveringIko" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="DatBPeriode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                     <element name="DatEPeriode" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
@XmlRootElement(name = "UWVPersoonsIkvInfoResponse")
public class UWVPersoonsIkvInfoResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "ClientSuwi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PeriodeGegevensleveringIko", type = JAXBElement.class, required = false),
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
     * line 69 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200-b01/BodyReaction.xsd
     * line 67 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200-b01/BodyReaction.xsd
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
     * {@link JAXBElement }{@code <}{@link UWVPersoonsIkvInfoResponse.ClientSuwi }{@code >}
     * {@link JAXBElement }{@code <}{@link UWVPersoonsIkvInfoResponse.PeriodeGegevensleveringIko }{@code >}
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
     *         <element name="Inkomstenverhouding" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="VolgnrIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}VolgnrIkv" minOccurs="0"/>
     *                   <element name="AanduidingIkvWerkgever" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AanduidingIkvWerkgever" minOccurs="0"/>
     *                   <element name="DatBIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="DatEIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="Inkomstenperiode" maxOccurs="unbounded">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatBIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                             <element name="DatEIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="CdSrtIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtInkomstenverhouding" minOccurs="0"/>
     *                             <element name="IndVerzekerdWaoIvaWga" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="IndVerzekerdWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="IndVerzekerdZw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Inkomstenopgave" maxOccurs="unbounded">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatBIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                             <element name="DatEIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="AantSvDagenIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN3" minOccurs="0"/>
     *                             <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200}AantVerloondeUrenIko" minOccurs="0"/>
     *                             <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
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
        "inkomstenverhouding"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr", required = true)
        protected String burgerservicenr;
        @XmlElement(name = "Inkomstenverhouding")
        protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding> inkomstenverhouding;

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
         * Gets the value of the inkomstenverhouding property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the inkomstenverhouding property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInkomstenverhouding().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding }
         * 
         * 
         * @return
         *     The value of the inkomstenverhouding property.
         */
        public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding> getInkomstenverhouding() {
            if (inkomstenverhouding == null) {
                inkomstenverhouding = new ArrayList<>();
            }
            return this.inkomstenverhouding;
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
         *         <element name="VolgnrIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}VolgnrIkv" minOccurs="0"/>
         *         <element name="AanduidingIkvWerkgever" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AanduidingIkvWerkgever" minOccurs="0"/>
         *         <element name="DatBIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="DatEIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="Inkomstenperiode" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatBIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                   <element name="DatEIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="CdSrtIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtInkomstenverhouding" minOccurs="0"/>
         *                   <element name="IndVerzekerdWaoIvaWga" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="IndVerzekerdWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="IndVerzekerdZw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Inkomstenopgave" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatBIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                   <element name="DatEIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="AantSvDagenIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN3" minOccurs="0"/>
         *                   <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200}AantVerloondeUrenIko" minOccurs="0"/>
         *                   <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
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
            "volgnrIkv",
            "aanduidingIkvWerkgever",
            "datBIkv",
            "datEIkv",
            "inkomstenperiode",
            "inkomstenopgave"
        })
        public static class Inkomstenverhouding {

            @XmlElement(name = "VolgnrIkv")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger volgnrIkv;
            @XmlElement(name = "AanduidingIkvWerkgever")
            protected String aanduidingIkvWerkgever;
            @XmlElement(name = "DatBIkv")
            protected String datBIkv;
            @XmlElement(name = "DatEIkv")
            protected String datEIkv;
            @XmlElement(name = "Inkomstenperiode", required = true)
            protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode> inkomstenperiode;
            @XmlElement(name = "Inkomstenopgave", required = true)
            protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave> inkomstenopgave;

            /**
             * Gets the value of the volgnrIkv property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getVolgnrIkv() {
                return volgnrIkv;
            }

            /**
             * Sets the value of the volgnrIkv property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setVolgnrIkv(BigInteger value) {
                this.volgnrIkv = value;
            }

            /**
             * Gets the value of the aanduidingIkvWerkgever property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAanduidingIkvWerkgever() {
                return aanduidingIkvWerkgever;
            }

            /**
             * Sets the value of the aanduidingIkvWerkgever property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAanduidingIkvWerkgever(String value) {
                this.aanduidingIkvWerkgever = value;
            }

            /**
             * Gets the value of the datBIkv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatBIkv() {
                return datBIkv;
            }

            /**
             * Sets the value of the datBIkv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatBIkv(String value) {
                this.datBIkv = value;
            }

            /**
             * Gets the value of the datEIkv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEIkv() {
                return datEIkv;
            }

            /**
             * Sets the value of the datEIkv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEIkv(String value) {
                this.datEIkv = value;
            }

            /**
             * Gets the value of the inkomstenperiode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the inkomstenperiode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInkomstenperiode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode }
             * 
             * 
             * @return
             *     The value of the inkomstenperiode property.
             */
            public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode> getInkomstenperiode() {
                if (inkomstenperiode == null) {
                    inkomstenperiode = new ArrayList<>();
                }
                return this.inkomstenperiode;
            }

            /**
             * Gets the value of the inkomstenopgave property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the inkomstenopgave property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInkomstenopgave().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave }
             * 
             * 
             * @return
             *     The value of the inkomstenopgave property.
             */
            public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenopgave> getInkomstenopgave() {
                if (inkomstenopgave == null) {
                    inkomstenopgave = new ArrayList<>();
                }
                return this.inkomstenopgave;
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
             *         <element name="DatBIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *         <element name="DatEIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="AantSvDagenIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN3" minOccurs="0"/>
             *         <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200}AantVerloondeUrenIko" minOccurs="0"/>
             *         <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
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
                "datBIko",
                "datEIko",
                "aantSvDagenIko",
                "aantVerloondeUrenIko",
                "bedrBrutoloonSv"
            })
            public static class Inkomstenopgave {

                @XmlElement(name = "DatBIko", required = true)
                protected String datBIko;
                @XmlElement(name = "DatEIko")
                protected String datEIko;
                @XmlElement(name = "AantSvDagenIko")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer aantSvDagenIko;
                @XmlElement(name = "AantVerloondeUrenIko")
                protected BigInteger aantVerloondeUrenIko;
                @XmlElement(name = "BedrBrutoloonSv")
                protected StandaardBedr bedrBrutoloonSv;

                /**
                 * Gets the value of the datBIko property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatBIko() {
                    return datBIko;
                }

                /**
                 * Sets the value of the datBIko property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatBIko(String value) {
                    this.datBIko = value;
                }

                /**
                 * Gets the value of the datEIko property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEIko() {
                    return datEIko;
                }

                /**
                 * Sets the value of the datEIko property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEIko(String value) {
                    this.datEIko = value;
                }

                /**
                 * Gets the value of the aantSvDagenIko property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAantSvDagenIko() {
                    return aantSvDagenIko;
                }

                /**
                 * Sets the value of the aantSvDagenIko property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAantSvDagenIko(Integer value) {
                    this.aantSvDagenIko = value;
                }

                /**
                 * Gets the value of the aantVerloondeUrenIko property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getAantVerloondeUrenIko() {
                    return aantVerloondeUrenIko;
                }

                /**
                 * Sets the value of the aantVerloondeUrenIko property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setAantVerloondeUrenIko(BigInteger value) {
                    this.aantVerloondeUrenIko = value;
                }

                /**
                 * Gets the value of the bedrBrutoloonSv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrBrutoloonSv() {
                    return bedrBrutoloonSv;
                }

                /**
                 * Sets the value of the bedrBrutoloonSv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrBrutoloonSv(StandaardBedr value) {
                    this.bedrBrutoloonSv = value;
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
             *       <sequence>
             *         <element name="DatBIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *         <element name="DatEIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="CdSrtIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtInkomstenverhouding" minOccurs="0"/>
             *         <element name="IndVerzekerdWaoIvaWga" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="IndVerzekerdWw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="IndVerzekerdZw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
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
                "datBIkp",
                "datEIkp",
                "cdSrtIkv",
                "indVerzekerdWaoIvaWga",
                "indVerzekerdWw",
                "indVerzekerdZw",
                "cdAardIkv"
            })
            public static class Inkomstenperiode {

                @XmlElement(name = "DatBIkp", required = true)
                protected String datBIkp;
                @XmlElement(name = "DatEIkp")
                protected String datEIkp;
                @XmlElement(name = "CdSrtIkv")
                protected String cdSrtIkv;
                @XmlElement(name = "IndVerzekerdWaoIvaWga")
                protected String indVerzekerdWaoIvaWga;
                @XmlElement(name = "IndVerzekerdWw")
                protected String indVerzekerdWw;
                @XmlElement(name = "IndVerzekerdZw")
                protected String indVerzekerdZw;
                @XmlElement(name = "CdAardIkv")
                protected String cdAardIkv;

                /**
                 * Gets the value of the datBIkp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatBIkp() {
                    return datBIkp;
                }

                /**
                 * Sets the value of the datBIkp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatBIkp(String value) {
                    this.datBIkp = value;
                }

                /**
                 * Gets the value of the datEIkp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEIkp() {
                    return datEIkp;
                }

                /**
                 * Sets the value of the datEIkp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEIkp(String value) {
                    this.datEIkp = value;
                }

                /**
                 * Gets the value of the cdSrtIkv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSrtIkv() {
                    return cdSrtIkv;
                }

                /**
                 * Sets the value of the cdSrtIkv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSrtIkv(String value) {
                    this.cdSrtIkv = value;
                }

                /**
                 * Gets the value of the indVerzekerdWaoIvaWga property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndVerzekerdWaoIvaWga() {
                    return indVerzekerdWaoIvaWga;
                }

                /**
                 * Sets the value of the indVerzekerdWaoIvaWga property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndVerzekerdWaoIvaWga(String value) {
                    this.indVerzekerdWaoIvaWga = value;
                }

                /**
                 * Gets the value of the indVerzekerdWw property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndVerzekerdWw() {
                    return indVerzekerdWw;
                }

                /**
                 * Sets the value of the indVerzekerdWw property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndVerzekerdWw(String value) {
                    this.indVerzekerdWw = value;
                }

                /**
                 * Gets the value of the indVerzekerdZw property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndVerzekerdZw() {
                    return indVerzekerdZw;
                }

                /**
                 * Sets the value of the indVerzekerdZw property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndVerzekerdZw(String value) {
                    this.indVerzekerdZw = value;
                }

                /**
                 * Gets the value of the cdAardIkv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdAardIkv() {
                    return cdAardIkv;
                }

                /**
                 * Sets the value of the cdAardIkv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdAardIkv(String value) {
                    this.cdAardIkv = value;
                }

            }

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
    public static class PeriodeGegevensleveringIko {

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
