package com.neotech.lesson08;

public class IntroToWhileLoop {
	
	public static void main(String[] args) {
		
		int time = 8;
		
		
		//IF A LOOP EXECUTES, ALWAYS > INFINITE LOOP
		
		while (time < 12) //here we write the condition
			
		{   //begins the while block 
			
			//this code is only executed if the condition is true 
			
			System.out.println("Time is " + time);
			
			time++;
			
			System.out.println("Time is executed");
			
		}	//ends the while block 
	
		
// Another example! 	
		
		
		
		//Print numbers from 1 to 50
		
		int num1 = 0;
		
		while (num1 <= 50)
			
		{
		
			System.out.println("The number is " + num1);
		
			num1++;
			
		}
		
		
// How to print 20 to 30
		
		int num2 = 20;
		
		while (num2 <= 30)
			
		{
			
			System.out.print(num2 + " ");
			
			num2++;
			
		}
		
		
		
	}

}
