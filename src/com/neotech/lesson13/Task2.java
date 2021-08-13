package com.neotech.lesson13;

public class Task2 {
	
	public static void main(String[] args) {
		
		
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
		
		int sum = 0;
		int[][] num = {{5, 4, 8}, {9, 2, 3}, {7, 4, 9} };
		
		
		for (int row = 0; row < num.length; row++)
		{
			for (int col = 0; col < num[row].length; col++)
			{
				sum = sum + num[row][col];
			}		
		}
		System.out.println(sum);
		
		
		System.out.println();
		
		
		
		int sum1 = 0;
		
		for (int[] row : num)
		{
			for (int col : row)
			{
				sum1 = sum1 + col;
			}	
		}
		System.out.println(sum1);
		
		
	}

}
