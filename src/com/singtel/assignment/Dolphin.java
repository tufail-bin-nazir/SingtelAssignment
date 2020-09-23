package com.singtel.assignment;

public class Dolphin implements Animal {
	
	
	
	private Fish fish;

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
	}

	
    public void canSwim() {
    	System.out.println(this.fish.swim());
    }

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
