package org.apache.jsp.admins;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      body {\n");
      out.write("        padding-top: 50px;\n");
      out.write("        padding-bottom: 20px;\n");
      out.write("        background-image: url(../images/fondoAdmin.jpg);\n");
      out.write("      }\n");
      out.write("      img {\n");
      out.write("        width: 80px;\n");
      out.write("        height: 80px;\n");
      out.write("        margin-top: 1px;\n");
      out.write("        margin-left: 1px;\n");
      out.write("        left: 50%;\n");
      out.write("        top: 50%;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <a href=\"http://localhost:8080/SoftwareII/admin.jsp\"><p align=\"right\" estyle=\"width: 150px;\">Cerrar Sesion </p></a><h1>Administrador</h1> \n");
      out.write("        <hr>\n");
      out.write("        <hr>\n");
      out.write("        <h3><a href=\"clientRegister.jsp\">Visualizar a los clientes registrados</a></h3> \n");
      out.write("        <hr>\n");
      out.write("        <h3><a href=\"aumentarCreditos1.jsp\">Aumentar creditos disponibles por cliente</a></h3>\n");
      out.write("        <p style></p>\n");
      out.write("        <ul></ul>\n");
      out.write("        <hr>\n");
      out.write("        <p style></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <hr>\n");
      out.write("      <footer>\n");
      out.write("        <p>Proyecto Casa de Subasta 2015-0 &copy;</p>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("    <!-- /container -->     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
