package com.neotech.lesson09;

public class Task {

	public static void main(String[] args) {
		
		

		
		
		//Print numbers from 1 to 100 in 1 line with space
		for (int i = 1; i <= 100; i++)
		{
			System.out.print(" " + i);	
		}
		
		
		System.out.println("--------------------");
		
		//Print numbers from 100 to 1
		for (int k = 100; k >= 1 ; k--)
		{
			System.out.println(k);
		}
		
		System.out.println("--------------------");
		
		//Print even numbers from 20 to 1 (2 ways)
		for (int y = 20; y >= 1; y--)
		{
			 if (y % 2 == 0)
			 {	 
				 System.out.println(y);	 
			 }
		}
		
		System.out.println("--------------------");
		
		
		//Print odd numbers between 20 and 50 (2 ways)
		for (int p = 20; p <= 50; p++)
		{
			if (p % 2 == 1)
			{
				System.out.println(p);
			}
			
		}
		
		
		
	}		
}
