package com.neotech.lesson13;

public class Task {
	
	public static void main(String[] args) {
		
		int [][] numbers = {{34, 56, 34, 34}, {56, 87, 23, 78}, {34, 87, 34, 98} };
	
		for (int u = 0; u < numbers.length; u++)
		{
			for (int p = 0; p < numbers[u].length; p++)
			{
				System.out.print(numbers[u][p] + " ");
			}
			System.out.println();
			}
		
		System.out.println();
		System.out.println();
		
		
		for (int u = 0; u < numbers.length; u++)
		{
			for (int p = 0; p < numbers[u].length; p++)
			{
				if (numbers[u][p] % 2 == 0) { //Modules operator 
					
					System.out.println("The even number is " + numbers[u][p] + " ");
				}
				
				
			}
			
			System.out.println();
		}
		
	
		
		
	}

}
