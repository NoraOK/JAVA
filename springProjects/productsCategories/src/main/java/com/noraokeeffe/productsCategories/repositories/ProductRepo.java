package com.noraokeeffe.productsCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.noraokeeffe.productsCategories.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{

}
