package bit.com.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dao.MainDao;
import bit.com.a.dto.MainDto;

@Repository
public class MainDaoImpl implements MainDao {

	@Autowired
	SqlSession session;
	
	String ns = "main.";
	
	
	@Override
	public List<MainDto> get_all_post() {
		return session.selectList(ns + "get_all_post");
	}


}
