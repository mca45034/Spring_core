package com.rays.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		Student student=context.getBean(Student.class);
		System.out.println(student);

	}

}