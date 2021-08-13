package com.neotech.lesson04;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		
		
		System.out.println(3>4);
		
		int a = 8; // assigning operator 
		int b = 10;
		
		System.out.println(a > b); // false 
		System.out.println(a < b); // true 
		
		int c = 10;
				
		System.out.println(c > b); // false 
		System.out.println(c == b); // is c equal to b? True 
		System.out.println(c!=b); // is c different from b? false 
		
		
		System.out.println("------------------------");
		double d1 = 5.64;
		double d2 = 5.64;
		
		boolean result = d1 > d2; // is d1 greater then d2 ?
		System.out.println("The result is: " + result);
	
		boolean result2 = d1 == d2;
		System.out.println("The result is: " + result2);
		
		boolean result3 = d1 < d2;
		System.out.println("The result is: " + result3);
		
		boolean result4 = d1 <= d2; 
		System.out.println("The result is: " + result4);
		
		boolean result5 = d1 >= d2; 
		System.out.println("The result is: " + result5);
		
		
	}
	
}
