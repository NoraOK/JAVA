package com.noraokeeffe.productsCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.noraokeeffe.productsCategories.models.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long>{

}
