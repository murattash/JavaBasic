package com.neotech.lesson05;

public class NestedIf {
	
	public static void main(String[] args) {
	
		boolean isMorning = false; //true or false
		boolean schoolDay = false;
		
		if (isMorning) //if is Morning is true then it checks inside the if block 
		{
			System.out.println("Good Morning");
			
			//this is the begining of the nested if-else statements
			if (schoolDay)
			{	
				System.out.println("You are at school");				
			}
			else //it is a schoolday
			{
				System.out.println("Hangout with family");
			}
				//this is the end of the nested if-else statements 
			
		 } else { // it is not morning
				
			System.out.println("It is not morning");	
				
			}
				
		}

	}		
