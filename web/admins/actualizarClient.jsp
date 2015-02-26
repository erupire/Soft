<%-- 
    Document   : actualizarClient
    Created on : 25/02/2015, 07:36:25 PM
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
        <title>Actualizar Cliente</title>
        
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>

        
    </head>
    <body>
      <sql:setDataSource
	var="ds"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="root"
	url="jdbc:mysql://localhost:3306/subastafinal?user='root'&password='root'"
	/> 
        <sql:query var="detalle" dataSource="${ds}">
				select * from cliente where DNI=?
				<sql:param value="${param.DNI }"></sql:param>

	</sql:query>
                                
        <div data-role="page" id="pageone" data-theme="b"> 

<div data-role="main" class="ui-content">
 <a href="http://localhost:8080/SoftwareII/admins/menuAdmin.jsp" class="ui-btn ui-btn-inline ui-shadow ui-icon-home ui-btn-icon-left" style="color: orange;">Home</a>
  
    <form method="post" action="ServletActualizarClient">
      <c:forEach var="a" items="${detalle.rows }">
      <label for="fname" style="color: orange;">userNameCliente:</label>
      <input type="text" name="userNameCliente" id="fname" value="${a.userNameCliente}" style="color: white-space ;" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ]/,''); ">
      <label for="fname" style="color: orange;">userPasswordCliente:</label>
      <input type="text" name="userPasswordCliente" id="fape" value="${a.userPasswordCliente}" style="color: white-space ;" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ]/,''); ">
      <label for="fname" style="color: orange;">DNI:</label>
      <input type="text" name="DNI" id="dni" value="${a.DNI}" style="color:white-space ;" maxlength="8" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;"> 
      
     
        <label for="fecha" style="color: orange;">Fecha Nacimiento :</label>
        <input type="date" name="fechaNacimiento" value="${a.fechaNacimiento}" style="color: white-space;">
        	
        	
      
     
      
      <label for="fname" style="color: orange;">cliente Email:</label>
      <input type="text" name="clienteEmail" id="dir" value="${a.clienteEmail}" style="color: white-space;" > 
      
      
      
      <label for="fname" style="color: orange;">name Cliente:</label>
      <input type="text" name="nameCliente" id="tlf" value="${a.nameCliente}" style="color: white-space;" maxlength="9" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;">
      
       <label for="fname" style="color: orange;">apellido Cliente:</label>
      <input type="text" name="apellidoCliente" id="tlf" value="${a.apellidoCliente}" style="color: white-space;" maxlength="9" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;">
      
      
      
      
      <input type="submit" value="Actualizar" >
      
    </c:forEach>
    </form>
    
  </div>

</div>
                              
                                
                                
        
        
    </body>
</html>
