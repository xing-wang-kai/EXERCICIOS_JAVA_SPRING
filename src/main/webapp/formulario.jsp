<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css" />
    <title>Fomulario</title>
</head>
<body>
    <fieldset>
        <legend>Fomulario Nova Empresa</legend>
        <form action="/gerenciador/novaEmpresa" method="post">
            <label>Nome: <input type="text" name="nome"/></label><br/><br/>
            <input type="submit" value="Click Aqui para Cadastrar">
        </form>
        <form action="/gerenciador/listempresas">
        	<input type="submit" value="Listar Empresas">
        </form>
    </fieldset>
    
</body>
</html>