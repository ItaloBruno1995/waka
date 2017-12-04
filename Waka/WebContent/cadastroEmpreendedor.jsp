<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
	<meta charset="utf-8">
	<title>Cadastro Empreendedor</title>
	<!-- DECLARAÇÃO JQUERY JAVA SCRIPT -->
<script type="text/javascript" src=" https://code.jquery.com/jquery-3.2.1.min.js"></script>

	<link rel="stylesheet" href="css/gridCadastro.css">
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
					<p>empreendedor</p>
				</div>
			</div>
		    <div class="box formulario">
		        	<form class="formFormulario" action="CadastroUsuarioServlet" method="post">
		        		<table>
		        		<tr>
		        			<td>Comece com uma foto</td>
		        		</tr>
		        		<!-- Buscar imagem -->
		        		  	<tr>
		        				<td><input type="file" id="file" name="file" onchange="uploadFile();"/></td>
		        			</tr>
		        			
		        			<!-- Carregar Imagem -->
		        			<tr>
		
							<img alt="Imagem" name="foto" src="" id="target" width="200" height="200" >
			
							</tr>
		        			
		        			
		        			
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
										<td><input type="tel" id="telefone" name="telefone" pattern="\(\d{2}\)\d{5}-\d{4}" placeholder="Telefone - (xx) xxxxx-xxxx" required="required"></td>
									</tr>
									<tr>
										<td><input type="text" id="endereco" name="endereco" placeholder="Endereço" required="required"></td>
									</tr>
									<tr>
		                <td>Data de Nascimento</td>
		                   </tr>
		        			<tr>
		        				<td><input type="date" name="dataNascimento" pattern="[0-9]{2}\/[0-9]{2}\/[0-9]{4}$" placeholder=" xx/xx/xxxx" required="required"></td>
		        			</tr>
		        			
		        		</table>
		        		<br/>
		        		<button class="botao" type="submit" name="button" value="proximo">proximo</button>
		        	</form>
		      </div>
		      <div class="progresso">
		      	<div class="divProgresso">
			      	<div class="bola primeiro">
			      		
			      	</div>
			      	<div class="bola segundo">
			      		
			      	</div>
			      	<div class="bola terceiro">
			      		
			      	</div>
			    </div>
		      </div>
  		</div>
	
</body>

<!-- FUNÇÃO JAVASCRIP -->
<script type="text/javascript">
function uploadFile() {
	


var target =document.querySelector("img");
var file= document.querySelector("input[type=file]").files[0];

var reader= new  FileReader();

reader.onload = function () {
	target.src= reader.result;

	//-------------------------------------
	//ARQUIVO CORRETO FAZER UPLOAD: COM AJAX:
	
	$.ajax({
			method: "POST",
			url: "EmpreendedorCadstroServlet",//CHAMAR A SERVLET
			data: {fileUpload : reader.result} //recebe a imagem
		}).done(function(response) {
			alert("Sucesso: "+response);
		}).fail(function(xhr, status, erroThrown) {
			alert("ERRO: "+ xhr.responseText);
		});
	
	
};

if(file){
reader.readAsDataURL(file);
		
}else {
	
  target.src="";
  
}
}

</script>

</html>
