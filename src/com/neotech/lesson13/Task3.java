package com.neotech.lesson13;

public class Task3 {
	
	public static void main(String[] args) {
		
		// Create an array of cars : American, German, Korean, Italian. 
		// Then retrieve all values from that array using 2 different loops
		
		String [][] cars = { {"Tesla", "Ford", "Chevrolet"}, 
							 {"Audi", "Porsche", "Volkswagen"}, 
							 {"Toyota", "Honda", "Nissan"} };
		
		
		for (int row = 0; row < cars.length; row++)
		{
			for (int col = 0; col < cars[row].length; col++)
			{
				System.out.print(cars[row][col] + " ");
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for (String [] row : cars)
		{
			for (String col : row)
			{
				System.out.print(col + " ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
