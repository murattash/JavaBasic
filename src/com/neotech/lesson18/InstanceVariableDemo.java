package com.neotech.lesson18;

public class InstanceVariableDemo {
	
	public static void main(String[] args) {
		
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		
		
		
		InstanceVariables obj1 = new InstanceVariables();
		
		obj1.name = "Evis";
		System.out.println(obj1.name);
		
	}
		
		
	
}
