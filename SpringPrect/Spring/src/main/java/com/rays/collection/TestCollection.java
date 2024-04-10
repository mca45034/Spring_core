package com.rays.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("collection.xml");
		MyBean bean=context.getBean(MyBean.class);
		bean.display();
	}

}
