package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainAPIPoint {
	private static List<Student> student;
	
	static {
		student = new ArrayList<>();
		student.add(new Student("raj",21,"hyderabad",11));
		student.add(new Student("raja",21,"hyderabad",11));
		student.add(new Student("mohan",21,"hyderabad",11));
		student.add(new Student("tom",21,"hyderabad",11));

	}
	
	public static void main(String[] args) {
		SpringApplication.run(MainAPIPoint.class, args);
	}
	
	@GetMapping("api/v2/a")
	public List<Student> getStudent(){
		return student;
	}
	
	
	static class Student{
		private String name;
		private Integer age;
		private String address;
		private Integer standard;
		
		public Student(String name, Integer age, String address, Integer standard) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.standard = standard;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "student [name=" + name + ", age=" + age + ", address=" + address + ", standard=" + standard + "]";
		}
		
		
	}
}
