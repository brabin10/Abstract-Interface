package com.revature;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("=====Common Primitieves=====");
		
		int i = 20000;
		
		//we can use the + to concatenate strings and other values to each other
		System.out.println("The value is: " + i);
		
		//chars are 2 bytes in size and written in single quotes, unless they're numbers
		//They represent a single character
		
		char c = 'a';
		char c3 ='$';
		
		System.out.println(c);
		System.out.println(c3);
		
		double d = 2;
		System.out.println("the value of double is: " + d);
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("Arithmetic operators");
		
		//creating variables to demonstrate arithmetic operators
		int sum = 5 + 5;
		int difference = 20 - 5;
		int product = 5 * 2;
		int quotient = 100 / 10;
		int remainder = 30 % 20;
		
		System.out.println(sum + difference + product + quotient + remainder);
		
		
		int funnyNum = 25;
		System.out.println("funny number is: " + funnyNum);
		
		funnyNum++;
		System.out.println("funny number is: " + funnyNum);
	}

}
