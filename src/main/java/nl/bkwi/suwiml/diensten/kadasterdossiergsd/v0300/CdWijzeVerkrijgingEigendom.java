
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CdWijzeVerkrijgingEigendom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CdWijzeVerkrijgingEigendom">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="C"/>
 *     <enumeration value="H"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CdWijzeVerkrijgingEigendom")
@XmlEnum
public enum CdWijzeVerkrijgingEigendom {


    /**
     * Contant
     * 
     */
    C,

    /**
     * Hypotheek
     * 
     */
    H;

    public String value() {
        return name();
    }

    public static CdWijzeVerkrijgingEigendom fromValue(String v) {
        return valueOf(v);
    }

}
