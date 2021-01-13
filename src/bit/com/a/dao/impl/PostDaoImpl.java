package bit.com.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dao.PostDao;
import bit.com.a.dto.PostDto;

@Repository
public class PostDaoImpl implements PostDao {

	@Autowired
	SqlSession session;
	
	String ns = "post.";
	
	
	@Override
	public List<PostDto> get_all_post() {
		return session.selectList(ns + "get_all_post");
	}


	@Override
	public PostDto get_post(int post_seq) {
		return session.selectOne(ns + "get_post", post_seq);
	}

}
