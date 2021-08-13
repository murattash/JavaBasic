package com.neotech.lesson14;

public class CarFactory {
	
	public static void main(String[] args) {
		
		
		
		Car car1 = new Car(); //ca1 is the object
		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Blue";
		car1.year = 2012;
		
		
		car1.drive();
		car1.stop();
		car1.transportPeopl();
		
		Car car2 = new Car();
		car2.make = "Honda";
		car2.model = "Accord";
		car2.color = "Green";
		car2.year = 2013;
		
		System.out.println(car1.make + " " + car1.model);
		
		
	}

}
