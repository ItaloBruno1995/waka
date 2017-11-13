<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
	<meta charset="utf-8">
  <title>Cadastro Empresa</title>
  <link rel="stylesheet" href="css/gridCadastroNegocio.css">
  <link rel="stylesheet" href="css/reset.css">
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
  				<p>negócio</p>
  				<img src="img/segundo.png" alt="">
  			</div>
		  </div>
      <div class="box formulario">
        <form class="formFormulario" action="CadastroEmpresaServlet" method="post">
      		<table>
      			<tr>
      				<td><input type="text" id="nomeEmpresa" name="nomeEmpresa" placeholder="Nome da empresa" required="required"></td>
      			</tr>
      			<tr>
      				<td><input type="text" id="razaoSocial" name="razaoSocial" placeholder="Razão Social" required="required"></td>
      			</tr>
      			<tr>
      				<td><input type="text" id="cnpj" name="cnpj" placeholder="CNPJ ou CPF" required="required"></td>
      			</tr>
      			<tr>
      				<td><input type="text" id="ramoAtuacao" name="ramoAtuacao" placeholder="Ramo de Atuação" required="required"></td>
      			</tr>
      		</table>
      			<button class="botao" type="submit" name="button" value="proximo">proximo</button>
      	</form>
      </div>
    </div>
</body>
</html>