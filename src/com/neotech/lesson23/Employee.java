package com.neotech.lesson23;

public class Employee {
	double salary;

	void getPaid() {
		System.out.println("The employee salary is " + salary);
	}
	
}

class Contractor extends Employee{
	double hourly;
	
	void getPaid() { //this method overrides the parent getPaid() method
		System.out.println("The employee salary is " + hourly);
	}
		
}

class FullTimeEmployee extends Employee {
	
}
