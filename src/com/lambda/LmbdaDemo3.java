package com.lambda;

interface Plays {

	//public abstcat int score
	int score();

}

public class LmbdaDemo3 {

	public static void main(String[] args) {

		Plays p = ()->{
			System.out.println("score called..");
			return 100;
		};
		
		int x = p.score();
		System.out.println("score = "+x);
		
	}
}
