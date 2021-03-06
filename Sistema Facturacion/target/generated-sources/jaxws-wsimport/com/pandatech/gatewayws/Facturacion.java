
package com.pandatech.gatewayws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Facturacion", targetNamespace = "http://gatewayws.pandatech.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Facturacion {


    /**
     * 
     * @param password
     * @param rutaCertificadop12
     * @param pin
     * @param usuario
     * @param rutaXml
     * @return
     *     returns java.lang.String
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "facturar", targetNamespace = "http://gatewayws.pandatech.com/", className = "com.pandatech.gatewayws.Facturar")
    @ResponseWrapper(localName = "facturarResponse", targetNamespace = "http://gatewayws.pandatech.com/", className = "com.pandatech.gatewayws.FacturarResponse")
    @Action(input = "http://gatewayws.pandatech.com/Facturacion/facturarRequest", output = "http://gatewayws.pandatech.com/Facturacion/facturarResponse", fault = {
        @FaultAction(className = InterruptedException_Exception.class, value = "http://gatewayws.pandatech.com/Facturacion/facturar/Fault/InterruptedException")
    })
    public String facturar(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "rutaCertificadop12", targetNamespace = "")
        String rutaCertificadop12,
        @WebParam(name = "pin", targetNamespace = "")
        String pin,
        @WebParam(name = "rutaXml", targetNamespace = "")
        String rutaXml)
        throws InterruptedException_Exception
    ;

    /**
     * 
     * @param password
     * @param clave
     * @param usuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "comprobanteXml", targetNamespace = "http://gatewayws.pandatech.com/", className = "com.pandatech.gatewayws.ComprobanteXml")
    @ResponseWrapper(localName = "comprobanteXmlResponse", targetNamespace = "http://gatewayws.pandatech.com/", className = "com.pandatech.gatewayws.ComprobanteXmlResponse")
    @Action(input = "http://gatewayws.pandatech.com/Facturacion/comprobanteXmlRequest", output = "http://gatewayws.pandatech.com/Facturacion/comprobanteXmlResponse")
    public String comprobanteXml(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

}
