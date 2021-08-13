package com.neotech.lesson16;

import java.util.Scanner;

public class StringMoreMethods {
	
	public static void main(String[] args) {
		
		// charAt()
//		Scanner scan = new Scanner (System.in);
//		char letter = scan.next().charAt(0);
//		System.out.println(letter);
		
		String name = "Hakan";
		char oneLetter = name.charAt(4);
		System.out.println(oneLetter);
	
		
		//indexOf()
		int index = name.indexOf('n');
		System.out.println(index);
		
		int index1 = name.indexOf('p'); //the is no letter p, so the system will return -1
		System.out.println(index1);
	
		//substring()
		String message = "Komron is the best"; //only one parameter, beginIndex
		String substr = message.substring(2);
		System.out.println(substr);
		
		String substr2 = message.substring(1, 6); //two parameters, beginIndex and endIndex
		System.out.println(substr2);
		
		
		
	}
	
	
	

}
