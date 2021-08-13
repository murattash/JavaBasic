package com.neotech.lesson29;

import java.util.*;

public class MapIntro {
	
	public static void main(String[] args) {
		
		
		// 		  key	  value
		HashMap<Integer, String> map = new HashMap<>();
		
		System.out.println("Size before adding " + map.size());
		
		
		//for maps we do not use add(), we use put()
		map.put(0, "Hakan");
		map.put(10, "Komron");
		map.put(5, "Murat");
		map.put(25, "Flori");
		map.put(2, "Mufasa");
		
		System.out.println(map);
		
		boolean empty = map.isEmpty();
		System.out.println("is the map empty: " + empty);
		
		if (!empty) {
			System.out.println("the size after adding pairs is: " + map.size());
		}
		
		
		//map.put("1", "Ivonne") CE: key must be an integer
		
		map.put(7, "Flori");
		System.out.println(map); //it is okay to have duplicate 
		
		
		map.put(7, "Murat"); // it will override the key-value pair that has the same key
		System.out.println(map);
		
		//how do we retrieve values from a map?
		String name = map.get(0);
		System.out.println("Name is: " + name);
		
		
		//how do we remove value 
		System.out.println("Removing a pair");
		map.remove(7);
		System.out.println(map);
		
		//how do we replace a pair 
		System.out.println("Replacing a value");
		map.replace(2, "Sabah");
		System.out.println(map);
		
		
		//check if map contains a key?
		System.out.println("Does that map contain key 25: " + map.containsKey(25));
		System.out.println("Does that map contain value Sabah:" + map.containsValue("Sabah"));

		
		
		
	}

}
