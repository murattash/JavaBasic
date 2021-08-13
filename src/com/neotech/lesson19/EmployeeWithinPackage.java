package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
			
		Employee emp = new Employee();
		Employee.company = "NeoTech";	
		emp.empName = "Sahin";
		emp.empLastName = "Erol";
		emp.salary = 70;
		//emp.ssn = 11234; you cannot access if from a different class
		
		emp.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); not visible from here 
		
	}

}
