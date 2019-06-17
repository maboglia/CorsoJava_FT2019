package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Comment;

public class CommentDAO {


	public ArrayList<Comment> getAll(){
		
		String sql = "select * from comments";
		ArrayList<Comment> commenti = new ArrayList<>();
		Statement stat;
		ResultSet rs;
		
		Database.connetti();
		try {
			stat = Database.getMiaConn().createStatement();
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				Comment temp = new Comment(rs.getInt("comment_id"), rs.getInt("post_id"), rs.getInt("user_id"), rs.getString("body"));
				commenti.add(temp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Database.chiudi();
		return commenti;
	}
	
	public static void main(String[] args) {
		CommentDAO ud = new CommentDAO();
		
		for (Comment commento : ud.getAll()) {
			System.out.println(""+commento.getPostId() + commento.getUserId() +commento.getBody());
		}
	}
	
	
}
