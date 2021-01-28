package bit.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.com.a.dto.BoardDto;
import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;
import bit.com.a.service.BoardService;
import bit.com.a.service.MainService;
import bit.com.a.service.PostService;

@Controller
public class BoardController {

	@Autowired
	BoardService service;

	
	@RequestMapping(value = "list",method= {RequestMethod.POST, RequestMethod.GET})
	public String list(int category_seq, Model model) {
		
		List<BoardDto> list = service.get_board_list(category_seq);
		List<MainDto> post = service.get_board_post(category_seq);
		
		
		model.addAttribute("cate_seq", category_seq);
		model.addAttribute("list", list);
		model.addAttribute("post", post);
		
		return "list.tiles";
	}
	
	@RequestMapping(value = "board",method= {RequestMethod.POST, RequestMethod.GET})
	public String board(int board_seq, Model model) {
			
		
		return "list.tiles";
	}
}
