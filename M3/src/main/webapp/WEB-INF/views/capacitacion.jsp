<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Capacitaciones</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="superior">
				
                <nav>
                    Contacto |  
                    <a href="Home">Home</a>  | 
                    <a href="ContactoController">Contacto</a> |
                    <a href="CapacitacionController">Listado Capacitaciones</a> |
                    <a href="Login">Ingresa a tu cuenta</a> |
                    <a href="CerrarSesion">Cerrar Sesión</a>
                </nav>
		<div class="encabezado">
		
			<h1>Listado de capacitaciones</h1>
	   
		</div>
	</div>

	<div class="medio">
		
		<table class="tabla">
			<thead>
				<tr class="campos">
				<th>Id de capacitación</th>
				<th>Nombre del cliente</th>
				<th>Lugar</th>
				<th>Email</th>
				<th>Duración</th> 
				<th>Comentario</th>				
				<th>Eliminar</th>
				<th>Modificar</th>
			</tr>
			</thead>


			<tbody>
				<c:forEach var="e" items="${lista}">
					<tr>
						<td><c:out value="${lista.getId_capa()}"></c:out></td>
						<td><c:out value="${e.getNombreapellido()}"></c:out></td>
						<td><c:out value="${e.getLugar()}"></c:out></td>
						<td><c:out value="${e.getEmail()}"></c:out></td>
						<td><c:out value="${e.getDuracion()}"></c:out></td>
						<td><c:out value="${e.getComentario()}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>

	   	</table>	
	</div>
</body>
</html>