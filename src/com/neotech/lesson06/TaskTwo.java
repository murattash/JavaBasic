package com.neotech.lesson06;

import java.util.Scanner;

public class TaskTwo {
	
	public static void main(String[] args) {
		
		//Write a program that calculates the sum of two numbers entered by the user.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Pick a number?");
		int num1 = input.nextInt();
		System.out.println ("The number you picked is " + num1);
		
		System.out.println("Pick a second number?");
		int num2 = input.nextInt();
		System.out.println ("The number you picked is " + num2);
		
		System.out.println("The total equals = " + (num1 + num2));
	}

}
