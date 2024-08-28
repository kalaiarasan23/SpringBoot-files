package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1SpringDemo1Application {

		public static void main(String[] args) {
			ApplicationContext m = new ClassPathXmlApplicationContext("a.xml");
			MyBean myBean =(MyBean) m.getBean("mybean");
			System.out.println(myBean);
		}
}
