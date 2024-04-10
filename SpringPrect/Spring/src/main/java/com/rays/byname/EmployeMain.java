package com.rays.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeMain {

	public static void main(String[] args) {
	  ApplicationContext context=new ClassPathXmlApplicationContext("autowire-by-name-Empolye.xml");
	  EmployeService emp1=context.getBean(EmployeService.class);
	  emp1.testInteface();
	}

}
