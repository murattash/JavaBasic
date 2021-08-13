package com.neotech.lesson13;

public class HW2 {
	
	
	public static void main(String[] args) {
		
		
		String[][] students = { { "Flori", "Mehmet", "Hakan", "Jasmine"}, {"A", "A", "B", "F"} };
		
		
		
	
		//length of array: sutdents.length > numbers of rows
		//length of specific row: students[1].length > number of columns
		
		for (int i = 0; i < students[1].length; i++)
		{
			if (students[1][i].equals("A") || students[1][i].equals("B")) {
				
			System.out.println(students[0][i]);	
				
			}
			
			
		}
		
		
		
	}
	

}
