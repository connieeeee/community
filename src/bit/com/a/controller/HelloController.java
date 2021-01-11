package bit.com.a.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bit.com.a.dto.MemberDto;
import bit.com.a.service.MemberService;

@Controller
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	MemberService service;
	
	
	@RequestMapping("hello.do")
	public String hello() {
		logger.info("hello() " + new Date());
		
		return "hello";
	}
	
	
	/* 1 */
	/*
	@RequestMapping(value = "hello.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String hello(HttpServletRequest req, Model model) {
		logger.info("hello() " + new Date());
		
		List<MemberDto> list = service.allmember();		
		model.addAttribute("list", list);
		
		return "hello";
	}
	*/
	
	@ResponseBody
	@RequestMapping(value = "getMembers.do", method = {RequestMethod.GET, RequestMethod.POST})
	public List<MemberDto> getMembers(){
		logger.info("getMembers() " + new Date());
		
		List<MemberDto> list = service.allmember();	
		
		return list;
	}
	
}














