package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Employee;

public class EmployeeDAO {
	
	//For now, I'll have an ArrayList of Employee objects, which will act as our fake database
	ArrayList<Employee> employeeList = new ArrayList<>();
	
	
	// This TEMPORARY method will return the employees from the database
	public ArrayList<Employee> getEmployees() {

		
		//first, fill the Arraylist with some data
		employeeList.add(new Employee(1, "Spongebob", "Square"));
		employeeList.add(new Employee(2, "Squidward", "Tentacles"));

		return employeeList;
		
	
	}

}
