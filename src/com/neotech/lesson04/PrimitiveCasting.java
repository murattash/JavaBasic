package com.neotech.lesson04;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		//Smallest to the biggest 
		//byte > sshort > int > long > float > double
		
		double d1 = 7.5; //no casting/conversation
		System.out.println(d1);
		
		double d2 = 7; //casting is happening
		System.out.println(d2);
		
		//widening, implicit casting, is done automatically 
		int num1 = 10;
		double d3 = num1; //casting 
		System.out.println("This is double >> " + d3);
		
		//narrowing, explicit casing, manually 
		//int num2 = 7.9; //Type mismatch: cannot covert from double to int
		
		int num2 = (int) 7.9; //I tell the compiler: I want to store it as an integer 
		System.out.println(num2);
		
		//narrowing, explicit casting, should be done manually 
		byte b1 = (byte) 12345; //I will take the responsibility
		System.out.println("This is byte >> " + b1);
		
		System.out.println("------------------------------");
		
		int i2 = 5;
		byte b2 = (byte) i2; //I may or may not lose data
		System.out.println("From int to byte >> " + b2); //I didn't lose any data
		
		long long1 = 85;
		int number5 = (int) long1; //I may lose data 
		System.out.println("From long to int >> " + number5); 
		
		//narrowing 
		//you are trying to fit something big into a small container
		long long2 = 213124324324l;
		int int2 = (int) long2; //I may lose data 
		System.out.println("From long to int >> "+ int2);
		
		int number10 = 195;
		float f3 = (float) number10; //you can specify it, but you don't need
		float f4 = number10;
		System.out.println("From int to float >> " + number10);
		
		// Quick task
		// try to store 5.84 into a byte
		// try to store 19 as double
		
		//narrowing
		byte b5 = (byte) 5.84;
		
		//Widening, automatically	
		double d5 = 19; 
		
		System.out.println("-----------------------------");
		
		// Create a int variable named number1, assign the value of 500.
		// Store/assign number1 into a byte name number2
		// Re-assign the number1 into number2.
		// Print the value of number2. Check if it is 500
		// What if the initial value was 50?
		
		int number1 = 500;
		byte number2 = (byte) 500;
		number1 = number2;
		System.out.println(number2);
	
		int number3 = 50;
		byte number4 = (byte) 50;
		number3 = number4;
		System.out.println(number4);
	
		System.out.println("-------------------------------");
		//Teacher version of this Task
		
		int number100 = 500;
		byte number200 = (byte) number100; //narrowing, manually
		System.out.println(number200);
				
		
	}
	

}
