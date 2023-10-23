
package nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300;

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
 *                     <element name="IndStartkwalificatieDuo" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                     <element name="Onderwijsovereenkomst" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Brin" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Brin" maxOccurs="unbounded"/>
 *                               <element name="DatInschrijvingOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                               <element name="DatUitschrijvingOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                               <element name="DeelnameOpleidingGeregistrDuo" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatBDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                         <element name="DatEDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="AanduidingLeerjaar" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}AanduidingLeerjaar" minOccurs="0"/>
 *                                         <element name="CdInschrijvingsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdInschrijvingsvorm" minOccurs="0"/>
 *                                         <element name="CdOnderwijsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdOnderwijsvorm" minOccurs="0"/>
 *                                         <element name="CdLeerwegMbo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdLeerwegMbo" minOccurs="0"/>
 *                                         <element name="InhoudDeelnameOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudOpleidingDuo"/>
 *                                         <element name="InhoudVak" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudVak" maxOccurs="unbounded" minOccurs="0"/>
 *                                         <element name="Beroepspraktijkovereenkomst" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Beroepspraktijkovereenkomst" maxOccurs="unbounded" minOccurs="0"/>
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
 *                     <element name="ResultaatOpleidingGeregistrDuo" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Brin" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Brin" maxOccurs="unbounded" minOccurs="0"/>
 *                               <element name="CdFaseOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdFaseOpleidingDuo" minOccurs="0"/>
 *                               <element name="CdSrtWaardedocument" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdSrtWaardedocument" minOccurs="0"/>
 *                               <element name="InhoudResultaatOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudOpleidingDuo"/>
 *                               <element name="ResultaatExamen" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}ResultaatExamen"/>
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
@XmlRootElement(name = "DUOPersoonsInfoResponse")
public class DUOPersoonsInfoResponse {

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
     * line 75 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/DUODossierPersoonGSD/Diensten/DUODossierPersoonGSD/v0300-b01/BodyReaction.xsd
     * line 73 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/DUODossierPersoonGSD/Diensten/DUODossierPersoonGSD/v0300-b01/BodyReaction.xsd
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
     * {@link JAXBElement }{@code <}{@link DUOPersoonsInfoResponse.ClientSuwi }{@code >}
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
     *         <element name="IndStartkwalificatieDuo" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *         <element name="Onderwijsovereenkomst" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Brin" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Brin" maxOccurs="unbounded"/>
     *                   <element name="DatInschrijvingOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                   <element name="DatUitschrijvingOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="DeelnameOpleidingGeregistrDuo" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatBDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                             <element name="DatEDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="AanduidingLeerjaar" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}AanduidingLeerjaar" minOccurs="0"/>
     *                             <element name="CdInschrijvingsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdInschrijvingsvorm" minOccurs="0"/>
     *                             <element name="CdOnderwijsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdOnderwijsvorm" minOccurs="0"/>
     *                             <element name="CdLeerwegMbo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdLeerwegMbo" minOccurs="0"/>
     *                             <element name="InhoudDeelnameOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudOpleidingDuo"/>
     *                             <element name="InhoudVak" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudVak" maxOccurs="unbounded" minOccurs="0"/>
     *                             <element name="Beroepspraktijkovereenkomst" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Beroepspraktijkovereenkomst" maxOccurs="unbounded" minOccurs="0"/>
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
     *         <element name="ResultaatOpleidingGeregistrDuo" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Brin" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Brin" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="CdFaseOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdFaseOpleidingDuo" minOccurs="0"/>
     *                   <element name="CdSrtWaardedocument" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdSrtWaardedocument" minOccurs="0"/>
     *                   <element name="InhoudResultaatOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudOpleidingDuo"/>
     *                   <element name="ResultaatExamen" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}ResultaatExamen"/>
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
        "indStartkwalificatieDuo",
        "onderwijsovereenkomst",
        "resultaatOpleidingGeregistrDuo"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr", required = true)
        protected String burgerservicenr;
        @XmlElement(name = "IndStartkwalificatieDuo")
        protected String indStartkwalificatieDuo;
        @XmlElement(name = "Onderwijsovereenkomst")
        protected List<DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst> onderwijsovereenkomst;
        @XmlElement(name = "ResultaatOpleidingGeregistrDuo")
        protected List<DUOPersoonsInfoResponse.ClientSuwi.ResultaatOpleidingGeregistrDuo> resultaatOpleidingGeregistrDuo;

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
         * Gets the value of the indStartkwalificatieDuo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndStartkwalificatieDuo() {
            return indStartkwalificatieDuo;
        }

        /**
         * Sets the value of the indStartkwalificatieDuo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndStartkwalificatieDuo(String value) {
            this.indStartkwalificatieDuo = value;
        }

        /**
         * Gets the value of the onderwijsovereenkomst property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the onderwijsovereenkomst property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOnderwijsovereenkomst().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst }
         * 
         * 
         * @return
         *     The value of the onderwijsovereenkomst property.
         */
        public List<DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst> getOnderwijsovereenkomst() {
            if (onderwijsovereenkomst == null) {
                onderwijsovereenkomst = new ArrayList<>();
            }
            return this.onderwijsovereenkomst;
        }

        /**
         * Gets the value of the resultaatOpleidingGeregistrDuo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the resultaatOpleidingGeregistrDuo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResultaatOpleidingGeregistrDuo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DUOPersoonsInfoResponse.ClientSuwi.ResultaatOpleidingGeregistrDuo }
         * 
         * 
         * @return
         *     The value of the resultaatOpleidingGeregistrDuo property.
         */
        public List<DUOPersoonsInfoResponse.ClientSuwi.ResultaatOpleidingGeregistrDuo> getResultaatOpleidingGeregistrDuo() {
            if (resultaatOpleidingGeregistrDuo == null) {
                resultaatOpleidingGeregistrDuo = new ArrayList<>();
            }
            return this.resultaatOpleidingGeregistrDuo;
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
         *         <element name="Brin" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Brin" maxOccurs="unbounded"/>
         *         <element name="DatInschrijvingOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *         <element name="DatUitschrijvingOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="DeelnameOpleidingGeregistrDuo" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatBDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                   <element name="DatEDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="AanduidingLeerjaar" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}AanduidingLeerjaar" minOccurs="0"/>
         *                   <element name="CdInschrijvingsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdInschrijvingsvorm" minOccurs="0"/>
         *                   <element name="CdOnderwijsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdOnderwijsvorm" minOccurs="0"/>
         *                   <element name="CdLeerwegMbo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdLeerwegMbo" minOccurs="0"/>
         *                   <element name="InhoudDeelnameOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudOpleidingDuo"/>
         *                   <element name="InhoudVak" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudVak" maxOccurs="unbounded" minOccurs="0"/>
         *                   <element name="Beroepspraktijkovereenkomst" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Beroepspraktijkovereenkomst" maxOccurs="unbounded" minOccurs="0"/>
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
            "brin",
            "datInschrijvingOpleiding",
            "datUitschrijvingOpleiding",
            "deelnameOpleidingGeregistrDuo"
        })
        public static class Onderwijsovereenkomst {

            @XmlElement(name = "Brin", required = true)
            protected List<Brin> brin;
            @XmlElement(name = "DatInschrijvingOpleiding", required = true)
            protected String datInschrijvingOpleiding;
            @XmlElement(name = "DatUitschrijvingOpleiding")
            protected String datUitschrijvingOpleiding;
            @XmlElement(name = "DeelnameOpleidingGeregistrDuo")
            protected List<DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst.DeelnameOpleidingGeregistrDuo> deelnameOpleidingGeregistrDuo;

            /**
             * Gets the value of the brin property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the brin property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBrin().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Brin }
             * 
             * 
             * @return
             *     The value of the brin property.
             */
            public List<Brin> getBrin() {
                if (brin == null) {
                    brin = new ArrayList<>();
                }
                return this.brin;
            }

            /**
             * Gets the value of the datInschrijvingOpleiding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatInschrijvingOpleiding() {
                return datInschrijvingOpleiding;
            }

            /**
             * Sets the value of the datInschrijvingOpleiding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatInschrijvingOpleiding(String value) {
                this.datInschrijvingOpleiding = value;
            }

            /**
             * Gets the value of the datUitschrijvingOpleiding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatUitschrijvingOpleiding() {
                return datUitschrijvingOpleiding;
            }

            /**
             * Sets the value of the datUitschrijvingOpleiding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatUitschrijvingOpleiding(String value) {
                this.datUitschrijvingOpleiding = value;
            }

            /**
             * Gets the value of the deelnameOpleidingGeregistrDuo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the deelnameOpleidingGeregistrDuo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDeelnameOpleidingGeregistrDuo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst.DeelnameOpleidingGeregistrDuo }
             * 
             * 
             * @return
             *     The value of the deelnameOpleidingGeregistrDuo property.
             */
            public List<DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst.DeelnameOpleidingGeregistrDuo> getDeelnameOpleidingGeregistrDuo() {
                if (deelnameOpleidingGeregistrDuo == null) {
                    deelnameOpleidingGeregistrDuo = new ArrayList<>();
                }
                return this.deelnameOpleidingGeregistrDuo;
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
             *         <element name="DatBDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *         <element name="DatEDeelnameOpleiding" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="AanduidingLeerjaar" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}AanduidingLeerjaar" minOccurs="0"/>
             *         <element name="CdInschrijvingsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdInschrijvingsvorm" minOccurs="0"/>
             *         <element name="CdOnderwijsvorm" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdOnderwijsvorm" minOccurs="0"/>
             *         <element name="CdLeerwegMbo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdLeerwegMbo" minOccurs="0"/>
             *         <element name="InhoudDeelnameOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudOpleidingDuo"/>
             *         <element name="InhoudVak" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudVak" maxOccurs="unbounded" minOccurs="0"/>
             *         <element name="Beroepspraktijkovereenkomst" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Beroepspraktijkovereenkomst" maxOccurs="unbounded" minOccurs="0"/>
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
                "datBDeelnameOpleiding",
                "datEDeelnameOpleiding",
                "aanduidingLeerjaar",
                "cdInschrijvingsvorm",
                "cdOnderwijsvorm",
                "cdLeerwegMbo",
                "inhoudDeelnameOpleidingDuo",
                "inhoudVak",
                "beroepspraktijkovereenkomst"
            })
            public static class DeelnameOpleidingGeregistrDuo {

                @XmlElement(name = "DatBDeelnameOpleiding", required = true)
                protected String datBDeelnameOpleiding;
                @XmlElement(name = "DatEDeelnameOpleiding")
                protected String datEDeelnameOpleiding;
                @XmlElement(name = "AanduidingLeerjaar")
                protected String aanduidingLeerjaar;
                @XmlElement(name = "CdInschrijvingsvorm")
                protected String cdInschrijvingsvorm;
                @XmlElement(name = "CdOnderwijsvorm")
                protected String cdOnderwijsvorm;
                @XmlElement(name = "CdLeerwegMbo")
                protected String cdLeerwegMbo;
                @XmlElement(name = "InhoudDeelnameOpleidingDuo", required = true)
                protected InhoudOpleidingDuo inhoudDeelnameOpleidingDuo;
                @XmlElement(name = "InhoudVak")
                protected List<InhoudVak> inhoudVak;
                @XmlElement(name = "Beroepspraktijkovereenkomst")
                protected List<Beroepspraktijkovereenkomst> beroepspraktijkovereenkomst;

                /**
                 * Gets the value of the datBDeelnameOpleiding property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatBDeelnameOpleiding() {
                    return datBDeelnameOpleiding;
                }

                /**
                 * Sets the value of the datBDeelnameOpleiding property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatBDeelnameOpleiding(String value) {
                    this.datBDeelnameOpleiding = value;
                }

                /**
                 * Gets the value of the datEDeelnameOpleiding property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEDeelnameOpleiding() {
                    return datEDeelnameOpleiding;
                }

                /**
                 * Sets the value of the datEDeelnameOpleiding property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEDeelnameOpleiding(String value) {
                    this.datEDeelnameOpleiding = value;
                }

                /**
                 * Gets the value of the aanduidingLeerjaar property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAanduidingLeerjaar() {
                    return aanduidingLeerjaar;
                }

                /**
                 * Sets the value of the aanduidingLeerjaar property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAanduidingLeerjaar(String value) {
                    this.aanduidingLeerjaar = value;
                }

                /**
                 * Gets the value of the cdInschrijvingsvorm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdInschrijvingsvorm() {
                    return cdInschrijvingsvorm;
                }

                /**
                 * Sets the value of the cdInschrijvingsvorm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdInschrijvingsvorm(String value) {
                    this.cdInschrijvingsvorm = value;
                }

                /**
                 * Gets the value of the cdOnderwijsvorm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdOnderwijsvorm() {
                    return cdOnderwijsvorm;
                }

                /**
                 * Sets the value of the cdOnderwijsvorm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdOnderwijsvorm(String value) {
                    this.cdOnderwijsvorm = value;
                }

                /**
                 * Gets the value of the cdLeerwegMbo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdLeerwegMbo() {
                    return cdLeerwegMbo;
                }

                /**
                 * Sets the value of the cdLeerwegMbo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdLeerwegMbo(String value) {
                    this.cdLeerwegMbo = value;
                }

                /**
                 * Gets the value of the inhoudDeelnameOpleidingDuo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InhoudOpleidingDuo }
                 *     
                 */
                public InhoudOpleidingDuo getInhoudDeelnameOpleidingDuo() {
                    return inhoudDeelnameOpleidingDuo;
                }

                /**
                 * Sets the value of the inhoudDeelnameOpleidingDuo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InhoudOpleidingDuo }
                 *     
                 */
                public void setInhoudDeelnameOpleidingDuo(InhoudOpleidingDuo value) {
                    this.inhoudDeelnameOpleidingDuo = value;
                }

                /**
                 * Gets the value of the inhoudVak property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the inhoudVak property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInhoudVak().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InhoudVak }
                 * 
                 * 
                 * @return
                 *     The value of the inhoudVak property.
                 */
                public List<InhoudVak> getInhoudVak() {
                    if (inhoudVak == null) {
                        inhoudVak = new ArrayList<>();
                    }
                    return this.inhoudVak;
                }

                /**
                 * Gets the value of the beroepspraktijkovereenkomst property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the beroepspraktijkovereenkomst property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBeroepspraktijkovereenkomst().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Beroepspraktijkovereenkomst }
                 * 
                 * 
                 * @return
                 *     The value of the beroepspraktijkovereenkomst property.
                 */
                public List<Beroepspraktijkovereenkomst> getBeroepspraktijkovereenkomst() {
                    if (beroepspraktijkovereenkomst == null) {
                        beroepspraktijkovereenkomst = new ArrayList<>();
                    }
                    return this.beroepspraktijkovereenkomst;
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
         *         <element name="Brin" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}Brin" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="CdFaseOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdFaseOpleidingDuo" minOccurs="0"/>
         *         <element name="CdSrtWaardedocument" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdSrtWaardedocument" minOccurs="0"/>
         *         <element name="InhoudResultaatOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}InhoudOpleidingDuo"/>
         *         <element name="ResultaatExamen" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}ResultaatExamen"/>
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
            "brin",
            "cdFaseOpleidingDuo",
            "cdSrtWaardedocument",
            "inhoudResultaatOpleidingDuo",
            "resultaatExamen"
        })
        public static class ResultaatOpleidingGeregistrDuo {

            @XmlElement(name = "Brin")
            protected List<Brin> brin;
            @XmlElement(name = "CdFaseOpleidingDuo")
            protected String cdFaseOpleidingDuo;
            @XmlElement(name = "CdSrtWaardedocument")
            protected String cdSrtWaardedocument;
            @XmlElement(name = "InhoudResultaatOpleidingDuo", required = true)
            protected InhoudOpleidingDuo inhoudResultaatOpleidingDuo;
            @XmlElement(name = "ResultaatExamen", required = true)
            protected ResultaatExamen resultaatExamen;

            /**
             * Gets the value of the brin property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the brin property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBrin().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Brin }
             * 
             * 
             * @return
             *     The value of the brin property.
             */
            public List<Brin> getBrin() {
                if (brin == null) {
                    brin = new ArrayList<>();
                }
                return this.brin;
            }

            /**
             * Gets the value of the cdFaseOpleidingDuo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdFaseOpleidingDuo() {
                return cdFaseOpleidingDuo;
            }

            /**
             * Sets the value of the cdFaseOpleidingDuo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdFaseOpleidingDuo(String value) {
                this.cdFaseOpleidingDuo = value;
            }

            /**
             * Gets the value of the cdSrtWaardedocument property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdSrtWaardedocument() {
                return cdSrtWaardedocument;
            }

            /**
             * Sets the value of the cdSrtWaardedocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdSrtWaardedocument(String value) {
                this.cdSrtWaardedocument = value;
            }

            /**
             * Gets the value of the inhoudResultaatOpleidingDuo property.
             * 
             * @return
             *     possible object is
             *     {@link InhoudOpleidingDuo }
             *     
             */
            public InhoudOpleidingDuo getInhoudResultaatOpleidingDuo() {
                return inhoudResultaatOpleidingDuo;
            }

            /**
             * Sets the value of the inhoudResultaatOpleidingDuo property.
             * 
             * @param value
             *     allowed object is
             *     {@link InhoudOpleidingDuo }
             *     
             */
            public void setInhoudResultaatOpleidingDuo(InhoudOpleidingDuo value) {
                this.inhoudResultaatOpleidingDuo = value;
            }

            /**
             * Gets the value of the resultaatExamen property.
             * 
             * @return
             *     possible object is
             *     {@link ResultaatExamen }
             *     
             */
            public ResultaatExamen getResultaatExamen() {
                return resultaatExamen;
            }

            /**
             * Sets the value of the resultaatExamen property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResultaatExamen }
             *     
             */
            public void setResultaatExamen(ResultaatExamen value) {
                this.resultaatExamen = value;
            }

        }

    }

}
