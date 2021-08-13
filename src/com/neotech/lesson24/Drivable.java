package com.neotech.lesson24;

public interface Drivable {
	
	//this is a Public Static Final boolean move_fast, this is added by java itself
	boolean move_fast = true;
	
	//even though we are not saying abstract in front of it, Java ads it itself
	//because every method created in an interface is abstract
	void drive();
}

abstract class Vehicle {
	//here we can define implemented methods and undefined/abstract methods
	
	void start(){
		System.out.println("Vehicles can start");
	}
	
	abstract void stop();			
}


//achieving multiple inheritance
class Cars extends Vehicle implements Drivable {

	@Override
	public void drive() {
		System.out.println("Car Drive");
	}

	@Override
	void stop() {
		System.out.println("Car Stop");
	}
	//a class extends another class 
	//a class implements an interface
	//an interface extends an interface 	
}

class Trucks extends Vehicle implements Drivable {

	@Override
	void stop() {
		
	}

	@Override
	public void drive() {
		
	}
	
	
}