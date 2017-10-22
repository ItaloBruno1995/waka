package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.SingleConnection;

public class DaoEmpresa {

	private Connection connection;

	public DaoEmpresa() {
		connection = SingleConnection.getConection();
	}

	public void cadastraEmpresa(BeanEmpresa empresa, BeanEmpreendedor empreendedor) {
		int nivelInicial=0;
		try {
			PreparedStatement stmt = connection.prepareStatement("insert into empresa(nome, nivel, ramoAtuacao, razaoSocial, cnpj, idEmpreendedor) value(?, ?, ?, ?, ?, ?)");
			stmt.setString(1, empresa.getNome());
			stmt.setInt(2,nivelInicial);//SETAR NIVEL COM ZERO (CADASTRO)
			stmt.setString(3, empresa.getRamoAtuacao());
			stmt.setString(4, empresa.getRazaoSocial());
			stmt.setString(5, empresa.getCnpj());
			stmt.setString(6, empreendedor.getEmail());
			
			
			
			stmt.execute();
			System.out.println("PASSOU EMPRESA DAO!");
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
