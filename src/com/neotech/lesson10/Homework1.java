package com.neotech.lesson10;

public class Homework1 {
	
	public static void main(String[] args) {
		
		//Write a program using while loop that calculates the sum of the even numbers between 0 and 10.
		
		
		int sum = 0;
		
		//between 0 - 10 --> run a loop from 0 to 10
		int i = 0;
		
		while (i <= 10)
		
		{
				//1st way:
				//0 2 4 6 8 10
			
			sum = sum +i;
			
				//increment 
			i +=2;
				
		}
		
		
		System.out.println("Sum using firsst way: " + sum);
		
		System.out.println("---------------------");
		
		int j = 0;
		int sum1 = 0;
		
		while (j <= 10);
		
		{
			if (j % 2 == 0)
			{
				
				sum1 = sum1 + j;
				
			}
			
			//increment 
			
			j++;
			
			
		}
		
		System.out.println("Sum using the second way: " + sum1);
		
		
	}

}
