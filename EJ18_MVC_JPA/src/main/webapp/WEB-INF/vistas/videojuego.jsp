<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Videojuego</h1>
	 
	 <h2>Nombre: ${v.nombre}</h2>
	 <h2>Id: ${v.id}</h2>
	 <h2>Compañia: ${v.compania}</h2>
	 <h2>Nota Media: ${v.notaMedia}</h2>
	 <p>Creador: ${v.creador}</p>
	 <a href="${v.web}">${v.web}</a>
</body>
</html>