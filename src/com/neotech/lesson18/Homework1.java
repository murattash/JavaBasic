package com.neotech.lesson18;

public class Homework1 {

	public static void main(String[] args) {

		String str = "Sunday";

		// 1st way
		for (int i = str.length() - 1; i >= 0; i--) {

			// this store the character in a variable and then prints it
			// char c = str.charAt[i];
			// System.out.print(c);

			// in one step
			System.out.print(str.charAt(i));
		}
		
		System.out.println();

		// 2nd way
		char[] str_chars = str.toCharArray();
		// str_chars[2];

		for (int i = str_chars.length - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}
			System.out.println();
		
		StringBuffer rvrsString = new StringBuffer(str);
		rvrsString.reverse();
		System.out.print(rvrsString);
		
	}

}
