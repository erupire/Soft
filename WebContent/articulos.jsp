<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
</head>
<body>


<div data-role="page" id="pageone" data-theme="b">
 
  <div data-role="main" class="ui-content" size="1">
 <a href="inicio.jsp" class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left">Home</a>


<form method="post" action="s02">
      
      
      <label for="fname" style="color:orange;" >Antiguedad: </label>
      <input type="text" name="ant" id="ant" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ 32]/,''); ">
      <label for="fname"style="color:orange;" >Creditos:</label>
      <input type="text" name="credito" id="credito" maxlength="3" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;" >
      <label for="fname" style="color:orange;">Stock:</label>
      <input type="text" name="stock" id="stock" maxlength="3" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;">
      <label for="fname" style="color:orange;">Alto:</label>
      <input type="text" name="alto" id="alto" maxlength="2" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;">
      <label for="fname" style="color:orange;">Ancho:</label>
      <input type="text" name="ancho" id="ancho" maxlength="3" onKeyPress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;">
      <label for="fname" style="color:orange;">Descripcion:</label>
      <input type="text" name="desc" id="desc" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ 32]/,''); ">
      <label for="fname" style="color:orange;">Disposicion</label>
      <input type="text" name="dispo" id="dispo" onkeyup="this.value = this.value.replace (/[^aA-zZ-ñÑ 32]/,'' ); ">
      
      
      
      <input type="reset" class="ui-btn ui-btn-inline l ui-shadow" style="color: orange;" value="Reset">
      <input type="submit"  onclick="location.href='datosPaciente.jsp'" class="ui-btn ui-btn-inline  ui-shadow" style="color: orange;" value="Finalizar">
   
  
    </form>
 </div>
</body>
</html>