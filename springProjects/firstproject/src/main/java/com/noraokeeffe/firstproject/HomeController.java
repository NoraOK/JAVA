package com.noraokeeffe.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("")
	public String hello() {
		return "Hello";
	}
	@RequestMapping("/world")
	public String world() {
		return "Hello World";
	}

}
