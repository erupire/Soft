<%-- 
    Document   : Producto1
    Created on : 26/02/2015, 01:32:02 AM
    Author     : Alain
--%>

<html>
  
  <head>
    <title>Subasta Articulo</title>
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootswatch/3.0.0/spacelab/bootstrap.min.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <style type="text/css">
      body {
        padding-top: 30px;
        padding-bottom: 20px;
        padding-left: 30px;
        padding-right: 30px;
      }
      .jumbotron {
        background-color:#CCFFCC;
        color:black;
      }
      img {
        width: 258px;
        height: 258px;
        margin-top: 1px;
        margin-left: 1px;
        left: 50%;
        top: 50%;
      }
    </style>
  </head>
  
  <body>
   <%! int count = 190; %>

<% count= count +10; %>
 
    <div class="container">
      <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active">
              <a href="../subastas/subasta.jsp">Volver</a>
          </li>
          <li>
            <a href="#">Ingresa</a>
          </li>
          <li>
            <a href="#">Vende</a>
          </li>
        </ul>
        <h3 class="text-muted">Casa de Subasta G3</h3>
      </div>
      <hr>
      <div class="jumbotron">
        <div class="container">
          <h2 class="text-center">La Monalisa</h2>
          <hr>
          <div class="media">
              <a class="pull-left" href="#">    <img class="media-object" src="../images/pintura.jpg">  </a>
            <div class="media-body">
              <b><p><font color="#800000" font size="5">Precio: S/. 200</font></p></b>
              <p><font size="3">Da Vinci</font></p>
              <p><font size="3">Pintura</font></p><br><br>
              <center>
                  <form action="Producto1.jsp" method="POST">
                  
                      <input type="submit" value="Ofertar" />
                  </form>
                  
                 La oferta se encuentra en: <%=count%>
              </center>
            </div>
          </div>
        </div>
        <!-- hasta aca es el cuerpo -->
      </div>
      <div class="container">
        <!-- Example row of columns -->
        <footer>
          <p>Proyecto Casa de Subasta 2015-0 &copy;</p>
        </footer>
      </div>
    </div>
  </body>

</html>