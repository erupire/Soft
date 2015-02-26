<%-- 
    Document   : menuClient
    Created on : 21-feb-2015, 18:43:50
    Author     : jazmin
--%>

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

   
 

  <div data-role="panel" id="myPanel" data-theme="b" style="background-color: black;"> 
   
   
    <a href="#" class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left" style="color: orange;">Home</a>
   
    <a href="search.jsp" class="ui-btn ui-corner-all ui-shadow ui-icon-search ui-btn-icon-left" style="color: orange;">Search</a>
    <a href="../clients/RegistrarProductoClient.jsp" class="ui-btn ui-corner-all ui-shadow   ui-icon-plus ui-btn-icon-left" style="color: orange;">RegistrarProducto</a>
    <a href="eliminar.jsp" class="ui-btn ui-corner-all ui-shadow  ui-icon-delete ui-btn-icon-left" style="color: orange;">Eliminar</a>
   
    <a href="../subastas/subasta.jsp" class="ui-btn ui-icon-eye ui-btn-icon-left" style="color: orange;">Subasta</a>

    
    
    
    
  </div>
  

 
  <div data-role="main" class="ui-content">
  
  <h1 style="color: orange;">Bienvenido </h1>
  <br/><img src="../images/logo.jpg"/>
    <br/>
    <br/><a href="#myPanel" class="ui-btn ui-btn-inline ui-corner-all ui-shadow" style="color: black;background-color:orange;">Abrir</a>
    
    
  
</div>


</body>
</html>