package com.dojo.productscategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.productscategories.models.Category;
import com.dojo.productscategories.models.Product;
import com.dojo.productscategories.repositories.CategoryRepository;
import com.dojo.productscategories.repositories.ProductRepository;

@Service
public class Services {
	@Autowired
	private ProductRepository prodRepo;
	@Autowired
	private CategoryRepository catRepo;
	
	public Product newProduct(Product product) {
		return this.prodRepo.save(product);
	}
	
	public Category newCategory(Category category) {
		return this.catRepo.save(category);
	}
	
	public Category oneCat(Long id) {
		return this.catRepo.findById(id).orElse(null);
	}
	public Product oneProd(Long id) {
		return this.prodRepo.findById(id).orElse(null);
	}
	
	public List<Category> findAllByProducts(Product product) {
		return this.catRepo.findAllByProducts(product);
		
	}
	
	public List<Category> findByProductsNotContains(Product product){
		return this.catRepo.findByProductsNotContains(product);
	}
	
	public List<Product> findAllByCategories(Category category){
		return this.prodRepo.findAllByCategories(category);
	}
	
	public List<Product> findByCategoriesNotContains(Category category){
		return this.prodRepo.findByCategoriesNotContains(category);
	}
	
	public void addingCat(Product product, Category category) {
		List<Category> nowCats = product.getCategories();
		nowCats.add(category);
		this.prodRepo.save(product);
	}
	
	public void addingProd(Category category, Product product) {
		List<Product> nowProds = category.getProducts();
		nowProds.add(product);
		this.catRepo.save(category);
	}

}
