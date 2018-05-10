
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

    private final static QName _Desconexion_QNAME = new QName("http://gatewayws.pandatech.com/", "desconexion");
    private final static QName _FacturacionResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "FacturacionResponse");
    private final static QName _ValidacionEstadoResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "validacionEstadoResponse");
    private final static QName _AutenticacionResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "autenticacionResponse");
    private final static QName _DesconexionResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "desconexionResponse");
    private final static QName _Facturacion_QNAME = new QName("http://gatewayws.pandatech.com/", "Facturacion");
    private final static QName _ComprobanteXml_QNAME = new QName("http://gatewayws.pandatech.com/", "comprobanteXml");
    private final static QName _FirmaXmlResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "firmaXmlResponse");
    private final static QName _ValidacionEstado_QNAME = new QName("http://gatewayws.pandatech.com/", "validacionEstado");
    private final static QName _Autenticacion_QNAME = new QName("http://gatewayws.pandatech.com/", "autenticacion");
    private final static QName _CreacionObjetoJsonResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "creacionObjetoJsonResponse");
    private final static QName _EnviarDocumentoResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "enviarDocumentoResponse");
    private final static QName _ComprobanteXmlResponse_QNAME = new QName("http://gatewayws.pandatech.com/", "comprobanteXmlResponse");
    private final static QName _EnviarDocumento_QNAME = new QName("http://gatewayws.pandatech.com/", "enviarDocumento");
    private final static QName _CreacionObjetoJson_QNAME = new QName("http://gatewayws.pandatech.com/", "creacionObjetoJson");
    private final static QName _FirmaXml_QNAME = new QName("http://gatewayws.pandatech.com/", "firmaXml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pandatech.gatewayws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Autenticacion }
     * 
     */
    public Autenticacion createAutenticacion() {
        return new Autenticacion();
    }

    /**
     * Create an instance of {@link CreacionObjetoJsonResponse }
     * 
     */
    public CreacionObjetoJsonResponse createCreacionObjetoJsonResponse() {
        return new CreacionObjetoJsonResponse();
    }

    /**
     * Create an instance of {@link EnviarDocumentoResponse }
     * 
     */
    public EnviarDocumentoResponse createEnviarDocumentoResponse() {
        return new EnviarDocumentoResponse();
    }

    /**
     * Create an instance of {@link FirmaXml }
     * 
     */
    public FirmaXml createFirmaXml() {
        return new FirmaXml();
    }

    /**
     * Create an instance of {@link CreacionObjetoJson }
     * 
     */
    public CreacionObjetoJson createCreacionObjetoJson() {
        return new CreacionObjetoJson();
    }

    /**
     * Create an instance of {@link ComprobanteXmlResponse }
     * 
     */
    public ComprobanteXmlResponse createComprobanteXmlResponse() {
        return new ComprobanteXmlResponse();
    }

    /**
     * Create an instance of {@link EnviarDocumento }
     * 
     */
    public EnviarDocumento createEnviarDocumento() {
        return new EnviarDocumento();
    }

    /**
     * Create an instance of {@link Desconexion }
     * 
     */
    public Desconexion createDesconexion() {
        return new Desconexion();
    }

    /**
     * Create an instance of {@link FacturacionResponse }
     * 
     */
    public FacturacionResponse createFacturacionResponse() {
        return new FacturacionResponse();
    }

    /**
     * Create an instance of {@link ValidacionEstadoResponse }
     * 
     */
    public ValidacionEstadoResponse createValidacionEstadoResponse() {
        return new ValidacionEstadoResponse();
    }

    /**
     * Create an instance of {@link FirmaXmlResponse }
     * 
     */
    public FirmaXmlResponse createFirmaXmlResponse() {
        return new FirmaXmlResponse();
    }

    /**
     * Create an instance of {@link ValidacionEstado }
     * 
     */
    public ValidacionEstado createValidacionEstado() {
        return new ValidacionEstado();
    }

    /**
     * Create an instance of {@link AutenticacionResponse }
     * 
     */
    public AutenticacionResponse createAutenticacionResponse() {
        return new AutenticacionResponse();
    }

    /**
     * Create an instance of {@link Facturacion_Type }
     * 
     */
    public Facturacion_Type createFacturacion_Type() {
        return new Facturacion_Type();
    }

    /**
     * Create an instance of {@link ComprobanteXml }
     * 
     */
    public ComprobanteXml createComprobanteXml() {
        return new ComprobanteXml();
    }

    /**
     * Create an instance of {@link DesconexionResponse }
     * 
     */
    public DesconexionResponse createDesconexionResponse() {
        return new DesconexionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Desconexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "desconexion")
    public JAXBElement<Desconexion> createDesconexion(Desconexion value) {
        return new JAXBElement<Desconexion>(_Desconexion_QNAME, Desconexion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionEstadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "validacionEstadoResponse")
    public JAXBElement<ValidacionEstadoResponse> createValidacionEstadoResponse(ValidacionEstadoResponse value) {
        return new JAXBElement<ValidacionEstadoResponse>(_ValidacionEstadoResponse_QNAME, ValidacionEstadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "autenticacionResponse")
    public JAXBElement<AutenticacionResponse> createAutenticacionResponse(AutenticacionResponse value) {
        return new JAXBElement<AutenticacionResponse>(_AutenticacionResponse_QNAME, AutenticacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesconexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "desconexionResponse")
    public JAXBElement<DesconexionResponse> createDesconexionResponse(DesconexionResponse value) {
        return new JAXBElement<DesconexionResponse>(_DesconexionResponse_QNAME, DesconexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facturacion_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "Facturacion")
    public JAXBElement<Facturacion_Type> createFacturacion(Facturacion_Type value) {
        return new JAXBElement<Facturacion_Type>(_Facturacion_QNAME, Facturacion_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobanteXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "comprobanteXml")
    public JAXBElement<ComprobanteXml> createComprobanteXml(ComprobanteXml value) {
        return new JAXBElement<ComprobanteXml>(_ComprobanteXml_QNAME, ComprobanteXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmaXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "firmaXmlResponse")
    public JAXBElement<FirmaXmlResponse> createFirmaXmlResponse(FirmaXmlResponse value) {
        return new JAXBElement<FirmaXmlResponse>(_FirmaXmlResponse_QNAME, FirmaXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "validacionEstado")
    public JAXBElement<ValidacionEstado> createValidacionEstado(ValidacionEstado value) {
        return new JAXBElement<ValidacionEstado>(_ValidacionEstado_QNAME, ValidacionEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autenticacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "autenticacion")
    public JAXBElement<Autenticacion> createAutenticacion(Autenticacion value) {
        return new JAXBElement<Autenticacion>(_Autenticacion_QNAME, Autenticacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreacionObjetoJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "creacionObjetoJsonResponse")
    public JAXBElement<CreacionObjetoJsonResponse> createCreacionObjetoJsonResponse(CreacionObjetoJsonResponse value) {
        return new JAXBElement<CreacionObjetoJsonResponse>(_CreacionObjetoJsonResponse_QNAME, CreacionObjetoJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarDocumentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "enviarDocumentoResponse")
    public JAXBElement<EnviarDocumentoResponse> createEnviarDocumentoResponse(EnviarDocumentoResponse value) {
        return new JAXBElement<EnviarDocumentoResponse>(_EnviarDocumentoResponse_QNAME, EnviarDocumentoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "enviarDocumento")
    public JAXBElement<EnviarDocumento> createEnviarDocumento(EnviarDocumento value) {
        return new JAXBElement<EnviarDocumento>(_EnviarDocumento_QNAME, EnviarDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreacionObjetoJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "creacionObjetoJson")
    public JAXBElement<CreacionObjetoJson> createCreacionObjetoJson(CreacionObjetoJson value) {
        return new JAXBElement<CreacionObjetoJson>(_CreacionObjetoJson_QNAME, CreacionObjetoJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmaXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gatewayws.pandatech.com/", name = "firmaXml")
    public JAXBElement<FirmaXml> createFirmaXml(FirmaXml value) {
        return new JAXBElement<FirmaXml>(_FirmaXml_QNAME, FirmaXml.class, null, value);
    }

}
