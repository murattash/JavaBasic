package com.neotech.lesson26;

import java.util.ArrayList;

public class Task {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Annie");
		names.add("Marcus");
		names.add("Lucas");
		names.add("Alex");
		
		System.out.println(names.isEmpty());
		
		System.out.println(names.contains("John"));
		
		System.out.println("The size of the ArrayLis is: " + names.size());
		
		for (String element : names) {
			System.out.print(element + " ");
		}
		

		System.out.println("\n"+ names);
	}

}
