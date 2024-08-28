package com.looseCoupling.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseMainClass {

	public static void main(String[] args) {
		UserDataProvider udp = new UserDBProvider();
		UserManager userManager = new UserManager(udp);
		System.out.println(userManager.getUserManager());
		
		UserDataProvider webProvider = new WebProvider();
		UserManager webUserManager = new UserManager(webProvider);
		System.out.println(webUserManager.getUserManager());
		
		ApplicationContext newDBProvider = new ClassPathXmlApplicationContext("ioc.xml");
		UserManager newDBManager = (UserManager) newDBProvider.getBean("UserMangerForNewDBProvider");
		System.out.println(newDBManager.getUserManager());

		ApplicationContext userDBProvider = new ClassPathXmlApplicationContext("ioc.xml");
		UserManager userDBManager = (UserManager) newDBProvider.getBean("UserMangerForUserDBProvider");
		System.out.println(userDBManager.getUserManager());
		
	}

}
