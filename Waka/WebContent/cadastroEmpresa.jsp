<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
	<meta charset="utf-8">
<title>Cadastro Empresa</title>
</head>
<body>
<h1>Cadastro Empresa</h1>
	<form action="salvarUsuario" method="post">

		<table>
			<tr>
				<td>Nome da empresa:</td>
				<td><input type="text" id="nomeEmpresa" name="nomeEmpresa" required="required"></td>
			</tr>
			<tr>
				<td>Razão Social:</td>
				<td><input type="text" id="razaoSocial" name="razaoSocial" required="required"></td>
			</tr>
			<tr>
				<td>CNPJ ou CPF:</td>
				<td><input type="text" id="cnpj" name="cnpj" required="required"></td>
			</tr>
			<tr>
				<td>Ramo de Atuação:</td>
				<td><input type="text" id="ramoAtuacao" name="ramoAtuacao" required="required"></td>
			</tr>
		</table>
			<input type="submit" value="Proximo" >
	</form>
</body>
</html>