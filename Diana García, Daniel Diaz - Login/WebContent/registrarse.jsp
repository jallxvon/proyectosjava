<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrarse</title>
<link rel="stylesheet" type="text/css" href="CSS/estilo.css">
</head>
<body>
	<div class="caja1">
		<h1>Registro de Nuevo Usuario</h1>
		<img src="Imagenes/newuser.png" width=90>
		<form action="inicio_sesion.jsp" method="post">
		<h3>Nombre: <input type=text placeholder="Ejemplo: Mar�a" name="nombre" required><br></h3>
		<h3>C�dula: <input type=text placeholder="Ejemplo:8-943-1245" name="cedula" required><br></h3>
		<h3>Correo Electr�nico:  <input type="email" placeholder="tucorreo@hotmail.com" name="correo" required>
		<h3>Contrase�a: <input type=password placeholder="contrase�a" name="contra1" required><br></h3>
		<h3>Repetir contrase�a: <input type=password placeholder="contrase�a" name="contra2" required><br></h3>
		<input class="button" type=submit value="Registrarse">
		</form>
		</div>
</body>
</html>