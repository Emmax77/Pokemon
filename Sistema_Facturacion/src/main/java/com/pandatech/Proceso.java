package com.pandatech;

import com.google.gson.Gson;
import com.pandatech.bean.RespuestaCliente;
import com.pandatech.gatewayws.Facturacion_Service;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import static java.lang.System.out;
import javax.servlet.ServletContext;

/**
 *
 * @author Emmanuel Guzman
 */
@WebServlet(name = "Proceso", urlPatterns = {"/Proceso"})
public class Proceso extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/192.168.1.165_8080/GatewayWS/Facturacion.wsdl")
    private Facturacion_Service service;

    //   @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/192.168.1.165_8080/GatewayWS/Facturacion.wsdl")
    //   private Facturacion_Service service;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Proceso</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Proceso at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
         */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        try { // Call Web Service Operation
            com.pandatech.gatewayws.Facturacion port = service.getFacturacionPort();
            // TODO initialize WS operation arguments here
            java.lang.String usuario = request.getParameter("usuario");
            java.lang.String password = request.getParameter("password");

            java.lang.String rutaCertificadop12 = request.getParameter("llave");
            java.lang.String pin = request.getParameter("pin");
            java.lang.String rutaXml = request.getParameter("xml");

            java.lang.String tipoIdReceptor = "0";
            java.lang.String numeroIdReceptor = "0";
            // TODO process result here
            java.lang.String result = port.facturar(usuario, password, rutaCertificadop12, pin, rutaXml, tipoIdReceptor, numeroIdReceptor);
            out.println("Result = " + result);
            Gson gson = new Gson();
            RespuestaCliente json = gson.fromJson(result, RespuestaCliente.class);

            String res = json.getComprobanteXml();
            out.println(res);
            
            String alerta = guardarXml(res);

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert(" + '"' + json.getAutenticacion() + "\\n" + json.getFirma() + "\\n" + json.getFactura() + "\\n" + alerta + '"' +");");
            out.println("location='index.html';");
            out.println("</script>");

        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        /*
        try { // Call Web Service Operation
            com.pandatech.gatewayws.Facturacion port = service.getFacturacionPort();
            // TODO initialize WS operation arguments here
            java.lang.String usuario = "cpj-3-101-684401@stag.comprobanteselectronicos.go.cr";
            java.lang.String password = "X=!:&OvjqB#C_)XO@#B]";
            java.lang.String rutaCertificadop12 = "C:/Users/PCPTUser/Desktop/prueba/llavecriptografica_310168440106.p12";
            java.lang.String pin = "8888";
            java.lang.String rutaXml = "C:\\Users\\PCPTUser\\Desktop\\prueba\\xml\\factura.xml";
            java.lang.String tipoIdReceptor = "0";
            java.lang.String numeroIdReceptor = "0";
            // TODO process result here
            java.lang.String result = port.facturar(usuario, password, rutaCertificadop12, pin, rutaXml, tipoIdReceptor, numeroIdReceptor);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
         */
    }

    public String guardarXml(String xml) {
        String respuesta = "";
        try {
            String ruta = "C://temp/PT-factura.xml";
            File archivo = new File(ruta);
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(xml);
            bw.close();
            respuesta = "Comprobante Xml creado en la siguiente ruta: " + ruta;
        } catch (Exception e) {
            respuesta = e.toString();
        }
        return respuesta;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
