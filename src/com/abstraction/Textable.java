package com.abstraction;
/*
 * interface : interface is fully abstract class
 * to create rules:
 * public asbtract
 * interface is nothing but class only, key word will be interface
 * class --> class extends
 * interface -> class implements
 * multipule inheritance ....
 * 1 child can have more thn 1 parent ....
 * all variables are by default public final static
 * 
 * */

interface Text{
	
	//public abstract void text
	void text();
	public final static int y=20;
	int x=12;
	
}
interface Calling{
	
	int call();
}


public class Textable implements Text,Calling {

	public void text() {
		System.out.println(x);
		System.out.println("text");
	}
	
	public static void main(String[] args) {
		
		//polymorphic
		Text t = new Textable();
		t.text();
		Calling c = new Textable();
		c.call();
		
	}

	
	public int call() {

		System.out.println("called....");
		return 0;
	}
	
}

