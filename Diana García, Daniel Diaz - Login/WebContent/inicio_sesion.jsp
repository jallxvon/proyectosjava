<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iniciar Sesión</title>
<link rel="stylesheet" type="text/css" href="CSS/estilo.css">
</head>
<body>
		<div class="caja1">
		<h1>Iniciar Sesión</h1>
		<img src="Imagenes/user.png" width=90>
		<form action="pagina_principal.jsp" method="post">
		<h3>Cédula: <input type=text placeholder="Ejemplo:8-943-1245" name="cedula" required><br></h3>
		<h3>Contraseña: <input type=password placeholder="contraseña" name="contra" required><br></h3>
		<h5>¿No recuerdas tu contraseña? Recuperala <a href="recuperar.jsp">Aquí!!</a></h5>
		<h5>¿No tienes un usuario? Registrate <a href="registrarse.jsp">Aquí!!</a><br></h5>
		<input class="button" type=submit value="Ingresar">
		</form>
		</div>
		
</body>
</html>