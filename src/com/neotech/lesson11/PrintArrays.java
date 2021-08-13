package com.neotech.lesson11;

public class PrintArrays {
	
	public static void main(String[] args) {
		
		
		int[] points = {90, 46, 98, 67, 43, 56, 100, 89};
		
		//printing one
		System.out.println(points[5]);
		
		int lenght = points.length;
		
		//to print all values in points array the loop must start at 0 and must end at length - 1
		
		
		// do not put <= in the length part. We do not want to exceed the length 
		for (int i = 0; i < lenght; i++)
		{
			//1st loop: i = 0, so we print points[0]
			//2nd loop: i = 1, we print points [1]
			System.out.print (points[i] + " ");
			
		}
		
		
		
	}

}
