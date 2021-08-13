package com.neotech.lesson17;

public class Task {
	
	public static void main(String[] args) {
		// Find out how many sentences are there in the string
		// "Yay! It is Saturday. Is it raining? Take your umbrella."

		String str = "Yay. It is Saturday. Is it raining. Take your umbrella.";
		
		String[] sentence = str.split("\\."); // you can use [.] or \\.
		
		for (String s : sentence) {
			System.out.println(s);
		}
		
		System.out.println("There are " + sentence.length + " sentences");
		
		
		System.out.println("------------------");
		
		
		String str2 = "Yay. It is Saturday. Is it raining. Take your umbrella.";
		String[] sentence2 = str2.split("[.!?]"); 
		
		for (String s : sentence2) {
			System.out.println(s);
		}
		
		System.out.println("There are " + sentence2.length + " sentences");
		
		
		
		System.out.println("==============================");
		
		//If I want to print "Maryam"
		//inside the string, some character have a special meaning in Java
		//when we want to use them we may get an error 
		// " \ ? n t These have special meaning in Java
		System.out.println("\"Maryam\""); // '\' is called escape character 
		System.out.println("\\Maryam\\");
		
		// ? . * have a special meaning in regular expression
		String s = "abc abbc afc afgc";
		String s2 = s.replaceAll("[a?c]", "+"); //if starts with a and have anything in between until c
		System.out.println(s2);
		
		
		String str3 = "Yay? It is Saturday? Is it raining? Take your umbrella?";
		String[] array = str3.split("\\?");
		System.out.println(array.length);
		
	}

}
