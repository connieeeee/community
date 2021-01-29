package bit.com.a.dto;

import java.io.Serializable;

public class AdminDto implements Serializable {

	private int board_seq;
	private int category_seq;
	private String category_name;
	private String board_name;
	private String board_inform;
	private int board_confirm;
	private int board_delete;
	private int user_seq;
	private String user_nickname;
	
	public AdminDto() {}

	public AdminDto(int board_seq, int category_seq, String category_name, String board_name, String board_inform,
			int board_confirm, int board_delete, int user_seq, String user_nickname) {
		super();
		this.board_seq = board_seq;
		this.category_seq = category_seq;
		this.category_name = category_name;
		this.board_name = board_name;
		this.board_inform = board_inform;
		this.board_confirm = board_confirm;
		this.board_delete = board_delete;
		this.user_seq = user_seq;
		this.user_nickname = user_nickname;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	public int getCategory_seq() {
		return category_seq;
	}

	public void setCategory_seq(int category_seq) {
		this.category_seq = category_seq;
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

	public String getBoard_inform() {
		return board_inform;
	}

	public void setBoard_inform(String board_inform) {
		this.board_inform = board_inform;
	}

	public int getBoard_confirm() {
		return board_confirm;
	}

	public void setBoard_confirm(int board_confirm) {
		this.board_confirm = board_confirm;
	}

	public int getBoard_delete() {
		return board_delete;
	}

	public void setBoard_delete(int board_delete) {
		this.board_delete = board_delete;
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
	
	
}
