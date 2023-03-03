package com.accesmodifiers;

public class ATest {

	
	private int x=10;
	int y =20;
	protected int p = 120;
	
	private void check() {
		System.out.println("check");
	}
	
	
	public void get() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
	}
	
	
	public static void main(String[] args) {
		
		ATest a = new ATest();
		a.get();
		
		
	}
}
