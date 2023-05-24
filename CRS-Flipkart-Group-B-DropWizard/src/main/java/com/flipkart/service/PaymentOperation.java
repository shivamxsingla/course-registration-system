/**
 * 
 */
package com.flipkart.service;

import org.apache.log4j.Logger;

import com.flipkart.constant.ModeOfPaymentConstant;
import com.flipkart.dao.NotificationDaoOperation;
import com.flipkart.dao.PaymentDaoOperation;

/**
 * @author shivam.singla
 *
 */
public class PaymentOperation implements PaymentInterface {
	
	private static volatile PaymentOperation instance = null;
	
	private PaymentOperation() {
	}
	
	@Override
	public void sendPayment(String sid, int amount, ModeOfPaymentConstant mode, String creds) {
		 PaymentDaoOperation payment = new PaymentDaoOperation();
		 payment.savePayment(sid, amount, mode, creds);
		  	return;
		
	}

	public static PaymentOperation getInstance() {
		
		if(instance==null)
		{
			synchronized(PaymentOperation.class){
				instance=new PaymentOperation();
			}
		}
		return instance;	
	}

}
