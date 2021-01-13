package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.PostDto;

public interface PostDao {

	List<PostDto> get_all_post();
	PostDto get_post(int post_seq);
	
}
