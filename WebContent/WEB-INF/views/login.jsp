<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<h1>Autentificar</h1>
	<hr>
${loginError}
	<f:form  action="login" method="post">
		<div>
			<label>User Name:</label>
			<input type="text" id="username" name="username" placeholder="User Name">
		</div>
		
		<div>
			<label>Contraseña:</label>
			<input type="password" id="password" name="password" placeholder="Contraseña">
		</div>
	
		<input type="submit" value="Entrar">
	</f:form>
	

	 
</body>
</html>