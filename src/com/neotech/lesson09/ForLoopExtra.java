package com.neotech.lesson09;

public class ForLoopExtra {
	
	public static void main(String[] args) {
		
		//print number from 21 to 30
		
		System.out.println("print numbers from 21 to 30");
		for (int i = 21; i <= 30; i++)
			
		{
			System.out.println(i);	
		}
		
	
		System.out.println("print numbers from 50 to 1");
		for (int i = 50; i >= 1; i-- )
		{
			
			System.out.println(i);
		}
		
		
		System.out.println("Print odd numbers from 1 to 10, 1st way");
		for (int i = 1; i <=10; i += 2)
		{
			System.out.println(i);
			
			
		}
		
		System.out.println("Print odd numbers from 1 to 10, 2nd way");
		for (int i = 1; i <= 10; i++)
		{
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("Print odd numbers from 1 to 10, 3nd way");
		for (int i = 1; i <= 10; i++)
		
		{
			if (i % 2 == 1) //this is how i know this will be an odd number, 0 is even 
			
			{System.out.println(i);}
			
		}
			
		System.out.println("What is the result?");
		int total = 0;
		for (int i = 3; i <= 6; i++)
		{
			System.out.println(i);
			total += i;
		}
	
			System.out.println("Total = " + total);
			
			
			
			
	}

}
