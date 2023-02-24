package com.methods;

public class MethodDemo2 {

	// static method can be called without object but it has to call with class name
	// static method can be called without object but it has to call with class name
	// in non static as well as static method
	
	//non static
	int no1 = 100;
	static int no2 =200;
	public static void display() {

		System.out.println("display called....");
	}

	public void test() {

		display();
	}

	public static float div(float x, float y, float z) {

		return (x / y) / z;
	}

	public static void main(String[] args) {

		MethodDemo2 m2 = new MethodDemo2();
		// m2.display();
		MethodDemo2.display();
		display();
		
		float f = div(12, 2, 5.5f);
		System.out.println(f);
		

	}
}
