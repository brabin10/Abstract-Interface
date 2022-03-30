package com.revature;

public class Launcher {
	public static void main(String[] args) {
	//The code inside a method(inside curly braces) is called method body
		
		//This is a print statement
		System.out.println("Hello World!");
		
		//double quotes within double quotes,use\backslashes\
		System.out.println("I typed \"syso\" + ctrl + space to autogenerate this print statement");
		
		//call exampleMethod, and give it some values
		//exampleMethod will run , but we wont' get anything back if we don't PRINT it
		exampleMethod(4,5);
		
		
		
		System.out.println(exampleMethod(13,45));
		
	}
	//Here's an example method
	public static int exampleMethod(int a, int b) {
		return a+b;
	}

}
