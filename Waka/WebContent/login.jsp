<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>login</title>
	<link rel="stylesheet" href="login.css" type="text/css">
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
			
			 <table>
				<tr><td><p>Email: <input type="text" name="email" id="email" /></p></tr></td>
			    <tr><td><p>Senha: <input type="password" id="senha" name="senha"> <br /> </tr></td></p><tr><td><p>Tipo
				de Login: <select name="tipoLogin"></p>
					<option value="Waka">Waka</option>
					<option value="Empreendedor">Empreendedor</option>
					<option value="Investidor">Investidor</option></tr></td>
				<tr><td></select> <br /> <input type="submit" value="  Logar  " onclick="salvar()" /></tr></td>
			 </table>
			</form>
		</div>	
	</div>
	<p>Não tem uma conta?<br/><a href="cadastroEmpreendedor.jsp"> Cadastre-se</a></p>
	
	
	<script>

	


	</script>
</body>
</html>