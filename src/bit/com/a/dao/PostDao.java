package bit.com.a.dao;

import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;

public interface PostDao {


	public PostDto get_post(int post_seq);
	
	// 게시판 조회수
	public void readcount(int post_seq) throws Exception;
	
	public boolean writePost(PostDto dto) throws Exception;
	
}
