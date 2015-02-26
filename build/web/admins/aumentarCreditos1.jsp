<%-- 
    Document   : aumentarCreditos1
    Created on : 25/02/2015, 10:16:20 PM
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
        <title>Aumentar Creditos1</title>
      
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
        
    </head>
    <body>
       
        <div data-role="page" id="pageone" data-theme="b">
  <a href="../admins/menuAdmin.jsp" class="ui-btn ui-btn-inline ui-shadow ui-icon-home ui-btn-icon-left" style="color: orange;">Home</a>
  <div data-role="header">
    <h1>Pack Creditos</h1>
  </div>
      <sql:setDataSource
	var="ds"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="root"
	url="jdbc:mysql://localhost:3306/subastafinal?user='root'&password='root'"
	/>  
     <sql:query var="detalle" dataSource="${ds}">
				select * from packcreditos 

	</sql:query>   
         <div data-role="main" class="ui-content">
   
    <table data-role="table" data-mode="reflow" class="ui-responsive" id="myTable">
      <thead>
      
        <tr>
          <th data-priority="1" style="color:orange;">idCreditos</th>
          <th data-priority="2" style="color:orange;">numCreditos</th>
          <th data-priority="3" style="color:orange;">precio</th>
          <th data-priority="4" style="color:orange;">idCliente</th>
          
         
        </tr>
      </thead>
        
      <tbody>
      	<c:forEach var="a" items="${detalle.rows }">
        <tr>
        
         <td style="color:aqua;">${a.idCreditos}</td>
         <td style="color:aqua;">${a.numCreditos}</td>
         <td style="color:aqua;">${a.precio}</td>
         
         <td style="color:aqua;">${a.idCreditos}</td>
         
         
         <td><a href="aumentarCreditos2.jsp?idCreditos=${a.idCreditos}" class="ui-btn ui-btn-inline ui-shadow ui-icon-tag ui-btn-icon-left"  style="color: orange;">Actualizar</a></td>
       
        </tr>
        </c:forEach>
      </tbody>
      
      
      
    </body>
</html>