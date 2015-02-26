package org.apache.jsp.subastas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class subastaObservador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("  \n");
      out.write("  <head>\n");
      out.write("    <title>Subasta</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/bootswatch/3.0.0/spacelab/bootstrap.min.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      body {\n");
      out.write("        padding-top: 30px;\n");
      out.write("        padding-bottom: 20px;\n");
      out.write("        padding-left: 30px;\n");
      out.write("        padding-right: 30px;\n");
      out.write("      }\n");
      out.write("      .jumbotron {\n");
      out.write("        background-color:#CCFFCC;\n");
      out.write("        color:black;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <div class=\"header\">\n");
      out.write("        <ul class=\"nav nav-pills pull-right\">\n");
      out.write("          <li class=\"active\">\n");
      out.write("            <a href=\"#\">Registrate</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\">Ingresa</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\">Vende</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <h3 class=\"text-muted\">Casa de Subasta G3</h3>\n");
      out.write("      </div><hr>\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <p><font size=\"7\">Productos Disponibles</font></p>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"media\">\n");
      out.write("            <a class=\"pull-left\" href=\"#\">    <img class=\"media-object\" src=\"../images/pintura.jpg\">  </a>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("              <h4 class=\"media-heading\"><a href=\"../subastas/Producto1S.jsp\">Producto 1</a></h4>\n");
      out.write("            <p><font size=\"3\">Pintura</font></p>\n");
      out.write("            <b><p align=\"right\"><font color=\"#800000\" font size=\"3\">Precio: S/.200</font></p></b>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("            <a class=\"pull-left\" href=\"#\">    <img class=\"media-object\" src=\"../images/escultura.jpg\">  </a>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("              <h4 class=\"media-heading\"><a href=\"../subastas/Producto2S.jsp\">Producto 2</a></h4>\n");
      out.write("            <p><font size=\"3\">Escultura</font></p>\n");
      out.write("            <b><p align=\"right\"><font color=\"#800000\" font size=\"3\">Precio: S/.300</font></p></b>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"media\">\n");
      out.write("            <a class=\"pull-left\" href=\"#\">    <img class=\"media-object\" src=\"../images/electronico.png\">  </a>\n");
      out.write("          <div class=\"media-body\">\n");
      out.write("              <h4 class=\"media-heading\"><a href=\"../subastas/Producto3S.jsp\">Producto 3</a></h4>\n");
      out.write("            <p><font size=\"3\">Electronico</font></p>\n");
      out.write("            <b><p align=\"right\"><font color=\"#800000\" font size=\"3\">Precio: S/.800</font></p></b>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- hasta aca es el cuerpo -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <footer>\n");
      out.write("        <p>Proyecto Casa de Subasta 2015-0 &copy;</p>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("\n");
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
