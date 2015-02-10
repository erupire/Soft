package edu.ulima.pe;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.ulima.dto.UsuarioDAO;

/**
 * Servlet implementation class Servlet04
 */
public class Servlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ses=request.getSession(true);
		
		int num=Integer.parseInt(request.getParameter("dni1"));

		
		UsuarioDAO a=new UsuarioDAO();
		a.eliminar(num);
		
		RequestDispatcher rd=request.getRequestDispatcher("/inicio.jsp");
		rd.forward(request, response);
	}

}
