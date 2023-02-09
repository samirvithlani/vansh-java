package com.ifelse;

import java.util.Scanner;

public class IfDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("you are eligible for voating...");
			if(age>=21) {
				System.out.println("you are eligible for marrige also");
			}
			else {
				System.out.println("you are not eligible for marrige");
			}
		}
		else {
			System.out.println("you are not eligible for voating...");
			if(age>=15) {
				System.out.println("you are eligible for collage....");
			}
			else {
				System.out.println("you are not eliggle for collage...");
			}

		}
		
		
	}
}
