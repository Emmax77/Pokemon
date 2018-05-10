
package com.pandatech.gatewayws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creacionObjetoJson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creacionObjetoJson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoIdEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroIdEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroIdReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creacionObjetoJson", propOrder = {
    "tipoIdEmisor",
    "numeroIdEmisor",
    "tipoIdReceptor",
    "numeroIdReceptor"
})
public class CreacionObjetoJson {

    protected String tipoIdEmisor;
    protected String numeroIdEmisor;
    protected String tipoIdReceptor;
    protected String numeroIdReceptor;

    /**
     * Gets the value of the tipoIdEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdEmisor() {
        return tipoIdEmisor;
    }

    /**
     * Sets the value of the tipoIdEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdEmisor(String value) {
        this.tipoIdEmisor = value;
    }

    /**
     * Gets the value of the numeroIdEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdEmisor() {
        return numeroIdEmisor;
    }

    /**
     * Sets the value of the numeroIdEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdEmisor(String value) {
        this.numeroIdEmisor = value;
    }

    /**
     * Gets the value of the tipoIdReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdReceptor() {
        return tipoIdReceptor;
    }

    /**
     * Sets the value of the tipoIdReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdReceptor(String value) {
        this.tipoIdReceptor = value;
    }

    /**
     * Gets the value of the numeroIdReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdReceptor() {
        return numeroIdReceptor;
    }

    /**
     * Sets the value of the numeroIdReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdReceptor(String value) {
        this.numeroIdReceptor = value;
    }

}
