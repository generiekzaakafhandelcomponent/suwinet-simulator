
package nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200;

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
@WebService(name = "DUOInfo", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200.ObjectFactory.class,
    nl.bkwi.suwiml.fwi.v0205.ObjectFactory.class,
    nl.bkwi.suwiml.basisschema.v0801.ObjectFactory.class
})
public interface DUOInfo {


    /**
     * 
     * @param parameters
     * @return
     *     returns nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200.DUOStudiefinancieringInfoResponse
     * @throws AanvraagNietOk
     */
    @WebMethod(operationName = "DUOStudiefinancieringInfo")
    @WebResult(name = "DUOStudiefinancieringInfoResponse", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200", partName = "parameters")
    public DUOStudiefinancieringInfoResponse duoStudiefinancieringInfo(
        @WebParam(name = "DUOStudiefinancieringInfo", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/DUODossierStudiefinancieringGSD/v0200", partName = "parameters")
        DUOStudiefinancieringInfo parameters)
        throws AanvraagNietOk
    ;

}
