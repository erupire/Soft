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
 * Servlet implementation class Servlet03
 */
public class Servlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession ses=request.getSession(true);
		
		
		String usuario=request.getParameter("user");
		String clave=request.getParameter("pass");
		
		
		
		UsuarioDAO a =new UsuarioDAO();
		
		ses.setAttribute("usuario", usuario);
		
		RequestDispatcher rd;
		
		if(a.UsuarioAcceder(usuario, clave)==true){

			rd=request.getRequestDispatcher("/inicio.jsp");
			rd.forward(request, response);
			
		}else if(a.UsuarioAcceder(usuario, clave)==false) {
			
			rd=request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}

		
		
		
	}

}
