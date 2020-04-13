<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aerobico</title>
</head>
<body>

	<form action="/aerobico" method="post">
		Nome do Exercicio: <input type="text" name="nomeDoExercicio">
		Tempo Recuperacao: <input type="text" name="tempoRecuperacao">
		Quantidade de Blocos <input type="text" name="quantidadeBlocos">
		Tempo:<input type="text" name="tempo"> 
		velocidadeMedia<input type="text" name="velocidadeMedia">
		inclinado:<select name="inclinado">
		<option></option>
			<option value=true>Sim</option>
			<option value=false>Não</option>
			</select> 
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>