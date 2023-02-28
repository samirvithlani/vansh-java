package com.overloading;

/*
 * 
 * polymorephisam : poly means many  phisam forms
 * many of form of the function
 * 
 * 2 type of poly are there
 * 1)compile time polymorephisam /static binding
 * 					method overloading...
 * 					:same name of method but with different param....called method overloading...
 * 					test(){} test(int x){} test(String p)
 * 2)runtime polymorephsain /dynamic binding
 * 					method overriding
 * 					polymorphic object...
 * 
 * 
 * 
 * 
 * */
public class Zomato {

	public void order() {

		System.out.println("order called...");
	}

	public void order(int price) {

		System.out.println("order called with price" + price);
	}
	public void order(long price) {

		System.out.println("order called with price long.." + price);
	}


	public void order(String name,int price) {
		System.out.println("order called with price and name ** ");
	}
	

	public int order(int price, String name) {
		System.out.println("order called with price and name ");
		return 1;
	}

	public void order(float price) {

		System.out.println("order called with price float" + price);
	}

	public void order(double price) {

		System.out.println("order called with price dbl" + price);
	}
	public void order(short price) {

		System.out.println("order called with price short" + price);
	}

	public static void main(String[] args) {
		
		
		Zomato z = new Zomato();
		z.order(1516171819285555l);
		z.order(15.25f);
		z.order(15);
		z.order((short)15);
		//z.order(150,"pizza");
		//z.order("pizza", 10);
		
		

	}
}
