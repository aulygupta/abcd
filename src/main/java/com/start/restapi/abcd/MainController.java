package com.start.restapi.abcd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
	
	@RequestMapping("/users234")
	public String home()
	{
		System.out.println("hello controller");
		return "bookWebsiteHome.jsp";
	}
	

}
