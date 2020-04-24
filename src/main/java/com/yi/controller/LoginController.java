package com.yi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginGet() {
		
		return "loginForm";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost(String id, String password, Model model) {
		System.out.println("login ----------------Post");
		System.out.println("id : " +id+", pass : "+password);
		model.addAttribute("id", id);
		model.addAttribute("password", password);
		return "loginResult";
	}
}
