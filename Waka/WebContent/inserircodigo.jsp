<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserir Codigo de Recuperação</title>
</head>
<body>

<center><h6>Por favor verifique o código no seu e-mail !!</h6></center>
<form method="get" action="CadastroNovaSenhaServlet">
			<!-- RETORNO DO VALIDAR CODIGO(MENSAGEM DE ERRO) -->
			<%if(request.getAttribute("validarCodigo")== null) 
			request.setAttribute("validarCodigo", "");
			%>
				<center>					
					Código:<input type="text" maxlength="9" name="codigo" placeholder="" required="" id="cod">	
					<p style="color: red"; > <%=request.getAttribute("validarCodigo") %></p>
					<k>Já tem conta?&ensp;</k><a href="">Fazer Login</a><br><br>			
					<input type="submit" value="Enviar"><br>
					<k>Passo 2-3</k>
				</center>
			</form>


</body>
</html>