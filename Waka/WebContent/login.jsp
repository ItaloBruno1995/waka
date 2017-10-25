<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
	<meta charset="utf-8">
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
			
			 <table>
			 	
				<tr><td><p>Email: <input type="text" name="email" id="email" required="required" /></p></td></tr>
			    <tr><td><p>Senha: <input type="password" id="senha" name="senha" required="required">  </p></td></tr>
			    <tr><td><p>Tipo de Login: <select name="tipoLogin" required="required"></p>
					<option value="Waka">Waka</option>
					<option value="Empreendedor">Empreendedor</option>
					<option value="Investidor">Investidor</option></tr></td>
				<tr><td></select> <br /> <input type="submit" value="  Logar  " onclick="salvar()" /></tr></td>
			 </table>
			</form>
		</div>	
	</div>
	<p>Não tem uma conta?<br/><a href="cadastroEmpreendedor.jsp"> Cadastre-se</a></p>
	<p><a href="recuperacaoSenha.jsp"> Esqueci minha senha</a></p>
	

</body>

</html>