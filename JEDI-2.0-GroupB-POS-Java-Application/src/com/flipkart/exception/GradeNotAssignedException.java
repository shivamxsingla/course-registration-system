package com.flipkart.exception;

/**
 * @author Group-B
 *
 */

public class GradeNotAssignedException extends Exception{
    private String studentID;

    /**
     * Constructor
     * @param studentID -> ID of student whose grade is not assigned
     */
    public GradeNotAssignedException(String studentID){
        this.studentID = studentID;
    }

    /**
     * Message of exception
     * @return -> exception's message
     */
    @Override
    public String getMessage() {
        return "Grade not assigned to student with ID " + studentID;
    }

    /**
     * Getter method for student ID.
     * @return -> StudentID
     */
    public String getStudentID(){
        return this.studentID;
    }

}
