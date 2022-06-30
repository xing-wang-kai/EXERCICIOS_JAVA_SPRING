<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList,br.com.kaiwang.gerenciador.servlet.models.Empresa" %>

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
	<form action="/gerenciador/formulario.jsp">
		<input value="voltar Formulario" type="submit"/>
	</form>

</body>
</html>