package com.yi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BootController {
	
	@RequestMapping(value = "boot1", method = RequestMethod.GET)
	public String boot1() {
		return "boot1";
	}
	
	@RequestMapping(value = "boot2", method = RequestMethod.GET)
	public String boot2() {
		return "boot2";
	}
	
	@RequestMapping(value = "boot3", method = RequestMethod.GET)
	public String boot3() {
		return "boot3";
	}
	
	@RequestMapping(value = "boot4", method = RequestMethod.GET)
	public String boot4() {
		return "boot4";
	}
}
