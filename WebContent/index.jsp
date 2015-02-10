<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css">
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>


<title>Insert title here</title>
</head>
<body>

<h1>Ingrese usuario y contraseña</h1>
<form  action="s03">

<div data-role="fieldcontain">
<label for="Usuario">Usuario:</label>
<input type="text" name="user">
    <label for="password">Password:</label>
    <input type="password" name="pass" id="password" />
</div>	

<input type="submit" value="Login" >
</form>


</body>
</html>