<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="login.css" type="text/css">
</head>
<body>
	<form action="LoginServlet" method="post">
		Email:<input type="text" name="email" id="email" /> <br /> Senha: <input
			type="password" id="senha" name="senha"> <br /> Tipo de
		Login: <select name="tipoLogin">
			<option value="Waka">Waka</option>
			<option value="Empreendedor">Empreendedor</option>
			<option value="Investidor">Investidor</option>
		</select> <br /> <input type="submit" value="Entrar" />

	</form>
</body>
</html>