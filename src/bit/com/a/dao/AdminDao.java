package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.AdminDto;

public interface AdminDao {

	public List<AdminDto> get_all_board_list();
	
	// 게시판 승인
	public void board_conf_del(String a, int board_seq);
}
