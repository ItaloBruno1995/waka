<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
  <meta charset="utf-8">
	<title>Waka - Jornada do empreendedor</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="Waka Coworking app - Jornada do empreendedor. Aplicativo para aceleração de startups">
  <meta name="keywords" content="Waka, Empreendedor, Aceleração, App, Aplicativo">
  <link rel="icon" href="img/logoSimples.png">
	<link rel="stylesheet" type="text/css" href="css/reset.css">
  <link rel="stylesheet" type="text/css" href="css/grid.css">
  <link rel="stylesheet" type="text/css" href="css/logo.css">
  <link rel="stylesheet" type="text/css" href="css/mediaQueries.css">
	<style>
	</style>
</head>
<body>
	<div class="container-box">
      	<div class="box Filhologo">
    		<div class="logo">
    			<img src="img/logoPreto.png" alt="Waka Coworking - espaço compartilhado">
    		</div>
        </div>
    	<div class="box FilhoBemVindo">
        	<p>Bem Vindo</p>
        	<p>A jornada do empreededor</p>
    	</div>
    	<div class="box btn-Empreendedor">
    	 	<div class="btn-div ">
	    	 	 <form  action="cadastroEmpreendedor.jsp">
		         	<button class="botao empre" >Cadastro Empreendedor</button>
		         </form>
    	 	</div>
	     </div>
	     <div class="textoDivisoria">
	     	<p>OU</p>
	     </div>
	    <div class="box btn-Investidor">
    	 	<div class="btn-div ">
	    	 	 <form  action="cadastroInvestidor.jsp">
		         	<button class="botao inve" >Cadastro Investidor</button>
		         </form>
		    </div>
    	</div>
	     <div class="box textoLogin">
	     	<p>Já possui uma conta?</p>
	     </div>
	     <div class="box btn-login">
    	 	<div class="btn-divLogin">
	    	 	 <form  action="login.jsp">
		         	<button class="botaoLogin inve" >Login</button>
		         </form>
		    </div>
    	</div>
	</div>
</body>
</html>
