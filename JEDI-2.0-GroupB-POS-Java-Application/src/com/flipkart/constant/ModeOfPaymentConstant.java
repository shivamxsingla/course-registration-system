/**
 * 
 */
package com.flipkart.constant;

/**
 * @author Group-B
 *
 */

public enum ModeOfPaymentConstant {

	CREDIT_CARD,NET_BANKING,DEBIT_CARD, CASH, SCHOLORSHIP, CHEQUE;
	
	/**
	 * Method to get Mode of Payment
	 * @param value
	 * @return Mode of Payment
	 */
	public static ModeOfPaymentConstant getModeofPayment(int value)
	{
		switch(value)
		{   
			case 0:
				return ModeOfPaymentConstant.CASH;
			case 1:
				return ModeOfPaymentConstant.CREDIT_CARD;
			case 2:
				return ModeOfPaymentConstant.NET_BANKING;
			case 3:
				return ModeOfPaymentConstant.DEBIT_CARD;
			case 4: 
				return ModeOfPaymentConstant.SCHOLORSHIP;
			case 5:
				return ModeOfPaymentConstant.CHEQUE;
			default:
				return null;
				
		}
			
	}

	/**
	 * Method to get string representing mode of payment
	 * @param mode
	 * @return Mode of payment in string
	 */
	public static String getStringModeOfPayment(ModeOfPaymentConstant mode) {
		switch(mode) {
			case CREDIT_CARD:
				return "Credit Card";
			case NET_BANKING:
				return "Net Banking";
			case DEBIT_CARD:
				return "Debit Card";
			case CASH:
				return "Cash";
			case SCHOLORSHIP:
				return "Scholorship";
			case CHEQUE:
				return "Cheque";
			default:
				return "Invalid Mode";
			
		}
	}
}
