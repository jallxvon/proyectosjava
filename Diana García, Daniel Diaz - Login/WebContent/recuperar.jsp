<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recuperar Contraseña</title>
<link rel="stylesheet" type="text/css" href="CSS/estilo.css">
</head>
<body>
		<div class="caja1">
		<h1>Recuperar Contraseña</h1>
		<img src="Imagenes/contra.png" width=90>
		<form action="inicio_sesion.jsp" method="post">
		<h3>Cédula: <input type=text placeholder="Ejemplo:8-943-1245" name="cedula" required><br></h3>
		<h3>Correo Electrónico:  <input type="email" placeholder="tucorreo@hotmail.com" name="correo" required><br></h3>
		<input class="button" type=submit value="Aceptar">
		<input class="button" type=submit value="Restablecer">
		<input class="button" type=submit value="Salir">
		</form>
		</div>
</body>
</html>