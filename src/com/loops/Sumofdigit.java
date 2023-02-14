package com.loops;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int no = sc.nextInt();
		int rem = 0,sum=0;
		while(no!=0) {
			rem = no %10;
			sum = sum +rem;
			no = no / 10;
			
		}
		System.out.println("sum of digit = "+sum);
		
		
	}
}
