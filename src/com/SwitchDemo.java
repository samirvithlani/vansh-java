package com;

import java.util.Scanner;

//if else switch case....
//if first condition wrong else if ... else if ....
//choice case...
public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("enter 1 for sum");
		System.out.println("enter 2 for sub");
		System.out.println("enter 3 for div");
		System.out.println("enter 4 for mul");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			System.out.println("enter no1");
			int no1 = sc.nextInt();
			System.out.println("enter no2");
			int no2 = sc.nextInt();
			int ans = no1 + no2;
			System.out.println("sum = " + ans);
		break;
		
		case 2:
			System.out.println("enter no1");
			no1 = sc.nextInt();
			System.out.println("enter no2");
			no2 = sc.nextInt();
			ans = no1 - no2;
			System.out.println("sub = " + ans);
		break;

		case 3:
			System.out.println("enter no1");
			no1 = sc.nextInt();
			System.out.println("enter no2");
			no2 = sc.nextInt();
			ans = no1 / no2;
			System.out.println("div = " + ans);

			break;
		case 4:
			System.out.println("enter no1");
			no1 = sc.nextInt();
			System.out.println("enter no2");
			no2 = sc.nextInt();
			ans = no1 * no2;
			System.out.println("mul = " + ans);
			break;
		default:
			System.out.println("invalid choice....");
		break;

		}

	}

}
