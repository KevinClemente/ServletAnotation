<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text-html";charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login Simple</h1>
	<form action="servletanotation" method="post">
		<label>Usuario: </label><input name="usuario" type="text">
		<label>Contrasena: </label><input name="contrasena" type="text">
		<input type="submit" value="Iniciar Sesion">
	</form>
</body>
</html>