package bit.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.MemberDao;
import bit.com.a.dto.MemberDto;
import bit.com.a.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao dao;
	
	@Override
	public List<MemberDto> allmember() {		
		return dao.allmember();
	}

	
}





