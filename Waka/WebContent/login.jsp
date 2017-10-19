<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>login</title>
	<link rel="stylesheet" href="css/login.css" type="text/css">
	<link rel="icon" href="img/waka.png">
</head>
<body>
	<div class="main">
		<div class="logo">
			<img src="img/waka.png">
		</div>
		<div>
			<form action="LoginServlet" method="post">
			<!-- RETORNO DO LOGIN(MENSAGEM DE ERRO) -->
			<%if(request.getAttribute("status")== null) 
			request.setAttribute("status", "");
			%>
			
			<p style="color: red;"><%=request.getAttribute("status")%></p>
			
			
				Email:<input type="text" name="email" id="email" /> <br />
			    Senha: <input type="password" id="senha" name="senha"> <br /> Tipo
				de Login: <select name="tipoLogin">
					<option value="Waka">Waka</option>
					<option value="Empreendedor">Empreendedor</option>
					<option value="Investidor">Investidor</option>
				</select> <br /> <input type="submit" value="Entrar" onclick="salvar()" />

			</form>
		</div>	
	</div>
	
	
	<script>

	


	</script>
</body>
</html>