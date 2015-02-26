<%-- 
    Document   : clientRegister
    Created on : 25/02/2015, 05:25:14 PM
    Author     : Alain
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes Registrados</title>
      
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
        
    </head>
    <body>
       
        <div data-role="page" id="pageone" data-theme="b">
  <a href="../admins/menuAdmin.jsp" class="ui-btn ui-btn-inline ui-shadow ui-icon-home ui-btn-icon-left" style="color: orange;">Home</a>
  <div data-role="header">
    <h1>Clientes</h1>
  </div>
      <sql:setDataSource
	var="ds"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="root"
	url="jdbc:mysql://localhost:3306/subastafinal?user='root'&password='root'"
	/>  
     <sql:query var="detalle" dataSource="${ds}">
				select * from cliente 

	</sql:query>   
         <div data-role="main" class="ui-content">
   
    <table data-role="table" data-mode="reflow" class="ui-responsive" id="myTable">
      <thead>
      
        <tr>
          <th data-priority="1" style="color:orange;">userNameCliente</th>
          <th data-priority="2" style="color:orange;">userPasswordCliente</th>
          <th data-priority="3" style="color:orange;">fechaNacimiento</th>
          <th data-priority="4" style="color:orange;">clienteEmail</th>
          <th data-priority="5" style="color:orange;">nameCliente</th>
          <th data-priority="6" style="color:orange;">apellidoCliente</th>
          <th data-priority="7" style="color:orange;">DNI</th>
          <th data-priority="8" style="color:orange;">Genero</th>
         
        </tr>
      </thead>
        
      <tbody>
      	<c:forEach var="a" items="${detalle.rows }">
        <tr>
        
         <td style="color:aqua;">${a.userNameCliente}</td>
         <td style="color:aqua;">${a.userPasswordCliente}</td>
         <td style="color:aqua;">${a.fechaNacimiento}</td>
         
         <td style="color:aqua;">${a.clienteEmail}</td>
         <td style="color:aqua;">${a.nameCliente}</td>
         <td style="color:aqua;">${a.apellidoCliente}</td>
         <td style="color:aqua;">${a.DNI}</td>
         <td style="color:aqua;">${a.genero}</td>
         
         <td><a href="actualizarClient.jsp?DNI=${a.DNI}" class="ui-btn ui-btn-inline ui-shadow ui-icon-tag ui-btn-icon-left"  style="color: orange;">Actualizar</a></td>
       
        </tr>
        </c:forEach>
      </tbody>
      
      
      
    </body>
</html>
