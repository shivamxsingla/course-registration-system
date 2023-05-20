/**
 * 
 */
package com.flipkart.client;
import java.util.Scanner;
import com.flipkart.service.*;

/**
 * @author shivam.singla
 *
 */
public class CRSApplicationClient {

	/**
	 * @param args
	 */
	//testing
	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		int choice;
		
		System.out.println("Welcome to Course Registration System");
		
		
		
		boolean interactWithClient = true;
		while(interactWithClient){
			// Take input choice until the user chooses to exit.
			System.out.println("Select one of the following choices by inputting the choice number:");
			System.out.println("1. Login");
			System.out.println("2. New student registration");
			System.out.println("3. Update Password");
			System.out.println("4. Exit");

			// Get user choice and act on it.
			choice = scannerObj.nextInt();
			scannerObj.nextLine();
			switch(choice) {
			case 1:
				System.out.println("You have chosen: 1. Login");
				LoginOperationService a = new LoginOperationService();
				a.login();
				break;
			case 2: 
				// Do new student registration.
				break;
			case 3:
				// Procedures for update password.
				break;
			case 4:
				interactWithClient = false; // Exit the service.
				break;
			default:
				System.out.println("Error!! Input valid choices.");
				// Write code to handle this.
			
			}
		}
		System.out.println("\nThanks for Interacting with us!");
		//scannerObj.close();
		
	}
	
	
}



















