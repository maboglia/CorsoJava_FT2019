package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Post;
import model.User;

public class PostDAO {

	public ArrayList<Post> getAll(){
		
		String sql = "select * from posts";
		ArrayList<Post> posts = new ArrayList<>();
		Statement stat;
		ResultSet rs;
		
		Database.connetti();
		try {
			stat = Database.getMiaConn().createStatement();
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				
				Post temp = new Post(rs.getInt("post_id"), rs.getInt("user_id"), rs.getString("title"), rs.getString("body"));
				posts.add(temp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Database.chiudi();
		return posts;
	}
	
	public static void main(String[] args) {
		PostDAO ud = new PostDAO();
		
		for (Post post : ud.getAll()) {
			System.out.println(post.getTitle());
		}
	}
}
