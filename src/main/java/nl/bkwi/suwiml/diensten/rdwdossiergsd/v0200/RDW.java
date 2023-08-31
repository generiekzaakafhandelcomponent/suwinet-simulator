
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import java.math.BigInteger;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Holder;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "RDW", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200")
@XmlSeeAlso({
    nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.ObjectFactory.class,
    nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
    nl.bkwi.suwiml.basisschema.v0801.ObjectFactory.class
})
public interface RDW {


    /**
     * 
     * @param burgerservicenr
     * @param clientSuwi
     * @param datBPeilperiodeAansprakelijkheid
     * @param datEPeilperiodeAansprakelijkheid
     * @param fwi
     * @param geboortedat
     * @param huisnr
     * @param nietsGevonden
     * @param ondernemingInst
     * @param postcd
     * @param significantDeelVanDeAchternaam
     * @param voorletters
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "VoertuigbezitInfoPersoon")
    @RequestWrapper(localName = "VoertuigbezitInfoPersoon", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200", className = "nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.VoertuigbezitInfoPersoon")
    @ResponseWrapper(localName = "VoertuigbezitInfoPersoonResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200", className = "nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.VoertuigbezitInfoPersoonResponse")
    public void voertuigbezitInfoPersoon(
        @WebParam(name = "Burgerservicenr", targetNamespace = "")
        String burgerservicenr,
        @WebParam(name = "Geboortedat", targetNamespace = "")
        String geboortedat,
        @WebParam(name = "SignificantDeelVanDeAchternaam", targetNamespace = "")
        String significantDeelVanDeAchternaam,
        @WebParam(name = "Voorletters", targetNamespace = "")
        String voorletters,
        @WebParam(name = "Postcd", targetNamespace = "")
        String postcd,
        @WebParam(name = "Huisnr", targetNamespace = "")
        BigInteger huisnr,
        @WebParam(name = "DatBPeilperiodeAansprakelijkheid", targetNamespace = "")
        String datBPeilperiodeAansprakelijkheid,
        @WebParam(name = "DatEPeilperiodeAansprakelijkheid", targetNamespace = "")
        String datEPeilperiodeAansprakelijkheid,
        @WebParam(name = "ClientSuwi", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.VoertuigbezitInfoPersoonResponse.ClientSuwi>> clientSuwi,
        @WebParam(name = "OndernemingInst", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.VoertuigbezitInfoPersoonResponse.OndernemingInst>> ondernemingInst,
        @WebParam(name = "FWI", targetNamespace = "http://bkwi.nl/SuwiML/FWI/v0205", mode = WebParam.Mode.OUT)
        Holder<FWI> fwi,
        @WebParam(name = "NietsGevonden", targetNamespace = "http://bkwi.nl/SuwiML/FWI/v0205", mode = WebParam.Mode.OUT)
        Holder<Object> nietsGevonden)
        throws AanvraagNietOk
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.VoertuigbezitInfoOrgResponse
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "VoertuigbezitInfoOrg")
    @WebResult(name = "VoertuigbezitInfoOrgResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public VoertuigbezitInfoOrgResponse voertuigbezitInfoOrg(
        @WebParam(name = "VoertuigbezitInfoOrg", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200", partName = "parameters")
        VoertuigbezitInfoOrg parameters)
        throws AanvraagNietOk
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200.KentekenInfoResponse
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "KentekenInfo")
    @WebResult(name = "KentekenInfoResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public KentekenInfoResponse kentekenInfo(
        @WebParam(name = "KentekenInfo", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200", partName = "parameters")
        KentekenInfo parameters)
        throws AanvraagNietOk
    ;

}