package com.mj.tapPayPractice.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mj.tapPayPractice.Service.UserService;

@Controller
public class UserController {
//	@RequestMapping("/MyFirstPage")
//	public String greeting(@RequestParam(value = "title", required = false, defaultValue = "xiao") String title,Model model) {
//		model.addAttribute("name", title);
//		return "index";
//	}
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String index(Map<String, Object> model) {
		model.put("ID", userService.getUserId());
		return "index";
	}

}
