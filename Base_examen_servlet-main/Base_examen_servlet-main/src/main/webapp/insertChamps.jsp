<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>formulario nuevas actividades</title>
</head>
<body class="container">

	<form action="/insertChamps" method="post" class="row d-flex justify-content-center">
	<div class="col-8 row justify-content-center"> 
		<div class="col-6 text-end">Nombre Campeon</div><input type="text" id="champion_name" name="champion_name"  class="col-6"/> 
		<div class="col-6 text-end">Tittle</div><input type="text" id="title" name="title"  class="col-6"/> 
		<div class="col-6 text-end">Lore</div><input type="text" id="lore" name="lore"  class="col-6"/>
		<div class="col-6 text-end">Tags</div><input type="text" id="tags" name="tags"  class="col-6"/>
		<input type="submit" value="enviar" />
	</div>
	</form>
	
	<a href="/index.jsp">Atras</a>
	
</body>
</html>