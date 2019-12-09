package com.noraokeeffe.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value="last_name", required=false) String last_name){
		if(first_name == null) {
			return "Hello Human! Welcome to SpringBoot!";
		}else if(last_name == null){
			return "Hello "+first_name+"! Welcome to SpringBoot!";
		}else {
			return "Hello "+first_name+" "+last_name+"! Welcome to SpringBoot!";
		}
	}
}
