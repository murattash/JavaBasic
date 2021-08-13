package com.neotech.lesson05;

public class ElseIfCondition {
	
	public static void main(String[] args) {
		
		double d1 = 12.2;
		double d2 = 12.3;
		
		//d1 > d2, its the same as d2 < d1
		//possible conditions:
		//d1 is bigger than d2
		//d1 is smaller than d2
		//d1 is equal to d2
		
		if (d1 < d2)// d1 < d2
		{
			System.out.println("Number " + d1 + " is smaller than " + d2);
		}
		
		else if (d1 > d2)//d1 is larger than d2
		
		{
			System.out.println("Number " + d1 + " is bigger than "+ d2);
		}
		else //this means that d1==d2  
		{
			System.out.println("Number " + d1 +" is equal to " + d2);
		}
		
		System.out.println("");
		
		System.out.println("We will do another example!!!");
		
		System.out.println("");
		
		// Let's code it again 
		
		int a = 5;
		int b = 6;
		
		//possible situations:
		//1. a is biggest than b    (b is smaller than a)
		//2. a is smaller than b   (b is bigger than a)
		//3. a is equal to b       (b is equal to a)
		
		//these conditions are exclusive (if one of them is trues, the other are NOT true. 
		if (a==b)
		{
			System.out.println("Number " + a + " is equal to " + b);
		}
		else if (a<b)
		{
			System.out.println("Number " + a + " is smaller than " + b);
		}
		else //you must close with else 
		{
			System.out.println("Number " + a + " is bigger than " + b);
		}
		
		
		
	}

}
