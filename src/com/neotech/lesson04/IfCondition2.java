package com.neotech.lesson04;

public class IfCondition2 {
	
	public static void main(String[] args) {
		//if you have more than $5000 in your bank account
		//then you can buy a LV bag
		
		int balance = 1200;
		
		if (balance > 5000) {
			
			System.out.println("I will buy a LV bag");
			System.out.println("I am happy");

		}
		
		System.out.println("I am outside of the mall.");
		
		System.out.println("-----------------------");
		
		//you should practice Java 15 hours per week
		//if you are practicing 15 hours or more, you will love java 
		//otherwise you will not love Java
		
		int practiceHours = 14;
		if (practiceHours >= 15) {
			
			//if statement is true this part will be executed 	
			System.out.println("Then you will love Java!!!");
			
			} else { 
			
		    //if statement is false this part will be executed 
			System.out.println("You will hate Java!!!");
				
			}
				
			System.out.println("This will alway be printed");
		
	}

}
