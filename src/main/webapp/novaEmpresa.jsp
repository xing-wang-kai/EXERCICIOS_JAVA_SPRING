<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="style.css" />
	<title>Pagina de cadastro de empresa</title>
</head>
<body>
	
	<fieldset>
		<legend><h1> EMPRESA CADASTRADA: </h1></legend>

			<h1>${ empresa }</h1>
		<form action="/gerenciador/formulario.jsp">
			<input value="voltar Formulario" type="submit"/>
		</form>
	</fieldset>	
</body>
</html>