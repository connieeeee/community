package bit.com.a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	
	@RequestMapping(value = "login", method = {RequestMethod.GET, RequestMethod.POST})
	public String move_to_login () {
		return "login.tiles";
	}
	
}
