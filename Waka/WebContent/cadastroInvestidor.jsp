<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
	<meta charset="utf-8">
	<title>Cadastro Investidor</title>
	
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/gridCadastro.css">
	<link rel="stylesheet" href="css/mediaQueryFormularios.css">
</head>
<body>
	<div class="container-box">
		<div class=" box logo">
					<div class="logoImg">
						<a href="index.jsp"><img src="img/logoPreto.png" alt="Cadastro Waka Coworking App - Jornada do Empreendedor"></a>
						<a href="login.jsp">Já possui conta?</a>
					</div>
		    </div>
			<div class="tipoCadastro">
				<div class="informacoes">
					<p>investidor</p>
			</div>
			 <div class="box formulario">
		        	<form class="formFormulario" action="CadastroUsuarioServlet" method="post">
		        		<table>
		        			<tr>
		        				<td><input type="email" id="email" name="email" placeholder="E-mail" required="required"></td>
		        			</tr>
		              <tr>
		                <td><input type="password" id="senha" name="senha" placeholder="Senha" required="required"></td>
		              </tr>
		              <tr>
		                <td><input type="text" id="nome" name="nome" required="required" placeholder="Seu nome"></td>
		              </tr>
		              <tr>
		                <td>Data de Nascimento</td>
		               </tr>
		               <tr>
		        				<td><input type="date" name="dataNascimento"
		        					pattern="[0-9]{2}\/[0-9]{2}\/[0-9]{4}$" placeholder=" xx/xx/xxxx" required="required"></td>
		        			</tr>
		               
		              <tr>
		                <td>Sexo:</td>
		              </tr>
		        			<tr>
		        				<td><select name="que titulo?">
		        						<option value=""></option>
		        						<option value="masculino">Masculino</option>
		        						<option value="feminino">Feminino</option>
		        				</select></td>
		        			</tr>
		        		</table>
		        		<br/>
		        		<button class="botao" type="submit" name="button" value="proximo">cadastrar</button>
		        	</form>
		      </div>
		</div>
	</div>
</body>
</html>