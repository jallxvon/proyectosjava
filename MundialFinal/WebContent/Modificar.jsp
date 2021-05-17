<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Conexion.*,Get_set.*,Operaciones.*,java.sql.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar registro - 2018 FIFA World Cup Database</title>
<link rel="stylesheet" type="text/css" href="css/estilomantenimiento.css">
<link rel="stylesheet" type="text/css" href="css/tablas.css">
</head>
<body>
<header>
	<h1><img id="copa" src="https://vignette.wikia.nocookie.net/logopedia/images/c/ca/2018_FIFA_World_Cup.png/revision/latest/scale-to-width-down/436?cb=20150414130804" alt="FIFA 2018 Trophy" width="60">2018 FIFA World Cup</h1>
		<nav>
		<ul>
			<li><a href="home.html">Inicio</a></li>
			<li><a href="home.html">Consultas</a>
				<ul>
			        <li><a href="#">Paises</a></li>
			        <li><a href="#">Menu</a></li>
			        <li><a href="#">Jugadores</a></li>
			        <li><a href="#">Partidos</a></li>
			        <li><a href="#">Estadios</a></li>
		        </ul>
		    </li>
	        <li><a href="#">Mantenimiento</a>
	        	<ul>
		        	<li><a href="#">Paises</a>Insertar</li>
		        	<li><a href="#">Paises</a></li>
		        	<li><a href="#">Paises</a>Eliminar</li>
	        	</ul>
	        </li>
	        	
			</ul>
		</nav>
	</header>
	<%Connection cnn;
	Conexion cn = new Conexion();
	Operaciones obj = new Operaciones();
	LinkedList<Comida> com = new LinkedList<Comida>();
	cnn=cn.establecer_conexion();
	
	com = obj.comida1();
	if(request.getParameter("cod")==null)
	{
	%>
	<h2>Modificar registro de la tabla Menu</h2>
			<section>
	<table>
	<thead>
	<tr><td>Codigo</td><td>Detalle</td></tr>
	</thead>
		<%
			for(Comida a :  com)
			{
				%>
				
					<tr>
						<td><%out.println(a.getCod_menu());%></td><td><%out.print(a.getDetalle());%></td>
					</tr>
				
				
		<%
				
			}
		%>
		</table><br><br><br>
	</section>
	<section>
	<div>
		<form action="Modificar.jsp" method="post">
			<fieldset>
				<legend>Insertar valores requeridos</legend>
			
					Codigo de Menu:<input type="text" required name="cod">
					<br>
					Detalle: <input type="text"  name="det">
					<br>
					Cantidad Consumida: <input type="number" name="cant">
			</fieldset>
				<input type="submit" value="Enviar" >
		</form>
	</div>
		<%} 
		else
		{
			String cod,det,cont;
			cod=request.getParameter("cod");
			det=request.getParameter("det");
			cont=request.getParameter("cant");			
			if(obj.exit(cod))
			{
				obj.modificar(cnn, cod, det, cont);
			out.println("Se actualizo un campo de la tabla Comida");
			out.println("<a href=Modificar.jsp>Salir</a>");
			}
			else
			{
				out.println("El registro que desea modificar no existe");
				out.println("<a href=Modificar.jsp>Salir</a>");
			}
			
		}
		%>
		</section>
		<br><br><br><br>
		<footer>
	<br>
		<p>2018. Derechos reservados.<br>Página web creada por los estudiantes del grupo 1LS122 como proyecto final.</p>
	<br>
	</footer>
</body>
</html>