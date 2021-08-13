package com.neotech.lesson26;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		//INTO:
		// - wrapper class: converting primitive data types to objects
		
		
		/*
		 *  class Integer {
		 *  	int value; 
		 * 
		 * 		getter();
		 * 		setter();
		 * 
		 */
		
		
		
		int a = 10;
		
		Integer c = new Integer(10); //boxing -- putting a primitive type int into an integer object
		Integer b = 10; //autoboxing
		
		//Long way
	// String str = new String("Saturday");
		//short way
	// String str2 = "Saturday";	
		
		//unboxing -- putting the value of an Integer object to an int primitive type
		int d = b.intValue();
		
		//automatic unboxing
		int e = b;
		
		//c, b are objects of type Integer
		//a, d, e are primitive int data types
		
		
		System.out.println("Other wrapper classes:");
		
		Boolean bool = true; //auto boxing 
		Boolean bool2 = new Boolean (true); //boxing 
		
	}

}
