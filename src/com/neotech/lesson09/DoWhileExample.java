package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int number;
		
		
		System.out.println("Please guess the number: ");
		number = input.nextInt();
		
		
//		while (number !=7) 
//		{
//			System.out.println("Guess the number");
//			number = input.nextInt();	
//		}
//		System.out.println("You are a winner!");
//		}
	
	
		do {
			
			System.out.println("Guess the number");
			number = input.nextInt();		
			
		} while (number !=7);
	
		System.out.println("You are a winner!");
		
	}

}	