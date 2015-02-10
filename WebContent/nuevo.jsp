<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuevo Usuario</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
</head>
<body>



 
<div data-role="page" id="pageone" data-theme="b" >
 
  <div data-role="main" class="ui-content" >
 <a href="inicio.jsp" class="ui-btn ui-btn-inline  ui-shadow ui-icon-home ui-btn-icon-left" style="color: orange;" >Home</a>
    <form method="post" action="s01">
      
      
      <label for="fname" style="color: orange;">Nombre:</label>
      <input type="text" name="nombre" id="fname" style="color:white-space ;" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ 32]/, ''); ">
      <label for="fname"style="color: orange;">Apellido:</label>
      <input type="text" name="apellido" id="fape" style="color:white-space ;" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ 32]/,''); ">
      <label for="fname" style="color: orange;">DNI:</label>
      <input type="text" name="dni" id="dni" style="color:white-space ;" maxlength="8" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;" >
      
     
        <label for="fecha" style="color: orange;">Fecha Nacimiento :</label>
        <input type="date" name="fecha" style="color:white-space ;">
        	
        	
      
      <fieldset data-role="controlgroup">
      <legend>G:</legend>
        <label for="male" style="color: orange;">Masculino</label>
        <input type="radio" name="gender" id="male" value="Masculino" style="color:white-space ;">
        <label for="female" style="color: orange;">Femenino</label>
        <input type="radio" name="gender" id="female" value="Femenino" style="color:white-space ;">	
      </fieldset>
      
      <label for="fname" style="color: orange;">Direccion:</label>
      <input type="text" name="dir" id="dir" style="color:white-space ;">
      
      
      
      <label for="fname" style="color: orange;">Telefono:</label>
      <input type="text" name="tlf" id="tlf" style="color:white-space ;" maxlength="9" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;">
      
      
      
      
      
      <input type="reset" style="color: orange;" value="Reset" class="ui-btn-inline">
      <input type="submit" style="color: orange;" onclick="location.href='articulos.jsp'" value="Continuar">
    
    </form>
    
  </div>
</div>
</body>
</html>