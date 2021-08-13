package com.neotech.lesson03;

public class VariablesTask1 {
	
	public static void main(String[] args) {
		
		String name = "Murat";
		String lastName = "Tashpulatov";
		String grade = "B-";
		String city = "Fairfax";
		String state = "VA";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		
		name = "Mark";
		lastName = "Johnson";
		grade = "A";
		city = "Richmond";
		state = "VA";
		String phoneNumber = "4232324";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		//What if we want to print them in one sentence? 
		//We can use concatenation
		System.out.println(name+ " " + lastName + " " + grade + " " + city + " " + state);
		
		//what if we use System.out.print()
		//System.out.print() does not print a new line 
		
		
		
	}

}
