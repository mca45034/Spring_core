package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class TextUser {
	
	public static void main(String[] args) {
		
	BeanFactory factory =new XmlBeanFactory(new ClassPathResource("User.Xml"));
	
	UserBean User = (UserBean) factory.getBean("UserBean");
		System.out.println(User.getName());	
		System.out.println(User.getLogin());
		System.out.println(User.getPassword());
	
		
	
	}

}
