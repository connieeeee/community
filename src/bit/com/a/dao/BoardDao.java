package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.BoardDto;
import bit.com.a.dto.MainDto;

public interface BoardDao {

 	List<BoardDto> get_cate_list(int category_seq);
 	List<MainDto> get_board_post(int category_seq);

 	List<MainDto> get_board_list(int board_seq);
}
