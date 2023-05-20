/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ansh.agarwal
 *
 */
public class SemesterRegistration 
{
	private int studentID;
	private int semester;
	private String dateOfJoining;
	public boolean registerCourse()
	{
		System.out.println("Course has been registered.");
		return true;
	}
	public void addCourse()
	{
		System.out.println("Course has been added.");
	}
	public void dropCourse()
	{
		System.out.println("Course has been dropped.");
	}
	public void payFees()
	{
		System.out.println("Fees has been paid.");
	}
	public void viewRegisteredCourses()
	{
		System.out.println("Registered courses have been displayed.");
	}
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
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}
	/**
	 * @return the dateOfJoining
	 */
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
}
