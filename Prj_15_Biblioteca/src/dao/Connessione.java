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
	private Statement mioStat = null;
	private ResultSet rs = null;
	
	public Connessione() {

		
	
	}
	
	public void connetti() {
		
		//1 ricevi la connessione al db
		try {
			miaConn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void eseguiScrittura(String sql) {
		try {
			//2 creo uno statement
			mioStat = miaConn.createStatement();
			
			//3 passo la richiesta allo stat
			int res = mioStat.executeUpdate(sql);
			
			System.out.println("record modificati: " + res);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void chiudi() {
		
		try {
			mioStat.close();
			miaConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connessione conn = new Connessione();
		
		conn.connetti();
		conn.eseguiScrittura("insert into libro (titolo, libro_id, prezzo) values('Fango', 1, 10) ");
		conn.chiudi();
		
	}
	
}
