<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
</head>
<body>

   
 

  <div data-role="panel" id="myPanel"> 
   
   
    <a href="#" class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left">Home</a>
   
    <a href="search.jsp" class="ui-btn ui-corner-all ui-shadow ui-icon-search ui-btn-icon-left">Search</a>
    <a href="nuevo.jsp" class="ui-btn ui-corner-all ui-shadow   ui-icon-plus ui-btn-icon-left">Nuevo</a>
    <a href="eliminar.jsp" class="ui-btn ui-corner-all ui-shadow  ui-icon-delete ui-btn-icon-left">Eliminar</a>
    <a href="datosUsuario.jsp" class="ui-btn ui-icon-eye ui-btn-icon-left">Mostrar Usuarios</a>
    <a href="detalleArticulos.jsp" class="ui-btn ui-icon-eye ui-btn-icon-left" style="color: orange;">Mostrar Articulos</a>
    
    
    
  </div>
  


  <div data-role="main" class="ui-content">
  
  <h1>Bienvenido </h1>
    <br/><img src="img/imagen.jpg"/>
    <br/>
    <br/><a href="#myPanel" class="ui-btn ui-btn-inline ui-corner-all ui-shadow">Abrir</a>
    
    
  </div>



</body>
</html>