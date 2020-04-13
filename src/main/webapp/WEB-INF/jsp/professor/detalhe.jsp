<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Professor</title>
</head>
<body>

	<form action="/professor" method="post">
		Nome: <input type="text" name="nome">
		CREF: <input type="text" name="cref">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>