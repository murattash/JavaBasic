package com.neotech.lesson10;

public class Task3 {
	
	public static void main(String[] args) {
		
		
		//this loop will be responsible to add rows
		for (int i = 0; i < 5; i++)
		{
			//this loop will add spaces before printing starts
			for (int k = 5; k > i; k--)//at the top we need more space than at the base of the pyramid
			
			{
				System.out.print(" ");
			}
			//this loop will add starts also with spaces in the shape of the pyramid
			for (int j = 0; j <= i; j++)
			
			{
				
				System.out.print("* ");
				
			}
			
			System.out.println("");
		}
		
		
	}

}
