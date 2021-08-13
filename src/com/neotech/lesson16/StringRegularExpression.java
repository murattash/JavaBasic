package com.neotech.lesson16;

public class StringRegularExpression {

	public static void main(String[] args) {
		
		String greeting = "Good morning";
		
		//replace()
		String newGreet = greeting.replace('o', 'u');
		System.out.println(newGreet);
		
		
		String otherGreet = greeting.replace("morning", "afternoon");
		System.out.println(otherGreet);
		
		String lastGreet = greeting.replace("evening", "afternoon");
		System.out.println(lastGreet);
		
		//replaceAl()
		
		String combination = "My phone # is 123123243242";
		System.out.println(combination);
		
		String newcombination = combination.replaceAll("[0-9]", "*");
		System.out.println(newcombination);
				
		String newcombination2 = combination.replaceAll("[a-z]", "+");
		System.out.println(newcombination2);
	
		String newcombination3 = combination.replaceAll("[A-Z]", "&");
		System.out.println(newcombination3);
		
		String newcombination4 = combination.replaceAll("[^0-9]", "+"); // ^ if you want to leave just a numbers or characters 
		System.out.println(newcombination4);
		
		String newcombination5 = combination.replaceAll("[0-9a-z]", " ");
		System.out.println(newcombination5);
		
		String newcombination6 = combination.replaceAll("[0-9a-z]", " ");
		System.out.println(newcombination6);
		
	}
}
