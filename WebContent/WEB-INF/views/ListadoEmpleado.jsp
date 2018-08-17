<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Listado de Empleados</h1>


	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Correo Electronico</th>
			<th>Dirección</th>
			<th>Ciudad</th>
			<th>Genero</th>
			<th>Habilidades</th>
			<th>Fecha de Nacimiento</th>
		
		</tr>

			<c:forEach items="${losEmpleados}" var="empleado">
				<tr>
					<th>${empleado.full_name }</th>
					<th>${empleado.email }</th>
					<th>${empleado.direccion }</th>
					<th>${empleado.ciudad }</th>
					<th>${empleado.genero }</th>
					<th>${empleado.skill }</th>
					<th>${empleado.fecha_nacimiento }</th>
				</tr>
			</c:forEach>

	</table>

</body>
</html>