<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList,br.com.kaiwang.gerenciador.servlet.models.Empresa" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/gerenciador/src/main/webapp/style.css" />
<title>ROTA LISTAR</title>
</head>
<body>

<h1>Empresa:</h1><br/>
<h2> USUÁRIO LOGADO:  ${ usuarioLogado.login } </h2>
<h2><a href="entrada?acction=logout">SAIR</a></h2>

	<ul>
		<% 
		ArrayList<Empresa> lista = (ArrayList<Empresa>) request.getAttribute("empresas");
		for(Empresa empresa: lista)
		{ 
		%>
		<fieldset>
			<h2>Empresa code: <%=empresa.getId()%> Empresa nome: <%=empresa.getNome()%></h2>
				<form action="/gerenciador/entrada" method="get">
					<input type="hidden" value="removerEmpresa" name="acction"/>
					<input type="hidden" value="<%=empresa.getId()%>" name="id"/>
					<input type="submit" value="DELETE" />
				</form>
				
				<form action="/gerenciador/entrada" method="get">
					<input type="hidden" value="editarEmpresa" name="acction"/>
					<input type="hidden" value="<%=empresa.getId()%>" name="id"/>
					<input type="submit" value="EDITAR" />
				</form>
				
			</fieldset>
		<% 
		}; 
		%>
	</ul>
	<form action="/gerenciador/entrada">
		<input type="hidden" value="formulario" name="acction"/>
		<input value="voltar Formulario" type="submit"/>
	</form>

</body>
</html>