package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import Utilitarios.*;
import connection.SingleConnection;


public class DaoEmpreendedor {

	private Connection connection;

	public DaoEmpreendedor() {
		// CONSTRUTOR:
		connection = SingleConnection.getConection();
	}

	public void cadastroEmpreendedor(BeanEmpreendedor empreendedor) {
		try {
			PreparedStatement stmt = connection.prepareStatement(
					"insert into empreendedor(nome, dataNascimento, telefone, endereco, sexo, email, senha, foto) value(?,?,?,?,?,?,?,?)");
			stmt.setString(1, empreendedor.getNome());
			stmt.setString(2, empreendedor.getDataNascimento());
			stmt.setString(3, empreendedor.getTelefone());
			stmt.setString(4, empreendedor.getEndereco());
			stmt.setString(5, empreendedor.getSexo());
			stmt.setString(6, empreendedor.getEmail());
			stmt.setString(7, empreendedor.getSenha());
			stmt.setBlob(8, empreendedor.getImagem());

			stmt.execute();
			System.out.println("Passou em EMPREENDEDOR DAO!");
			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}

	}

	public boolean validarEmail(String usuaioLogado) throws Exception {
		PreparedStatement stmt = connection.prepareStatement("select * from empreendedor where email=?");
		stmt.setString(1, usuaioLogado);
		ResultSet rs = stmt.executeQuery();
		System.out.println("Passou EM VALIADAR EMAIL:");
		if (rs.next()) {
			// DEU CERTO:
			System.out.println("EMAIL VALIDO");
			return true;

		} else {
			// DEU ERRO:
			System.out.println("EMAIL INVALIDO");
			return false;

		}

	}

	public int codigoSeguraca() {
		Random radom = new Random();
		int numeroTmp = 0;
		for (int i = 0; i < 10; i++) {
			numeroTmp = radom.nextInt(20000);
			System.out.println(">" + numeroTmp);
		}
		return numeroTmp;

	}

	
	//INSERIR O CODIGO NO BANCO DE DADOS
		public void gravarCodigo(String usuarioLogado){
			
			int numeroGerado = codigoSeguraca();
			try {
				PreparedStatement stmt = connection.prepareStatement("insert into seguranca(codigo, email) value(?,?)");
				stmt.setInt(1, numeroGerado);
				stmt.setString(2, usuarioLogado);
				stmt.execute();
				connection.commit();
				
				
				System.out.println("passou em GRAVAR CODIGO");
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				try {
					connection.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//MANDAR NUMERO GERADO PARA SERVLET
				
				
			}
			System.out.println("VALOR FINAL DO CODIGO DO USUARIO  :"+numeroGerado);
			//ENVIAR EMAIL
	enviarEmail.enviarGmail(usuarioLogado, numeroGerado);
		
		}
		
		
		
		//VERIFICAR SE O CODIGO PERTENCE AO USUARIO
		public boolean validarCodigo(int codigoInformado)  throws Exception{
				
				PreparedStatement stmt = connection.prepareStatement("select * from seguranca where codigo=?");
				stmt.setInt(1, codigoInformado);
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next()){
					// DEU CERTO:
					return true;
				}else{
					// DEU ERRO:
					return false;
				}
				
			}


		
		public void salvarNovaSenha(String usuarioLogado, String novaSenha){
			   System.out.println("Nova seha que chegou aqui "+novaSenha);
			   try {
				PreparedStatement stmt = connection.prepareStatement("update empreendedor set senha = ? where email = ?");
				stmt.setString(1, novaSenha);
				stmt.setString(2, usuarioLogado);
				stmt.execute();
				System.out.println("passou aqui no dao nova senha");
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