/**
 * 
 */
package com.flipkart.dao;

import com.flipkart.constant.ModeOfPaymentConstant;

/**
 * @author shivam.singla
 *
 */
public interface PaymentDaoInterface {

	public void savePayment(String sid, int amount, ModeOfPaymentConstant mode, String creds);

	
}
