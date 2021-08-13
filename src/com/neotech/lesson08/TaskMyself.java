package com.neotech.lesson08;

public class TaskMyself {
	
	public static void main(String[] args) {
		
		boolean workDay = false;
		
		int day = 1;
		
		while (day <= 7)
			
		
		{  
			
			if (day <=5 && workDay == true)
				
			{
				System.out.println("It is a workday");
				
		
			} else if (day <=5 && workDay == false) {
				
				System.out.println("I need a day off");
				
				
			} else if (day == 6) {
				
				System.out.println("I do not need a day off any more");
				
			}
			
			
			day++;
			
		}
		
		
	}

}
