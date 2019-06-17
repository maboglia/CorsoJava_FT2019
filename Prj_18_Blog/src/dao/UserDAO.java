package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.User;

public class UserDAO {

	public User getById(int id) {
		
		String sql = "select * from users where user_id = " + id;
		User temp=null;
		Statement stat;
		ResultSet rs;
		Database.connetti();
		try {
			stat = Database.getMiaConn().createStatement();
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				temp = new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Database.chiudi();
		return temp;
	}

	
	
	public ArrayList<User> getAll(){
		
		String sql = "select * from users";
		ArrayList<User> utenti = new ArrayList<>();
		Statement stat;
		ResultSet rs;
		
		Database.connetti();
		try {
			stat = Database.getMiaConn().createStatement();
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				User temp = new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email"));
				utenti.add(temp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Database.chiudi();
		return utenti;
	}
	
	public static void main(String[] args) {
		UserDAO ud = new UserDAO();
		
		for (User utente : ud.getAll()) {
			System.out.println(utente.getUsername());
		}
	}
}
