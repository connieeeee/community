package bit.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.com.a.dto.MainDto;
import bit.com.a.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService service;
	
	@RequestMapping(value = "main",method= {RequestMethod.POST, RequestMethod.GET})
	public String main(Model model) {
		
		List<MainDto> list = service.get_all_post();
		
		model.addAttribute("list", list);
		return "main.tiles";
	}


}
