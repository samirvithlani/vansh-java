package com.interfacedemo;

//interface is fully abstract class
interface Text{	
	//public abstact void text()
	void text();
	//public final static
	int x =10;
	
}
interface Call{
	
	void call();
}


public class Texting implements Text,Call{

	
	
	public void text() {
		
		
	}
	
	public static void main(String[] args) {
		
		Text t = new Texting();
		t.text();
		System.out.println(x);
		//x=14; error
		
	}

	
	public void call() {
		
	}
	
	
}
