<%-- 
    Document   : aumentarCreditos2
    Created on : 25/02/2015, 10:40:19 PM
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
				select * from packcreditos where idCreditos=?
				<sql:param value="${param.idCreditos}"></sql:param>

	</sql:query>
                                
        <div data-role="page" id="pageone" data-theme="b"> 

<div data-role="main" class="ui-content">
 <a href="http://localhost:8080/SoftwareII/admins/menuAdmin.jsp" class="ui-btn ui-btn-inline ui-shadow ui-icon-home ui-btn-icon-left" style="color: orange;">Home</a>
  
    <form method="post" action="ServletAumentarCreditos">
      <c:forEach var="a" items="${detalle.rows }">
      <label for="fname" style="color: orange;">idCreditos:</label>
      <input type="text" name="idCreditos" id="fname" value="${a.idCreditos}" style="color: white-space ;" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ]/,''); ">
      <label for="fname" style="color: orange;">numCreditos:</label>
      <input type="text" name="numCreditos" id="fape" value="${a.numCreditos}" style="color: white-space ;" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ]/,''); ">
      <label for="fname" style="color: orange;">precio:</label>
      <input type="text" name="precio" id="fape" value="${a.precio}" style="color: white-space ;" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ]/,''); ">
      
      
      <label for="fname" style="color: orange;">aumentarCreditos:</label>
      <input type="text" name="aumentarCreditos" id="fape" value="" >
      <label for="fname" style="color: orange;">aumentarPrecio:</label>
      <input type="text" name="aumentarPrecio" id="fape" value="" >
      
      
      
      
      <input type="submit" value="Actualizar" >
      
    </c:forEach>
    </form>
    
  </div>

</div>

        
    </body>
</html>
