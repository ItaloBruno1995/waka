package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnection;

public class DaoAdministrador extends BeanUsuario {

	private Connection connection;

	public DaoAdministrador() {
		connection = SingleConnection.getConection();
	}

	public boolean login(BeanUsuario usuario)  throws Exception{
		
		PreparedStatement stmt = connection.prepareStatement("select * from administrador where email=? and senha=?");
		stmt.setString(1, usuario.email);
		stmt.setString(2, usuario.senha);
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()){
			// DEU CERTO:
			return true;
		}else{
			// DEU ERRO:
			return false;
		}
		

	}
	//METODO PARA SETAR ID:
	

}//FIM DA CLASSE
