package com.flipkart.bean;


/**
 * @author cyrus.dwivedi
 *
 */
public class PaymentNotification extends Payment{
	
	private int studentID;
	private int referenceID;
	private int notificationID;
	private String notificationMessage;
	
	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the referenceID
	 */
	public int getReferenceID() {
		return referenceID;
	}
	/**
	 * @param referenceID the referenceID to set
	 */
	public void setReferenceID(int referenceID) {
		this.referenceID = referenceID;
	}
	/**
	 * @return the notificationID
	 */
	public int getNotificationID() {
		return notificationID;
	}
	/**
	 * @param notificationID the notificationID to set
	 */
	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
	}
	/**
	 * @return the notificationMessage
	 */
	public String getNotificationMessage() {
		return notificationMessage;
	}
	/**
	 * @param notificationMessage the notificationMessage to set
	 */
	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}
	
}

