<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
</head>
<body>


<a href="inicio.jsp" class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left">Home</a>
  <div data-role="header">
    <h1>Usuarios</h1>
  </div>
  <sql:setDataSource
	var="ds"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="root"
	url="jdbc:mysql://localhost:3306/db_subasta?user='root'&password='root'"
	/>
	
	<sql:query var="detalle" dataSource="${ds}">
				select * from tbusuario order by nombre

	</sql:query>
  <div data-role="main" class="ui-content">
   
    <table data-role="table" data-mode="reflow" class="ui-responsive" id="myTable">
      <thead>
      
        <tr>
          <th data-priority="1">ID Usuario</th>
          <th data-priority="2">ID Admin</th>
          <th data-priority="3">Nombre</th>
          <th data-priority="4">Apellido</th>
          <th data-priority="5">Fecha de Nacimiento</th>
          <th data-priority="6">DNI</th>
          <th data-priority="7">Genero</th>
          <th data-priority="8">Direccion</th>
          <th data-priority="9">Telefono</th>
         
        </tr>
      </thead>
      
      <tbody>
      	<c:forEach var="a" items="${detalle.rows }">
        <tr>
        
         <td>${a.usuarioID}</td>
         <td>${a.adminID}</td>
         <td>${a.nombre}</td>
         
         <td>${a.apellido}</td>
         <td>${a.fechaNac}</td>
         <td>${a.dni}</td>
         <td>${a.genero}</td>
         <td>${a.direccion}</td>
         <td>${a.telefono}</td>
         <td><a href="actualizar.jsp?pID=${a.usuarioID}" class="ui-btn ui-corner-all ui-shadow ui-icon-tag ui-btn-icon-left"></a></td>
       
        </tr>
        </c:forEach>
      </tbody>
     
    </table>
    
    <a href="search.jsp" class="ui-btn ui-corner-all ui-shadow ui-icon-search ui-btn-icon-left">Buscar Articulos o Usuarios Especificos</a>
    
  </div>


 


</body>
</html>