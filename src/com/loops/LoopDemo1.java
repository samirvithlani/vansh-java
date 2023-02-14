package com.loops;

public class LoopDemo1 {

	//2 types of loop 
	//entry control loop and exit control loop
	// for loop , while loop  -->for loop -->condtion --> statement
	//do while loop ---> statement --->condition
	//for while do while....
	//when to use for loop
	//when to use while loop
	//when you know starting part and ending part -->
	//when you  sont know ending part
	
	
	public static void main(String[] args) {
		
		//initilization part once 
		//condition part
		//increment decrement part...
		for(int i=1;i<=20;i++) {
			if(i %2==0) {
				System.out.println("even "+i);
			}
			else {
				System.out.println("odd "+i);
			}
			
		}
		
	}
}
