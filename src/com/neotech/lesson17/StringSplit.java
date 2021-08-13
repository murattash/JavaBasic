package com.neotech.lesson17;

public class StringSplit {
	
	public static void main(String[] args) {
		
		//split()
		String sentence = "Today is Thursday and I have Java class";
		String[] result = sentence.split(" "); //we use [] after string because it as an array 
		
		for (String word : result) { //for every String in String sentence we will print a word 
			System.out.print(word + "|");
			
		}
		
		
		// How many words are there in a sentence
		System.out.println("The sentence has " + result.length + " words" );
		
		System.out.println("----------------------");
		
		String [] array = sentence.split("a");
		for (String str : array) {
			System.out.println(str);
		}
		
		
		
		
		System.out.println("-------------------");
		
		String combination = "ksdasdasdas9sdasdasdas3asdasdasda2dsadsakjgj";
		String [] arr = combination.split("[0-9]");
		
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		
		
		System.out.println("------------------");
		
		//Reverse the sentence
		
		for (int r = result.length - 1; r >= 0; r --) { //1. first element should be length minus 1 
			System.out.print(result[r] + "|");
			
		}
		
	}

}
