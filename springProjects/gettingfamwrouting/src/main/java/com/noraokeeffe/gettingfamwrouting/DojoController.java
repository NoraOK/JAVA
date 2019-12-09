package com.noraokeeffe.gettingfamwrouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{name}")
	public String dojoName(@PathVariable ("name") String name) {
		if(name.equals("dojo")) {
			return "The Dojo is awesome!";
		}else if(name.equals("burbank-dojo")){
			return "The Burbank Dojo is in SoCal";
		}else if(name.equals("san-jose")) {
			return "The San Jose Dojo is the Dojo HQ";
		}else {
			return name;
		}
	}
}
