package edu.ulima.pe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.ulima.dto.UsuarioDAO;
import edu.ulima.dto.UsuarioDTO;

/**
 * Servlet implementation class Servlet01
 */
public class Servlet01 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ses=request.getSession(true);
		UsuarioDTO p=new UsuarioDTO();

		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String fechaNac=request.getParameter("fecha");
		int dni=Integer.parseInt(request.getParameter("dni"));
		String genero=request.getParameter("gender");
		String dir=request.getParameter("dir");
		int tlf=Integer.parseInt(request.getParameter("tlf"));
		String adminID = (String)ses.getAttribute("usuario");
		int usuarioID = Integer.parseInt(request.getParameter("usuarioID"));
		
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setFechaNac(fechaNac);
		p.setDni(dni);
		p.setGenero(genero);
		p.setDireccion(dir);
		p.setTelefono(tlf);
		p.setAdminID(adminID);
		p.setUsuarioID(usuarioID);
		UsuarioDAO dao=new UsuarioDAO();
		dao.datosGenerales(p);
		List<UsuarioDTO> lista = new ArrayList<UsuarioDTO>();
		lista = dao.mostrar();
		
		
		ses.setAttribute("lista", lista);
		ses.setAttribute("dni", dni);
		
		RequestDispatcher rd=request.getRequestDispatcher("/datosUsuario.jsp");
		rd.forward(request, response);
	}

}
