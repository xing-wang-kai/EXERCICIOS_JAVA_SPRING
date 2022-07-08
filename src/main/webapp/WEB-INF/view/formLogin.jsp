<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/gerenciador/src/main/webapp/style.css" />
<title>Formulário Login</title>
</head>
<body>
<form action="/gerenciador/entrada" method="post">
	<input type="hidden" name="acction" value="logar"/>
	<label>LOGIN: <input type="text" required autofocus name="login" placeholder="INSIRA SEU LOGIN AQUI!"/></label>
	</br></br>
	<label>EMAIL: <input type="password" required autofocus name="password" placeholder="INFORME SEU PASSWORD"/> </label>
	</br></br>
	<input type="submit" value=" LOGAR "/>
</form>

</body>
</html>