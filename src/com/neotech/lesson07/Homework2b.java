package com.neotech.lesson07;

import java.util.Scanner;

public class Homework2b {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int day;
		
		//ask user to enter a number from 1-7
		
		System.out.println("Please enter the day number: ");
		day = scanner.nextInt();
		
		///////Using && OPERATORS////////////
		
		if (day >= 1 && day <=5) {
			
			System.out.println("It is a weekday!");
		} 
		
		else if (day >= 6 && day < 7) {
			
			System.out.println("It is a weekend!");
		}
		
		else { 
			
			System.out.println("That is not a day!");
			
		}
		
		///////Using || OPERATORS////////////
		
		if (day == 1 || day == 2 || day ==3 || day == 4 || day == 5) // of them needs to be true 
		{
			 System.out.println("It is a weekday!!!");
		} 
		
		else if (day == 6 || day == 7)
		
		{
			System.out.println("It is a weekend");
		}
		
		else 
			
		{
			System.out.println("This is not a day!!!");	
		}
		
		
		
		///////Using || and && OPERATORS////////////
		if (day >= 1 && day <= 5)
		{
			System.out.println("It is a weekday");
			
		}else if ( day == 6|| day ==7){
			
			System.out.println("It is a weekend");
			
		} else {
			
			System.out.println("This is not a day");
		}
			
		
		
		
	}

}
