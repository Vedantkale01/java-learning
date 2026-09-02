package com.abstraction;

import java.util.Scanner;

public class NotificationSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("Enter Your Choice :");
		int choice=sc.nextInt();
		System.out.println("Enter your message :");
		sc.nextLine();
		String msg=sc.nextLine();
		MessageService service=MessageFactory.getMessageService(choice);
	    NotificationService obj=new NotificationService();
	    obj.notifyUser(service, msg);
	}
}

class NotificationService{
	public void notifyUser(MessageService service,String message) {
		if(service.sendMessage(message)) {
			System.out.println("Notification sent successfully");
		}else {
			System.out.println("Notification failed");
		}
	}
}

/**
 * Factory class is  class which contains Factory method
 * it is a static method which creates and returns the object of implementation
*/
class MessageFactory{
	public static MessageService getMessageService(int choice) {
		switch(choice) {
			case 1 -> {
				return new EmailService();
			}
			case 2 ->{
				return new SMSService();
			}
			case 3->{
				return new WhatsAppService();
			}
			default -> {
				return null;
			}
		}
	}
}
interface MessageService{
	boolean sendMessage(String message);
}

class EmailService implements MessageService{
	public boolean sendMessage(String message) {
		System.out.println("Message sent via Email.");
		return true;
	}
}

class SMSService implements MessageService{
	public boolean sendMessage(String message) {
		System.out.println("Message sent via SMS.");
		return true;
	}
}

class WhatsAppService implements MessageService{
	public boolean sendMessage(String message) {
		System.out.println("Message sent via WhatsApp.");
		return true;
	}
}

