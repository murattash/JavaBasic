package com.neotech.lesson22;

public class Addition {
	
	//Compile Time Polymorphism
	
	//we have the same name for methods but different parameters or type > method overloading
	//order is important
	//you cannot create two the same methods 
	
	void add (int a, int b) {
		System.out.println(a + b);
	}

	void add (int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	void add (double a, double b) {
		System.out.println(a + b);
		
	}
	
	void add (double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	void add(double d, int i) {
		System.out.println(d +i);
	}
	
	void add(String s, int i) {
		System.out.println("You cannot add them!!");
	}
	
}