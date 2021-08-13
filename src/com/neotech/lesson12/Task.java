package com.neotech.lesson12;

public class Task {
	
	public static void main(String[] args) {
		
		
		// 1st way 
		int [] math = {65, 34, 56, 23, 67};
		int sum = 0;
		
		for (int i = 0; i < math.length; i++) {
			
			sum += math[i];
			
			
		}
		System.out.println("The sum of all numbers is " + sum);
	
		
		//2nd way 
		int sum1 = 0;
		for (int numbers : math) {
			
			sum1 += numbers; 
			
			
		}
		
		System.out.println("The sum of all numbers is " + sum1);
		
	}

}
