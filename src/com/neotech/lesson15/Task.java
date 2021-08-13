package com.neotech.lesson15;

public class Task {
	
	
	//Create a method that will take 2 parameters as numbers and prints which number is larger.
	void large(int a, int b) {
		
		if (a > b) {
			System.out.println(a + " is larger");
		} else {
			System.out.println(b + " is larger");	
		}
	}

	//Create a method that will take a number and prints whether the number is even or odd.
	void evenOdd (int r) {
		
		if (r % 2 == 0) {
			
			System.out.println(r + " is even number");
		} else {
			System.out.println(r + " is odd number");
		}
	}
	
	//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	void hello (String greeting) {
		
		if (greeting.equals("Hello")) {	
			System.out.println(greeting + " this is how we say hi in USA");
		} else if (greeting.equals("Salom")) {
			System.out.println(greeting + " this is how we say hi in Uzbekstan");
		}	
	}

	public static void main(String[] args) {
		
		Task find = new Task();
		
		find.large(10, 50);
		
		Task find2 = new Task();
		
		find2.evenOdd(9);
		
		Task find3 = new Task();
		
		find3.hello("Salom");
		
	}
		
	
}
