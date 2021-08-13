package com.neotech.lesson06;

public class Homework1 {
	
	//We chose this homework to show nested if 
	//if inside if 
	
	public static void main(String[] args) {
		
		//Write a program if a patient has allergies
		
		//if have allergies check > peanut allergy
			//if yes print "Don't eat peanut!"
		
		//if have allergies check > locates allergy
			//if yes print "Don't eat yogurt!"
		
		//if have allergies check > bee allergy	
			//if yes print "Don't eat honey!"
	
		//if have allergies check > seafood allergy	
			//if yes print "Don't eat fish!"
	
	//If patient doesn't have allergies print "You're healthy!" 
		
		
		//how to fomat the code on Mac > cmd + shift + f
		
		
		boolean allergy = true;
		boolean peanut = false;
		boolean bee = false;                
		boolean seafood = true;
		boolean lactose = true;
		
		if(allergy) {
			System.out.println("You have allergy.");
			
			if (peanut) { 	
				
				System.out.println("Don't eat peanut");
			} else {
				
				System.out.println("You can eat peanut!"); //Example for nested if 
			}
			
			if (bee) {
				System.out.println("Don't eat peanut ");
				
			}
			
			if (lactose) {
				System.out.println("Don't drink mulk");
				
			}
			
			if (seafood) {
				System.out.println("Don't eat fish");
				
			}
			
		} else {
			
			System.out.println("You are healthy");
			
		}
		
	}

}
