
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "KadasterInfo", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
    nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectFactory.class,
    nl.bkwi.suwiml.basisschema.v0801.ObjectFactory.class
})
public interface KadasterInfo {


    /**
     * 
     * @param parameters
     * @return
     *     returns nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.PersoonsInfoResponse
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "PersoonsInfo")
    @WebResult(name = "PersoonsInfoResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", partName = "parameters")
    public PersoonsInfoResponse persoonsInfo(
        @WebParam(name = "PersoonsInfo", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", partName = "parameters")
        PersoonsInfo parameters)
        throws AanvraagNietOk
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectInfoKadastraleAanduidingResponse
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "ObjectInfoKadastraleAanduiding")
    @WebResult(name = "ObjectInfoKadastraleAanduidingResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", partName = "parameters")
    public ObjectInfoKadastraleAanduidingResponse objectInfoKadastraleAanduiding(
        @WebParam(name = "ObjectInfoKadastraleAanduiding", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", partName = "parameters")
        ObjectInfoKadastraleAanduiding parameters)
        throws AanvraagNietOk
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300.ObjectInfoLocatieOZResponse
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "ObjectInfoLocatieOZ")
    @WebResult(name = "ObjectInfoLocatieOZResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", partName = "parameters")
    public ObjectInfoLocatieOZResponse objectInfoLocatieOZ(
        @WebParam(name = "ObjectInfoLocatieOZ", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", partName = "parameters")
        ObjectInfoLocatieOZ parameters)
        throws AanvraagNietOk
    ;

}