package com.flipkart.exception;

/**
 * @author Group-B
 *
 */
public class CourseLimitExceededException extends Exception {

	private int num;
	
	/**
	 * Constructor
	 * @param num Number of courses
 	 */
	public CourseLimitExceededException(int num) {
		this.num = num;
	}

	/**
	 * Message returned when exception is thrown
	 */
	@Override
	public String getMessage() {
		return "Cannot register for more courses, already registered for " + num + " courses";
	}
}