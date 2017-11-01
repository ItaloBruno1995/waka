<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
	<meta charset="utf-8">
<title>Recuperação de Senha</title>
</head>
<body>
<h1>Recuperação de Senha</h1> 
<form action="RecuperarSenhaServlet" method="get">
<!-- RETORNO DO VALIDAR EMAIL(MENSAGEM DE ERRO) -->
			<%if(request.getAttribute("validarEmail")== null) 
			request.setAttribute("validarEmail", "");
			%>

		<table>
			<tr>
				<td>Email:
				<input type="email" required="required" id="email" name="email" ></td>
				
			</tr>
				<!-- VALIDAR EMAIL -->
				<center style="color: red";> <%=request.getAttribute("validarEmail") %></center>
					
				 <tr>
				 <td><p>Selecione Usuario: <select name="tipoLogin" required="required"></p>
					<option value="Empreendedor">Empreendedor</option>
					<option value="Investidor">Investidor</option></td>
					</tr>
				<tr>
			    <td><input type="submit" value="Enviar Solicitação" > </td>
			    </tr>
			</table>
	</form>
</body>
</html>