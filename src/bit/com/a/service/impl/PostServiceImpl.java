package bit.com.a.service.impl;

import java.io.File;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import bit.com.a.dao.PostDao;
import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;
import bit.com.a.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao dao;
	
	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public PostDto get_post(int post_seq) throws Exception {
			dao.readcount(post_seq);
		return dao.get_post(post_seq);
	}

	@Override
	public boolean writePost(PostDto dto) throws Exception {
		return dao.writePost(dto);
	}

}
