package com.neotech.lesson31;

import java.util.LinkedList;
import java.util.List;

public class Homework3 {
	
	public static void main(String[] args) {
		
		List<Double> numbers = new LinkedList<>();
		
		numbers.add(3.5);
		numbers.add(20.0);
		numbers.add(25.5);
		numbers.add(6.2);
		
		double sum = 0;
		
		for (Double num : numbers) {
			sum+=num;
		}
		
		System.out.println("The sum of all elements in the list is: " + sum);
		
		
		
		
		
	}

}
