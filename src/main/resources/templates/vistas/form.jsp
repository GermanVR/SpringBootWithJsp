<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert para Usuarios</title>
</head>
<body>

	<form action="/users" method="POST">
		<label for="name" > Nombre</label>
		<input id="name" placeholder="Ingresa Nombre" name="name" type="text">
		<br> 
		<label for="password" > Contraseña</label> 
		<input id="password" placeholder="Ingresa Password" name="password" type="password">
		<br> 
		<button type="submit">Registrar</button>
	</form>
</body>
</html>