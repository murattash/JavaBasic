package com.neotech.lesson19;

public class Employee {
	
	static String company;

	public String empName;
	protected String empLastName;
	
	double salary;
	
	//		type name
	private int ssn;
	
	//    OPT
	//access modifier 
	public void method1(){
		System.out.println("I am public method");
	}
	
	
	protected void method2(){
		System.out.println("I am protected method");
	}
	
	
	void method3 (){
		System.out.println("I am default method!!");
	}
	
	
	private void method4(){
		System.out.println("I am a private method");
	}
	
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();	
		company = "NeoTech";
		emp.empName = "Sabah";
		emp.empLastName = "Bushaj";
		emp.salary = 60;
		emp.ssn = 1223456;
		
		
		//can we access the methods
		
		emp.method1();
		emp.method2();
		emp.method3();
		emp.method4();
	}
	
}
