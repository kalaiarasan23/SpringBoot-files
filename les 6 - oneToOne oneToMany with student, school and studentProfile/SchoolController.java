package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
	private final SchoolRepository schoolRepository; // inject repoitory
	
	public SchoolController(SchoolRepository schoolRepository) {
		this.schoolRepository=schoolRepository;
	} 
	
	@PostMapping("school")
	public School create( @RequestBody School school) {
		return  schoolRepository.save(school);
	}
	
	@GetMapping("listSchool")
	public List<School> listSchool() {
		return schoolRepository.findAll();
	}
}
