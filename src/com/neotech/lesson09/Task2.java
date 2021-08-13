package com.neotech.lesson09;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		
//		2. Write a program that the user to declare a positive integer.
// 		It should then print the multiplication table of that number.
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a positive number: ");
		int num = input.nextInt();
		int num2 = 0;
		
		
		while (num2 < 10)
			
		{
			num2++;
			
			System.out.println(num2 + " * " + num + " = " + (num2*num));
			
		}
		
	}

}
