<%-- 
    Document   : registerClients
    Created on : 21-feb-2015, 18:26:02
    Author     : jazmin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Clientes</title>
        
        <link rel="stylesheet" type="text/css" href="../css/registerClients.css" />
        <link rel="shortcut icon" href="../images/registroClientes.png" />
    </head>
    <body>
        
         <h1>Nuevo usuario</h1>
        
        <form  action="ServletRegistrarUsuario" method="POST">
       
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="nombre" id="nombre" value="" required="" /></td>
                    </tr>
                    <tr>
                        <td>Apellido:</td>
                        <td><input type="text" name="apellido" id="apellido" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>DNI:</td>
                        <td><input type="text" name="dni" id="dni" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Fecha de Nacimiento: </td>
                        <td><input type="date" name="fecha" id="fecha" style="color:white-space;"></input></td>
                    </tr>
                    <tr>
                        <td>Genero:</td>
                        <td>
                            <label>Masculino</label>
                            <input type="radio" name="generos" id="generos" value="masculino" />
                            <label>Femenino</label>
                            <input type="radio" name="generos" id="generos" value="femenino" />
                        </td>
                    </tr>
                    <tr>
                        <td>email:</td>
                        <td><input type="text" name="email" id="email" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Nick:</td>
                        <td><input type="text" name="nick" id="nick" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" id="password" value="" required=""/></td>
                    </tr>
                    
                     </tbody>
            </table><br>

            
            <input type="submit" value="Registrar" name="Registrar" style='width:100px; height:30px' /> 
               
        
        </form><br><br>
        
        
        
        <form name="volver" action="../clients/loginClient.jsp" method="POST">
            
            <input type="submit" value="volver" name="back" style='width:100px; height:30px' />
        </form>
        
        
    </body>
</html>
