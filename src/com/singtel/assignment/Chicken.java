package com.singtel.assignment;

public class Chicken extends Bird {
	
	@Override
	public void sing() {
		System.out.println("A chicken says: “Cluck, cluck");

		
	}
	
	@Override
	public void walk() {
		System.out.println("A chicken cannot fly");

		
	}

}
