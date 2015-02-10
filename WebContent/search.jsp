<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
</head>
<body>

<a href="inicio.jsp" class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left">Home</a>
<a href="nuevo.jsp" class="ui-btn ui-corner-all ui-shadow  ">Nuevo</a>


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
    <h2>Usuarios</h2>
    	<form class="ui-filterable">
      <input id="myFilter" data-type="search">
    </form>
    
    <h2>Buscar Datos de Usuario</h2>
    <ul data-role="listview" data-filter="true" data-input="#myFilter" data-autodividers="true" data-inset="true">
			
		
			<c:forEach var="a" items="${detalle.rows }">
        
          <li><a href="OnlyOne.jsp?nombre=${a.nombre }">${a.nombre }</a></li>
         
        </c:forEach>
		

	<h2>Buscar Articulos</h2>
    <ul data-role="listview" data-filter="true" data-input="#myFilter" data-autodividers="true" data-inset="true">
			
		
			<c:forEach var="a" items="${detalle.rows }">
        
          <li><a href="OnlyOneHoja.jsp?usuarioID=${a.usuarioID }">${a.usuarioID }</a></li>
         
        </c:forEach>		

      
    </ul>
    
  </div>
 
 
</body>
</html>