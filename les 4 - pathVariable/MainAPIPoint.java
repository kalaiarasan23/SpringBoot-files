package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainAPIPoint {
	private static List<Student> student;
	
	static {
		student = new ArrayList<>();
		student.add(new Student("raj",21,"hyderabad",11));
		student.add(new Student("raja",34,"hyderabad",13));
		student.add(new Student("mohan",55,"hyderabad",12));
		student.add(new Student("tom",65,"hyderabad",16));

	}
	
	public static void main(String[] args) {
		SpringApplication.run(MainAPIPoint.class, args);
	}
	
	@GetMapping("api/v2/a")
	public List<Student> getStudent(){
		return student;
	}
	
	@GetMapping("api/v2/a/{studentId}")
	public Student getStudent(@PathVariable("studentId") Integer id){
		return student.stream().filter(st -> st.id.equals(id))
				.findFirst().orElseThrow( ()-> new IllegalArgumentException());
	}
	
	
	static class Student{
		private String name;
		private Integer id;
		private String address;
		private Integer standard;
		
		public Student(String name, Integer id, String address, Integer standard) {
			this.name = name;
			this.id = id;
			this.address = address;
			this.standard = standard;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer age) {
			this.id = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "student [name=" + name + ", id=" + id + ", address=" + address + ", standard=" + standard + "]";
		}
		
		
	}
}
