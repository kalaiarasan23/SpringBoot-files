package com.example.demo.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setterInjector.xml");
		Car myCar = (Car) context.getBean("myCar");
		myCar.printDetail();
	}
}
