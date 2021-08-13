package com.neotech.lesson20;

public class ThisKeyword {
	
	int a, b;

	public ThisKeyword () {
		System.out.println("I am default constructor");
		
	}
	
	
	public ThisKeyword (int a, int b) {
		//this keyword 
		//we are trying to assign the value that we get from the user as a parameter
		//to the instance variable 
		//this.a refers to the instance variable
		//a is a local variable
		
		this.a = a;
		this.b = b;
		
		
	}
	
	void sum() {
		int sum = a + b;
		System.out.println("The sum is " + sum) ;
		
	}
	
}
