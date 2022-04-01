
package com.revature.models;

// This Class models the employees table in our database
public class Employee {

	// Variable for the employee class - must match the employees table in the database
	// note the private variables, private coupled with getters and setters (see below) are how we achieve ENCAPSULATION
	private int employee_id;
	 
	private String first_name;
	private String last_name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employee_id, String first_name, String last_name) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	//this class won't have any methods, we just need it to represent (aka MODEL) some data
	
}
