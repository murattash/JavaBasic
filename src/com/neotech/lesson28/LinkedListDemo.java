package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		// We will create a LinkedList to store String objects
		// ArrayList<String> names = new ArrayList<>();
		LinkedList<String> names = new LinkedList<>();
		names.add("Komron");
		names.add("Hakan");
		names.add("Mufasa");
		names.add(1, "Murat");
		
		int size = names.size();
		System.out.println("The size of the list is " + size);
		System.out.println(names);
		
		System.out.println("------------------");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("------------------");
		
		for (String element : names) {
			System.out.println(element);
		}
		
		System.out.println("------------------");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		
	}

}
