package com.neotech.lesson08;

public class IntroToDoWhileLoop {
	
	public static void main(String[] args) {
		
		int num = 5;
		
		
		//while the condition is true, do something 
				//check the condition then run the code
		
		while (num > 15)
		
		{
			
			System.out.println(num + " ");
			num++;
			
		}
		
		
		int num2 = 5;
		
		//do something while the condition is true
			//run the code fist and then check the condition - if condition is true, run again
		
		
		do 	{
			
			System.out.print((num2 + " "));
			num2++;
			
		} while (num2 > 6);
		
	}

}
