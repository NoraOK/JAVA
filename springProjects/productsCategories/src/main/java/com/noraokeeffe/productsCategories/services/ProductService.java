package com.noraokeeffe.productsCategories.services;

import org.springframework.stereotype.Service;
import com.noraokeeffe.productsCategories.models.Product;
import com.noraokeeffe.productsCategories.repositories.ProductRepo;

@Service
public class ProductService {
	private final ProductRepo productRepo;
	
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}
	
	
}
