package model;

public class Comment {

	private int commentId, postId, userId;
	private String body;
	
	
	public Comment(int commentId, int postId, int userId, String body) {
		this.commentId = commentId;
		this.postId = postId;
		this.userId = userId;
		this.body = body;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
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
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
	
}
