<%@include file="cabe�alho.jsp"%>


<body>
<!-- Teste Usuario Logado -->

<h1>Bem vindo</h1>

<!--EXEBIR USUARIOS NA SESS�O  -->
<p>Usuario Logado: <%=session.getAttribute("sessaoAdministrador") %></p>
</body>
</html>