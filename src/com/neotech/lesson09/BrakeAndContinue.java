package com.neotech.lesson09;

public class BrakeAndContinue {
	
	public static void main(String[] args) {
		
		
		System.out.println("------Break-----");
		for (int i= 1; i <= 10; i++)
			
		{
			if (i == 4) {
				System.out.println("I reached the break statement");
				break;
			}
			
			
			System.out.println(i);
			
		}
		
		
		System.out.println("------Continue-----");
		for (int i= 1; i <= 10; i++)
			
		{
			if (i == 4) {
				System.out.println("I reached the continue statement");
				continue;
			}
			
			
			System.out.println(i);
			
		}
		
		
		
		
	}

}
