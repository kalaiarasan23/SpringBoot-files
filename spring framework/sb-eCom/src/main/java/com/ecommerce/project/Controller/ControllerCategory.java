package com.ecommerce.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;

@RestController
public class ControllerCategory {
	@Autowired
	CategoryService categoryService;  // we can inject field injection and construction injection
	
	@GetMapping("/api/public/category")
	public List<Category> categoryMethod(){
		return categoryService.getCategory();
	}
	
	@PostMapping("/api/public/category")
	public String addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
		return "category added";
	}
	
	@DeleteMapping("api/public/category/{id}")
	public String deleteCategory(@PathVariable Long id) {
		return categoryService.deleteCategory(id);
	}
}
