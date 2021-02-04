package bit.com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.com.a.dto.BoardDto;
import bit.com.a.dto.BoardParam;
import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;
import bit.com.a.service.BoardService;
import bit.com.a.service.MainService;
import bit.com.a.service.PostService;

@Controller
public class BoardController {

	@Autowired
	BoardService service;

	
	@RequestMapping(value = "list1",method= {RequestMethod.POST, RequestMethod.GET})
	public String list(int category_seq, Model model) {
		
		List<BoardDto> list = service.get_cate_list(category_seq);
		List<MainDto> post = service.get_board_post(category_seq);
		
		
		model.addAttribute("cate_seq", category_seq);
		model.addAttribute("list", list);
		model.addAttribute("post", post);
		
		return "list.tiles";
	}
	
	@RequestMapping(value = "board",method= {RequestMethod.POST, RequestMethod.GET})
	public String board(BoardParam param, Model model) {
		
		System.out.println("board: board " + param.getBoard_seq() + "; cate " + param.getCategory_seq());

		
		List<BoardDto> list = service.get_cate_list(param.getCategory_seq());
		List<MainDto> post = service.get_board_list(param);
		
//		System.out.println("board: title " + post.get(0).getPost_title());

		// paging 처리
		int sn = param.getPageNumber();		// 현재 페이지
		int start = sn * param.getRecordCountPerPage() + 1;	// 1 11 21
		int end = (sn + 1) * param.getRecordCountPerPage();	// 10 20 30
		
		param.setStart(start);
		param.setEnd(end);
				
		// 글의 총수
		int totalRecordCount = service.get_board_count( param );
		

		model.addAttribute("cate_seq", param.getCategory_seq());
		model.addAttribute("post", post);
		model.addAttribute("list", list);
				
		
		model.addAttribute("pageNumber", sn);
		model.addAttribute("pageCountPerScreen", 10);
		model.addAttribute("recordCountPerPage", param.getRecordCountPerPage());
		model.addAttribute("totalRecordCount", totalRecordCount);
		
		model.addAttribute("choice", param.getChoice());
		model.addAttribute("searchWord", param.getSearchWord());
		
		return "list.tiles";
	}
	
	@RequestMapping(value = "new_board",method= {RequestMethod.POST, RequestMethod.GET})
	public String new_board(String board_name, Model model) {
		return "newboard.tiles";
	}
	
	@RequestMapping(value = "add_board",method= {RequestMethod.POST, RequestMethod.GET})
	public String add_board(BoardDto dto, Model model) {
		service.add_board(dto);
		return "redirect:/main";
	}
}
