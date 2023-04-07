package com.lambda;

interface Resume {

	String getName(String Name);
}

public class LambdaDemo4 {

	public static void main(String[] args) {
		
	
		Resume r = (x)->{
			
			return x.toUpperCase();
		};
		String x = r.getName("ram");
		System.out.println(x);
	}
}
