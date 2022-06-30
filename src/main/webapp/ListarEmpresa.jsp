<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, br.com.kaiwang.gerenciador.servlet.Empresa" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Empresa:</h1><br/>
	<ul>

		<% 
		ArrayList<Empresa> lista = (ArrayList<Empresa>)request.getAttribute("empresas");
		for(Empresa empresa: lista)
		{ 
		%>
			<li>
			<%=empresa.getNome()%>
			<button><a href="/gerenciador/removerEmpresa?id=<%=empresa.getId()%>">DEL</a></button>
			</li>
		<% 
		}; 
		%>
	</ul>
	<form action="/gerenciador/formulario.jsp">
		<input value="voltar Formulario" type="submit"/>
	</form>

</body>
</html>