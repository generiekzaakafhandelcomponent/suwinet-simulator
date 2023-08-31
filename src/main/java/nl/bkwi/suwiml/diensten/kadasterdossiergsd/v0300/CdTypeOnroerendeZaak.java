
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CdTypeOnroerendeZaak.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CdTypeOnroerendeZaak">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="P"/>
 *     <enumeration value="L"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CdTypeOnroerendeZaak")
@XmlEnum
public enum CdTypeOnroerendeZaak {


    /**
     * Appartementsrecht
     * 
     */
    A,

    /**
     * Perceel
     * 
     */
    P,

    /**
     * Leidingnetwerk
     * 
     */
    L;

    public String value() {
        return name();
    }

    public static CdTypeOnroerendeZaak fromValue(String v) {
        return valueOf(v);
    }

}
