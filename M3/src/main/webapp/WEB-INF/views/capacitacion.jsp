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
 <!--  inicio  -->                              
 
    <div>
        <div class="header-dark">
            <nav class="navbar navbar-expand-lg navbar-light bg-white py-3 shadow-sm">
                <div class="container">
                	<a class="navbar-brand" href="#">Listado de Capacitaciones</a>
					<button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1">
						<span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span>
					</button>
                    <div class="collapse navbar-collapse" id="navcol-1">
                        <ul class="nav navbar-nav">
                            <li class="nav-item" role="presentation">
                            	<a class="nav-link" href="#">Usuario</a>
                            </li>
                            <li class="dropdown">
                            	<a class="dropdown-toggle nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false" href="#">Usuario </a>
	                                <div class="dropdown-menu" role="menu">
	                                	<a class="dropdown-item" role="presentation" href="#">Listado de Usuarios</a>
	                                	<a class="dropdown-item" role="presentation" href="#">Nuevo</a>
	                                </div>
                            </li>
                            <li class="dropdown">
                            	<a class="dropdown-toggle nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false" href="#">Capacitación </a>
	                                <div class="dropdown-menu" role="menu">
	                                	<a class="dropdown-item" role="presentation" href="#">Listar</a>
	                                	<a class="dropdown-item" role="presentation" href="#">Crear</a>
	                                </div>
                            </li>
                            <li class="nav-item" role="presentation">
                            	<a class="nav-link" href="#">Contacto</a>
                            </li>
                        </ul>
                        <form class="form-inline mr-auto" target="_self"></form>
                        <span class="navbar-text">
                        	<a href="#" class="login">Log In</a>
                        	<a class="btn btn-light action-button" role="button" href="#">Sign Up</a>
                        </span>
                        
                     </div>
				</div>
            </nav>
        </div>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script> 
                     
 <!--  fin  -->               
	</div>

	<div class="medio">		
		<table class="table table-striped">
			<thead>
				<tr>
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
						<td><c:out value="${e.getId_capa()}"></c:out></td>
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