<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aluno</title>
</head>
<body>

	<form action="/aluno" method="post">
		Nome: <input type="text" name="Nome"><br> idade: <input
			type="text" name="idade"><br> peso: <input type="text"
			name="peso"><br> telefone:<input type="text"
			name="telefone"><br>
		<!-- Professor: <input type="text" name="professor.nome"> -->
		<input type="submit" value="Cadastrar">
	</form>
		<c:forEach var="item" items="${alunos}">
			<h5>${item.nome}
				<a href="/aluno/${item.id}">excluir</a>
			</h5>
		</c:forEach>

		
	
</body>
</html>