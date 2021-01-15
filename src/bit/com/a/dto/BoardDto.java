package bit.com.a.dto;

import java.io.Serializable;

public class BoardDto implements Serializable {

	private int board_seq;
	private int category_seq;
	private String board_inform;
	private int board_confirm;
	private int board_delete;
	private String board_name;
	
	private String category_name;
	
	public BoardDto() {}

	public BoardDto(int board_seq, int category_seq, String board_inform, int board_confirm, int board_delete,
			String board_name, String category_name) {
		super();
		this.board_seq = board_seq;
		this.category_seq = category_seq;
		this.board_inform = board_inform;
		this.board_confirm = board_confirm;
		this.board_delete = board_delete;
		this.board_name = board_name;
		this.category_name = category_name;
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

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	
	
}
