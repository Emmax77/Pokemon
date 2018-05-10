
package com.pandatech.gatewayws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for firmaXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="firmaXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutaCertificadop12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rutaXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rutaGuardado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firmaXml", propOrder = {
    "rutaCertificadop12",
    "pin",
    "rutaXml",
    "rutaGuardado"
})
public class FirmaXml {

    protected String rutaCertificadop12;
    protected String pin;
    protected String rutaXml;
    protected String rutaGuardado;

    /**
     * Gets the value of the rutaCertificadop12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaCertificadop12() {
        return rutaCertificadop12;
    }

    /**
     * Sets the value of the rutaCertificadop12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaCertificadop12(String value) {
        this.rutaCertificadop12 = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the rutaXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaXml() {
        return rutaXml;
    }

    /**
     * Sets the value of the rutaXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaXml(String value) {
        this.rutaXml = value;
    }

    /**
     * Gets the value of the rutaGuardado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaGuardado() {
        return rutaGuardado;
    }

    /**
     * Sets the value of the rutaGuardado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaGuardado(String value) {
        this.rutaGuardado = value;
    }

}
