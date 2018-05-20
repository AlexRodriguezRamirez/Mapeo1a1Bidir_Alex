/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;


import es.albarregas.beans.Pais;
import es.albarregas.beans.Presidente;
import es.albarregas.dao.IPaisDAO;
import es.albarregas.dao.IPresidenteDAO;
import es.albarregas.daofactory.DAOFactory;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jesus
 */
@WebServlet(name = "Eleccion", urlPatterns = {"/eleccion"})
public class Eleccion extends HttpServlet {

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
        String url = null;
        DAOFactory daof = DAOFactory.getDAOFactory();
        IPresidenteDAO pdao = daof.getPresidenteDAO();
        IPaisDAO cdao = daof.getPaisDAO();
        List<Presidente> listaPresi = pdao.get();
        List<Pais> listaPais = cdao.get();
        HttpSession sesion = request.getSession();
        
        
        switch(request.getParameter("op")){
            case "add":
                url = "JSP/formularioAlta.jsp";
                break;
            case "delete":
            case "update":
                request.setAttribute("listado", listaPresi);
                break;
            case "list":

                if (request.getParameter("t").equals("pais")) {
                    sesion.setAttribute("listaPais", listaPais);
                }
                
                else {
                    if (request.getParameter("t").equals("presidente")) {
                        sesion.setAttribute("listaPresi", listaPresi); 
                        //atributo control que será utilizado para comprobar si se debe mostrar el listado de paises o de presidentes en listado.jsp
                        sesion.setAttribute("control", "presidente");
                    }
                }
            
        }
        switch(request.getParameter("op")){
            case "list":
                url = "JSP/listado.jsp";
                break;
            case "delete":
                url = "JSP/borrado.jsp";
                break;
            case "update":
                url = "JSP/actual.jsp";
                break;
        }
        request.getRequestDispatcher(url).forward(request, response);
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
