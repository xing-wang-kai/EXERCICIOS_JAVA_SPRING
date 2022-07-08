<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/gerenciador/src/main/webapp/style.css" />
    <title>Fomulario</title>
</head>
<body>
    <fieldset>
        <legend>Fomulario Nova Empresa</legend>
        
        <form action="/gerenciador/entrada" method="post">
            <label>Nome: <input type="text" name="nome"/></label><br/>
            <input type="hidden" value="criarEmpresa" name="acction"/>
            <input class="button" type="submit" value="CADASTRAR">
        </form>
        
        <form action="/gerenciador/entrada" method="get">
            <input type="hidden" name="acction" value="listarEmpresas"/><br/>
            <input class="button" type="submit" value="LISTAR EMPRESAS">
        </form>
        
   
    </fieldset>
    
</body>
</html>