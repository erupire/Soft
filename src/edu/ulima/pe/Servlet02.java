package edu.ulima.pe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.ulima.dto.UsuarioDAO;
import edu.ulima.dto.UsuarioDTO;

/**
 * Servlet implementation class Servlet02
 */
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession ses=request.getSession(true);
		
		String ant=request.getParameter("ant");
		float credito=Float.parseFloat(request.getParameter("credito"));
		float stock=Float.parseFloat(request.getParameter("stock"));
		float alto=Float.parseFloat(request.getParameter("alto"));
		String ancho=request.getParameter("ancho");
		String dispo=request.getParameter("dispo");
		String desc=request.getParameter("desc");
		int usuarioID = (Integer) ses.getAttribute("usuarioID");
		int articuloID = Integer.parseInt(request.getParameter("articulo"));
		UsuarioDTO p=new UsuarioDTO();
		
		
		p.setAntiguedad(ant);
		p.setCreditos(credito);
		p.setStock(stock);
		p.setAlto(alto);
		p.setAncho(ancho);
		p.setDisposicion(dispo);
		p.setDescripcion(desc);
		p.setUsuarioID(usuarioID);
		p.setArticuloID(articuloID);
		UsuarioDAO dao=new UsuarioDAO();
		dao.Articulos(p);
	
		
		RequestDispatcher rd=request.getRequestDispatcher("/inicio.jsp");
		rd.forward(request, response);
	}

}
