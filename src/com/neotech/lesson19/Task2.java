package com.neotech.lesson19;

public class Task2 {
	
//	Create a method that will take a String as a
//	parameter and returns reversed String. Method
//	should be available to all classes within your project
//	and accessible by class name.

	static String name = "Murat"; 
	
	
	public void String (String reverse) {
				
		for (int i = name.length() - 1; i >= 0; i--) {
			
			System.out.print(name.charAt(i));
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Task2 rvr = new Task2();
		
		rvr.String(name);
		
	}
	
}
