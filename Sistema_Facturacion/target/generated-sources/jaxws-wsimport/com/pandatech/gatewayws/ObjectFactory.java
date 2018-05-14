
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

    private final static QName _Facturar_QNAME = new QName("http://gatewayws.pandatech.com/", "facturar");
    private final static QName _FacturarResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "facturarResponse");
    private final static QName _InterruptedException_QNAME = new QName("http://gatewayws.pandatech.com/", "InterruptedException");
    private final static QName _ComprobanteXmlResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "comprobanteXmlResponse");
    private final static QName _ComprobanteXml_QNAME = new QName("http://gatewayws.pandatech.com/", "comprobanteXml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pandatech.gatewayws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Facturar }
     * 
     */
    public Facturar createFacturar() {
        return new Facturar();
    }

    /**
     * Create an instance of {@link FacturarResponse }
     * 
     */
    public FacturarResponse createFacturarResponse() {
        return new FacturarResponse();
    }

    /**
     * Create an instance of {@link InterruptedException }
     * 
     */
    public InterruptedException createInterruptedException() {
        return new InterruptedException();
    }

    /**
     * Create an instance of {@link ComprobanteXmlResponse }
     * 
     */
    public ComprobanteXmlResponse createComprobanteXmlResponse() {
        return new ComprobanteXmlResponse();
    }

    /**
     * Create an instance of {@link ComprobanteXml }
     * 
     */
    public ComprobanteXml createComprobanteXml() {
        return new ComprobanteXml();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facturar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "facturar")
    public JAXBElement<Facturar> createFacturar(Facturar value) {
        return new JAXBElement<Facturar>(_Facturar_QNAME, Facturar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "facturarResponse")
    public JAXBElement<FacturarResponse> createFacturarResponse(FacturarResponse value) {
        return new JAXBElement<FacturarResponse>(_FacturarResponse_QNAME, FacturarResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobanteXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "comprobanteXmlResponse")
    public JAXBElement<ComprobanteXmlResponse> createComprobanteXmlResponse(ComprobanteXmlResponse value) {
        return new JAXBElement<ComprobanteXmlResponse>(_ComprobanteXmlResponse_QNAME, ComprobanteXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobanteXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "comprobanteXml")
    public JAXBElement<ComprobanteXml> createComprobanteXml(ComprobanteXml value) {
        return new JAXBElement<ComprobanteXml>(_ComprobanteXml_QNAME, ComprobanteXml.class, null, value);
    }

}
