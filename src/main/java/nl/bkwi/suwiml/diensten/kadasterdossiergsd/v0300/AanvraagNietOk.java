
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.ws.WebFault;
import nl.bkwi.suwiml.fwi.v0205.Melding;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "Fout", targetNamespace = "http://bkwi.nl/SuwiML/FWI/v0205")
public class AanvraagNietOk
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Melding faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AanvraagNietOk(String message, Melding faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public AanvraagNietOk(String message, Melding faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: nl.bkwi.suwiml.fwi.v0205.Melding
     */
    public Melding getFaultInfo() {
        return faultInfo;
    }

}
