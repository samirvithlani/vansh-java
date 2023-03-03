package com.methodoverriding;


//method overriding :-

//when child class develop same method signture as parent class called method over riding
//method signture --> access modifier of method
//name of method
//return type of method
//param of method


//runtime polymorephism parent class method and child class memory 
//we can not change return type in overrideing....
//private method can not be override...

//if parent class has mehod access spe is default thn child class can have either default or protecred or public
//if parent class has mehod access spe is protected thn child class can have either  protecred or public
//if parent class has mehod access spe is protected thn child class can have only public

class Driving{
	
	public void drives() {
		
		System.out.println("drives method called from parent class");
	}
}


public class Driver extends Driving {

	
	public void drives() {
		
		super.drives();
	}
	
	public static void main(String[] args) {
		
		
		//Driver d = new Driver();
		//d.drives();
		
		//polymorphic
		
		//parent class refernece and child class object...
		Driving d = new Driver();
		d.drives();
		
		
		
	}
	
	
	
}
