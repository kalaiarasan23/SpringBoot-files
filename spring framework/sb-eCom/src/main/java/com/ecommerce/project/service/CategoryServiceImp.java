package com.ecommerce.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Category;

@Service
public class CategoryServiceImp implements CategoryService {
	private List<Category> categoryList= new ArrayList<>();
	
	@Override
	public List<Category> getCategory() {
		return categoryList;
	}

	@Override
	public void addCategory(Category c) {
		categoryList.add(c);
	}

	@Override
	public String deleteCategory(Long id) {
//		categoryList.remove((id-1));
		Category c = categoryList.stream()
				.filter(s -> s.getId().equals(id))
				.findFirst() 
				.orElse(null); // or use get()
		
		if(c == null)
			return "not found on DB";
		
		categoryList.remove(c);
		return c +" from DB";
	}
}
