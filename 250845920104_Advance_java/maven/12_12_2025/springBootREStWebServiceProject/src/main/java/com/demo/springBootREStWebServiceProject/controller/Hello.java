package com.demo.springBootREStWebServiceProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// this is our hello Controller
@RestController
public class Hello {
	
	
	@GetMapping("/welcome")
	public String greetings() {
		return "hello yash welcome to the Rest Web Service";
	}
	
}
