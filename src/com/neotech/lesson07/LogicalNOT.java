package com.neotech.lesson07;

public class LogicalNOT {
	
	public static void main(String[] args) {
		
		// this operator --> ! (NOT) - reversing the value of a boolean variable
		
		boolean b1 = !true;
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(b2);
	
		
		
		//! can be put in front of any boolean = !false or !true, if (!cold)
		
		boolean cold = !false;
		
		if (!cold) { System.out.println("cold!");}
		else { System.out.println("not cold"); }
		
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("");
		
		boolean isRaining = !true;
		
		if (isRaining) {System.out.println("Not Raining");} 
		else { System.out.println("Raining"); }
		
	}

}
