package bit.com.a.dto;

import java.io.Serializable;

public class BoardParam implements Serializable {
	
	private int board_seq;
	private int category_seq;
	
	private String choice;
	private String searchWord;
	
	// paging
	private int pageNumber = 0;	// 현재 페이지
	private int recordCountPerPage = 10;	// 표현할 페이지의 글수
	
	private int start = 1;
	private int end = 10;
	
	public BoardParam() {}

	public BoardParam(int board_seq, int category_seq, String choice, String searchWord, int pageNumber, int recordCountPerPage, int start, int end) {
		super();
		this.board_seq = board_seq;
		this.category_seq = category_seq;
		this.choice = choice;
		this.searchWord = searchWord;
		this.pageNumber = pageNumber;
		this.recordCountPerPage = recordCountPerPage;
		this.start = start;
		this.end = end;
	}

	public BoardParam(int board_seq, int category_seq) {
		super();
		this.board_seq = board_seq;
		this.category_seq = category_seq;
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

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	
}
