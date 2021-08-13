package com.neotech.lesson10;

public class EasyPatterns {
	
	public static void main(String[] args) {
		
		
		for (int j = 0; j < 5; j++)
		{
			
			System.out.print("*");
			
		}
			System.out.println("");
			
		for (int j = 0; j < 4; j++)
		
		{
			
			System.out.print("*");
			
		}
		System.out.println("");
		
		for (int j = 0; j < 3; j++)
			
		{
			
			System.out.print("*");
			
		}
		System.out.println("");
		
		for (int j = 0; j < 2; j++)
			
		{
			
			System.out.print("*");
			
		}
		System.out.println("");
		
		for (int j = 0; j < 1; j++)
			
		{
			
			System.out.print("*");
			
		}
		System.out.println("");
		
		
		
		System.out.println("------------------"); //this shows us how long it would takes us to do it without a for loop
		
		
		
		for (int row = 0; row <= 5; row++)
		{
			
			for (int col = 0; col < row; col++)
				
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
	}

}
