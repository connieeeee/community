package bit.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.com.a.dto.PostDto;
import bit.com.a.service.PostService;

@Controller
public class PostController {
	
	@Autowired
	PostService service;
	
	@RequestMapping(value = "main",method= {RequestMethod.POST, RequestMethod.GET})
	public String main(Model model) {
		
		List<PostDto> list = service.get_all_post();
		
		model.addAttribute("list", list);
		return "main.tiles";
	}

	@RequestMapping(value = "detail",method= {RequestMethod.POST, RequestMethod.GET})
	public String detail(int post_seq, Model model) {
		
		PostDto dto = service.get_post(post_seq);
		
		model.addAttribute("post", dto);
		
		return "detail.tiles";
	}
}
