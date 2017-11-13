<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/gridLogin.css">
    <link rel="icon" href="img/logoSimples.png">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" href="css/mediaQueryFormularios.css">
    <title></title>
  </head>
  <body>
    <div class="container-box">
	      <div class="box FilhoLogo">
	        <div class="logo">
	          <a href="index.jsp"><img src="img/logoPreto.png" alt="Cadastro Waka Coworking App - Jornada do Empreendedor"></a>
	        </div>
	      </div>
		  <div class="box formulario">
		   <form class="formFormulario" action="LoginServlet" method="post">
				<!-- RETORNO DO LOGIN(MENSAGEM DE ERRO) -->
				<%if(request.getAttribute("status")== null) 
				request.setAttribute("status", "");
				%>
				
				<p style="color: red;"><%=request.getAttribute("status")%></p>
	          	<table>

					

					<tr><td><input class="campo" type="email" name="email" value="" placeholder="Email"></td></tr>
	          		<tr><td><input class="campo" type="password" name="senha" value="" placeholder="Senha"></td></tr>

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