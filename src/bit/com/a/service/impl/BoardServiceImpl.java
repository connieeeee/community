package bit.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.BoardDao;
import bit.com.a.dto.BoardDto;
import bit.com.a.dto.BoardParam;
import bit.com.a.dto.MainDto;
import bit.com.a.service.BoardService;
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public List<BoardDto> get_cate_list(int category_seq) {
		return dao.get_cate_list(category_seq);
	}

	@Override
	public List<MainDto> get_board_post(int category_seq) {
		return dao.get_board_post(category_seq);
	}

	@Override
	public List<MainDto> get_board_list(BoardParam param) {
		return dao.get_board_list(param);
	}

	@Override
	public void add_board(BoardDto dto) {
		dao.add_board(dto);
	}

	@Override
	public int get_board_count(BoardParam param) {
		return dao.get_board_count(param);
	}
}
