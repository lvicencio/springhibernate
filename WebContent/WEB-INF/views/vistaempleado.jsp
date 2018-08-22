<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Empleado de la Empresa</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

<c:choose>
		<c:when test="${empty loggedInUser.username }">
			<a href="login">Login</a>
		</c:when>
		<c:otherwise>
			Hola ${loggedInUser.username }! <a href="logout">Salir</a>
			
			<button onclick="window.location.href= 'vistaempleado'"; return false; >Agregar Nuevo Empleado</button>
	



	<h1>Empleado</h1>
	<hr>

	<f:form modelAttribute="empleado" action="guardarEmpleado">
	<input type="hidden" value = "${empleado.skill }" id="skill" >
		<table border="1">
			<f:hidden path="id"/>
			<tr>
				<td>Nombre Completo</td>
				<td><f:input path="full_name"/></td>
			</tr>
			
			<tr>
				<td>Correo Electronico</td>
				<td><f:input path="email"/></td>
			</tr>
			
			<tr>
				<td>Dirección</td>
				<td><f:textarea path="direccion"/>
				</td>
			</tr>
			
			<tr>
				<td>Ciudad</td>
				<td>
					<f:select path="ciudad">
						<f:option value="Arica">Arica</f:option>
						<f:option value="Concepcion">Concepción</f:option>
						<f:option value="Iquique">Iquique</f:option>
						<f:option value="Serena">La Serena</f:option>
						<f:option value="Valdivia">Valdivia</f:option>
						<f:option value="Santiago">Santiago</f:option>
						<f:option value="Parenas">Punta Arenas</f:option>
					</f:select>
				</td>
			</tr>
			
			<tr>
				<td>Genero</td>
				<td>
					<f:radiobutton path="genero" value="Hombre"/>Masculino
					<f:radiobutton path="genero" value="Femenino"/>Femenino
				</td>
			</tr>
			
			<tr>
				<td>Conocimientos de Programación</td>
				<td>
					<f:checkbox path="skill" value="Java"/>JAVA  <br>
					<f:checkbox path="skill" value="C"/>C#  <br>
					<f:checkbox path="skill" value="Php"/>PHP  <br>
					<f:checkbox path="skill" value="Python"/>Python  <br>
					<f:checkbox path="skill" value="Angular"/>Angular  <br>
					<f:checkbox path="skill" value="Vb"/>Visual Basic  <br>
				</td>
			</tr>
			
			<tr>
				<td>Fecha de Nacimiento</td>
				<td><f:input path="fecha_nacimiento" type="date"/></td>
			</tr>
		
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Enviar">
					<input type="reset" value="Borrar">
				</td>
			</tr>
		</table>
	</f:form>
	
	<a href="ListadoEmpleado">Listar Todos los Empleados</a>  
	
	<script type="text/javascript">
		$(document).ready(function() {
			var skill = $('#skill').val().split(",");
			var $checkboxes = $("input[type=checkbox]");
			$checkboxes.each(function(id, element) {
				if (skill.indexOf(element.value) != -1) {
					element.setAttribute("checked", "checked");
				}
				
			});
		});
	</script>


	</c:otherwise>
	</c:choose>	 
</body>
</html>