package com.singtel.assignment;

public class Butterfly implements Animal {
	
	private boolean metamorphosis;

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
	   System.out.println("does not make a sound");
		
	}

	@Override
	public void fly() {
		if(metamorphosis)
		  System.out.println("can walk");
		else
		  System.out.println("can fly");
		
	}

	public boolean isMetamorphosis() {
		return metamorphosis;
	}

	public void setMetamorphosis(boolean metamorphosis) {
		this.metamorphosis = metamorphosis;
	}
	
	

}
