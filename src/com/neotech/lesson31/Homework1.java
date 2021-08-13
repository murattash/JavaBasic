package com.neotech.lesson31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework1 {
	
	public static void main(String[] args) {
		
		//collection of pair 
		Map<String, Integer> emp = new HashMap<>();
		
		emp.put("Komron", 95000);
		emp.put("Mufasa", 100000);
		emp.put("Evis", 85000);
		emp.put("Hakan", 92000);
		
		Collection<Integer> values = emp.values();
		
		int highest = 0;
		
		for (Integer salary : values) {
			if (salary > highest) {
				highest=salary;
			}
		}
		
		System.out.println("Theh highest salary is " + highest);
		
		//You have to find the pair/entry that has the highest value
		Set<Entry<String, Integer>> entries = emp.entrySet(); //getting Set of this pair in order to iterate. Because I can not iterate pairs from Maps
		
		Iterator <Entry<String, Integer>> iterator = entries.iterator();
		
		Entry<String, Integer> maxEntry = iterator.next();
		
		while (iterator.hasNext()) {
			Entry<String,Integer> entry = iterator.next(); //every time i get a pair it will be a type of Entry<String,Integer>
			
			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry; 
			}
			
		}
		
		System.out.println("The highest entry  is " + maxEntry);
	}

}
