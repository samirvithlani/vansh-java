package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter age");
			//sc =null;
			int age = sc.nextInt();

			System.out.println(age);
		} catch (InputMismatchException | NullPointerException e) {
			
			System.out.println("something went wrong..");
		}

	}
}
