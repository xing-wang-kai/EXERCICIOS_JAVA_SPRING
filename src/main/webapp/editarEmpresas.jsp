<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.kaiwang.gerenciador.servlet.models.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Empresa empresas = (Empresa)request.getAttribute("empresa"); 
	System.out.println("EMPRESA: " + empresas);
	System.out.println("empresa: " + empresas.getId());
%>
<fieldset>
	<legend>FORMULÁRIO PARA EDIÇÃO: </legend>
	<form action="/gerenciador/editarEmpresa" method="get">
	<label>NOVO NOME:
		<input type="text" value="<%=empresas.getNome()%>" name="nome"/></label>
		<input type="hidden" value="<%=empresas.getId()%>" name="id"/>
		<input type="submit" value="EDITAR" />
	</form>
	 
	
</fieldset>
</body>
</html>