package com.neotech.lesson23;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.salary = 90000;
		emp.getPaid();
		
		
		Contractor ct = new Contractor();
		emp.salary = 100;
		emp.getPaid();
	
		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 100000;
		ft.getPaid();
		
	}
	
	
}
