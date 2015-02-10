<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
<title>Actualizacion de datos</title>
</head>
<body>

 <sql:setDataSource
	var="ds"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="root"
	url="jdbc:mysql://localhost:3306/db_subasta?user='root'&password='root'"
	/>
	
	<sql:query var="detalle" dataSource="${ds}">
				select * from tbusuario where usuarioID=?
				<sql:param value="${param.pID }"></sql:param>

	</sql:query>

<div data-role="main" class="ui-content">
 <a href="inicio.jsp" class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left">Home</a>
 
 
 
    <form method="post" action="s05">
      <c:forEach var="a" items="${detalle.rows }">
      <label for="fname">ID Usuario:</label>
      <input type="text" name="usuarioID" id="fname" value="${a.usuarioID}">
      <label for="fname">Nombre:</label>
      <input type="text" name="nombre" id="fname" value="${a.nombre}">
      <label for="fname">Apellido:</label>
      <input type="text" name="apellido" id="fape" value="${a.apellido}">
      <label for="fname">DNI:</label>
      <input type="text" name="dni" id="dni" value="${a.dni}">
      
     
        <label for="fecha">Fecha Nacimiento :</label>
        <input type="date" name="fecha" value="${a.fechaNac}">
        	
        	
      
      <fieldset data-role="controlgroup">
      <legend>G:</legend>
        <label for="male">Masculino</label>
        <input type="radio" name="gender" id="male" value="Masculino">
        <label for="female">Femenino</label>
        <input type="radio" name="gender" id="female" value="Femenino">	
      </fieldset>
      
      <label for="fname">Direccion:</label>
      <input type="text" name="dir" id="dir" value="${a.direccion}"> 
      
      
      
      <label for="fname">Telefono:</label>
      <input type="text" name="tlf" id="tlf" value="${a.telefono}">
      
      
      
      
      
      <input type="submit" value="Actualizar">
      
    </c:forEach>
    </form>
    
  </div>



</body>
</html>