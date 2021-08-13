package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
		// int
		
		ArrayList<String> choco = new ArrayList<>();
		choco.add("Kinder");
		choco.add("Hershey");
		choco.add("Godiva");
		choco.add("Snickers");
		
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		
		sweets.addAll(choco); //by default, puts all objects of choco AL, at the end of the sweets AL
		
		System.out.println("The size of the sweets arrayList is: " + sweets.size());
		System.out.println(sweets);
		
		
		
		
		//how do we use iterator
		Iterator<String> it = sweets.iterator();
		
		while(it.hasNext())
		
		{
			String str = it.next();
			
			System.out.print(str + " - ");
			
			if (str.equals("ice cream")) {
				it.remove();
			}
			
		}
		
		System.out.println();
		System.out.println(sweets);
		
		
		//for loop
		//1 directions
		for (String str : sweets)
		{
			System.out.println(str + " - ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
