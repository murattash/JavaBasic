package com.neotech.lesson16;

public class StringMethods {
	
	public static void main(String[] args) {
		
	//1st way of creating a string 
	String name = "Enes"; //String literal, short way 

	
	//2nd way 
	String name2  = new String ("Hakan");
	System.out.println(name2);
	
	//-----------------------------
	
	//length ()
	String school = "Neotech Academy";
	int size = school.length();
	System.out.println("The size of " + school + " is " + size);
	
	String school2 = "    Neotech Academy     ";
	int size2 = school.length();
	System.out.println("The size of " + school + " is " + size2);
	
	//-----------------------------
	
	//toUpperCase() toLowerCase()
	String city = "Fairfax";
	
	String newCity = city.toLowerCase();
	System.out.println(newCity);
	
	String newCity2 = city.toUpperCase();	
	System.out.println(newCity2);
	
	
	
	//concat()
	//This is concatenation
	String sentence = "The size of " + school + " is " + size;
	
	String zip = "12345";
	
	String setence3 = city + zip;
	System.out.println(setence3);
	
	String setence2 = city.concat(zip);
	System.out.println(setence2);
	
	String setence4 = city + " " + zip; //this is a regular way
	System.out.println(setence4);
	
	String setence5 = city.concat(" ".concat(zip));//this is using concatenation
	System.out.println(setence5);
	
	String setence6 = city.concat(", ").concat("VA").concat(" ").concat(" ").concat(zip); //method chaining
	System.out.println(setence6);
	
	
	
	// isEmpty()
	String str = "Evis";
	boolean isEmp = str.isEmpty();
	System.out.println(isEmp); //this will print False because String is not empty 
	
	String str1 = "";
	boolean isEmp1 = str1.isEmpty();
	System.out.println(isEmp1); //this will print True because String is empty 
	
	String str2 = " ";
	boolean isEmp2 = str2.isEmpty();
	System.out.println(isEmp2); //this will print False because space is a character
	
	
	
	//trim
	System.out.println(school2);
	System.out.println(school2.trim()); //will remove spaces in the beg and end 
	
	String sent = "    I woke up    very late today!";
	System.out.println(sent.trim());
	
	String sent2 = "    I love    my students!   ";
	int size5 = sent2.length();
	System.out.println(size5);
	
	String sent3 = sent2.trim();
	int size6 = sent3.length();
	System.out.println(size6);
	
	
	int[] num = { 5, 4, 1, 7, 8};
	int size7 = num.length; //in this case length is a property, not a method
	
	int size8 = sent3.length();
	
	}
	
	
}
