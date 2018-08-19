<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Empleados</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<h1>Listado de Empleados</h1>
<hr>
<p>
<button onclick="window.location.href= 'vistaempleado'"; return false; >Agregar Nuevo Empleado</button>
</p>
	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Correo Electronico</th>
			<th>Dirección</th>
			<th>Ciudad</th>
			<th>Genero</th>
			<th>Habilidades</th>
			<th>Fecha de Nacimiento</th>
			<th>Opciones</th>
		
		</tr>

			<c:forEach items="${losEmpleados}" var="empleado">
				<c:url var="updateLink" value="UpdateFormulario">
					<c:param name="empleadoId" value="${empleado.id}"></c:param>				
				</c:url>
				<c:url var="eliminarLink" value="eliminarEmpleado">
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
					<th> <a href="${updateLink}">Editar</a>  |<a onclick="if(!(confirm('seguro de eliminar este empleado?'))) return false" href="${eliminarLink}">Eliminar</a></th>
				</tr>
			</c:forEach>

	</table>

</body>
</html>