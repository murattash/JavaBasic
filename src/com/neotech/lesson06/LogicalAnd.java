package com.neotech.lesson06;

public class LogicalAnd {
	
	public static void main(String[] args) {
		
		//Declare a number
		//if number is between 1-10 >> n is small 
		//if number is between 11-100 > n is medium
		//if number is between 101-1000 >> n is large 
		
		
		int number = 2356;
		
		if (number >= 1 && number <=10) {
			
			System.out.println(number + " is small");
		
		} else if (number > 10 && number <=100) {
			
			System.out.println(number + " is medium");
			
		} else if (number >100 && number <= 1000) {
			
			System.out.println(number + " is large");
			
		} else {
			
			System.out.println(number + " is out of range");
			
		}
		
	}

}
