package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;

public interface PostDao {


	public PostDto get_post(int post_seq);
	
	// 게시판 조회수
	public void readcount(int post_seq) throws Exception;
	
	public boolean writePost(PostDto dto) throws Exception;
	
	public List<PostDto> get_all_board_list(int category_seq) throws Exception;
}
