<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de Professores</title>
</head>
<body>
	<h4>Listagem de Professores</h4>
	
	<h4><a href="/professor">Novo</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${professores}">
		<h5>${item.nome} <a href="/professor/${item.id}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>