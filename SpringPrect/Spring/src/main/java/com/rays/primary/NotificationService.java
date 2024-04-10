package com.rays.primary;

public class NotificationService {
	private MessageService messageService;

	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}


	public void sendNotification(String massage) {
		messageService.sendMessage(massage);
	}

}
