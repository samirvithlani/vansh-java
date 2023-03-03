package com.abstraction;

abstract class Course {

	// if class is an abstract thn only we can create abstract methods...
	// abstract method does not have metod body...
	public abstract void java();
	public abstract void python();
	public  void js() {
		
	}
	// parent class all abstrcat method should overide in child class
}

public class Royal extends Course {

	public void java() {
		System.out.println("java called...");
	}

	public static void main(String[] args) {

		// we can not create an object of abstract calss

		// Course c = new Course();
		Course c = new Royal();
		c.java();
	}

	
	public void python() {
		// TODO Auto-generated method stub
		
	}
}
