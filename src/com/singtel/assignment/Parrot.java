package com.singtel.assignment;

public class Parrot extends Bird{
	 
	   Animal animal=null;
	   void livingWith(Animal animal){
		 this.animal =animal;
		 }
	   
	   public void sing() {
		   this.animal.sing();
	   }
	   
	   
	   
	  
	}
