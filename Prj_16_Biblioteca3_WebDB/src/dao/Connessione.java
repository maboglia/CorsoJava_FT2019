package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connessione {

	private final String DB_URL = "jdbc:mysql://localhost/java_19";
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	
	private Connection miaConn = null;

	public Connection connetti() {
		
		//1 ricevi la connessione al db
		try {
			miaConn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return miaConn;
	}
	
	public Connection getMiaConn() {
		return miaConn;
	}
	
	public void chiudi() {
		
		try {
			miaConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
