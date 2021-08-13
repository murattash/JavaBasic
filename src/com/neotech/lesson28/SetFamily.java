package com.neotech.lesson28;

import java.util.*;

public class SetFamily {

	public static void main(String[] args) {
		
		//This is a HashSet, no order, no duplicates
		
		Set<String> veggies = new HashSet<>();
		veggies.add("Potato");
		veggies.add("Avacado");
		veggies.add("Tomato");
		veggies.add("Eggplant");
		veggies.add("Potato");
		
		System.out.println(veggies);
		
		//This is a HashSet, no duplicates, insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Potato");
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits);
		
		//
		Set<String> food = new TreeSet<>(veggies);
		System.out.println(food);
		
	}
	
}
