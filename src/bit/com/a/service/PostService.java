package bit.com.a.service;

import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;

public interface PostService {
	

	public PostDto get_post(int post_seq) throws Exception;

}
