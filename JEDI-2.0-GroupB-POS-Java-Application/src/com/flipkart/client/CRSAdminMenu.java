/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

/**
 * @author ramasamy.kandasamy
 *
 */
public class CRSAdminMenu {
	public static void displayMenu() {
		System.out.println("1. Generate Report Card");
		System.out.println("2. Add Professor");
		System.out.println("3. Approve Student Registration");
		System.out.println("4. Add course");
		System.out.println("5. Remove course");
		System.out.println("6. Exit");
	}
	
	public static int getChoice() {
		displayMenu();
		Scanner scannerObj = new Scanner(System.in);
		int choice = scannerObj.nextInt();
		scannerObj.nextLine();
		return choice;
	}
	
	public static void process() {
		int choice;
		boolean terminate = false;
		while(!terminate) {
			choice = getChoice();
			switch(choice) {
			case 1:
				// pass
				break;
			case 2:
				//pass
				break;
			case 3:
				//pass
				break;
			case 4:
				//pass
				break;
			case 5:
				//pass
				break;
			case 6:
				//pass
				terminate = true;
				break;
				
			default:
				//
				System.out.println("Error! Invalid choice.");
				// Handle the exception.
			}
		}
	}
}
