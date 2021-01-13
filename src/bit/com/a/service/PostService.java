package bit.com.a.service;

import java.util.List;

import bit.com.a.dto.PostDto;

public interface PostService {

	List<PostDto> get_all_post();
	PostDto get_post(int post_seq);
}
