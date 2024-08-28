package com.example.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoWiringByName.xml");
		Car myCar = (Car) context.getBean("myCar");
		myCar.printDetail();
	}
}
