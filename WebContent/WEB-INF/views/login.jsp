<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Login</title>
<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class="container">
		<h1>Autentificar</h1>
		<hr>
	${loginError}
		<f:form  action="login" method="post" class="form-signin">
			<div>
				<label>User Name:</label>
				<input type="text" id="username" name="username" placeholder="User Name">
			</div>
			
			<div>
				<label>Contraseña:</label>
				<input type="password" id="password" name="password" placeholder="Contraseña">
			</div>
		
			<input type="submit" value="Entrar" class="btn btn-primary">
		</f:form>
		

</div> 
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>