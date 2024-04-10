package com.rays.exclude;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExcludeManually {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("exclude.xml");

		UserService userService = context.getBean("userService", UserService.class);
		userService.geet();

		AnotherService anotherService = context.getBean("anotherService", AnotherService.class);
		anotherService.doSamething();

		UserService userServiceToExclude = null;

		userServiceToExclude = context.getBean("userServiceToExclude", UserService.class);

		userServiceToExclude.geet();
	}

}
