package com.neotech.lesson05;

public class TaskWithTeacher {
	
	public static void main(String[] args) {
		
		//is it Friday... "Its Friday, I am going to watch a movie!"
				//if date is 13... "I will watch a scary movie!"
				//if date is not 13.. "I will watch a comedy
		//if not Friday... "Its not Friday, I am going to study Java."
		
//Make sure to follow this steps when doing future TASK! 
		
		
		boolean isFriday = false;
		int date = 14; 
		
		if (isFriday)
		{
			System.out.println("Its Friday, I am going to watch a movie!");
			
			//beginning nested if-else
			if (date == 13)
			{
				System.out.println("I will watch a scary movie!");
			}
			else
			{
				System.out.println("I will watch a comedy");
			}
			//ending nested if-else 
		}
		else
		{
			System.out.println("Its not Friday, I am going to study Java");
		}
		
		
	}

}
