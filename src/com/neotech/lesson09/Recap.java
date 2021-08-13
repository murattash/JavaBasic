package com.neotech.lesson09;

public class Recap {
	
	
	public static void main(String[] args) {
		
		//Let's print "Hello" 5 times 
		
		// 1st way,
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		
		
		//2nd way, using while loop
		int i = 1;
		
		while (i <= 5) {
			
			System.out.println("Hello");
			
			//i = i + 1;
			//i += 1 ; 
				
			i++;
			
		}
		
		System.out.println("----------------------");
		
		
		//3rd way, using do-while loop
			int j = 1;
			
		do {
			
			
			System.out.println("Hello");
			
			j++;
			
		} while (j <=5);
		
		
		System.out.println("**********************");
		System.out.println("Using While");
		
		int k = 10;

		while (k <=5)
		
		{
		
			System.out.println("Bye");
				
			
		}
		
		System.out.println("**********************");
		System.out.println("Using Do While");
		
		int m = 10;
		
		do {
			
			System.out.println("Bye");
			
			
			
		} while (m <=5 );
				
		
		
	}

}
