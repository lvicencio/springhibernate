<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Contacto de Empleado</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<%-- 
<c:choose>
		<c:when test="${empty loggedInUser.username }">
			<a href="login">Login</a>
			
			<hr>
			
		<h1>No esta autorizado para realizar la acción</h1>
		
		</c:when>
		<c:otherwise>
			Hola ${loggedInUser.username }! <a href="logout">Salir</a>
			
			<button onclick="window.location.href= 'vistaempleado'"; return false; >Agregar Nuevo Empleado</button>
	
 --%>

	<h1>Contactos del Empleado</h1>
	<hr>
<div>
	<c:out value="${resultado}"></c:out> <br/><br/>
</div>
	<f:form modelAttribute="contacto" action="guardarContacto">
	<input type="text" value = "${empleado.id }" id="skill" >
	<input type="text" value = "${empleado.full_name }" id="skill" >
		<table border="1">
<%-- 			<f:hidden path="id"/> --%>
			
			<tr>
				<td>Medio de Contacto</td>
				<td>
					<f:select path="medio">
						<f:option value="fijo">Fijo</f:option>
						<f:option value="Celular">Celular</f:option>
						<f:option value="Correo">Correo</f:option>
						<f:option value="Whatsapp">WhatsApp</f:option>
					</f:select>
				</td>
			</tr>
			
			<tr>
				<td>Dato</td>
				<td><f:input path="dato"/></td>
			</tr>

			<tr>
				<td></td>
				<td>
					<input type="submit" value="Enviar">
				</td>
			</tr>
		</table>
	</f:form>
	
	<a href="ListadoEmpleado">Listar Todos los Empleados</a>  
	



<%-- 	</c:otherwise>
	</c:choose>	  --%>
</body>
</html>