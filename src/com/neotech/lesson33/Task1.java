package com.neotech.lesson33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int age;
		String name = " ";
		
		
		try {
			System.out.println("Etner your name: ");
			name = scan.next();
			
			System.out.println("Enter your age: ");
			age = scan.nextInt();
		}
		
		catch (InputMismatchException ime) {
			System.out.println("We caught an InputMismatchException");
			System.out.println(name);
		}
		
		
	}

}
