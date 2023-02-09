package com.ifelse;

import java.util.Scanner;

public class LogicalOPdemo1 {

	/*
	 *  && || !
	 *        &&
	 *  no>20 && no % 2 ==0
	 *  
	 *  T        T         T
	 *  F        -         F
	 *  T        F         F
	 *  //all condition must satsify...
	 *  
	 *          ||
	 *   T     -        T
	 *   F     T		T
	 *   F     F		F
	 *   
	 *           atleast one condition satisfy        
	 * 
	 * 
	 * */
	
	//number should be div by either 2 or 3 bu must be greeter 20
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int no = sc.nextInt();
		if((no >=20) && (no %2 ==0 || no %3 ==0)) {
			
			System.out.println("condtion true");
		}
		else {
			System.out.println("false...");
		}
		
		
		
		
		
	}
	
}
