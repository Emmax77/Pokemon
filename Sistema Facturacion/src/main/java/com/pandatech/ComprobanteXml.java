/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pandatech;

import com.google.gson.Gson;
import com.pandatech.bean.RespuestaCliente;
import com.pandatech.gatewayws.Facturacion_Service;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Emmanuel Guzman
 */
@WebServlet(name = "ComprobanteXml", urlPatterns = {"/ComprobanteXml"})
public class ComprobanteXml extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/GatewayWS/Facturacion.wsdl")
    private Facturacion_Service service;

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
            out.println("<title>Servlet ComprobanteXml</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ComprobanteXml at " + request.getContextPath() + "</h1>");
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
            java.lang.String clave = request.getParameter("clave_comprobante");
            // TODO process result here
            java.lang.String result = port.comprobanteXml(usuario, password, clave);
            out.println("Result = "+result);
            
            Gson gson = new Gson();
            RespuestaCliente json = gson.fromJson(result, RespuestaCliente.class);

            String res = json.getComprobanteXml();
            out.println(res);

            String alerta = guardarXml(res);

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert(" + '"' + json.getAutenticacion() + "\\n" + alerta + '"' + ");");
            out.println("location='index.html';");
            out.println("</script>");
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        
    }
    
    public String guardarXml(String xml) {
        String respuesta = "";
        try {
            String ruta = "C://temp/PT-Comprobante.xml";
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
