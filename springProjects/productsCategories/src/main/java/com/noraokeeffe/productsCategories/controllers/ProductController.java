package com.noraokeeffe.productsCategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.noraokeeffe.productsCategories.models.Product;
import com.noraokeeffe.productsCategories.services.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value="/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "/producstcategories/newProduct.jsp";
	}
	
	@RequestMapping(value="/create_product", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "/products/newProduct.jsp";
		}else {
			productService.createProduct(product);
			return "redirect:/products/new";
		}
	}
	
	
	
	

}
