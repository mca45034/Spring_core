package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextPerson {

	
	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Person.xml");
		
		PersonBean person = (PersonBean) context.getBean("personBean");

		System.out.println("Person's name: " + person.getName());



		
	
	}
}
