package com.neotech.lesson22;

public class School {
	
	
	public static void main(String[] args) {
		
		PianoTeacher pt = new PianoTeacher("John", "Smith", true);
		
		
	}
	
	String fname, lname;
	
	School(){
		
	}

	School(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		
	}
}

class MathTeacher extends School {
	
	String salary; // i need to initialize this before adding to a math teacher
	
	MathTeacher(){
		
	}
	
	
	MathTeacher(String fname, String lname, String salary) {
		super(fname, lname);
		this.salary = salary;
		
	}
	
}

class PianoTeacher extends School {
	boolean certified;
	
	PianoTeacher(String fname, String lname, boolean certified) {
		super(fname, lname);
		this.certified = certified;
	}
	
}
