package com.neotech.lesson06;

import java.util.Scanner;

public class TaskThree {
	
	public static void main(String[] args) {
		
		//3. Write a program that asks user to enter two numbers and prints which one is larger.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Pick a number?");
		int num1 = input.nextInt();
		System.out.println ("The number you picked is " + num1);
		
		System.out.println("Pick a second number?");
		int num2 = input.nextInt();
		System.out.println ("The number you picked is " + num2);
		
		
		System.out.println("--------------------------");
		
		
		System.out.println("Your numbers are " + num1 + " and " + num2 );
		
		
		System.out.println("--------------------------");
	
		
		if (num1 > num2) {
			
			System.out.println(num1 + " is larger than " + num2);
			
		} else if (num2 > num1) {
			
			System.out.println(num2 + " is larger than " + num1);
		
			
		} else { System.out.println(num1 + " is equal to " + num2);
			
			
		}
	
	}


}
