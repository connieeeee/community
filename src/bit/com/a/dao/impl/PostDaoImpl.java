package bit.com.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.com.a.dao.PostDao;
import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;

@Repository
public class PostDaoImpl implements PostDao {

	@Autowired
	SqlSession session;
	
	String ns = "post.";

	@Override
	public PostDto get_post(int post_seq) {
		return session.selectOne(ns + "get_post", post_seq);
	}
	
	@Override
	public void readcount(int post_seq) throws Exception {
		System.out.println("PostDaoImpl readcount");
		session.update(ns + "readcount", post_seq);
	}

	@Override
	public boolean writePost(PostDto dto) throws Exception {
		int n = session.insert(ns + "writePost", dto);
		return n>0?true:false;
	}

	@Override
	public List<PostDto> get_all_board_list(int category_seq) throws Exception {
		return session.selectList(ns + "get_all_board_list", category_seq);
	}

}
