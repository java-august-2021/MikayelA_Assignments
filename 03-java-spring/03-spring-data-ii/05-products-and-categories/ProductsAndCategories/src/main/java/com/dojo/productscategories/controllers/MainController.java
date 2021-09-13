package com.dojo.productscategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojo.productscategories.models.Category;
import com.dojo.productscategories.models.Product;
import com.dojo.productscategories.services.Services;

@Controller
public class MainController {

	@Autowired
	private Services tService;
	
	@GetMapping("/product/new")
	public String newProd() {
		return "newProduct.jsp";
	}
	
	@GetMapping("/category/new")
	public String newCat() {
		return "newCategory.jsp";
	}
	
	@PostMapping("/newCat")
	public String thatCat(@RequestParam("cat") String category) {
		Category c = new Category();
		c.setName(category);
		this.tService.newCategory(c);
		return "redirect:/category/new";
	}
	@PostMapping("/newProduct")
	public String thatProd(@RequestParam("name") String name, @RequestParam("desc") String desc, @RequestParam("price") String price){
		Product p = new Product();
		this.tService.newProduct(p);
		return "redirect:/product/new";
	}
	
	@GetMapping("/product/{id}")
	public String oneProd (@PathVariable("id") Long id, Model viewModel) {
		Product idProd = tService.oneProd(id);
		List<Category> allCats = tService.findAllByProducts(idProd);
		viewModel.addAttribute("categories", allCats);
		viewModel.addAttribute("prodId", idProd);
		return "Products.jsp";
	}
	
	@GetMapping("/category/{id}")
	public String oneCat (@PathVariable("id") Long id, Model viewModel) {
		Category idCat = tService.oneCat(id);
		List<Product> allProds = tService.findAllByCategories(idCat);
		viewModel.addAttribute("products", allProds);
		viewModel.addAttribute("catId", idCat);
		return "Categories.jsp";
	}
	
	@PostMapping("/addCategory/{id}")
	public String addCategory(@RequestParam("cat") Long id, @PathVariable("id") Long pId) {
		Product prodToCat = this.tService.oneProd(pId);
		Category catToAdd = this.tService.oneCat(id);
		this.tService.addingCat(prodToCat, catToAdd);
		return "redirect:/{id}";
	}
	
	@PostMapping("/addProduct/{id}")
	public String addProduct(@RequestParam("prod") Long id, @PathVariable("id") Long cId) {
		Product prodToCat = this.tService.oneProd(id);
		Category catToAdd = this.tService.oneCat(cId);
		this.tService.addingProd(catToAdd, prodToCat);
		return "redirect:/cat.{id}";
	}
	
	
}
