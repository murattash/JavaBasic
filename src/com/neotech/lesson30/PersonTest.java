package com.neotech.lesson30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer, Person> people = new TreeMap<>();
		//this map, has a mapping of an integer with a person object
		
		people.put(1, new Person("Hakan", "K", 22, 100000));
		people.put(2, new Person("Shodmon", "B", 20, 120000));
		people.put(3, new Person("Komron", "B", 25, 80000));
		
		for (Entry<Integer, Person> entry : people.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue().name + " " + entry.getValue().lastName);
			
			entry.getValue().printDetails();
			
		}
		
		
		
		
		
	}

}
