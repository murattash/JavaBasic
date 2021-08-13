package com.neotech.lesson04;

public class Recap {
	
	public static void main(String[] args) {
		
		int num1 = 10+10*10;
		System.out.println(num1);
		
		int num2 = (10+10)*10;
		System.out.println(num2);
		
		int num3 = 10*10+10/10;
		System.out.println(num3);
		
		int num4 = 15;
		int num5 = 4;		
		
		int div = num4/num5;
		System.out.println("div is --> " + div);// 3.75 nut the 0.75 is lost 
		
		int remainder = 19%6;
		System.out.println(remainder);
		
		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "Sunday";
		boolean z = true; 
		
		System.out.println(x + " " + y);
		System.out.println(x + y + a);
		System.out.println(x + z);
		
		System.out.println(x + y + a + b);
		System.out.println(a + b + " " + x + " " + y);
		
		System.out.println(a + (b + x + y)); //1020JavaSunday
		
		System.out.println(a + b + (x + y)); //30JavaSunday
		
		System.out.println(x + y + a * b ); // JavaSunday200
		
		String emptyStr = ""; // zero characters inside 
		String spaceStr = " "; // one character inside, which is space
		
		
	}

}
