package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Employee;

public class EmployeeDAO {
	
	ArrayList<Employee> employeeList = new ArrayList<>();
	
	public ArrayList<Employee> getEmployees() {

		employeeList.add(new Employee(1, "Spongebob", "Square"));
		employeeList.add(new Employee(2, "Squidward", "Tentacles"));
		return employeeList;
		
	
	}

}
