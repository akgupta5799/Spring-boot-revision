package com.dev.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a = 11;
		int b = 22;
		return "The sum of " +a+ " and "+b+" is "+(a+b)+".";
	}
}
