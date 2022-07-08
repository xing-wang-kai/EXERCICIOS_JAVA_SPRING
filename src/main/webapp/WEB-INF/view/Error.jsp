<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% Exception Error = (Exception) request.getAttribute("error"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ocorreu um Error Durante a Requisição</h1>
	<fieldset>
	<legend>ERROR TRACE</legend>
		<ul>
			<li><%=Error.getLocalizedMessage() %></li>
			<li><%=Error.hashCode() %></li>
			<li><%=Error.getCause() %></li>
			<li><%=Error.getStackTrace() %></li>
			<li><%=Error.getSuppressed() %></li>
			<li><%=Error.getMessage() %></li>
			
		</ul>
	</fieldset>
</body>
</html>