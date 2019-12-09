package com.noraokeeffe.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.noraokeeffe.relationships.models.License;
import com.noraokeeffe.relationships.models.Person;
import com.noraokeeffe.relationships.services.LicenseService;
import com.noraokeeffe.relationships.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;

	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
////Route for CREATING a new license & links it to selected person/////////////////////////////////////////////////////////
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "/relationships/NewLicense.jsp";
	}
////POST route that CREATES a license, links it to a person and checks for errors in the form from the .JSP file///////////	
	@RequestMapping("/license/process")
	public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "/relationships/NewLicense.jsp";
		} else {
			String number = licenseService.generateLicenseNumber();
			license.setNumber(number);
			licenseService.createLicense(license);
			return "redirect:/";
		}
	}


}
