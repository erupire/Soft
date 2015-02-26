/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;


import beans.ClienteDTO;
import beans.ServicioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gianarlo
 */
@WebServlet(name = "ServletRegistrarUsuario", urlPatterns = {"/clients/ServletRegistrarUsuario"})
public class ServletRegistrarUsuario extends HttpServlet {

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
       
        response.sendRedirect("loginClient.jsp");
        
        
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
       
        
         ClienteDTO c= new ClienteDTO();

		String nombre=request.getParameter("nombre");
                System.out.println(nombre);
		String apellido=request.getParameter("apellido");
		      System.out.println(apellido);
                int dni= Integer.parseInt(request.getParameter("dni"));
                System.out.println(dni+"");
                String fechaNac=request.getParameter("fecha");
	        System.out.println(fechaNac);
                String genero=request.getParameter("generos");
                System.out.println(genero);
                String email=request.getParameter("email");
                System.out.println(email);
		String nick=request.getParameter("nick");
                System.out.println(nick);
		String password = request.getParameter("password");
		System.out.println(password);
                
		c.setNameCliente(nombre);
		c.setApellidoCliente(apellido);
                c.setDni(dni);
		c.setGenero(genero);
                c.setClienteEmail(email);
                c.setUserNameCliente(nick);
                c.setUserPasswordCliente(password);
                c.setFechaNacimiento(fechaNac);
                
             
                
		ServicioDAO dao=new ServicioDAO();
		dao.registrarCliente(c);
                dao.registrarPacks();
                
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
