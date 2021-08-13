package com.neotech.lesson21;

public class Car {
	
	String make, model;
	
	Car()
	{
		System.out.println("I ma a parent default constructor");
	}

	Car(String make, String model)
	{
		this.make = make;
		this.model = model;
	}
	
}


class Mercedes extends Car {
	
	String sportModel;
	
	Mercedes(){
		//super(); //has to be on the first line and only in the constructor
		//super("Mercedes", "E500"); //this uses super class 
		System.out.println("I am a child default constructor");
	}
	
	Mercedes(String make, String model, String sportModel){
		
//		//First way
//		super.make = make;
//		super.model = model;
//		this.sportModel = sportModel;
		
		super(make, model);
		this.sportModel = sportModel; 
	
	}
	
	void display() {
		
		System.out.println(make + " " + model + " " + sportModel);
		
	}
	
}





