/**
 * 
 */
package com.flipkart.service;

import java.util.Scanner;

import com.flipkart.client.CRSAdminMenu;
import com.flipkart.client.CRSProfessorMenu;
import com.flipkart.client.CRSStudentMenu;

/**
 * @author ansh.agarwal
 *
 */
public class LoginOperationService implements LoginInterface
{
	public boolean login() {
		Scanner scannerObj = new Scanner(System.in);
		
		// Get ID.
		System.out.println("Enter your ID");
		int id = scannerObj.nextInt();
		scannerObj.nextLine(); // Consumes the empty return left by nextInt in the previous line.
		
		// Get Password.
		System.out.println("Enter your password");
		String password = scannerObj.nextLine();
		
		// Get user role.
		System.out.println("Enter you role");
		String role = scannerObj.nextLine();
		
		// Check if the user exists

			System.out.println("You are not a verified user.");
			if(role.equals("Student")) {
				System.out.println("Register yourself as a new student");
			} else if(role.equals("Professor")) {
				System.out.println("Contact the Admin.");
			} else {
				// This condition should not happen.
				// Handle the exception. <-- TODO
			}
			return false;
		}
		
		
		// Check if password and role matches.
		if(!void verifyPassword(id, password)) {
			return false;
		}
		
		if(!verifyRole(id, role)) {
			return false;
		}
		
		
		// Call user specific operations.
		
		if (role.equals("admin")) {
			CRSAdminMenu.process();
		} else if(role.equals("professor")) {
			CRSProfessorMenu.process();
		} else if(role.equals("student")) {
			CRSStudentMenu.process();
		} else {
			// Error. Handle the error.
			// May be this is not necessary as we check above if the role matches.ß
		}
		
		return true;
	}

	public boolean userExists(int id) {
		// TODO Implement this function.
		return true;
	}
	
	public boolean verifyPassword(int id, String inputPassword) {
		return true;
	}
	
	public boolean verifyRole(int id, String inputRole) {
		return true;
	}
}
