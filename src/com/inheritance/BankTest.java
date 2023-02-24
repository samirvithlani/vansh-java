package com.inheritance;

class Bank{
	
	int x =100;
	
	void demo() {
		
		System.out.println("demo...");
	}
}
public class BankTest  extends Bank{

	void test() {
		
		System.out.println(x);
		demo();
	}
	public static void main(String[] args) {
		
		BankTest b1 = new BankTest();
		b1.test();
		//System.out.println(x);
	}
}
