package com.neotech.lesson31;

import java.util.*;

public class Homework2 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		
		set.add("hi ");
		set.add("student, ");
		set.add("how ");
		set.add("are ");
		set.add("doing?");
		
		String fullSent = ""; 
		
		for (String word : set) {
			fullSent+=word;
		}
		
		System.out.println(fullSent);
	}

}
