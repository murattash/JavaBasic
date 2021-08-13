package com.neotech.lesson04;

public class CompoundOperator {
	
	public static void main(String[] args) {
		//Also known as shorthand operator
		
		int num = 100; //create a box and store 100 
		num = num + 100; // add 100 to the bvalue inside the box
		System.out.println(num);// add 100 to the value inside the box 
		
		num = num + 100;
		System.out.println(num);
		
		// We can use compound/shorthand operator which are shorter 
		
		num += 100;
		System.out.println("Here " + num);
		
		//long way 
		//num = num - 50;
		
		//short way 
		num -= 50; //it was 400, then it became 350 
		System.out.println(num);
		
		//num = num / 7;
		num /= 7;
		System.out.println(num);
		
		//num = num * 7;
		num *=2;
		System.out.println(num);
		
		//num = num % 9;
		num %=9;
		System.out.println(num);
		
				
	}

}
