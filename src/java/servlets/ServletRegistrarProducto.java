/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;


import beans.ProductoDTO;
import beans.ServicioDAO;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import sun.util.calendar.ZoneInfoFile;

/**
 *
 * @author Gianarlo
 */

@WebServlet(name = "ServletRegistrarProducto", urlPatterns = {"/clients/ServletRegistrarProducto"})
@MultipartConfig
public class ServletRegistrarProducto extends HttpServlet {

    
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
    
  
      response.sendRedirect("menuClient.jsp");
        
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
      
    String nombreProducto= request.getParameter("nombreProducto");
      System.out.println(nombreProducto);
    int precioBase= Integer.parseInt(request.getParameter("precioBase"));
    System.out.println(precioBase);
    String descripcion= request.getParameter("descripcion");
     System.out.println(descripcion);
    String autor= request.getParameter("autor");
    System.out.println(autor);
    String categoria= request.getParameter("categoria");
    System.out.println(categoria);
      
      //Part filePart= request.getPart("foto");
      //String fileName= filePart.getSubmittedFileName();
      //InputStream fileContent=filePart.getInputStream();
      
       ProductoDTO producto= new ProductoDTO();
        producto.setNombreProducto(nombreProducto);
       producto.setPrecioBase(precioBase);
       producto.setDescripcion(descripcion);
       producto.setAutor(autor);
       producto.setCategoria(categoria);
     // producto.setFoto((FileInputStream)fileContent);
        
      ServicioDAO dao= new ServicioDAO();
      dao.insertarProducto(producto);
        
        
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
