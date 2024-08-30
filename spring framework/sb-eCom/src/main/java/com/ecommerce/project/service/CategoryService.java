package com.ecommerce.project.service;

import java.util.List;

import com.ecommerce.project.model.Category;

public interface CategoryService {
	List<Category> getCategory();
	void addCategory(Category c);
	String deleteCategory(Long id);
}
