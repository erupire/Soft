package org.apache.jsp.subastas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Producto1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int count = 190; 
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
      out.write("    <title>Subasta Articulo</title>\n");
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
      out.write("      img {\n");
      out.write("        width: 258px;\n");
      out.write("        height: 258px;\n");
      out.write("        margin-top: 1px;\n");
      out.write("        margin-left: 1px;\n");
      out.write("        left: 50%;\n");
      out.write("        top: 50%;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("   ");
      out.write('\n');
      out.write('\n');
 count= count +10; 
      out.write("\n");
      out.write(" \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"header\">\n");
      out.write("        <ul class=\"nav nav-pills pull-right\">\n");
      out.write("          <li class=\"active\">\n");
      out.write("              <a href=\"../subastas/subasta.jsp\">Volver</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\">Ingresa</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\">Vende</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <h3 class=\"text-muted\">Casa de Subasta G3</h3>\n");
      out.write("      </div>\n");
      out.write("      <hr>\n");
      out.write("      <div class=\"jumbotron\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <h2 class=\"text-center\">La Monalisa</h2>\n");
      out.write("          <hr>\n");
      out.write("          <div class=\"media\">\n");
      out.write("              <a class=\"pull-left\" href=\"#\">    <img class=\"media-object\" src=\"../images/pintura.jpg\">  </a>\n");
      out.write("            <div class=\"media-body\">\n");
      out.write("              <b><p><font color=\"#800000\" font size=\"5\">Precio: S/. 200</font></p></b>\n");
      out.write("              <p><font size=\"3\">Da Vinci</font></p>\n");
      out.write("              <p><font size=\"3\">Pintura</font></p><br><br>\n");
      out.write("              <center>\n");
      out.write("                  <form action=\"Producto1.jsp\" method=\"POST\">\n");
      out.write("                  \n");
      out.write("                      <input type=\"submit\" value=\"Ofertar\" />\n");
      out.write("                  </form>\n");
      out.write("                  \n");
      out.write("                 La oferta se encuentra en: ");
      out.print(count);
      out.write("\n");
      out.write("              </center>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- hasta aca es el cuerpo -->\n");
      out.write("      </div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <!-- Example row of columns -->\n");
      out.write("        <footer>\n");
      out.write("          <p>Proyecto Casa de Subasta 2015-0 &copy;</p>\n");
      out.write("        </footer>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("</html>");
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
