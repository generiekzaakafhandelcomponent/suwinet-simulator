
package nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200;

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
 *                               <element name="AdministratieveEenheid" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="NaamAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
 *                                         <element name="Loonheffingennr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Loonheffingennr"/>
 *                                         <element name="DatBAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="DatEAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <choice>
 *                                           <element name="PersoonAdministratieveEenheid">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                                                     <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *                                                     <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                                                     <element name="FeitelijkAdresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
 *                                                       <complexType>
 *                                                         <complexContent>
 *                                                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             <sequence>
 *                                                               <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                               <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                               <choice>
 *                                                                 <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
 *                                                                 <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
 *                                                                 <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
 *                                                                 <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
 *                                                               </choice>
 *                                                             </sequence>
 *                                                           </restriction>
 *                                                         </complexContent>
 *                                                       </complexType>
 *                                                     </element>
 *                                                     <element name="CorrespondentieadresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
 *                                                       <complexType>
 *                                                         <complexContent>
 *                                                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             <sequence>
 *                                                               <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                               <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                               <choice>
 *                                                                 <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
 *                                                                 <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
 *                                                                 <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
 *                                                                 <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
 *                                                               </choice>
 *                                                             </sequence>
 *                                                           </restriction>
 *                                                         </complexContent>
 *                                                       </complexType>
 *                                                     </element>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="RechtspersoonAdministratieveEenh">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="FiNr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}SofiNr"/>
 *                                                     <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
 *                                                     <element name="CdRechtsvorm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRechtsvorm" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                         </choice>
 *                                         <element name="FeitelijkAdresAeh" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <choice>
 *                                                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
 *                                                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
 *                                                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
 *                                                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
 *                                                   </choice>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="CorrespondentieadresAeh" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                                   <choice>
 *                                                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
 *                                                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
 *                                                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
 *                                                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
 *                                                   </choice>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Inkomstenperiode" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="DatBIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *                                         <element name="DatEIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="CdSrtIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtInkomstenverhouding" minOccurs="0"/>
 *                                         <element name="CdTypeArbeidscontract" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdTypeArbeidscontract" minOccurs="0"/>
 *                                         <element name="CdInvloedVerzekeringsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdInvloedVerzekeringsplicht" minOccurs="0"/>
 *                                         <element name="IndLoonheffingskortingToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="IndRegelmatigArbeidspatroon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdInd" minOccurs="0"/>
 *                                         <element name="IndPersoneelsleningNietInLoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="IndLoonIsMedeAowAlleenstaande" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="IndLoonInclusiefWajongUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="IndVakantiebonnenToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *                                         <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
 *                                         <element name="CdIncidInkomstenvermindering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdIncidInkomstenvermindering" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="SectorRisicogroepIkv" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="CdSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorRisicogroep" minOccurs="0"/>
 *                                         <element name="DatBSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="DatESectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                                         <element name="SectorBeroepsEnBedrijfsleven" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv"/>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
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
 *                                         <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}AantVerloondeUrenIko" minOccurs="0"/>
 *                                         <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrLoonLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrIngehoudenLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrOpgbRechtVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrOpgbRechtExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrVergoedingReiskostenOnbelast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrInUitkBegrBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
 *                                         <element name="BedrRechtstreeksBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
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
     * line 195 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSD/v0200-b02/BodyReaction.xsd
     * line 193 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSD/v0200-b02/BodyReaction.xsd
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
     *                   <element name="AdministratieveEenheid" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="NaamAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
     *                             <element name="Loonheffingennr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Loonheffingennr"/>
     *                             <element name="DatBAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="DatEAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <choice>
     *                               <element name="PersoonAdministratieveEenheid">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       <sequence>
     *                                         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *                                         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
     *                                         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *                                         <element name="FeitelijkAdresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
     *                                           <complexType>
     *                                             <complexContent>
     *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 <sequence>
     *                                                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                                   <choice>
     *                                                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
     *                                                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
     *                                                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
     *                                                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
     *                                                   </choice>
     *                                                 </sequence>
     *                                               </restriction>
     *                                             </complexContent>
     *                                           </complexType>
     *                                         </element>
     *                                         <element name="CorrespondentieadresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
     *                                           <complexType>
     *                                             <complexContent>
     *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 <sequence>
     *                                                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                                   <choice>
     *                                                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
     *                                                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
     *                                                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
     *                                                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
     *                                                   </choice>
     *                                                 </sequence>
     *                                               </restriction>
     *                                             </complexContent>
     *                                           </complexType>
     *                                         </element>
     *                                       </sequence>
     *                                     </restriction>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="RechtspersoonAdministratieveEenh">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       <sequence>
     *                                         <element name="FiNr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}SofiNr"/>
     *                                         <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
     *                                         <element name="CdRechtsvorm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRechtsvorm" minOccurs="0"/>
     *                                       </sequence>
     *                                     </restriction>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                             </choice>
     *                             <element name="FeitelijkAdresAeh" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <choice>
     *                                         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
     *                                         <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
     *                                         <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
     *                                         <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
     *                                       </choice>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="CorrespondentieadresAeh" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                                       <choice>
     *                                         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
     *                                         <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
     *                                         <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
     *                                         <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
     *                                       </choice>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Inkomstenperiode" maxOccurs="unbounded">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DatBIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
     *                             <element name="DatEIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="CdSrtIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtInkomstenverhouding" minOccurs="0"/>
     *                             <element name="CdTypeArbeidscontract" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdTypeArbeidscontract" minOccurs="0"/>
     *                             <element name="CdInvloedVerzekeringsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdInvloedVerzekeringsplicht" minOccurs="0"/>
     *                             <element name="IndLoonheffingskortingToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="IndRegelmatigArbeidspatroon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdInd" minOccurs="0"/>
     *                             <element name="IndPersoneelsleningNietInLoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="IndLoonIsMedeAowAlleenstaande" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="IndLoonInclusiefWajongUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="IndVakantiebonnenToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
     *                             <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
     *                             <element name="CdIncidInkomstenvermindering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdIncidInkomstenvermindering" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="SectorRisicogroepIkv" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="CdSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorRisicogroep" minOccurs="0"/>
     *                             <element name="DatBSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="DatESectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                             <element name="SectorBeroepsEnBedrijfsleven" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
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
     *                             <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}AantVerloondeUrenIko" minOccurs="0"/>
     *                             <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrLoonLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrIngehoudenLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrOpgbRechtVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrOpgbRechtExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrVergoedingReiskostenOnbelast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrInUitkBegrBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
     *                             <element name="BedrRechtstreeksBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
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
         *         <element name="AdministratieveEenheid" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="NaamAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
         *                   <element name="Loonheffingennr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Loonheffingennr"/>
         *                   <element name="DatBAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="DatEAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <choice>
         *                     <element name="PersoonAdministratieveEenheid">
         *                       <complexType>
         *                         <complexContent>
         *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             <sequence>
         *                               <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
         *                               <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
         *                               <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
         *                               <element name="FeitelijkAdresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
         *                                 <complexType>
         *                                   <complexContent>
         *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       <sequence>
         *                                         <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                                         <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                                         <choice>
         *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
         *                                           <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
         *                                           <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
         *                                           <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
         *                                         </choice>
         *                                       </sequence>
         *                                     </restriction>
         *                                   </complexContent>
         *                                 </complexType>
         *                               </element>
         *                               <element name="CorrespondentieadresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
         *                                 <complexType>
         *                                   <complexContent>
         *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       <sequence>
         *                                         <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                                         <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                                         <choice>
         *                                           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
         *                                           <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
         *                                           <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
         *                                           <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
         *                                         </choice>
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
         *                     <element name="RechtspersoonAdministratieveEenh">
         *                       <complexType>
         *                         <complexContent>
         *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             <sequence>
         *                               <element name="FiNr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}SofiNr"/>
         *                               <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
         *                               <element name="CdRechtsvorm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRechtsvorm" minOccurs="0"/>
         *                             </sequence>
         *                           </restriction>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                   </choice>
         *                   <element name="FeitelijkAdresAeh" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <choice>
         *                               <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
         *                               <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
         *                               <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
         *                               <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
         *                             </choice>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="CorrespondentieadresAeh" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                             <choice>
         *                               <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
         *                               <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
         *                               <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
         *                               <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
         *                             </choice>
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
         *         <element name="Inkomstenperiode" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatBIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                   <element name="DatEIkp" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="CdSrtIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtInkomstenverhouding" minOccurs="0"/>
         *                   <element name="CdTypeArbeidscontract" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdTypeArbeidscontract" minOccurs="0"/>
         *                   <element name="CdInvloedVerzekeringsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdInvloedVerzekeringsplicht" minOccurs="0"/>
         *                   <element name="IndLoonheffingskortingToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="IndRegelmatigArbeidspatroon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdInd" minOccurs="0"/>
         *                   <element name="IndPersoneelsleningNietInLoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="IndLoonIsMedeAowAlleenstaande" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="IndLoonInclusiefWajongUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="IndVakantiebonnenToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
         *                   <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
         *                   <element name="CdIncidInkomstenvermindering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdIncidInkomstenvermindering" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="SectorRisicogroepIkv" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="CdSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorRisicogroep" minOccurs="0"/>
         *                   <element name="DatBSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="DatESectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="SectorBeroepsEnBedrijfsleven" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv"/>
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
         *         <element name="Inkomstenopgave" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DatBIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
         *                   <element name="DatEIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *                   <element name="AantSvDagenIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN3" minOccurs="0"/>
         *                   <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}AantVerloondeUrenIko" minOccurs="0"/>
         *                   <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrLoonLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrIngehoudenLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrOpgbRechtVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrOpgbRechtExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrVergoedingReiskostenOnbelast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrInUitkBegrBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
         *                   <element name="BedrRechtstreeksBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
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
            "administratieveEenheid",
            "inkomstenperiode",
            "sectorRisicogroepIkv",
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
            @XmlElement(name = "AdministratieveEenheid")
            protected UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid administratieveEenheid;
            @XmlElement(name = "Inkomstenperiode", required = true)
            protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.Inkomstenperiode> inkomstenperiode;
            @XmlElement(name = "SectorRisicogroepIkv")
            protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv> sectorRisicogroepIkv;
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
             * Gets the value of the administratieveEenheid property.
             * 
             * @return
             *     possible object is
             *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid }
             *     
             */
            public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid getAdministratieveEenheid() {
                return administratieveEenheid;
            }

            /**
             * Sets the value of the administratieveEenheid property.
             * 
             * @param value
             *     allowed object is
             *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid }
             *     
             */
            public void setAdministratieveEenheid(UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid value) {
                this.administratieveEenheid = value;
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
             * Gets the value of the sectorRisicogroepIkv property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the sectorRisicogroepIkv property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSectorRisicogroepIkv().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv }
             * 
             * 
             * @return
             *     The value of the sectorRisicogroepIkv property.
             */
            public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv> getSectorRisicogroepIkv() {
                if (sectorRisicogroepIkv == null) {
                    sectorRisicogroepIkv = new ArrayList<>();
                }
                return this.sectorRisicogroepIkv;
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
             *         <element name="NaamAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
             *         <element name="Loonheffingennr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Loonheffingennr"/>
             *         <element name="DatBAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="DatEAdministratieveEenheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <choice>
             *           <element name="PersoonAdministratieveEenheid">
             *             <complexType>
             *               <complexContent>
             *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   <sequence>
             *                     <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
             *                     <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
             *                     <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
             *                     <element name="FeitelijkAdresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
             *                       <complexType>
             *                         <complexContent>
             *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             <sequence>
             *                               <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                               <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                               <choice>
             *                                 <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
             *                                 <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
             *                                 <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
             *                                 <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
             *                               </choice>
             *                             </sequence>
             *                           </restriction>
             *                         </complexContent>
             *                       </complexType>
             *                     </element>
             *                     <element name="CorrespondentieadresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
             *                       <complexType>
             *                         <complexContent>
             *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             <sequence>
             *                               <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                               <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                               <choice>
             *                                 <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
             *                                 <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
             *                                 <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
             *                                 <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
             *                               </choice>
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
             *           <element name="RechtspersoonAdministratieveEenh">
             *             <complexType>
             *               <complexContent>
             *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   <sequence>
             *                     <element name="FiNr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}SofiNr"/>
             *                     <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
             *                     <element name="CdRechtsvorm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRechtsvorm" minOccurs="0"/>
             *                   </sequence>
             *                 </restriction>
             *               </complexContent>
             *             </complexType>
             *           </element>
             *         </choice>
             *         <element name="FeitelijkAdresAeh" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <choice>
             *                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
             *                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
             *                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
             *                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
             *                   </choice>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="CorrespondentieadresAeh" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *                   <choice>
             *                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
             *                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
             *                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
             *                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
             *                   </choice>
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
                "naamAdministratieveEenheid",
                "loonheffingennr",
                "datBAdministratieveEenheid",
                "datEAdministratieveEenheid",
                "persoonAdministratieveEenheid",
                "rechtspersoonAdministratieveEenh",
                "feitelijkAdresAeh",
                "correspondentieadresAeh"
            })
            public static class AdministratieveEenheid {

                @XmlElement(name = "NaamAdministratieveEenheid")
                protected String naamAdministratieveEenheid;
                @XmlElement(name = "Loonheffingennr", required = true)
                protected String loonheffingennr;
                @XmlElement(name = "DatBAdministratieveEenheid")
                protected String datBAdministratieveEenheid;
                @XmlElement(name = "DatEAdministratieveEenheid")
                protected String datEAdministratieveEenheid;
                @XmlElement(name = "PersoonAdministratieveEenheid")
                protected UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid persoonAdministratieveEenheid;
                @XmlElement(name = "RechtspersoonAdministratieveEenh")
                protected UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh rechtspersoonAdministratieveEenh;
                @XmlElement(name = "FeitelijkAdresAeh")
                protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh> feitelijkAdresAeh;
                @XmlElement(name = "CorrespondentieadresAeh")
                protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.CorrespondentieadresAeh> correspondentieadresAeh;

                /**
                 * Gets the value of the naamAdministratieveEenheid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNaamAdministratieveEenheid() {
                    return naamAdministratieveEenheid;
                }

                /**
                 * Sets the value of the naamAdministratieveEenheid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNaamAdministratieveEenheid(String value) {
                    this.naamAdministratieveEenheid = value;
                }

                /**
                 * Gets the value of the loonheffingennr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLoonheffingennr() {
                    return loonheffingennr;
                }

                /**
                 * Sets the value of the loonheffingennr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLoonheffingennr(String value) {
                    this.loonheffingennr = value;
                }

                /**
                 * Gets the value of the datBAdministratieveEenheid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatBAdministratieveEenheid() {
                    return datBAdministratieveEenheid;
                }

                /**
                 * Sets the value of the datBAdministratieveEenheid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatBAdministratieveEenheid(String value) {
                    this.datBAdministratieveEenheid = value;
                }

                /**
                 * Gets the value of the datEAdministratieveEenheid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatEAdministratieveEenheid() {
                    return datEAdministratieveEenheid;
                }

                /**
                 * Sets the value of the datEAdministratieveEenheid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatEAdministratieveEenheid(String value) {
                    this.datEAdministratieveEenheid = value;
                }

                /**
                 * Gets the value of the persoonAdministratieveEenheid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid }
                 *     
                 */
                public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid getPersoonAdministratieveEenheid() {
                    return persoonAdministratieveEenheid;
                }

                /**
                 * Sets the value of the persoonAdministratieveEenheid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid }
                 *     
                 */
                public void setPersoonAdministratieveEenheid(UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid value) {
                    this.persoonAdministratieveEenheid = value;
                }

                /**
                 * Gets the value of the rechtspersoonAdministratieveEenh property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh }
                 *     
                 */
                public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh getRechtspersoonAdministratieveEenh() {
                    return rechtspersoonAdministratieveEenh;
                }

                /**
                 * Sets the value of the rechtspersoonAdministratieveEenh property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh }
                 *     
                 */
                public void setRechtspersoonAdministratieveEenh(UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.RechtspersoonAdministratieveEenh value) {
                    this.rechtspersoonAdministratieveEenh = value;
                }

                /**
                 * Gets the value of the feitelijkAdresAeh property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the feitelijkAdresAeh property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFeitelijkAdresAeh().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh }
                 * 
                 * 
                 * @return
                 *     The value of the feitelijkAdresAeh property.
                 */
                public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.FeitelijkAdresAeh> getFeitelijkAdresAeh() {
                    if (feitelijkAdresAeh == null) {
                        feitelijkAdresAeh = new ArrayList<>();
                    }
                    return this.feitelijkAdresAeh;
                }

                /**
                 * Gets the value of the correspondentieadresAeh property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the correspondentieadresAeh property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCorrespondentieadresAeh().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.CorrespondentieadresAeh }
                 * 
                 * 
                 * @return
                 *     The value of the correspondentieadresAeh property.
                 */
                public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.CorrespondentieadresAeh> getCorrespondentieadresAeh() {
                    if (correspondentieadresAeh == null) {
                        correspondentieadresAeh = new ArrayList<>();
                    }
                    return this.correspondentieadresAeh;
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
                 *         <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <choice>
                 *           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
                 *           <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
                 *           <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
                 *           <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
                 *         </choice>
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
                    "datBAdres",
                    "datEAdres",
                    "straatadres",
                    "postbusadres",
                    "straatadresBuitenland",
                    "postbusadresBuitenland"
                })
                public static class CorrespondentieadresAeh {

                    @XmlElement(name = "DatBAdres")
                    protected String datBAdres;
                    @XmlElement(name = "DatEAdres")
                    protected String datEAdres;
                    @XmlElement(name = "Straatadres")
                    protected Straatadres straatadres;
                    @XmlElement(name = "Postbusadres")
                    protected Postbusadres postbusadres;
                    @XmlElement(name = "StraatadresBuitenland")
                    protected StraatadresBuitenland straatadresBuitenland;
                    @XmlElement(name = "PostbusadresBuitenland")
                    protected PostbusadresBuitenland postbusadresBuitenland;

                    /**
                     * Gets the value of the datBAdres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBAdres() {
                        return datBAdres;
                    }

                    /**
                     * Sets the value of the datBAdres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBAdres(String value) {
                        this.datBAdres = value;
                    }

                    /**
                     * Gets the value of the datEAdres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEAdres() {
                        return datEAdres;
                    }

                    /**
                     * Sets the value of the datEAdres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEAdres(String value) {
                        this.datEAdres = value;
                    }

                    /**
                     * Gets the value of the straatadres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Straatadres }
                     *     
                     */
                    public Straatadres getStraatadres() {
                        return straatadres;
                    }

                    /**
                     * Sets the value of the straatadres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Straatadres }
                     *     
                     */
                    public void setStraatadres(Straatadres value) {
                        this.straatadres = value;
                    }

                    /**
                     * Gets the value of the postbusadres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Postbusadres }
                     *     
                     */
                    public Postbusadres getPostbusadres() {
                        return postbusadres;
                    }

                    /**
                     * Sets the value of the postbusadres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Postbusadres }
                     *     
                     */
                    public void setPostbusadres(Postbusadres value) {
                        this.postbusadres = value;
                    }

                    /**
                     * Gets the value of the straatadresBuitenland property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StraatadresBuitenland }
                     *     
                     */
                    public StraatadresBuitenland getStraatadresBuitenland() {
                        return straatadresBuitenland;
                    }

                    /**
                     * Sets the value of the straatadresBuitenland property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StraatadresBuitenland }
                     *     
                     */
                    public void setStraatadresBuitenland(StraatadresBuitenland value) {
                        this.straatadresBuitenland = value;
                    }

                    /**
                     * Gets the value of the postbusadresBuitenland property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PostbusadresBuitenland }
                     *     
                     */
                    public PostbusadresBuitenland getPostbusadresBuitenland() {
                        return postbusadresBuitenland;
                    }

                    /**
                     * Sets the value of the postbusadresBuitenland property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PostbusadresBuitenland }
                     *     
                     */
                    public void setPostbusadresBuitenland(PostbusadresBuitenland value) {
                        this.postbusadresBuitenland = value;
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
                 *         <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *         <choice>
                 *           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
                 *           <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
                 *           <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
                 *           <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
                 *         </choice>
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
                    "datBAdres",
                    "datEAdres",
                    "straatadres",
                    "postbusadres",
                    "straatadresBuitenland",
                    "postbusadresBuitenland"
                })
                public static class FeitelijkAdresAeh {

                    @XmlElement(name = "DatBAdres")
                    protected String datBAdres;
                    @XmlElement(name = "DatEAdres")
                    protected String datEAdres;
                    @XmlElement(name = "Straatadres")
                    protected Straatadres straatadres;
                    @XmlElement(name = "Postbusadres")
                    protected Postbusadres postbusadres;
                    @XmlElement(name = "StraatadresBuitenland")
                    protected StraatadresBuitenland straatadresBuitenland;
                    @XmlElement(name = "PostbusadresBuitenland")
                    protected PostbusadresBuitenland postbusadresBuitenland;

                    /**
                     * Gets the value of the datBAdres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatBAdres() {
                        return datBAdres;
                    }

                    /**
                     * Sets the value of the datBAdres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatBAdres(String value) {
                        this.datBAdres = value;
                    }

                    /**
                     * Gets the value of the datEAdres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDatEAdres() {
                        return datEAdres;
                    }

                    /**
                     * Sets the value of the datEAdres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatEAdres(String value) {
                        this.datEAdres = value;
                    }

                    /**
                     * Gets the value of the straatadres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Straatadres }
                     *     
                     */
                    public Straatadres getStraatadres() {
                        return straatadres;
                    }

                    /**
                     * Sets the value of the straatadres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Straatadres }
                     *     
                     */
                    public void setStraatadres(Straatadres value) {
                        this.straatadres = value;
                    }

                    /**
                     * Gets the value of the postbusadres property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Postbusadres }
                     *     
                     */
                    public Postbusadres getPostbusadres() {
                        return postbusadres;
                    }

                    /**
                     * Sets the value of the postbusadres property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Postbusadres }
                     *     
                     */
                    public void setPostbusadres(Postbusadres value) {
                        this.postbusadres = value;
                    }

                    /**
                     * Gets the value of the straatadresBuitenland property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StraatadresBuitenland }
                     *     
                     */
                    public StraatadresBuitenland getStraatadresBuitenland() {
                        return straatadresBuitenland;
                    }

                    /**
                     * Sets the value of the straatadresBuitenland property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StraatadresBuitenland }
                     *     
                     */
                    public void setStraatadresBuitenland(StraatadresBuitenland value) {
                        this.straatadresBuitenland = value;
                    }

                    /**
                     * Gets the value of the postbusadresBuitenland property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PostbusadresBuitenland }
                     *     
                     */
                    public PostbusadresBuitenland getPostbusadresBuitenland() {
                        return postbusadresBuitenland;
                    }

                    /**
                     * Sets the value of the postbusadresBuitenland property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PostbusadresBuitenland }
                     *     
                     */
                    public void setPostbusadresBuitenland(PostbusadresBuitenland value) {
                        this.postbusadresBuitenland = value;
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
                 *         <element name="Voornamen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
                 *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
                 *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
                 *         <element name="FeitelijkAdresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <sequence>
                 *                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *                   <choice>
                 *                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
                 *                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
                 *                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
                 *                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
                 *                   </choice>
                 *                 </sequence>
                 *               </restriction>
                 *             </complexContent>
                 *           </complexType>
                 *         </element>
                 *         <element name="CorrespondentieadresPersoonAeh" maxOccurs="unbounded" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <sequence>
                 *                   <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *                   <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                 *                   <choice>
                 *                     <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
                 *                     <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
                 *                     <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
                 *                     <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
                 *                   </choice>
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
                    "voornamen",
                    "voorvoegsel",
                    "significantDeelVanDeAchternaam",
                    "feitelijkAdresPersoonAeh",
                    "correspondentieadresPersoonAeh"
                })
                public static class PersoonAdministratieveEenheid {

                    @XmlElement(name = "Voornamen")
                    protected String voornamen;
                    @XmlElement(name = "Voorvoegsel")
                    protected String voorvoegsel;
                    @XmlElement(name = "SignificantDeelVanDeAchternaam")
                    protected String significantDeelVanDeAchternaam;
                    @XmlElement(name = "FeitelijkAdresPersoonAeh")
                    protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.FeitelijkAdresPersoonAeh> feitelijkAdresPersoonAeh;
                    @XmlElement(name = "CorrespondentieadresPersoonAeh")
                    protected List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.CorrespondentieadresPersoonAeh> correspondentieadresPersoonAeh;

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
                     * Gets the value of the feitelijkAdresPersoonAeh property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the Jakarta XML Binding object.
                     * This is why there is not a {@code set} method for the feitelijkAdresPersoonAeh property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFeitelijkAdresPersoonAeh().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.FeitelijkAdresPersoonAeh }
                     * 
                     * 
                     * @return
                     *     The value of the feitelijkAdresPersoonAeh property.
                     */
                    public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.FeitelijkAdresPersoonAeh> getFeitelijkAdresPersoonAeh() {
                        if (feitelijkAdresPersoonAeh == null) {
                            feitelijkAdresPersoonAeh = new ArrayList<>();
                        }
                        return this.feitelijkAdresPersoonAeh;
                    }

                    /**
                     * Gets the value of the correspondentieadresPersoonAeh property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the Jakarta XML Binding object.
                     * This is why there is not a {@code set} method for the correspondentieadresPersoonAeh property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCorrespondentieadresPersoonAeh().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.CorrespondentieadresPersoonAeh }
                     * 
                     * 
                     * @return
                     *     The value of the correspondentieadresPersoonAeh property.
                     */
                    public List<UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.AdministratieveEenheid.PersoonAdministratieveEenheid.CorrespondentieadresPersoonAeh> getCorrespondentieadresPersoonAeh() {
                        if (correspondentieadresPersoonAeh == null) {
                            correspondentieadresPersoonAeh = new ArrayList<>();
                        }
                        return this.correspondentieadresPersoonAeh;
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
                     *         <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                     *         <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                     *         <choice>
                     *           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
                     *           <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
                     *           <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
                     *           <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
                     *         </choice>
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
                        "datBAdres",
                        "datEAdres",
                        "straatadres",
                        "postbusadres",
                        "straatadresBuitenland",
                        "postbusadresBuitenland"
                    })
                    public static class CorrespondentieadresPersoonAeh {

                        @XmlElement(name = "DatBAdres")
                        protected String datBAdres;
                        @XmlElement(name = "DatEAdres")
                        protected String datEAdres;
                        @XmlElement(name = "Straatadres")
                        protected Straatadres straatadres;
                        @XmlElement(name = "Postbusadres")
                        protected Postbusadres postbusadres;
                        @XmlElement(name = "StraatadresBuitenland")
                        protected StraatadresBuitenland straatadresBuitenland;
                        @XmlElement(name = "PostbusadresBuitenland")
                        protected PostbusadresBuitenland postbusadresBuitenland;

                        /**
                         * Gets the value of the datBAdres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDatBAdres() {
                            return datBAdres;
                        }

                        /**
                         * Sets the value of the datBAdres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDatBAdres(String value) {
                            this.datBAdres = value;
                        }

                        /**
                         * Gets the value of the datEAdres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDatEAdres() {
                            return datEAdres;
                        }

                        /**
                         * Sets the value of the datEAdres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDatEAdres(String value) {
                            this.datEAdres = value;
                        }

                        /**
                         * Gets the value of the straatadres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Straatadres }
                         *     
                         */
                        public Straatadres getStraatadres() {
                            return straatadres;
                        }

                        /**
                         * Sets the value of the straatadres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Straatadres }
                         *     
                         */
                        public void setStraatadres(Straatadres value) {
                            this.straatadres = value;
                        }

                        /**
                         * Gets the value of the postbusadres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Postbusadres }
                         *     
                         */
                        public Postbusadres getPostbusadres() {
                            return postbusadres;
                        }

                        /**
                         * Sets the value of the postbusadres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Postbusadres }
                         *     
                         */
                        public void setPostbusadres(Postbusadres value) {
                            this.postbusadres = value;
                        }

                        /**
                         * Gets the value of the straatadresBuitenland property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link StraatadresBuitenland }
                         *     
                         */
                        public StraatadresBuitenland getStraatadresBuitenland() {
                            return straatadresBuitenland;
                        }

                        /**
                         * Sets the value of the straatadresBuitenland property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link StraatadresBuitenland }
                         *     
                         */
                        public void setStraatadresBuitenland(StraatadresBuitenland value) {
                            this.straatadresBuitenland = value;
                        }

                        /**
                         * Gets the value of the postbusadresBuitenland property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link PostbusadresBuitenland }
                         *     
                         */
                        public PostbusadresBuitenland getPostbusadresBuitenland() {
                            return postbusadresBuitenland;
                        }

                        /**
                         * Sets the value of the postbusadresBuitenland property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PostbusadresBuitenland }
                         *     
                         */
                        public void setPostbusadresBuitenland(PostbusadresBuitenland value) {
                            this.postbusadresBuitenland = value;
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
                     *         <element name="DatBAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                     *         <element name="DatEAdres" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
                     *         <choice>
                     *           <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Straatadres"/>
                     *           <element name="Postbusadres" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}Postbusadres"/>
                     *           <element name="StraatadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}StraatadresBuitenland"/>
                     *           <element name="PostbusadresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}PostbusadresBuitenland"/>
                     *         </choice>
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
                        "datBAdres",
                        "datEAdres",
                        "straatadres",
                        "postbusadres",
                        "straatadresBuitenland",
                        "postbusadresBuitenland"
                    })
                    public static class FeitelijkAdresPersoonAeh {

                        @XmlElement(name = "DatBAdres")
                        protected String datBAdres;
                        @XmlElement(name = "DatEAdres")
                        protected String datEAdres;
                        @XmlElement(name = "Straatadres")
                        protected Straatadres straatadres;
                        @XmlElement(name = "Postbusadres")
                        protected Postbusadres postbusadres;
                        @XmlElement(name = "StraatadresBuitenland")
                        protected StraatadresBuitenland straatadresBuitenland;
                        @XmlElement(name = "PostbusadresBuitenland")
                        protected PostbusadresBuitenland postbusadresBuitenland;

                        /**
                         * Gets the value of the datBAdres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDatBAdres() {
                            return datBAdres;
                        }

                        /**
                         * Sets the value of the datBAdres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDatBAdres(String value) {
                            this.datBAdres = value;
                        }

                        /**
                         * Gets the value of the datEAdres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDatEAdres() {
                            return datEAdres;
                        }

                        /**
                         * Sets the value of the datEAdres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDatEAdres(String value) {
                            this.datEAdres = value;
                        }

                        /**
                         * Gets the value of the straatadres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Straatadres }
                         *     
                         */
                        public Straatadres getStraatadres() {
                            return straatadres;
                        }

                        /**
                         * Sets the value of the straatadres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Straatadres }
                         *     
                         */
                        public void setStraatadres(Straatadres value) {
                            this.straatadres = value;
                        }

                        /**
                         * Gets the value of the postbusadres property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Postbusadres }
                         *     
                         */
                        public Postbusadres getPostbusadres() {
                            return postbusadres;
                        }

                        /**
                         * Sets the value of the postbusadres property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Postbusadres }
                         *     
                         */
                        public void setPostbusadres(Postbusadres value) {
                            this.postbusadres = value;
                        }

                        /**
                         * Gets the value of the straatadresBuitenland property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link StraatadresBuitenland }
                         *     
                         */
                        public StraatadresBuitenland getStraatadresBuitenland() {
                            return straatadresBuitenland;
                        }

                        /**
                         * Sets the value of the straatadresBuitenland property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link StraatadresBuitenland }
                         *     
                         */
                        public void setStraatadresBuitenland(StraatadresBuitenland value) {
                            this.straatadresBuitenland = value;
                        }

                        /**
                         * Gets the value of the postbusadresBuitenland property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link PostbusadresBuitenland }
                         *     
                         */
                        public PostbusadresBuitenland getPostbusadresBuitenland() {
                            return postbusadresBuitenland;
                        }

                        /**
                         * Sets the value of the postbusadresBuitenland property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PostbusadresBuitenland }
                         *     
                         */
                        public void setPostbusadresBuitenland(PostbusadresBuitenland value) {
                            this.postbusadresBuitenland = value;
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
                 *         <element name="FiNr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}SofiNr"/>
                 *         <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
                 *         <element name="CdRechtsvorm" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdRechtsvorm" minOccurs="0"/>
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
                    "fiNr",
                    "naamRechtspersoon",
                    "cdRechtsvorm"
                })
                public static class RechtspersoonAdministratieveEenh {

                    @XmlElement(name = "FiNr", required = true)
                    protected String fiNr;
                    @XmlElement(name = "NaamRechtspersoon")
                    protected String naamRechtspersoon;
                    @XmlElement(name = "CdRechtsvorm")
                    protected String cdRechtsvorm;

                    /**
                     * Gets the value of the fiNr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFiNr() {
                        return fiNr;
                    }

                    /**
                     * Sets the value of the fiNr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFiNr(String value) {
                        this.fiNr = value;
                    }

                    /**
                     * Gets the value of the naamRechtspersoon property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNaamRechtspersoon() {
                        return naamRechtspersoon;
                    }

                    /**
                     * Sets the value of the naamRechtspersoon property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNaamRechtspersoon(String value) {
                        this.naamRechtspersoon = value;
                    }

                    /**
                     * Gets the value of the cdRechtsvorm property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdRechtsvorm() {
                        return cdRechtsvorm;
                    }

                    /**
                     * Sets the value of the cdRechtsvorm property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdRechtsvorm(String value) {
                        this.cdRechtsvorm = value;
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
             *         <element name="DatBIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
             *         <element name="DatEIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="AantSvDagenIko" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}AantalN3" minOccurs="0"/>
             *         <element name="AantVerloondeUrenIko" type="{http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200}AantVerloondeUrenIko" minOccurs="0"/>
             *         <element name="BedrBrutoloonSv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrLoonLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrIngehoudenLbPremieVolksverz" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrOpgbRechtVakantietoeslag" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrOpgbRechtExtraPrdSalaris" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrVergoedingReiskostenOnbelast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrInUitkBegrBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
             *         <element name="BedrRechtstreeksBetAlimentatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StandaardBedr" minOccurs="0"/>
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
                "bedrBrutoloonSv",
                "bedrLoonLbPremieVolksverz",
                "bedrIngehoudenLbPremieVolksverz",
                "bedrVakantietoeslag",
                "bedrOpgbRechtVakantietoeslag",
                "bedrExtraPrdSalaris",
                "bedrOpgbRechtExtraPrdSalaris",
                "bedrVergoedingReiskostenOnbelast",
                "bedrInUitkBegrBetAlimentatie",
                "bedrRechtstreeksBetAlimentatie"
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
                @XmlElement(name = "BedrLoonLbPremieVolksverz")
                protected StandaardBedr bedrLoonLbPremieVolksverz;
                @XmlElement(name = "BedrIngehoudenLbPremieVolksverz")
                protected StandaardBedr bedrIngehoudenLbPremieVolksverz;
                @XmlElement(name = "BedrVakantietoeslag")
                protected StandaardBedr bedrVakantietoeslag;
                @XmlElement(name = "BedrOpgbRechtVakantietoeslag")
                protected StandaardBedr bedrOpgbRechtVakantietoeslag;
                @XmlElement(name = "BedrExtraPrdSalaris")
                protected StandaardBedr bedrExtraPrdSalaris;
                @XmlElement(name = "BedrOpgbRechtExtraPrdSalaris")
                protected StandaardBedr bedrOpgbRechtExtraPrdSalaris;
                @XmlElement(name = "BedrVergoedingReiskostenOnbelast")
                protected StandaardBedr bedrVergoedingReiskostenOnbelast;
                @XmlElement(name = "BedrInUitkBegrBetAlimentatie")
                protected StandaardBedr bedrInUitkBegrBetAlimentatie;
                @XmlElement(name = "BedrRechtstreeksBetAlimentatie")
                protected StandaardBedr bedrRechtstreeksBetAlimentatie;

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

                /**
                 * Gets the value of the bedrLoonLbPremieVolksverz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrLoonLbPremieVolksverz() {
                    return bedrLoonLbPremieVolksverz;
                }

                /**
                 * Sets the value of the bedrLoonLbPremieVolksverz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrLoonLbPremieVolksverz(StandaardBedr value) {
                    this.bedrLoonLbPremieVolksverz = value;
                }

                /**
                 * Gets the value of the bedrIngehoudenLbPremieVolksverz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrIngehoudenLbPremieVolksverz() {
                    return bedrIngehoudenLbPremieVolksverz;
                }

                /**
                 * Sets the value of the bedrIngehoudenLbPremieVolksverz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrIngehoudenLbPremieVolksverz(StandaardBedr value) {
                    this.bedrIngehoudenLbPremieVolksverz = value;
                }

                /**
                 * Gets the value of the bedrVakantietoeslag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrVakantietoeslag() {
                    return bedrVakantietoeslag;
                }

                /**
                 * Sets the value of the bedrVakantietoeslag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrVakantietoeslag(StandaardBedr value) {
                    this.bedrVakantietoeslag = value;
                }

                /**
                 * Gets the value of the bedrOpgbRechtVakantietoeslag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrOpgbRechtVakantietoeslag() {
                    return bedrOpgbRechtVakantietoeslag;
                }

                /**
                 * Sets the value of the bedrOpgbRechtVakantietoeslag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrOpgbRechtVakantietoeslag(StandaardBedr value) {
                    this.bedrOpgbRechtVakantietoeslag = value;
                }

                /**
                 * Gets the value of the bedrExtraPrdSalaris property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrExtraPrdSalaris() {
                    return bedrExtraPrdSalaris;
                }

                /**
                 * Sets the value of the bedrExtraPrdSalaris property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrExtraPrdSalaris(StandaardBedr value) {
                    this.bedrExtraPrdSalaris = value;
                }

                /**
                 * Gets the value of the bedrOpgbRechtExtraPrdSalaris property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrOpgbRechtExtraPrdSalaris() {
                    return bedrOpgbRechtExtraPrdSalaris;
                }

                /**
                 * Sets the value of the bedrOpgbRechtExtraPrdSalaris property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrOpgbRechtExtraPrdSalaris(StandaardBedr value) {
                    this.bedrOpgbRechtExtraPrdSalaris = value;
                }

                /**
                 * Gets the value of the bedrVergoedingReiskostenOnbelast property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrVergoedingReiskostenOnbelast() {
                    return bedrVergoedingReiskostenOnbelast;
                }

                /**
                 * Sets the value of the bedrVergoedingReiskostenOnbelast property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrVergoedingReiskostenOnbelast(StandaardBedr value) {
                    this.bedrVergoedingReiskostenOnbelast = value;
                }

                /**
                 * Gets the value of the bedrInUitkBegrBetAlimentatie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrInUitkBegrBetAlimentatie() {
                    return bedrInUitkBegrBetAlimentatie;
                }

                /**
                 * Sets the value of the bedrInUitkBegrBetAlimentatie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrInUitkBegrBetAlimentatie(StandaardBedr value) {
                    this.bedrInUitkBegrBetAlimentatie = value;
                }

                /**
                 * Gets the value of the bedrRechtstreeksBetAlimentatie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public StandaardBedr getBedrRechtstreeksBetAlimentatie() {
                    return bedrRechtstreeksBetAlimentatie;
                }

                /**
                 * Sets the value of the bedrRechtstreeksBetAlimentatie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StandaardBedr }
                 *     
                 */
                public void setBedrRechtstreeksBetAlimentatie(StandaardBedr value) {
                    this.bedrRechtstreeksBetAlimentatie = value;
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
             *         <element name="CdTypeArbeidscontract" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdTypeArbeidscontract" minOccurs="0"/>
             *         <element name="CdInvloedVerzekeringsplicht" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdInvloedVerzekeringsplicht" minOccurs="0"/>
             *         <element name="IndLoonheffingskortingToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="IndRegelmatigArbeidspatroon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdInd" minOccurs="0"/>
             *         <element name="IndPersoneelsleningNietInLoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="IndLoonIsMedeAowAlleenstaande" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="IndLoonInclusiefWajongUitkering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="IndVakantiebonnenToegepast" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
             *         <element name="CdAardIkv" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdAardIkv" minOccurs="0"/>
             *         <element name="CdIncidInkomstenvermindering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdIncidInkomstenvermindering" minOccurs="0"/>
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
                "cdTypeArbeidscontract",
                "cdInvloedVerzekeringsplicht",
                "indLoonheffingskortingToegepast",
                "indRegelmatigArbeidspatroon",
                "indPersoneelsleningNietInLoon",
                "indLoonIsMedeAowAlleenstaande",
                "indLoonInclusiefWajongUitkering",
                "indVakantiebonnenToegepast",
                "cdAardIkv",
                "cdIncidInkomstenvermindering"
            })
            public static class Inkomstenperiode {

                @XmlElement(name = "DatBIkp", required = true)
                protected String datBIkp;
                @XmlElement(name = "DatEIkp")
                protected String datEIkp;
                @XmlElement(name = "CdSrtIkv")
                protected String cdSrtIkv;
                @XmlElement(name = "CdTypeArbeidscontract")
                protected String cdTypeArbeidscontract;
                @XmlElement(name = "CdInvloedVerzekeringsplicht")
                protected String cdInvloedVerzekeringsplicht;
                @XmlElement(name = "IndLoonheffingskortingToegepast")
                protected String indLoonheffingskortingToegepast;
                @XmlElement(name = "IndRegelmatigArbeidspatroon")
                protected String indRegelmatigArbeidspatroon;
                @XmlElement(name = "IndPersoneelsleningNietInLoon")
                protected String indPersoneelsleningNietInLoon;
                @XmlElement(name = "IndLoonIsMedeAowAlleenstaande")
                protected String indLoonIsMedeAowAlleenstaande;
                @XmlElement(name = "IndLoonInclusiefWajongUitkering")
                protected String indLoonInclusiefWajongUitkering;
                @XmlElement(name = "IndVakantiebonnenToegepast")
                protected String indVakantiebonnenToegepast;
                @XmlElement(name = "CdAardIkv")
                protected String cdAardIkv;
                @XmlElement(name = "CdIncidInkomstenvermindering")
                protected String cdIncidInkomstenvermindering;

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
                 * Gets the value of the cdTypeArbeidscontract property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdTypeArbeidscontract() {
                    return cdTypeArbeidscontract;
                }

                /**
                 * Sets the value of the cdTypeArbeidscontract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdTypeArbeidscontract(String value) {
                    this.cdTypeArbeidscontract = value;
                }

                /**
                 * Gets the value of the cdInvloedVerzekeringsplicht property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdInvloedVerzekeringsplicht() {
                    return cdInvloedVerzekeringsplicht;
                }

                /**
                 * Sets the value of the cdInvloedVerzekeringsplicht property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdInvloedVerzekeringsplicht(String value) {
                    this.cdInvloedVerzekeringsplicht = value;
                }

                /**
                 * Gets the value of the indLoonheffingskortingToegepast property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndLoonheffingskortingToegepast() {
                    return indLoonheffingskortingToegepast;
                }

                /**
                 * Sets the value of the indLoonheffingskortingToegepast property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndLoonheffingskortingToegepast(String value) {
                    this.indLoonheffingskortingToegepast = value;
                }

                /**
                 * Gets the value of the indRegelmatigArbeidspatroon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndRegelmatigArbeidspatroon() {
                    return indRegelmatigArbeidspatroon;
                }

                /**
                 * Sets the value of the indRegelmatigArbeidspatroon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndRegelmatigArbeidspatroon(String value) {
                    this.indRegelmatigArbeidspatroon = value;
                }

                /**
                 * Gets the value of the indPersoneelsleningNietInLoon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndPersoneelsleningNietInLoon() {
                    return indPersoneelsleningNietInLoon;
                }

                /**
                 * Sets the value of the indPersoneelsleningNietInLoon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndPersoneelsleningNietInLoon(String value) {
                    this.indPersoneelsleningNietInLoon = value;
                }

                /**
                 * Gets the value of the indLoonIsMedeAowAlleenstaande property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndLoonIsMedeAowAlleenstaande() {
                    return indLoonIsMedeAowAlleenstaande;
                }

                /**
                 * Sets the value of the indLoonIsMedeAowAlleenstaande property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndLoonIsMedeAowAlleenstaande(String value) {
                    this.indLoonIsMedeAowAlleenstaande = value;
                }

                /**
                 * Gets the value of the indLoonInclusiefWajongUitkering property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndLoonInclusiefWajongUitkering() {
                    return indLoonInclusiefWajongUitkering;
                }

                /**
                 * Sets the value of the indLoonInclusiefWajongUitkering property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndLoonInclusiefWajongUitkering(String value) {
                    this.indLoonInclusiefWajongUitkering = value;
                }

                /**
                 * Gets the value of the indVakantiebonnenToegepast property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndVakantiebonnenToegepast() {
                    return indVakantiebonnenToegepast;
                }

                /**
                 * Sets the value of the indVakantiebonnenToegepast property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndVakantiebonnenToegepast(String value) {
                    this.indVakantiebonnenToegepast = value;
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

                /**
                 * Gets the value of the cdIncidInkomstenvermindering property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdIncidInkomstenvermindering() {
                    return cdIncidInkomstenvermindering;
                }

                /**
                 * Sets the value of the cdIncidInkomstenvermindering property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdIncidInkomstenvermindering(String value) {
                    this.cdIncidInkomstenvermindering = value;
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
             *         <element name="CdSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorRisicogroep" minOccurs="0"/>
             *         <element name="DatBSectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="DatESectorRisicogroep" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
             *         <element name="SectorBeroepsEnBedrijfsleven" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv"/>
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
                "cdSectorRisicogroep",
                "datBSectorRisicogroep",
                "datESectorRisicogroep",
                "sectorBeroepsEnBedrijfsleven"
            })
            public static class SectorRisicogroepIkv {

                @XmlElement(name = "CdSectorRisicogroep")
                protected String cdSectorRisicogroep;
                @XmlElement(name = "DatBSectorRisicogroep")
                protected String datBSectorRisicogroep;
                @XmlElement(name = "DatESectorRisicogroep")
                protected String datESectorRisicogroep;
                @XmlElement(name = "SectorBeroepsEnBedrijfsleven")
                protected UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven sectorBeroepsEnBedrijfsleven;

                /**
                 * Gets the value of the cdSectorRisicogroep property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCdSectorRisicogroep() {
                    return cdSectorRisicogroep;
                }

                /**
                 * Sets the value of the cdSectorRisicogroep property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCdSectorRisicogroep(String value) {
                    this.cdSectorRisicogroep = value;
                }

                /**
                 * Gets the value of the datBSectorRisicogroep property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatBSectorRisicogroep() {
                    return datBSectorRisicogroep;
                }

                /**
                 * Sets the value of the datBSectorRisicogroep property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatBSectorRisicogroep(String value) {
                    this.datBSectorRisicogroep = value;
                }

                /**
                 * Gets the value of the datESectorRisicogroep property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatESectorRisicogroep() {
                    return datESectorRisicogroep;
                }

                /**
                 * Sets the value of the datESectorRisicogroep property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatESectorRisicogroep(String value) {
                    this.datESectorRisicogroep = value;
                }

                /**
                 * Gets the value of the sectorBeroepsEnBedrijfsleven property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven }
                 *     
                 */
                public UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven getSectorBeroepsEnBedrijfsleven() {
                    return sectorBeroepsEnBedrijfsleven;
                }

                /**
                 * Sets the value of the sectorBeroepsEnBedrijfsleven property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven }
                 *     
                 */
                public void setSectorBeroepsEnBedrijfsleven(UWVPersoonsIkvInfoResponse.ClientSuwi.Inkomstenverhouding.SectorRisicogroepIkv.SectorBeroepsEnBedrijfsleven value) {
                    this.sectorBeroepsEnBedrijfsleven = value;
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
                 *         <element name="CdSector" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSectorOsv"/>
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
                    "cdSector"
                })
                public static class SectorBeroepsEnBedrijfsleven {

                    @XmlElement(name = "CdSector", required = true)
                    protected String cdSector;

                    /**
                     * Gets the value of the cdSector property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCdSector() {
                        return cdSector;
                    }

                    /**
                     * Sets the value of the cdSector property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCdSector(String value) {
                        this.cdSector = value;
                    }

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
