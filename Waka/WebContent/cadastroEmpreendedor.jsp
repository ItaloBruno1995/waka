<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
	<meta charset="utf-8">
	<title>Cadastro Empreendedor</title>
	<link rel="stylesheet" href="css/gridCadastro.css">
	<link rel="stylesheet" href="css/reset.css">
</head>
<body>
	  <div class="container-box">
		    <div class=" box logo">
					<div class="logoImg">
						<img src="img/logo.png" alt="Cadastro Waka Coworking App - Jornada do Empreendedor">
						<a href="login.html">Já possui conta?</a>
					</div>
		    </div>
			<div class="tipoCadastro">
				<div class="informacoes">
					<p>empreendedor</p>
					<img src="img/foto1.png" alt="">
				</div>
			</div>
		    <div class="box formulario">
		        	<form class="formularioCadastro" action="CadastroUsuarioServlet" method="post">
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
										<td><input type="tel" id="telefone" name="telefone"
											pattern="\(\d{2}\)\d{5}-\d{4}" placeholder="Telefone - (xx) xxxxx-xxxx" required="required"></td>
									</tr>
									<tr>
										<td><input type="text" id="endereco" name="endereco" placeholder="Endereço" required="required"></td>
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
		        				<td><select name="sexo">
		        						<option value=""></option>
		        						<option value="masculino">Masculino</option>
		        						<option value="feminino">Feminino</option>
		        				</select></td>
		        			</tr>
		        		</table>
		        		<br/>
		        		<button class="botao" type="submit" name="button" value="proximo">proximo</button>
		        	</form>
		      </div>
  		</div>
	
</body>
</html>