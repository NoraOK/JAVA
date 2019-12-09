package com.noraokeeffe.thecode;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method= RequestMethod.POST)
	public String error(@RequestParam(value="code") String code) {
		if(code.equals("bushido")) {
			return "code.jsp";
		}else {
			return "redirect:/flashMessages";
		}
	}
	@RequestMapping("/flashMessages")
	public String flashMessage(RedirectAttributes messages) {
		messages.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
}
