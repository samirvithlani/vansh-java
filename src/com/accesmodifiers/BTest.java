package com.accesmodifiers;

public class BTest extends ATest	 {

	
	void test() {
		
		BTest b  = new BTest();
		//System.out.println(x);
		//System.out.println(b.y);
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		
		
		BTest b = new BTest();
		b.test();
	}
}
