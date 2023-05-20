/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

/**
 * @author ramasamy.kandasamy
 *
 */
public class CRSProfessorMenu {
	public static void displayMenu() {
		System.out.println("1. AddGrades");
		System.out.println("2. View Enrolled Students");
		System.out.println("3. Exit");
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
				terminate = true;
				break;
			default:
				System.out.println("Error! Invalid choice.");
				// Handle the exception.
			}
		}
	}
}
