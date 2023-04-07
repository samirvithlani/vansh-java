package com.lambda;

interface Prints{

	//public abstractt private
	void print();
}



public class LambdaDemo1 implements Prints {

	public static void main(String[] args) {
		
		Prints p = new LambdaDemo1();
		p.print();
		
	}

	@Override
	public void print() {
	
		System.out.println("printing....");
		
	}
}
