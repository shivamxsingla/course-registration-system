/**
 * 
 */
package com.flipkart.bean;

import com.flipkart.constant.ModeOfPaymentConstant;

/**
 * @author shivam.singla
 *
 */
@SuppressWarnings("unused")
public class PaymentNotification {
	private String message;
	/**
	 * Getter of notification message
	 * @return -> Notification message
	 */
	public String getNotificationMessage() {
		return message;
	}

	/**
	 * Setter of notification message
	 * @param message -> New message
	 */
	public void setNotificationMessage(String message) {
		this.message = message;
	}	
}
