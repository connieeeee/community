package bit.com.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dao.BoardDao;
import bit.com.a.dto.BoardDto;
import bit.com.a.dto.BoardParam;
import bit.com.a.dto.MainDto;
@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	SqlSession session;
	
	String ns = "board.";
	
	@Override
	public List<BoardDto> get_cate_list(int category_seq) {
		List<BoardDto> list = session.selectList(ns + "get_cate_list", category_seq);
		return list;
	}

	@Override
	public List<MainDto> get_board_post(int category_seq) {
		List<MainDto> list = session.selectList(ns + "get_board_post", category_seq);
		return list;
	}

	@Override
	public List<MainDto> get_board_list(BoardParam param) {
		List<MainDto> list = session.selectList(ns + "get_board_list", param);
		return list;
	}

	@Override
	public void add_board(BoardDto dto) {
		session.insert(ns + "add_board", dto);
	}

	@Override
	public int get_board_count(BoardParam param) {
		return session.selectOne(ns + "get_board_count", param);
	}

}
