package com.neotech.lesson04;

public class IfCondition {

	public static void main(String[] args) {
		
		//Declare a number and compare if the number is larger than 100
		//if it is larger than 100, lets print my number is large
		
		int num = 79;
		
		if (num>100) {
			System.out.println("My number is large");
			
		}
		
		System.out.println("End of code");
		
		System.out.println("----------------------");
		
		num = 157;
		boolean condition = num > 100;
		
		if (condition) {
			
			System.out.println("My number is large");
		}
		
		System.out.println("End of code 2");
		System.out.println("----------------------");
	}
	
	
}
