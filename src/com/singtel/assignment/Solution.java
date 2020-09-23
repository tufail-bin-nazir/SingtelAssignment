package com.singtel.assignment;

public class Solution {
	
		 public static void main(String[] args) {
			 
// A. Lets start from the basic			 
		 Animal bird = new Bird();
		 bird.walk();
		 bird.fly();
		 bird.sing();
		 
		 Bird duck = new Duck();
		 duck.sing();
		 duck.walk();
		 
		 
		 Bird chicken = new Chicken();
		 chicken.sing();
		 chicken.walk();
		 
		 Parrot parrot = new Parrot();
		 parrot.livingWith(new Dog());
		 parrot.sing();
		 parrot.livingWith(new Cat());
		 parrot.sing();
		 parrot.livingWith(new Rooster());
		 parrot.sing();
		 
		 
		
		 
		 
		// B. Model Fish as well as other swimming animals
		 
		 Fish shark = new Shark();
		 shark.size();
		 shark.eat();
		 
		 Fish clownfish = new Clownfish();
		 clownfish.size();
		 clownfish.sing();
		 
		 
		 Dolphin dolphin  = new Dolphin();
		 dolphin.setFish(new Fish() {
			
			@Override
			public void walk() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean swim() {
				return true;
			}
			
			@Override
			public void size() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void sing() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
		});
		 
		 dolphin.canSwim();
		 
		 
		 
//D. Model animals that change their behavior over time
		 
		 Butterfly butterfly = new Butterfly();
		 butterfly.fly();
		 butterfly.sing();
		 
		 //setting metamorphosis for caterpillar
		 
		 butterfly.setMetamorphosis(true);
		 butterfly.fly();
		 
		 
		 
		 
		 // E. Counting animals
		 
		 int canfly = 0;
		 int canWalk = 0;
		 int canSing = 0;
		 int canSwim = 0;
		 
		 Animal[] animals = new Animal[]{
				 new Bird(),
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new Parrot(),
				 new Shark(),
				 new Clownfish(),
				 new Dolphin(),
				 new Dog(),
				 new Butterfly(),
				 new Cat()
				};
		 
		 
		
		 
		 
		 }

}
