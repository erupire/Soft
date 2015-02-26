<%-- 
    Document   : subastaObservador
    Created on : 26/02/2015, 01:44:48 AM
    Author     : Alain
--%>

<html>
  
  <head>
    <title>Subasta</title>
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
    </style>
  </head>
  
  <body>
  <div class="container">
      <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active">
              <a href="../clients/registerClients.jsp">Registrate</a>
          </li>
          <li>
            <a href="#">Ingresa</a>
          </li>
          <li>
            <a href="#">Vende</a>
          </li>
        </ul>
        <h3 class="text-muted">Casa de Subasta G3</h3>
      </div><hr>
    <div class="jumbotron">
      <div class="container">
        <p><font size="7">Productos Disponibles</font></p>
        <hr>
        <div class="media">
            <a class="pull-left" href="#">    <img class="media-object" src="../images/pintura.jpg">  </a>
          <div class="media-body">
              <h4 class="media-heading"><a href="../subastas/Producto1S.jsp">Producto 1</a></h4>
            <p><font size="3">Pintura</font></p>
            <b><p align="right"><font color="#800000" font size="3">Precio: S/.200</font></p></b>
          </div>
        </div>
        <div class="media">
            <a class="pull-left" href="#">    <img class="media-object" src="../images/escultura.jpg">  </a>
          <div class="media-body">
              <h4 class="media-heading"><a href="../subastas/Producto2S.jsp">Producto 2</a></h4>
            <p><font size="3">Escultura</font></p>
            <b><p align="right"><font color="#800000" font size="3">Precio: S/.300</font></p></b>
          </div>
        </div>
        <div class="media">
            <a class="pull-left" href="#">    <img class="media-object" src="../images/electronico.png">  </a>
          <div class="media-body">
              <h4 class="media-heading"><a href="../subastas/Producto3S.jsp">Producto 3</a></h4>
            <p><font size="3">Electronico</font></p>
            <b><p align="right"><font color="#800000" font size="3">Precio: S/.800</font></p></b>
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
  </body>

</html>
