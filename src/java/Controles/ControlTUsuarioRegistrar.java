/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Encapsulamiento.Tipousuario;
import Negocio.NegocioTUsuario;
import Negocio.NegocioTipoUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Montano
 */
@WebServlet(name = "ControlTUsuarioRegistrar", urlPatterns = {"/ControlTUsuarioRegistrar"})
public class ControlTUsuarioRegistrar extends HttpServlet {

    @EJB
    private NegocioTUsuario negocioTUsuario;
    private NegocioTipoUsuario negociotipousuario;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        if(request.getMethod().equals("GET"))
        {
            negociotipousuario= new NegocioTipoUsuario();
            negociotipousuario.getAll();
            
            request.setAttribute("negociotipousuario", negociotipousuario);  
            request.getRequestDispatcher("UsuarioRegistrar.jsp").forward(request, response);
        }
        
        if(request.getMethod().equals("POST"))
        {
            Tipousuario tipoUsuario = new Tipousuario();
            tipoUsuario.setIdTipoUsuario(request.getParameter("cmbTipoUsuario"));                        
           
            String id = String.valueOf(request.getParameter("txtApellido1").charAt(0));
            id = id + String.valueOf(request.getParameter("txtApellido2").charAt(0));
            id = id.toUpperCase();
            Date now = new Date();                        
            SimpleDateFormat format = new SimpleDateFormat("yy");            
            id = id + format.format(now);
            
            negocioTUsuario.GetCantidad();
            
            String cantidad = negocioTUsuario.getCantidadDatos();
            
            while(cantidad.length() < 4)
            {
                cantidad = "0" + cantidad;
            }
            id = id + cantidad;            
            
            negocioTUsuario.getUsuario().setIdUsuario(id);
            negocioTUsuario.getUsuario().setNombre(request.getParameter("txtNombre"));
            negocioTUsuario.getUsuario().setApellido1(request.getParameter("txtApellido1"));
            negocioTUsuario.getUsuario().setApellido2(request.getParameter("txtApellido2"));
            negocioTUsuario.getUsuario().setContrasenia("12345".getBytes());
            negocioTUsuario.getUsuario().setTipousuario(tipoUsuario);
            negocioTUsuario.getUsuario().setEstado("0");
            negocioTUsuario.getUsuario().setCorreoElectronico(request.getParameter("txtCorreo"));
            negocioTUsuario.getUsuario().setTelefono(request.getParameter("txtTelefono"));
            
            boolean retorno = negocioTUsuario.Registrar();
            
            request.setAttribute("resultado", retorno?"Correcto":"Incorrecto");
            
            request.getRequestDispatcher("UsuarioResultado.jsp").forward(request, response);
        }
        
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