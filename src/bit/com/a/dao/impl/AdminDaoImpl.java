package bit.com.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dao.AdminDao;
import bit.com.a.dto.AdminDto;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	SqlSession session;
	
	String ns = "admin.";
	
	@Override
	public List<AdminDto> get_all_board_list() {
		List<AdminDto> list = session.selectList(ns + "get_all_board_list");
		return list;
	}

}
