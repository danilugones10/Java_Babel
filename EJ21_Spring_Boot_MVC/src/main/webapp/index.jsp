<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="align:center">
		<h1>Bienvenidos a nuestra pagina web</h1>
		<h1>Por favor introduzca los datos!!!</h1>
		<form action="validar" method="post">
			Nombre: <input type="text" name="usuario"/>
			Password: <input type="password" name="contrasena"/>
			<input type="submit" value="Enviar datos"/>
		</form>
		<h2 style="color:red">${param.error}</h2>
	</div>
</body>
</html>