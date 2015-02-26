<%-- 
    Document   : Admin
    Created on : 20-feb-2015, 18:16:49
    Author     : Gianarlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/admin.css"></link>
        
        
        <link rel="shortcut icon" href="images/Windows_7_security_Icon_32.png" />
   
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logueo Admin</title>
    </head>
    <body>
       
        <h1>Ingrese su Usuario Y Contraseña</h1>
        
        <form name="formularioAdmin" action="ServletValidarAdmin" method="POST">
            
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>UserName: </td>
                        <td><input type="text" name="userNameAdmin" id="userNameAdmin" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password: </td>
                        <td><input type="password" name="passwordAdmin" id="passwordAdmin" value="" /></td>
                    </tr>
                    
                
                </tbody>
            
            </table><br>
            <input type="submit" value="Ingresar al sistema" style='width:200px; height:30px'/>
        </form>
    </body>
</html>
