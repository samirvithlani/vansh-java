package com.ifelse;

import java.util.Scanner;

//com.ifelse.IfelseDemo
public class IfelseDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter no1 ");
		int no1 = sc.nextInt();
		System.out.println("enter no2");
		int no2 = sc.nextInt();
		
		//12>12 false
		//ledder if else
		if(no1>no2) {
			System.out.println("no 1 is greater");
		}
		else if(no1==no2) {
			System.out.println("both no are same...");
		}
		else {
			System.out.println("no 2 is greater..");
		}
		
		
		
		
		
	}
}
