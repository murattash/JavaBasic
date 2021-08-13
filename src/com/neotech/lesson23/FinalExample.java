package com.neotech.lesson23;

public class FinalExample {
	
	//instance variable 
	final String str = "I love Java!";
			
	final void printVariable() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
	//	fe.str = "I don't love Java"; //final variable cannot be changed 
		
		fe.printVariable();
	}
}

class ChildClass extends FinalExample {
	String str = "Child Class";
	
//	void printVariable() { //CE: you cannot modify/override a final method
//		System.out.println(this.str);
//	}
	
	//this is a different method
	void printVariable(int num) {
		
	}
	
	
}
