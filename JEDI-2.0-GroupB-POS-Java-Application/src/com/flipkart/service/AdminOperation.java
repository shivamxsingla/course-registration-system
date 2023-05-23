package com.flipkart.service;
/**
 * @author Group-B
 *
 */
import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.constant.SQLQueriesConstant;
import com.flipkart.dao.AdminDaoOperation;
import com.flipkart.dao.NotificationDaoOperation;
import com.flipkart.exception.*;
import com.flipkart.utils.DBUtil;
import com.flipkart.dao.RegistrationDaoInterface;
import com.flipkart.dao.RegistrationDaoOperation;
import com.flipkart.dao.UserDaoOperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@SuppressWarnings("unused")
public class AdminOperation implements AdminInterface{

    private static volatile AdminOperation instance = null;

    private AdminOperation(){}

    public static AdminOperation getInstance() {
        if (instance == null) {
            synchronized (AdminOperation.class) {
                instance = new AdminOperation();
            }
        }
        return instance;
    }

    AdminDaoOperation adminDaoInterfaceImpl = AdminDaoOperation.getInstance();
    NotificationDaoOperation notificationDao = NotificationDaoOperation.getInstance();
    @Override
    public void addCourse(Course course) throws CourseFoundException {
        try{
            adminDaoInterfaceImpl.addCourse(course);
        } catch (CourseFoundException e) {
            throw e;
        }
    }

    @Override
    public void removeCourse(int courseID) throws CourseNotFoundException, CourseNotDeletedException {
        try{
            adminDaoInterfaceImpl.removeCourse(courseID);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void addProf(Professor professor) throws ProfNotAddedException, ProfFoundException{
        try{
            adminDaoInterfaceImpl.addProf(professor);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void removeProf(String profID) throws ProfNotFoundException, ProfNotDeletedException {
        try {
            adminDaoInterfaceImpl.removeProf(profID);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void removeStudent(String studentID) throws StudentNotFoundException {
        try{
            adminDaoInterfaceImpl.removeStudent(studentID);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void assignProf(String profID, int courseID) throws CourseNotFoundException, ProfNotFoundException{
        try{
            adminDaoInterfaceImpl.assignProf(profID, courseID);
        } catch (Exception e) {
            throw e;
        }
    }


    /**
     * Method to ensure no course has less than three registered students
     */
   
    @Override
    public void generateReportCard(String studentID) throws StudentNotFoundException {
        try {
            adminDaoInterfaceImpl.generateReportCard(studentID);
        } catch (StudentNotFoundException e) {
            throw e;
        }
    }

    /**
     * Method to get list of courses in catalog
     * @return List of courses in CourseCatalogue
     */
    @Override
    public List<Course> viewCourses() {
        List<Course> courseList = null;
        try {
            courseList = adminDaoInterfaceImpl.viewCourses();
        } catch (Exception e) {
            throw e;
        }
        return courseList;
    }

    /**
     * Method to approve Student
     * @param studentId -> ID of student to be approved
     * @throws StudentNotFoundException
     */
    @Override
    public void approveStudent(String studentId) throws StudentNotFoundException {
        try {
            adminDaoInterfaceImpl.approveStudent(studentId);
        } catch (Exception e) {
            throw e;
        }
    }

    
    /**
     * Method to accept scholarship from students
     */
    public void paymentDoneViaScholarship(String studentID) {
    	NotificationOperation.getInstance().sendNotification(studentID, "payment", "Payment done for student with id " + studentID + " via Scholarship");
    	
    }
    
    /**
     * Method to accept Demand Draft from students
     */
    public void paymentDoneViaDemandDraft(String studentID) {
    	NotificationOperation.getInstance().sendNotification(studentID, "payment", "Payment done for student with id " + studentID + " via Demand Draft");

    }

    /**
     * Method to fetch the list of all enrolled professors
     *
     * @return List of Professors in table Professors
     */
    @Override
    public List<Professor> viewProfessors() {
        try {
            return adminDaoInterfaceImpl.viewProfessors();
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Method view pending approvals of students
     */
    @Override
    public List<Student> viewPending() {
        try {
            return adminDaoInterfaceImpl.viewPending();
        } catch (Exception e) {
            throw e;
        }
    }
}
