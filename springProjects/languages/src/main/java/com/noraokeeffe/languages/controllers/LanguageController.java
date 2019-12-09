package com.noraokeeffe.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.noraokeeffe.languages.models.Language;
import com.noraokeeffe.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langService;
	
	public LanguageController(LanguageService langService) {
		this.langService = langService;
	}
	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("lang") Language lang) {
		List<Language> langs = langService.allLangs();
		model.addAttribute("langs", langs);
		return "/languages/index.jsp";
	}
	@RequestMapping(value="/languages_create", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lang") Language lang, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return index(model, lang);
		}else{
			langService.createLang(lang);
			return "redirect:/languages";
		}	
	}
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLang(id);
		model.addAttribute("lang", lang);
		return "/languages/show.jsp";
	}
	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLang(id);
		model.addAttribute("lang" , lang);
		return "/languages/edit.jsp";
	}
	@RequestMapping(value= "/languages_edit/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/edit.jsp";
		}else {
			langService.updateLange(lang);
			return "redirect:/languages";
		}
	}
	@RequestMapping(value="/languages_delete/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		langService.deleteLang(id);
		return "redirect:/languages";
	}
}
