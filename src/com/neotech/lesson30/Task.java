package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task {
	
	public static void main(String[] args) {
		
		String[] cities = {"Paris", "Ankara", "London", "Washington"};
		
		Map<String, Integer> map = new TreeMap<>();
	
		for (String str : cities) {
			
			map.put(str, str.length());
		}
		
		System.out.println(map);
		
		Iterator <Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> en = it.next();	
			
			if (en.getValue() > 7) {
				it.remove();
			}	
		}
	}

}
