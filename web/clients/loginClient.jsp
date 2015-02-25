<%-- 
    Document   : loginClient
    Created on : 21-feb-2015, 13:50:41
    Author     : jazmin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logueo Cliente</title>
        
        <link rel="stylesheet" type="text/css" href="../css/login.css" />
        
        <link rel="shortcut icon" href="../images/login.png" />
        
    </head>
    <body>
        
                <h1>Ingrese su Usuario Y Contraseña</h1>
        
                <form action="ServletValidarUsuario"  method="POST">
                
                
                    <table border="0">
                        <thead>
                            <tr>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>usuario:</td>
                                <td><input type="text" name="usuario" id="usuario" value=""  /></td>
                            </tr>
                            <tr>
                                <td>password:</td>
                                <td><input type="password" name="password" id="password" value="" /></td>
                           </tr>
                        </tbody><br>
                        
                        
                        
                    </table><br>

                 <input type="submit" value="Ingresar" name="Ingresar" style='width:100px; height:30px'  />
                           
                
                
                </form><br><br>
                
               
        
        <form name="RegistrarUsuario" id="RegistrarUsuario" action="../clients/registerClients.jsp" method="POST">
            
                <input type="submit" value="Registrarse" name="Registrarse" style='width:100px; height:30px'   />
            
            </form>                
    </body>
</html>
