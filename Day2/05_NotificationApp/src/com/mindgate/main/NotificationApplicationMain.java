package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.NotificationFactory;
import com.mindgate.service.Notification;

public class NotificationApplicationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String to;
		String message;
		int choice;
		String choice1;
		do {
			System.out.println("Press 1 To Send SMS notification");
			System.out.println("Press 2 To Send WhatsApp notification");
			System.out.println("Press 3 To Send Email notification");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();

			Notification notification = NotificationFactory.getNotification(choice);
			if (notification != null && choice <= 2) {
				System.out.println("Enter Contact : ");
				to = scanner.next();
				message = scanner.nextLine();
				System.out.println("Enter Message");
				message = scanner.nextLine();
				notification.sendNotification(to, message);
			}

			else if (choice == 3) {
				System.out.println("Enter Email id : ");
				to = scanner.next();
				message = scanner.nextLine();
				System.out.println("Enter Message");
				message = scanner.nextLine();
				notification.sendNotification(to, message);
			} else {
				System.out.println("Invalid notification Choice");
			}
			System.out.println("Do You Want to Send More notification? true or false");
			choice1 = scanner.next();
		} while (choice1.equals("true"));
		System.out.println("Thank You....");
//		Notification notification = new SMSNotification();
//		notification = new WhatsAppNotification();
//		notification = new EmailNotification();
//		notification.sendNotification(to, message);
	}
}
