/**
 * 
 */
package com.flipkart.service;

import com.flipkart.constant.ModeOfPaymentConstant;

/**
 * @author shivam.singla
 *
 */
public interface PaymentInterface {

	public void sendPayment(String sid,  int amount, ModeOfPaymentConstant mode, String creds);
	
	
}
