package bit.com.a.dao;

import java.util.List;

import bit.com.a.dto.MainDto;

public interface MainDao {

	List<MainDto> get_all_post();
	MainDto get_post(int post_seq);
	
}
