package com.noraokeeffe.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
		public String greeting() {
			return "Hello client! How is your day going???";
	}
	@RequestMapping("/random")
		public String randomSpring() {
			return "Spring Boot is so great!!";
	}

}
