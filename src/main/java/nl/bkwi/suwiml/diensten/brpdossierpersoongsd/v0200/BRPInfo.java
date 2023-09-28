
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

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
@WebService(name = "BRPInfo", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
    nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200.ObjectFactory.class
})
public interface BRPInfo {


    /**
     * 
     * @param parameters
     * @return
     *     returns nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200.AanvraagPersoonResponse
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "AanvraagPersoon")
    @WebResult(name = "AanvraagPersoonResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", partName = "parameters")
    public AanvraagPersoonResponse aanvraagPersoon(
        @WebParam(name = "AanvraagPersoon", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", partName = "parameters")
        Request parameters)
        throws AanvraagNietOk
    ;

}