<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>Identificação Nivel</title>
</head>
<body>
	<h1>Identificação Nivel</h1>
	<form action="IdentificarNivelServlet" method="get">

		<table>
			<tr>
					<td>Possui Funcionarios?</td>
			</tr>
			<tr>
				
					<td><input type="radio" required="required" id="funcionarioSim"
						name="funcionario" value="sim">Sim
					<input type="radio" required="required" id="funcionarioNao"
					name="funcionario" value="nao" checked="checked">Não</td>
			
			</tr>
			
			<tr>
				<td>Possui Clientes?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required" id="clienteS"
					name="cliente" value="sim">Sim
				<input type="radio" required="required" id="clienteN"
					name="cliente" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
				<td>Possui Receita Bruta?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required" id="receitaBrutaS"
					name="receitaBruta" value="sim">Sim
				<input type="radio" required="required" id="receitaBrutaN"
					name="receitaBruta" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
				<td>Possui Receita Liquida?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required"
					id="receitaLiquidaS" name="receitaLiquida" value="sim">Sim
				<input type="radio" required="required"
					id="receitaLiquidaN" name="receitaLiquida" value="nao"
					checked="checked">Não</td>
			</tr>
			<tr>
				<td>Possui Protifolio de Produtos?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required"
					id="portifolioProdutoS" name="portifolioProduto" value="sim">Sim
				<input type="radio" required="required"
					id="portifolioProdutoN" name="portifolioProduto" value="nao"
					checked="checked">Não</td>
			</tr>
			<tr>
				<td>Ja lançou produtos novos?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required" id="produtoNovo"
					name="produtoNovo" value="sim">Sim
				<input type="radio" required="required" id="produtoNovo"
					name="produtoNovo" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
				<td>Ja vendeu produtos novos?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required"
					id="vendaProdutoNovoS" name="vendaProdutoNovo" value="sim">Sim
				<input type="radio" required="required"
					id="vendaProdutoNovoN" name="vendaProdutoNovo" value="nao"
					checked="checked">Não</td>
			</tr>
			<tr>
			<td>Ja participou de eventos realizados pela waka?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required"
				id="paticipouEventoS" name="paticipouEvento" value="sim">Sim
			<input type="radio" required="required"
				id="paticipouEventoN" name="paticipouEvento" value="nao"
				checked="checked">Não</td>
			</tr>
			<tr>
			<td>Ja teve lucros com novos produtos?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required"
				id="lucroProdutoNovoS" name="lucroNovoProduto" value="sim">Sim
			<input type="radio" required="required"
				id="lucroProdutoNovoN" name="lucroNovoProduto" value="nao"
				checked="checked">Não</td>
			</tr>
			<tr>
			<td>Possui Capital Social?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required" id="capitalSoacialS"
				name="capitalSoacial" value="sim">Sim
			<input type="radio" required="required" id="capitalSoacialN"
				name="capitalSoacial" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
			<td>Possui Valuation?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required" id="valuationS"
				name="valuation" value="sim">Sim
			<input type="radio" required="required" id="valuationN"
				name="valuation" value="nao" checked="checked">Não</td>
				</tr>
				<tr></tr>
			<tr><td><input type="submit" value="Cadastrar"></td></tr>

		</table>
	</form>

</body>
</html>