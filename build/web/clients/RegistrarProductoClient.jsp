<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Productos</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>


</head>
<body>


<div data-role="page" id="pageone" data-theme="b" >
 
  <div data-role="main" class="ui-content" >
      <form method="POST" action="ServletRegistrarProducto" >
      
      
      
      <label for="fname" style="color: orange;">Nombre del Producto:</label>
      <input type="text" name="nombreProducto" id= "nombreProducto" value="" required=""/>
      <label for="fname"style="color: orange;">Precio base:</label>
     <input type="text" name="precioBase" id= "precioBase" value="" required=""/> 
      <label for="fname" style="color: orange;">Descripción:</label>
      <input type="text" name="descripcion" id= "descripcion" value="" required=""/>
      
      
      
      <label for="fname" style="color: orange;">Creador:</label>
      <input type="text" name="autor" id="autor" style="color:white-space;">
      
      
      
      <label for="fname" style="color: orange;">Categoria:</label>
    <input type="text" name="categoria" id= "categoria" value="" required=""/>
      
    Select a file: <input type="file" name="foto" id="foto"/>
  
      
      <input type="submit"   class="ui-btn ui-btn-inline  ui-shadow" style="color: orange;" value="RegistrarProducto">
      
      
    
      </form><br>
 
      <form name="finalizar" action="../clients/menuClient.jsp" method="POST">
     
          <input type="submit" value="Volver" name="back" />
      
      </form>
      
      
    
  </div>
</div>
    
    
    
</body>
</html>