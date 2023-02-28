package com.constructor;

/*
 * constructor: --constructor is a special function which has same name as class name
 * constructor does not have return type , but constructor can have parameters
 * 
 * type of constructor:
 * in java we have 2 type of constructors
 * 1)default constructor
 * 2)param constructor...
 * 
 * in single java class one constructor must be there...
 * if developer will not constructor, compiler will creaete default construtor...
 * 
 * use:use of onstrucot is to intilize object of class and load of class in memory and initilize instance variable of class
 * 
 * 
 * */
public class Bank {


	//default constuctor....
	public Bank() {
		System.out.println("Default construcntor of bank class...");
	}
	
	public void demo() {
		
		System.out.println("..");
	}
	
	
	public static void main(String[] args) {
		
		//instance of class...     = new object
		Bank b = new Bank();
		Bank b1 = new Bank();
		
		
		
	}
}
