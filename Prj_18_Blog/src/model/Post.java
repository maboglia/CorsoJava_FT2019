package model;

public class Post {

	private int postId, userId;
	private String title, body;
	
	
	public Post(int postId, int userId, String title, String body) {
		this.postId = postId;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}
	
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
	
}
