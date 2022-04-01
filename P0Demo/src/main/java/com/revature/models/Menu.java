package com.revature.models;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.daos.EmployeeDAO;

// This Menu Class will have a method that displays a menu to the user that they can interact with : displayMenu()
// Through this menu, the user can give inputs that will interact with the database
public class Menu {
	
	// instantiating the EmployeeDAO object so that we can use it's methods
	EmployeeDAO eDAO = new EmployeeDAO();
	
	// All of the menu display options and control flow are contained within this method
	public void displayMenu() {
		
		boolean displayMenu = true; // We're going to use this to toggle whether the menu continues after user input
		Scanner scan = new Scanner(System.in); // Scanner object to parse (read) user input
		
		//pretty greeting
		System.out.println("Welcome to the Krusty Krab Employee Management System");
		
		// display the menu as long as the displayMenu boolean is true
		while(displayMenu) {
			
			// tell the user to choose an option
			System.out.println("Choose an option");
			
			
			//list out the user's options for them to choose
			System.out.println("1: get greeted");
			System.out.println("2: exit the application");
			System.out.println("2: Show all employees");
			
			//parse the user's input after they choose option, and put it in a  int variable
			int input = scan.nextInt();
			scan.nextLine(); //without nextLine(), the application won't move to the next Line...so we need it!
			
			// Switch statement- depending on the uer's input, do some functionality
			switch(input) {
			
			case 1: {
				System.out.println("Hello User");
				break;
			}
			
			case 2: {
				System.out.println("Bye user! come again soon");
				displayMenu = false;  //remember, the while loop depends on displayMenu being true. So this ends the loop
				break;
			}
			
			case 3: {
				//call the getEmployees() method from the EmployeeDAO, put the results into a variable
				ArrayList<Employee> employees = eDAO.getEmployees();
				//print out the value of our employee variable
				System.out.println(employees);
				
			}
			
			default: {
				// this default block will run if the user inputs a number that isn't one of the options
				System.out.println("Plaase try again");
				break;
			}
			}  //Switch statement ends here
		}  // While loop ends here
	}  // Methods ends here

} //class ends here
