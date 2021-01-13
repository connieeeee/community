package bit.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.PostDao;
import bit.com.a.dto.PostDto;
import bit.com.a.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao dao;
	
	@Override
	public List<PostDto> get_all_post() {
		return dao.get_all_post();
	}

	@Override
	public PostDto get_post(int post_seq) {
		return dao.get_post(post_seq);
	}

}
