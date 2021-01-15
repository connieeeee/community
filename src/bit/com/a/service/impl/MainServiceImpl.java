package bit.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.MainDao;
import bit.com.a.dto.MainDto;
import bit.com.a.service.MainService;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	MainDao dao;
	
	@Override
	public List<MainDto> get_all_post() {
		return dao.get_all_post();
	}

	@Override
	public MainDto get_post(int post_seq) {
		return dao.get_post(post_seq);
	}

}
