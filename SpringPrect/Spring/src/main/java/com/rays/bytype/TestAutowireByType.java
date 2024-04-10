package com.rays.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByType {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire-by-type.xml");
		UserService user=(UserService) context.getBean("userService");
		user.add();
	}

}
