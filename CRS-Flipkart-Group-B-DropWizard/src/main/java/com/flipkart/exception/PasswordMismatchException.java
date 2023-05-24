/**
 * 
 */
package com.flipkart.exception;

/**
 * @author Group-B
 *
 */

public class PasswordMismatchException extends Exception{

	/**
	 * Constructor
	 * @param password password
	 */
	public PasswordMismatchException(String password) {
	}

	/**
	 * @return Message to be displayed
	 */
	@Override
	public String getMessage() 
	{
		return "Entered incorrect password";
	}

}
