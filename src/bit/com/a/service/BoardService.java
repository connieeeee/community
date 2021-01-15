package bit.com.a.service;

import java.util.List;

import bit.com.a.dto.BoardDto;
import bit.com.a.dto.MainDto;

public interface BoardService {

 	List<BoardDto> get_board_list(int category_seq);
 	List<MainDto> get_board_post(int category_seq);
 	
}
