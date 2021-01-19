package bit.com.a.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String detail(int post_seq, Model model) throws Exception {
		
		PostDto dto = service.get_post(post_seq);
		
		model.addAttribute("post", dto);
		
		return "detail.tiles";
	}
	
	/*
	@RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
	public String pdsupload(PostDto dto , @RequestParam(value = "fileload", required = false)MultipartFile fileload, 
					HttpServletRequest req) {
		
		// filename 취득
		String filename = fileload.getOriginalFilename();
		dto.setOldfilename(filename);
		
		// upload 경로 설정
		// server
		String fupload = req.getServletContext().getRealPath("/upload");
		
		// 폴더
	//	String fupload = "d:\\tmp";
		
		System.out.println("fupload:" + fupload);
		
		// file명을 취득
		String f = dto.getOldfilename();
		String newfilename = PdsUtil.getNewFileName( f );	// 324324324324.txt
		
		dto.setFilename(newfilename);
		
		File file = new File(fupload + "/" + newfilename);
				
		try {
			// 실제로 파일이 업로드되는 부분
			FileUtils.writeByteArrayToFile(file, fileload.getBytes());
			
			// db에 저장
			service.uploadPds(dto);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		
		return "redirect:/pdslist.do";		
	}*/
}
