package com.neotech.lesson09;

public class Homework1 {

	public static void main(String[] args) {
		
		// 1st way, increment by 1
		int i = 0;
		int sum = 0;
		
		while ( i <= 10)
		
		{
			
			if (i % 2 == 0)
				
			{ //even 
				
				sum = sum + i;
				
			}
			
			
			i++;
		}
		
		System.out.println("Sum = " + sum);
		
		System.out.println("---------------------");
		
		
		int j = 0;
		int total = 0;
		
		while (j <= 10)
			
		{
			total += j;
			
			j += 2;	
			
			
		}
		
		
		System.out.println("Total = " + total);
		
		
		
		
		
	}
	
	
}
