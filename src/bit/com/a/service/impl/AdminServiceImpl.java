package bit.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.AdminDao;
import bit.com.a.dto.AdminDto;
import bit.com.a.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;
	
	@Override
	public List<AdminDto> get_all_board_list() {
		return dao.get_all_board_list();
	}

	@Override
	public void board_conf_del(String a, int board_seq) {
		System.out.println("service imple" + a);
		dao.board_conf_del(a, board_seq);
	}

}
