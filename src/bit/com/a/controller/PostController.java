package bit.com.a.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import bit.com.a.dto.MainDto;
import bit.com.a.dto.PostDto;
import bit.com.a.service.PostService;
import bit.com.a.util.PdsUtil;

@Controller
public class PostController {

	@Autowired
	PostService service;
	

	@RequestMapping(value = "detail",method= {RequestMethod.POST, RequestMethod.GET})
	public String detail(int post_seq, Model model, HttpServletRequest request) throws Exception {
		
		String realFolder = request.getSession().getServletContext().getRealPath("profileUpload");
		
		System.out.println(realFolder);
		
		PostDto dto = service.get_post(post_seq);
		
		model.addAttribute("post", dto);
		
		return "detail.tiles";
	}
	
	
	@RequestMapping(value = "write",method= {RequestMethod.POST, RequestMethod.GET})
	public String write(int category_seq, Model model) throws Exception {
		
		List<PostDto> list = service.get_all_board_list(category_seq);

		model.addAttribute("list", list);
		model.addAttribute("name", list.get(0).getCategory_name());
		model.addAttribute("category_seq", category_seq);
		
		return "write.tiles";
	}
	
	@RequestMapping(value = "writeAf", method = {RequestMethod.GET, RequestMethod.POST})
	public String writeAf(PostDto dto, Model m, @RequestParam(value = "fileload", required = false)MultipartFile fileload, 
			HttpServletRequest req) throws Exception {
		
		System.out.println("dto: " + dto.getBoard_seq());
		
		// filename 취득
		String filename = fileload.getOriginalFilename();
		dto.setOld_filename(filename);
		
		// upload 경로 설정
		// server
		String fupload = req.getServletContext().getRealPath("/upload");
		
		// 폴더
//		String fupload = "C:\\AA\\tmp";
		
		System.out.println("fupload: " + fupload);
		
		// file명 취득
		String f = dto.getOld_filename();
		String newfilename = PdsUtil.getNewFileName(f);
		
		dto.setPost_image(newfilename);
		dto.setUser_seq(1);
		
		File file = new File(fupload + "/" + newfilename);
		
		try {
			// 실제로 파일이 업로드되는 부분
			FileUtils.writeByteArrayToFile(file, fileload.getBytes());
			
			// db에 저장
			service.writePost(dto);
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		m.addAttribute("category_seq", dto.getCategory_seq());
		
		return "redirect:/list";
	}



}
