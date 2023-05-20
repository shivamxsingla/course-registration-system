/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

/**
 * @author ramasamy.kandasamy
 *
 */
public class CRSStudentMenu {
	public static void displayMenu() {
		System.out.println("1. Add course");
		System.out.println("2. Drop course");
		System.out.println("3. View grades");
		System.out.println("4. Pay fees");
		System.out.println("5. Exit");
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
