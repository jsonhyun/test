package com.yi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yi.domain.UserVO;

@Controller
public class JoinController {
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String joinGet() {
		
		return "joinForm";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String joinPost(UserVO vo, Model model) {
		System.out.println(vo.toString());
		model.addAttribute("user", vo);
		
		return "joinResult";
	}
	
}
