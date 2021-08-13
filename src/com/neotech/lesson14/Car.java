package com.neotech.lesson14;

public class Car {
	
	//feature of the car (also known as properties)
	
	String make; 
	String model;
	String color;
	int year;
	int maxSpeed;
	
	//this is a blueprint
	//So, by having a class and decelerating all the variables in it, i just use the main method to build an object and keep it clean from variables.

	
	//behavior are below, we will learn about this in the other class 
	
	void drive ()
	{
		System.out.println("This car can drive.");
	}
	
	void stop()
	{
		System.out.println(make + " can stop");
	}
	
	void transportPeopl()
	{
		System.out.println(make + " " + model + " transport people");
	}
	
	
	
	//primitive data type: int, long, byte, short
	//non-primitive data types: String, Car (we can include thing in this)
	
	
	public static void main(String[] args) {
		
		//declare int
		int a = 5;
		
		//declare a string
		String name = "Sabah";
		
		//another way to declare string
		String name2 = new String("Mufasa"); //Scanner scan = new Scanner()
		
		
		//what does this line do?
		Car car1 = new Car(); //creating an object of class Car
		
		//1. declare an object of class Car ---> Car car1;
		//2. instantiation ---> new 
		//3. initialization --> Car()
		
		
		car1.make = "BMW";
		car1.model = "X5";
		car1.color = "Black";
		car1.year = 2021;
		
		Car car2 = new Car();
		
		car2.make = "Toyota";
		car2.model = "Rav4";
		car2.color = "White";
		car2.year = 2021;
		
	}
	
	
	
}
