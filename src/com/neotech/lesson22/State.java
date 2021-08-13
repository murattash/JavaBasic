package com.neotech.lesson22;

public class State {
	
	//instance variables 
	String name, capital;

	//we don't have the default constructor anymore
	public State(String name, String capital) {
		this.name = name;
		this.capital = capital;
		
	}
	
	public void displayName() {
		System.out.println(name);
	}
	
	public void displayCapital() {
		System.out.println(capital);
	}
	
	public void displayFullInformation() {
		this.displayName(); //compiler by default adds this keyword
		displayCapital();
	}
	
	public static void main(String[] args) {
		
		State st = new State("NJ", "Trenton");
		st.displayName();
		st.displayCapital();
		System.out.println("--------");
		
		State st2 = new State("VA", "Richmond");
		st2.displayFullInformation();
		
	}
}
