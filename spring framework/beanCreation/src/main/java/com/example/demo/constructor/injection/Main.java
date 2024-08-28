package com.example.demo.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");
		Car myCar = (Car) context.getBean("Car");
		myCar.printDetail();
	}
}
