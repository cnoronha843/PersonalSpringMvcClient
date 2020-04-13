<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de Exercicios</title>
</head>
<body>
	<h4>Listagem de Exercicios</h4>
	
	<h4><a href="/aerobico">Aerobico</a> | <a href="/anaerobico">Anaerobico</a> |  <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${exercicios}">
		<h5>${item} <a href="/exercicio/${item.id}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>