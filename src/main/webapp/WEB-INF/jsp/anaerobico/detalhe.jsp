<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Anaerobico</title>
</head>
<body>

	<form action="/anaerobico" method="post">
		Nome do Exercicio:<input type="text" name="nomeDoExercicio">
		Tempo de Recuperacao:<input type="text" name="tempoRecuperacao">
		Quantidade de Blocos:<input type="text" name="quantidadeBlocos"> 
		Quantidade de Repetições:<input type="text" name="peso">
		Peso:<input type="text" name="qtdeRepeticao">
		Aparelho:<input type="text" name="aparelho">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>