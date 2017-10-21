<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8" content="text/html; charset=utf-8">
<title>Cadastro Empreendedor</title>
</head>
<body>
	<h1>Cadastro Empreendedor</h1>

	<form action="CadastroUsuarioServlet" method="post">

		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" id="nome" name="nome" required="required"></td>
			</tr>
			<tr>
				<td>Data de nascimento:</td>
				<td><input type="date" name="dataNascimento" 
					pattern="[0-9]{2}\/[0-9]{2}\/[0-9]{4}$" placeholder=" xx/xx/xxxx"></td>
			</tr>
			<tr>
				<td>Sexo:</td>
				<td><select name="sexo">
						<option value=""></option>
						<option value="masculino">Masculino</option>
						<option value="feminino">Feminino</option>
						<option value="outro">Outro</option>
				</select></td>
			</tr>
			<tr>
				<td>Telefone:</td>
				<td><input type="tel" id="telefone" name="telefone"
					pattern="\(\d{2}\)\d{5}-\d{4}" placeholder="(xx) xxxxx-xxxx"></td>
			</tr>
			<tr>
				<td>Endereço:</td>
				<td><input type="text" id="endereco" name="endereco"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" id="email" name="email" placeholder="nome@exemplo.com" ></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" id="senha" name="senha"></td>
			</tr>
		</table>
		<br/>
		<input type="submit" value="Proximo" >
		
	</form>
</body>
</html>