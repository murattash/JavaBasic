package com.neotech.lesson17;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		//when we want to change the string
		StringBuffer strBfr = new StringBuffer ("Hello");
		System.out.println(strBfr);
		
		//here we show this is mutable -- changeable
		strBfr.append(" World"); // string is added to the existing object
		System.out.println(strBfr);
		
		
		String str = "Hi";
		str = str.concat("All"); //a new String is created 
		
		System.out.println(strBfr.length());
		System.out.println(strBfr.reverse());
		
		System.out.println("-------------");
		
		String anotherStr = strBfr.substring(3,8);
		System.out.println(anotherStr); //after is has been reversed 
		
		System.out.println("------------");
		StringBuffer strBldr = new StringBuffer ("We are tired");
		strBldr.append(", but we do not stop");
		System.out.println(strBldr);
		
		
	}

}
