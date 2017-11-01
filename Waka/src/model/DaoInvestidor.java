package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import Utilitarios.*;
import connection.SingleConnection;


public class DaoInvestidor {

	private Connection connection;

	public DaoInvestidor() {
		// CONSTRUTOR:
		connection = SingleConnection.getConection();
	}
 public boolean login(BeanUsuario usuario)  throws Exception{
		
		PreparedStatement stmt = connection.prepareStatement("select * from investidor where email=? and senha=?");
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
 }
