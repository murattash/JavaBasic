package com.neotech.lesson10;

public class Homework3 {
	
	public static void main(String[] args) {
		
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		int i = 0;
		
		while (i <= 50)
		
		{
			if (i % 3 == 0)	
			{
			
				continue;
			}
			
			else 
			{
				System.out.println(i + " ");
				
			}
			
			i++;
			
		}
		
		
	}

}
