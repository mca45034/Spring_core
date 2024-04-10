package com.rays.primary;

public class EmailService implements MessageService{

	public void sendMessage(String massage) {
		System.out.println("sending mail :"+massage);
		
	}

}
