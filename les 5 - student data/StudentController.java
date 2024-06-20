package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	private final StudentRepository rep;
	
	public StudentController(StudentRepository rep) {
		this.rep = rep;
	}
	
	@PostMapping("student")
	public Student post(@RequestBody Student s)
	{
		return rep.save(s);
		}
	
	@GetMapping("student")
	public List<Student> findAllStudent()
	{
		return rep.findAll();
		}
	
	@GetMapping("student/{studId}")
	public Student findId(@PathVariable("studId") Integer id){
		return rep.findById(id).orElse(new Student());
	}
	
	@GetMapping("studentName/{studId}")
	public List<Student> findName(@PathVariable("studId") String s) {
		return rep.findByFirstNameLike(s);
	}
	
	@DeleteMapping("studentDelete/{delId}")
//	@ResponseStatus(HttpStatus.OK)
	public void delById(@PathVariable("delId") Integer id)
	{
		rep.deleteById(id);
	}
	
}
