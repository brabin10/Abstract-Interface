package com.revature;

public class Launcher {

	public static void main(String[] args) {
		//instantiate two MyThread object
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setPriority(1);
		t2.setPriority(10);

		try {
			t3.join();
		}
		catch (InterruptedException e) {
			System.out.println("Exception caught");
		}

		//let both threads start using the start() method
		t1.start();
		t2.start();
		t3.start();
		
	}
}
