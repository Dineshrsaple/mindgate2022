package com.mindgate.factory;

import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.pojo.WhatsAppNotification;
import com.mindgate.service.Notification;

public class NotificationFactory {
	public static Notification getNotification(int choice) {
		Notification notificaation = null;
		switch (choice) {
		case 1:
			notificaation = new SMSNotification();
			break;
		case 2:
			notificaation = new WhatsAppNotification();
			break;
		case 3:
			notificaation = new EmailNotification();
			break;
//			default:
//				shapes = new Shapes();
//				break;
		}
		;
		return notificaation;

	}

}
