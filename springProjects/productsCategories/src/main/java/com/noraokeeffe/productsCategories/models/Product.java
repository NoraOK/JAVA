package com.noraokeeffe.productsCategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String desc;
	private float price;
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(
    	name = "categories_products",
    	joinColumns = @JoinColumn(name = "product_id"),
    	inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;
    
    public Product() {}
    
    @PrePersist
    protected void onCreate() {
    	this.createdAt = new Date();
    } 
    @PreUpdate
    protected void onUpdate() {
    	this.updatedAt = new Date();
    }

	public Long getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
    
    
}
