package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) 
		
			{
			
			//1 loop: i = 1, I want j to run only once ( 1
			//2 loop: i = 2, I want j to run two times (1 2
			for (int j = 1; j <= i; j++) 
			{
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
			
		}
		
		
		for (int i = num; i > 0; i--)
		{
			
			//1 loop: i = 5, j will run from 1 to 4
			//2 loop: i = 4, j will run from 1 to 3
			for (int j = 1; j < i; j ++) 
			{
				System.out.print(j + " ");
				
			}
				
			
			System.out.println();
		}
		
		
		
	}

}
