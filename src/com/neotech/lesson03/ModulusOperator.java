package com.neotech.lesson03;

public class ModulusOperator {
	
	public static void main(String[] args) {
		
		int a = 25;
		int b = 4;		
		int div = 0;
		int rem = 0;
		
		div = a/b; // 25/4 -> 6
		rem = a%b; // 25%4 -> 4 is fully divisible by 6 and the remainder is 1.
		
		System.out.println("This is division: " + div);
		System.out.println("The remainder of 25 < (25/4) > is : " + rem);
		
		int c = 13; 
		int d = 5;
		
		int rem2 = c%d;// 13/5 --> 10/5 and the remainder of 13 > (13 - 10) = 3 
		
		System.out.println("The remainder of 13 < (13/5) > is: " + rem2);
		
		// example:
		// input two numbers: 
		
		double d1 = 2.434;
		double d2 = 3.435;
		
		int num1 = 7;
		int num2 = 2;
		
		int rem3 = num1%num2;
		System.out.println("The remainder of 7 < (7/2) > is: " + rem3);
	
		
		int resnum = 7/2;
		System.out.println("This from diving int: " + resnum);
		
		double d3 = d1/d2;
		System.out.println("This is from diving doubles: " + d3);
		
		
		
	}

}
