<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Empleados</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div>
			<c:choose>


				<c:when test="${empty loggedInUser.username }">

					<a href="login">Login</a>

				</c:when>
				<c:otherwise>

					<p class="navbar-text navbar-right">
						Identificado por ${loggedInUser.username }! - <a href="logout"
							class="btn btn-default"> Salir </a>
					</p>

				</c:otherwise>
			</c:choose>
			<hr>
		</div>
		<h1>Listado de Empleados</h1>
		<hr>
		<p></p>
		<!-- <button onclick="window.location.href= 'vistaempleado'"; return false; class="btn btn-primary" >Agregar Nuevo Empleado</button>  -->

		<table class="table table-striped">
			<a href="vistaempleado" class="btn btn-primary"> Agregar Empleado
			</a>
			<br>
			<br>
			<tr>
				<th>Nombre</th>
				<th>Correo Electronico</th>
				<th>Dirección</th>
				<th>Ciudad</th>
				<th>Genero</th>
				<th>Habilidades</th>
				<th>Fecha de Nacimiento</th>
				<th>Contactos</th>
				<th>Opciones</th>

			</tr>

			<c:forEach items="${losEmpleados}" var="empleado">
				<c:url var="updateLink" value="UpdateFormulario">
					<c:param name="empleadoId" value="${empleado.id}"></c:param>
				</c:url>
				<c:url var="eliminarLink" value="eliminarEmpleado">
					<c:param name="empleadoId" value="${empleado.id}"></c:param>
				</c:url>
				<c:url var="contactoLink" value="contactos">
					<c:param name="empleadoId" value="${empleado.id}"></c:param>
				</c:url>
				<tr>
					<th>${empleado.full_name }</th>
					<th>${empleado.email }</th>
					<th>${empleado.direccion }</th>
					<th>${empleado.ciudad }</th>
					<th>${empleado.genero }</th>
					<th>${empleado.skill }</th>
					<th>${empleado.fecha_nacimiento }</th>
					<th><a href="${contactoLink}">Contactos |</a></th>
					<th><a href="${updateLink}"><span class="glyphicon glyphicon-pencil" aria-hidden="true"> Editar </span>|</a> <a
						onclick="if(!(confirm('seguro de eliminar este empleado?'))) return false"
						href="${eliminarLink}"><span class="glyphicon glyphicon-trash" aria-hidden="true"> Eliminar </span></a></th>
				</tr>
			</c:forEach>

		</table>


		<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</div>
</body>
</html>