package com.neotech.lesson33;import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {
	
	static String str;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int a = 10;
		int b = 0;
		
		//System.out.println(a/b); //ArithmeticExceotion - / by 0
		
		int[] arr = {1, 3, 5, 6, 7};
		
		//System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
		
		
		//System.out.println(str.length()); //NullPointerException
		
		
		String filePath = "";
		
		//FileInputStream fis = new FileInputStream(filePath); // FileNotFoundException:
		
		NullPointerException npe = new NullPointerException();
		
		throw(npe);
		
		
		
		
	}

}
