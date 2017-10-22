<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>Identificação Nivel</title>
</head>
<body>
	<h1>Identificação Nivel</h1>
	<form action="" method="post">

		<table>
			<tr>
					<td>Possui Funcionarios?</td>
			</tr>
			<tr>
				
					<td><input type="radio" required="required" id="funcionarioSim"
						name="funcionarioSim" value="sim">Sim
					<input type="radio" required="required" id="funcionarioNao"
					name="funcionarioNao" value="nao" checked="checked">Não</td>
			
			</tr>
			
			<tr>
				<td>Possui Clientes?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required" id="clienteS"
					name="clienteS" value="sim">Sim
				<input type="radio" required="required" id="clienteN"
					name="clienteN" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
				<td>Possui Receita Bruta?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required" id="receitaBrutaS"
					name="receitaBrutaS" value="sim">Sim
				<input type="radio" required="required" id="receitaBrutaN"
					name="receitaBrutaN" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
				<td>Possui Receita Liquida?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required"
					id="receitaLiquidaS" name="receitaLiquidaS" value="sim">Sim
				<input type="radio" required="required"
					id="receitaLiquidaN" name="receitaLiquidaN" value="nao"
					checked="checked">Não</td>
			</tr>
			<tr>
				<td>Possui Protifolio de Produtos?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required"
					id="portifolioProdutoS" name="portifolioProdutoS" value="sim">Sim
				<input type="radio" required="required"
					id="portifolioProdutoN" name="portifolioProdutoN" value="nao"
					checked="checked">Não</td>
			</tr>
			<tr>
				<td>Ja lançou produtos novos?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required" id="produtoNovoS"
					name="portifolioProdutoS" value="sim">Sim
				<input type="radio" required="required" id="produtoNovoN"
					name="produtoNovoN" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
				<td>Ja vendeu produtos novos?</td>
			</tr>
			<tr>
				<td><input type="radio" required="required"
					id="vendaProdutoNovoS" name="vendaProdutoNovoS" value="sim">Sim
				<input type="radio" required="required"
					id="vendaProdutoNovoN" name="vendaProdutoNovoN" value="nao"
					checked="checked">Não</td>
			</tr>
			<tr>
			<td>Ja participou de eventos realizados pela waka?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required"
				id="paticipouEventoS" name="paticipouEventoS" value="sim">Sim
			<input type="radio" required="required"
				id="paticipouEventoN" name="paticipouEventoN" value="nao"
				checked="checked">Não</td>
			</tr>
			<tr>
			<td>Ja teve lucros com novos produtos?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required"
				id="lucroProdutoNovoS" name="lucroNovoProdutoS" value="sim">Sim
			<input type="radio" required="required"
				id="lucroProdutoNovoN" name="lucroProdutoNovoN" value="nao"
				checked="checked">Não</td>
			</tr>
			<tr>
			<td>Possui Capital Social?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required" id="capitalSoacialS"
				name="capitalSoacialS" value="sim">Sim
			<input type="radio" required="required" id="capitalSoacialN"
				name="capitalSoacialN" value="nao" checked="checked">Não</td>
			</tr>
			<tr>
			<td>Possui Valuation?</td>
			</tr>
			<tr>
			<td><input type="radio" required="required" id="valuationS"
				name="valuationS" value="sim">Sim
			<input type="radio" required="required" id="valuationN"
				name="valuationN" value="nao" checked="checked">Não</td>
				</tr>
				<tr></tr>
			<tr><td><input type="submit" value="Cadastrar"></td></tr>

		</table>
	</form>

</body>
</html>