package com.neotech.lesson19_1;

//import only employee class from package lesson 19
//import com.neotech.lesson19.Employee;

//this imports all the classes on the specified package
import com.neotech.lesson19.*;

public class EmployeeOutsidePackage {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
	//	Employee.company = "NeoTech"; //company has default access modifier 
		
		emp.empName = "Komron";
	//	emp.empLastName = ""; cant see
	//	emp.salary = 80; default 
	//	emp.ssn = 12234; cant see	
		
		
		emp.method1();
	//	emp.method2(); cant see
	//	emp.method3(); cant see
	//	emp.method4(); cant see
		
		
		
		
	}

}
