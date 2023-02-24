package com.methods;

public class MethodDemo1 {

	//instance variable... / class level variable...
	//non static
	int no=100;
	
	//singnature
	//access modifiers return type name of method (params)
	//non static
	//non static method if you call inside static method object is required
	//non static method if you call inside non static method in same class object is not required
	//non static instanve variable can be called inside non static method...
	//non static instanve variable can not be called inside  static method...
	public void test1() {
		
		System.out.println(no);
		System.out.println("non static,wo return wo arguments");
	}
	
	public void driver() {
		
		test1();
	}
	
	public int sum(int a,int b) {
		
		//int c = a + b;
		//return 100;
//		return c;
		return a + b;
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(no); //error
		MethodDemo1 m1 = new MethodDemo1();
		m1.test1();
		int x = m1.sum(100, 200);
		System.out.println(x);
		System.out.println(m1.no);
		
	}
}
