package com.lambda;

interface Phone {

	void brand();
}

public class LmbdaDemo2 {

	public static void main(String[] args) {

		Phone p = ()->{
			
			System.out.println("brand called...");
		};
		p.brand();
		
	}
}
