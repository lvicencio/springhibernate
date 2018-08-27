<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Contacto de Empleado</title>
<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div>
			<c:choose>
				<c:when test="${empty loggedInUser.username }">
					<a href="login">Login</a>

					<h1>No esta autorizado para realizar la acción</h1>

				</c:when>
				<c:otherwise>
					<p class="navbar-text navbar-right">
						Identificado por ${loggedInUser.username }! - <a href="logout"
							class="btn btn-default"> Salir </a>
					</p>
		</div>

		<h1>Contactos del Empleado</h1>
		<hr>
		<div>
			<c:out value="${resultado}"></c:out>
			<br />
			<br />
		</div>

		<f:form modelAttribute="contacto" action="guardarContacto">

			<table border="1">
				<%-- 			<f:hidden path="id"/> --%>

				<tr>
					<td>Medio de Contacto</td>
					<td><f:select path="medio">
							<f:option value="fijo">Fijo</f:option>
							<f:option value="Celular">Celular</f:option>
							<f:option value="Correo">Correo</f:option>
							<f:option value="Whatsapp">WhatsApp</f:option>
						</f:select></td>
				</tr>

				<tr>
					<td>Dato</td>
					<td><f:input path="dato" /> <f:errors path="dato"
							cssStyle="color:red" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Agregar Contacto"></td>
				</tr>
			</table>
			<hr>
		</f:form>

		<br>
		<!-- contactos -->

		<table border="1">
			<tr>
				<th>ID</th>
				<th>Medio</th>
				<th>dato</th>


			</tr>

			<c:forEach items="${contactos}" var="contactos">
				<tr>
					<th>${contactos.idC }</th>
					<th>${contactos.medio }</th>
					<th>${contactos.dato }</th>

				</tr>
			</c:forEach>

		</table>
	<br>

		<a href="ListadoEmpleado" class="btn btn-info">Listar Todos los Empleados</a>




		</c:otherwise>
		</c:choose>

	</div>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>