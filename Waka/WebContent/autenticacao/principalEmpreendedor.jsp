<%@include file="cabeçalho.jsp"%>


<body>
<!-- Teste Usuario Logado -->

<h1>Bem vindo</h1>

<!--EXEBIR USUARIOS NA SESSÃO  -->
<p>Usuario Logado: <%=session.getAttribute("sessaoAdministrador") %></p>
</body>
</html>