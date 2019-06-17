package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {


	private static final String DB_URL = "jdbc:mysql://localhost/java_19";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	private static Connection miaConn = null;

	public static Connection connetti() {
		
		//1 ricevi la connessione al db
		try {
			miaConn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return miaConn;
	}
	
	public static Connection getMiaConn() {
		return miaConn;
	}
	
	public static void chiudi() {
		
		try {
			miaConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
}
