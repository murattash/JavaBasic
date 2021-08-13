package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. Write a program that asks user to enter his/her username and password until user enters them correctly.

		
		Scanner scan = new Scanner (System.in);
		
		String userName = "user";
		String passWord = "user!123";

		
		//user inputs
		String un;
		String ps;
		boolean flag = false; //while doesn't execute of condition is false
		
		
		do {
			
		
		System.out.println("Enter username and password");
		un = scan.next();
		ps = scan.next();
		
		//when user enteres the right values, looping must stop.
		if (userName.equals(un) && passWord.equals(ps))
		{
			System.out.println("You are logged in now");
			break;
			//another way: instead of brake, you can make flag = false
		}
		
		
		} while (flag);
		

	}

}
