package bit.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bit.com.a.dto.AdminDto;
import bit.com.a.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService service;
	
	@RequestMapping(value = "admin",method= {RequestMethod.POST, RequestMethod.GET})
	public String admin(Model model) {
		return"admin-main.tiles";
	}
	
	@RequestMapping(value = "board_setting",method= {RequestMethod.POST, RequestMethod.GET})
	public String board_setting(Model model) {
		
		List<AdminDto> list = service.get_all_board_list();
		
		
		model.addAttribute("list", list);
		return"board_setting.tiles";
	}
	
	@ResponseBody
	@RequestMapping(value = "board_confirm",method= {RequestMethod.POST, RequestMethod.GET})
	public void board_confirm(String a, int board_seq, Model model) {
		System.out.println(a);
		service.board_conf_del(a, board_seq);
	}
	
}
