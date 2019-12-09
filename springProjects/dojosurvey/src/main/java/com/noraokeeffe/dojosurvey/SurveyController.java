package com.noraokeeffe.dojosurvey;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/result")
	public String result(Model model) {
		return "results.jsp";
	}
	@RequestMapping(value="/processform", method= RequestMethod.POST)
	public String processform(
			HttpSession session,
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="lang") String lang,
			@RequestParam(value="comment") String comment) {
        session.setAttribute("name", name);
        session.setAttribute("location", location);
        session.setAttribute("lang", lang);
        session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	
	
}
