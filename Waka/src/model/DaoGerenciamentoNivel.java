package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnection;

public class DaoGerenciamentoNivel {
	private Connection connection;
	
	public DaoGerenciamentoNivel() {
	
		connection = SingleConnection.getConection();
	}
	
	
	public int calcularNivelInicial(BeanGerenciamentoNivel nivel){
		int pontos =0;
		pontos= nivel.getCliente()+nivel.getFuncionario()+nivel.getReceitaBruta()+nivel.getReceitaLiquida()+
				nivel.getPortifoleProdutos()+nivel.getlProdutosNovos()+nivel.getvProdutosNovos()+nivel.lucosProdutos+
				nivel.getEventos()+nivel.getCapitalSocial()+nivel.getValuation();
		return pontos;
	}
	
	public void salvarInicial(BeanGerenciamentoNivel  nivel, BeanUsuario usuario) {
		int pontos = calcularNivelInicial(nivel);
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("update empresa set nivel =? where idEmpreendedor = ?");
			stmt.setInt(1, pontos);
			stmt.setString(2, usuario.getEmail());
			stmt.execute();
			System.out.println("TOTAL DE PONTOS REGISTRADO: "+pontos);
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}	
	
}
