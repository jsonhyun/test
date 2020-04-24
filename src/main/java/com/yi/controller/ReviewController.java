package com.yi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yi.domain.ReviewVO;

@Controller
public class ReviewController {
	
	@RequestMapping(value = "review", method = RequestMethod.GET)
	public String reviewGet() {
		
		return "bookReviewForm";
	}
	
	@RequestMapping(value = "review", method = RequestMethod.POST)
	public String reviewPost(ReviewVO vo, Model model) {
		
		model.addAttribute("review", vo);
		return "bookReviewResult";
	}
}
