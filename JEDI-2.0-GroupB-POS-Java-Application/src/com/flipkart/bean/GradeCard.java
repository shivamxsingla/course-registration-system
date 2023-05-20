/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ansh.agarwal
 *
 */
public class GradeCard 
{
	private int studentID;
	private int semester;
	private float cpi;
	
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
	 * @return the pi
	 */
	public float getCpi() {
		return cpi;
	}
	/**
	 * @param cpi the pi to set
	 */
	public void setCpi(float cpi) {
		this.cpi = cpi;
	}
}
