package com.neotech.lesson15;

public class CalculatorWithReturn {
	
	int add (int a, int b) { //
		
		int sum = a + b;
		
		return sum;
		
	}  //this will return the data type that you picked 
	
	
	int multiply (int a, int b) {
		//let me do it in one step
		return  a * b; 
		
		
	}
	
	//This method will get two numbers
	//And will return the division
	double divide (double a, double b) {
		double result = a/b;
		return result;
	}
	
	
	int giveMeBackSmth() {
		System.out.println("I am inside giveMeBackSmth");
		return 3;
	}

	void dontGivemMeBackAnth () {
		System.out.println("I am inside dontGivemMeBackAnth");
		
	}
	
}
