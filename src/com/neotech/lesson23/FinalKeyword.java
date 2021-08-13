package com.neotech.lesson23;

public class FinalKeyword {
	
	//final variable
	public static String hello = "Hello!";
	public static final String goodbye = "Goodbye!";
	
	public static final double PI = 3.14; //PI will not change
	
	
	//can we overload?
	//can we override?
	protected final void hello() {
		System.out.println("I am a final method");
	}
	
	public final void hello(String name) { //overloading works for final keyword
		System.out.println("Hello " + name );
	}
	
	public static void main(String[] args) {
		
	//	goodbye = "Bye"; //compiler error: you cannot modify a final variable
		
		final int age = 25;
	//	age = 26;
		
		
	}

}

class SubClass extends FinalKeyword {
	// public void hello() { //compiler error: you cannot override a final method		
	// }

	public void hello (int num) { //new method, not overriding. signature is different
		
	}
	
}
