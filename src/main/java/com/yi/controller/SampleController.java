package com.yi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yi.domain.ProductVO;

@Controller
public class SampleController {
	
	@RequestMapping(value = "doA", method = RequestMethod.GET)
	public String doA(HttpServletRequest request) { //브라우저에서 전달된 request가 자동 주입됨
		System.out.println(request);
		String key1 = request.getParameter("key1");
		System.out.println(key1);
		return "home";
	}
	
	@RequestMapping(value = "doB", method = RequestMethod.GET)
	public String doB( String key1, String key2 ) { //request안에 key1을 찾아서 자동 주입시킴
		System.out.println(key1);
		System.out.println(key2);
		return "test";
	}
	
	/***/
	@RequestMapping(value = "doC", method = RequestMethod.GET) // 이 방법을 추천하고 가장 많이 사용
	public String doC( int key1, double key2, Model model ) {
		System.out.println(key1);
		System.out.println(key2);
		model.addAttribute("key1", key1);
		model.addAttribute("key2", key2);
		return "test";
	}
	/***/
	
	@RequestMapping(value = "doD", method = RequestMethod.GET)
	public String doD(@ModelAttribute("key1")int key1, @ModelAttribute("key2")String key2) {	
		return "test";
	}
	
	@RequestMapping(value = "doE", method = RequestMethod.GET)
	public String doE( Model model) {
		ProductVO vo = new ProductVO();
		vo.setName("오감자");
		vo.setPrice(2100);
		
		model.addAttribute("p1", vo);
		
		return "test2";
	}
	
	@RequestMapping(value = "doF", method = RequestMethod.GET)
	public String doF(Model model) {
		//list를 만들어서 jsp에 전달
		
		List<ProductVO> list = new ArrayList<ProductVO>();
		list.add(new ProductVO("오감자", 2500));
		list.add(new ProductVO("새우깡", 1500));
		list.add(new ProductVO("초코칩", 3000));
		list.add(new ProductVO("엄마손", 3500));
		
		model.addAttribute("list", list);
		return "test3";
	}
	
	@RequestMapping(value = "doForward", method = RequestMethod.GET)
	public String doForward() {
		//doForward를 실행시, doF로 forward되도록 한다.
		
		return "forward:/doF";
	}
	
	@RequestMapping(value = "doRedirect", method = RequestMethod.GET)
	public String doRedirect() {
		return "redirect:/doE";
	}
	
	@RequestMapping(value = "doJson1", method = RequestMethod.GET)
	public @ResponseBody String doJson1() {
		
		return "test";
	}
	
	@RequestMapping(value = "doJson2", method = RequestMethod.GET)
	public @ResponseBody ProductVO doJson2() {
		ProductVO vo = new ProductVO();
		vo.setName("오감자");
		vo.setPrice(2100);
		
		return vo;
	}
}
