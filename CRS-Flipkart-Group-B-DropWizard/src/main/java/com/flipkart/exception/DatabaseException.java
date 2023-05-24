/**
 * 
 */
package com.flipkart.exception;

/**
 * @author Group-B
 *
 */

public class DatabaseException extends Exception {

	/**
	 * @return message of exception
	 */
	@Override
	public String getMessage() {
		return "Connection Error with the database. Try again.";
	}
	
	
}
