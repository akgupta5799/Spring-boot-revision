package com.sts.firstSTSProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot! This is Addy, a passionate Java Developer. Now I started to learn Spring Boot.";
	}
}
