package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrayWithForEachLoops {

	public static void main(String[] args) {
		
		String[][] animals = {{"cat", "dog", "bird"}, 
							  {"tiger", "wolf", "lion", "bear"}, 
							  {"salmon", "shrimp", "crab"} };
		
		//print all elements with nested for loop
		
		for (int i = 0; i < animals.length; i++)
		{
			for (int j = 0; j <animals[i].length; j++)
			{
				System.out.print(animals[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
	
		//using FOR EACH LOOP
		
		//elements for the animals array (2D) are {"cat", "dog", "bird"}, {"tiger", "wolf", "lion", "bear"}
		for (String[] row : animals) //Array, need to use [] after String 
		{
			//we now loop through the elements found on the row 1D array
			for(String col : row) //this is a String not an Array that is why we are not using [] after String 
			{
				System.out.print(col + " ");
			}
			System.out.println();
			
			
			
		//enhanced for to loop 2D array:
			
		//first loop: for (datatype[] element : 2D array
			
		//second loop: for (datatype x : element (1D))	
			

			
		}
	
		System.out.println();	
		System.out.println();
		
		
		int[][] points = {{90, 67, 88, 56},
						  {85, 45, 90}, 
						  {100, 99, 55, 87, 65}};  
			
			
		for (int[] row : points) //the datatype of row? from 2D to 1D	
		{
			for (int point : row) //the datatype of point?  from 1D to element
			{
				System.out.print(point + " ");
			}
			
			System.out.println();
		}
		
		
		
		
	}
	

}
