package com.neotech.lesson26;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(14);
		numbers.add(20);
		numbers.add(25);
		numbers.add(10);
		
		System.out.println(numbers.get(1));
		System.out.println(numbers.size());
		
		System.out.println(numbers.contains(25));
		System.out.println(numbers);
		
		
		
		
	}

}
