package com.rays.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AllBanKInTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("primary2.xml");
		AllBanKIn bank=(AllBanKIn) context.getBean("allBanKIn");
		bank.allMessage("Rahul kirar");
	}

}
