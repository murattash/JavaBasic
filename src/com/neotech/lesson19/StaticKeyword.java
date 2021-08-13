package com.neotech.lesson19;

public class StaticKeyword {
	
	//instance variables 
	String color;
	int memory;
	
	//class/static variables
	static String brand;
	static boolean touchscreen;

	
	
	//not static --- instance method
	//instance methods can access and use all the variables inside the class 
	void displaySpecification() 
	{
		System.out.println("We build an " + brand + " with " + memory + "GB with " + color + " color!");	
	}
	
	static void displaySpecificInfo_2()
	{
		System.out.println("Brand is " + brand + " and toouchsceen is " + touchscreen);
		//We can use instance variables when printing static method 
		//System.out.println("We build a " + brand + " with " + memory + "GB " + color + " color!");
	}
	
	public static void main(String[] args) {
		
		//when we access static variables, we do not need an object 
		StaticKeyword.brand = "Iphone";
		StaticKeyword.touchscreen = true;
		
		StaticKeyword obj1 = new StaticKeyword();
		obj1.color = "Black";
		obj1.memory = 64;
		
		obj1.displaySpecification();
		
		//this has to be access as static 
		StaticKeyword.touchscreen = false;
		
		//because we are in the same class, we can call static variables without class 
		touchscreen = true;
		
		displaySpecificInfo_2();
		
	}
	
	
	
	
}
