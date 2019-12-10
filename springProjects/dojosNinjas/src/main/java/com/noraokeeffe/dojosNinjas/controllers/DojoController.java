package com.noraokeeffe.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.noraokeeffe.dojosNinjas.models.Dojo;
import com.noraokeeffe.dojosNinjas.services.DojoService;

@Controller
public class DojoController {
	private final DojoService dojoService;
	
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
////Route for CREATING a new dojo///////////////////////////////////////////////////////////////////////////	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojosNinjas/newDojo.jsp";
	}
	
	@RequestMapping(value = "/process_dojo", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("person") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "/dojosNinjas/newDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "/dojosNinjas/all.jsp";
	}
	
	@RequestMapping("/dojos/{id}")
	public String oneDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.getDojo(id);
		model.addAttribute("dojo", dojo);
		return "/dojosNinjas/oneDojo.jsp";
	}

}
