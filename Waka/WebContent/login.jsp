<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/gridLogin.css">
    <link rel="icon" href="img/logoSimples.png">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <title></title>
  </head>
  <body>
    <div class="container-box">
	      <div class="box FilhoClose">
	        <form class="" action="index.html" method="post">
	          <button class="close" type="submit">X</button>
	        </form>
	      </div>
	      <div class="box FilhoLogo">
	        <div class="logo">
	          <img src="img/logo.png" alt="Waka Coworking - espaço compartilhado">
	        </div>
	      </div>
		  <div class="formulario">
		   <form class="input" action="LoginServlet" method="post">
				<!-- RETORNO DO LOGIN(MENSAGEM DE ERRO) -->
				<%if(request.getAttribute("status")== null) 
				request.setAttribute("status", "");
				%>
				
				<p style="color: red;"><%=request.getAttribute("status")%></p>
	          	<table>
					<tr><td><input class="campo" type="text" name="" value="" placeholder="Email"></td></tr>
	          		<tr><td><input class="campo" type="password" name="" value="" placeholder="Senha"></td></tr>
					<tr><td><select name="tipoLogin">
					  <option value="empreendedor">Empreendedor</option> 
					  <option value="waka" selected>Waka</option>
					  <option value="investidor">Investidor</option>
					</select></td></tr>
					<tr><td><button class="botao" type="submit">Login</button></td></tr>
				</table>
	         </form>
	      <div class="box texto FilhoEsqSenha">
	        <a href="#">Esqueci minha senha</a>
	      </div>
	      <div class="box texto FilhoCadastro">
	        <a href="cadastroEmpreendedor.jsp">Cadastrar</a>
	      </div>
	    </div>
    </div>
  </body>
</html>