package com.neotech.lesson10;

public class Patterns {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
			
			
		}
		
		for (int r = 5; r > 0; r--) //go from 5 4 3 2 1 // first loop is row numbers
		{
			for (int t = 0; t < r; t++) //go from j to i, but i changes every loop // second loop is how many in that row
			{
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------");

		
		//controlling the for loop
		//ask a user to enter a number ]
		
		int num = 3;
		
		for (int g = 0; g < num; g++)
			
		{
			
			System.out.println(g + " ");
			
		}
		
	}

}
