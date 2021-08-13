package com.neotech.lesson06;

import java.util.Scanner;

public class TaskOne {
	
	public static void main(String[] args) {
	
		//1. Write a program that asks user to enter first name and then last name. At the end system should display user’s full name.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is your Last name?");
		String lastName = input.next();
		System.out.println("Last name is " + lastName + ".");
		
		System.out.println("What is your First name?");
		String firstName = input.next();
		System.out.println("Last name is " + firstName);
		
		
		System.out.println("The user's full name is " + firstName + " " + lastName);
	}

}

