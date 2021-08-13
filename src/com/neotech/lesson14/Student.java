package com.neotech.lesson14;

public class Student {
	
	String name, surname, school;
	int studentID;
	int age;
	
	void study ()
	{
		System.out.println(name + " " + surname + " is studying");
	}
	
	void doHowework()
	{
		System.out.println(name + " is doing the homework");
	}
	
	
	void studentInfo()
	{
		System.out.println(name + " " + surname + " " + studentID + " " + school);
		
	}
	
}
