package com.neotech.lesson18;

public class Employee {
	
//	Create a Class called Employee:
//		Create three variables eID , salary and set the CEO to “Elion”
//		Create two objects of the class Employee
//		Set the value of eID, salary for each of the objects
//		Print out the eID , salary and CEO for each of the objects
//	
	
		int eID;
		int salary;
		
		static String ceo = "Elion";
	
		
		void printEmpoyee() {
			
			System.out.println("ID: " + eID + ", Salary: " + salary + ", CEO: " + ceo) ;
		}
		
		
	public static void main(String[] args) {
		
		Employee.ceo = "Ahmet";
		
		
		//Employee.eID = 4; //we cannot, because instance variables are accessed through an object
		
		Employee emp1 = new Employee();
		emp1.eID = 1;
		emp1.salary = 50000;
		
		
		Employee emp2 = new Employee();
		emp2.eID = 2;
		emp2.salary = 55000;
		
		emp1.printEmpoyee();
		emp2.printEmpoyee();
		
	}

}
