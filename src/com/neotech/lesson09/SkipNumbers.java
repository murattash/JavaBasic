package com.neotech.lesson09;

public class SkipNumbers {
	
	public static void main(String[] args) {
		
		//i want to print numbers form 1 to 10
		//want to skip 4,6,9
		
		
		for (int j = 1; j <=10; j++)
		{
			if (j == 4 || j == 6 || j == 9)
			
			{ 
				continue;
			}
			
			System.out.println(j);
		}
		
		
		System.out.println("----------------------");
		
		//print 10 - 50
		//skip 25 - 45
		
		for (int k = 10; k <=50; k++)
			
		{
			if (k >= 25 && k <= 45)
			{
				continue;
			}
			
			
			System.out.println(k);
			
		}
	
	
	}

}
