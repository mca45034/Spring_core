package com.rays.exclude;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExcludeAutometic {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("exclude.xml");
		TestAutowire test=context.getBean(TestAutowire.class);
		test.performOpretion();

	}

}