package bit.com.a.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;

public interface PostService {
	

	public PostDto get_post(int post_seq) throws Exception;

	public boolean writePost (PostDto dto) throws Exception;

}
