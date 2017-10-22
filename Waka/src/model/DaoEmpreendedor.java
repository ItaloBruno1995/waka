package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.SingleConnection;

public class DaoEmpreendedor {
	
	
	private Connection connection;

	 public DaoEmpreendedor() {
		// CONSTRUTOR:
		 connection= SingleConnection.getConection();
	}
	
	 public void cadastroEmpreendedor(BeanEmpreendedor empreendedor){
		 try {
			PreparedStatement stmt = connection.prepareStatement("insert into empreendedor(nome, dataNascimento, telefone, endereco, sexo, email, senha) value(?,?,?,?,?,?,?)");
			stmt.setString(1, empreendedor.getNome());
			stmt.setString(2, empreendedor.getDataNascimento());
			stmt.setString(3, empreendedor.getTelefone());
			stmt.setString(4, empreendedor.getEndereco());
			stmt.setString(5, empreendedor.getSexo());
			stmt.setString(6, empreendedor.getEmail());
			stmt.setString(7, empreendedor.getSenha());
			
			stmt.execute();
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
	 
	 
	 public void buscarIdEmpreendedor(BeanEmpreendedor empreendedor){
		
		 try {
			 //PROCURAR PELO ID(PELO EMAIL)
			PreparedStatement stmt = connection.prepareStatement("select * from empreendedor where email=? ");
			stmt.setString(1, empreendedor.getEmail());
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				//SETAR O CAMPO ID (QUANDO LOCALIZAR)
				empreendedor.setId(rs.getInt("idEmpreendedor"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 
	 }
	
}
