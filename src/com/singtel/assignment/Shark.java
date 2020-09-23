package com.singtel.assignment;

public class Shark implements Fish {

	

	public void size() {
		
		System.out.println("Sharks are large and grey");
	}
	
   public void eat() {
		
		System.out.println("Sharks eat other fish");
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}
