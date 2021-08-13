package com.neotech.lesson29;

import java.util.*;

public class OtherMap {
	
	public static void main(String[] args) {
		
		//create a map with groceries
		
		Map<String, Integer> groceries = new TreeMap<>(); //this map will be ordered alphabetically by the KEY
		
		groceries.put("Milk", 2);
		groceries.put("Bread", 4);
		groceries.put("Egg", 1);
		groceries.put("Oil", 3);
		groceries.replace("Egg", 2);
		
		System.out.println(groceries);
		
		
		//get all the keys of the map and put them in a set 
		Set<String> allKeys = groceries.keySet();
		System.out.println("All keys of the map: " + allKeys);
		
		
		Collection<Integer> allValue = groceries.values();
		System.out.println("All values of the map " + allValue);
		
		
	}
	
}
