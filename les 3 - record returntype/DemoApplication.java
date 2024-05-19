package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		 Theater td = context.getBean(Theater.class);
//		 td.watch();
	}
	
	@GetMapping("/we")
	public GiveResponses sample()
	{
		return new GiveResponses("hi games",List.of("A","B","C"),new Person("raja"));
	}
	
	record Person(String name)   {	}
	
	record GiveResponses(String message, List<String> Sections,Person person) {}
}
