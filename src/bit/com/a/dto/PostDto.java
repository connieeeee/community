package bit.com.a.dto;

import java.io.Serializable;

public class PostDto implements Serializable {

	private int post_seq;
	private int board_seq;
	private int user_seq;
	private String post_title;
	private String post_content;
	private String post_image;
	private String wdate;
	private String category_name;
	private String user_nickname;
	private int delete;
	private String board_name;
	
	
	public PostDto() {}


	public PostDto(int post_seq, int board_seq, int user_seq, String post_title, String post_content, String post_image,
			String wdate, String category_name, String user_nickname, int delete, String board_name) {
		super();
		this.post_seq = post_seq;
		this.board_seq = board_seq;
		this.user_seq = user_seq;
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_image = post_image;
		this.wdate = wdate;
		this.category_name = category_name;
		this.user_nickname = user_nickname;
		this.delete = delete;
		this.board_name = board_name;
	}


	public PostDto(int board_seq, int post_seq, String user_nickname, String post_title, int delete, String wdate) {
		super();
		this.board_seq = board_seq;
		this.post_seq = post_seq;
		this.user_nickname = user_nickname;
		this.post_title = post_title;
		this.delete = delete;
		this.wdate = wdate;
	}

	public PostDto(int user_seq, String user_nickname, String post_title, String post_content, String post_image) {
		super();
		this.user_seq = user_seq;
		this.user_nickname = user_nickname;
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_image = post_image;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	public int getPost_seq() {
		return post_seq;
	}

	public void setPost_seq(int post_seq) {
		this.post_seq = post_seq;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public String getPost_image() {
		return post_image;
	}

	public void setPost_image(String post_image) {
		this.post_image = post_image;
	}

	public int getDelete() {
		return delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	
	
}
