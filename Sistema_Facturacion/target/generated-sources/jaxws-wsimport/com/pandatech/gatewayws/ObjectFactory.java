
package com.pandatech.gatewayws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pandatech.gatewayws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FacturacionResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "FacturacionResponse");
    private final static QName _InterruptedException_QNAME = new QName("http://gatewayws.pandatech.com/", "InterruptedException");
    private final static QName _Facturacion_QNAME = new QName("http://gatewayws.pandatech.com/", "Facturacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pandatech.gatewayws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FacturacionResponse }
     * 
     */
    public FacturacionResponse createFacturacionResponse() {
        return new FacturacionResponse();
    }

    /**
     * Create an instance of {@link InterruptedException }
     * 
     */
    public InterruptedException createInterruptedException() {
        return new InterruptedException();
    }

    /**
     * Create an instance of {@link Facturacion_Type }
     * 
     */
    public Facturacion_Type createFacturacion_Type() {
        return new Facturacion_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "FacturacionResponse")
    public JAXBElement<FacturacionResponse> createFacturacionResponse(FacturacionResponse value) {
        return new JAXBElement<FacturacionResponse>(_FacturacionResponse_QNAME, FacturacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "InterruptedException")
    public JAXBElement<InterruptedException> createInterruptedException(InterruptedException value) {
        return new JAXBElement<InterruptedException>(_InterruptedException_QNAME, InterruptedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facturacion_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "Facturacion")
    public JAXBElement<Facturacion_Type> createFacturacion(Facturacion_Type value) {
        return new JAXBElement<Facturacion_Type>(_Facturacion_QNAME, Facturacion_Type.class, null, value);
    }

}
