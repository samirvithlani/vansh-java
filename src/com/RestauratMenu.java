package com;

import java.util.Scanner;

public class RestauratMenu {

	public static void main(String[] args) {

		System.out.println("PRESS 1 FOR GUJARATI :: ");
		System.out.println("PRESS 2 FOR PUNJABI :: ");
		System.out.println("PRESS 3 FOR SOUTH INDIAN :: ");

		Scanner sc = new Scanner(System.in);
		int cousinChoice = sc.nextInt();
		int gchoice = 0, pchoice = 0, schoice = 0;
		int rotichoice = 0, frprice = 10, frpriceg = 15;
		int isOrder = 0;
		int qty = 0, amount = 0;

		switch (cousinChoice) {

		case 1:

			System.out.println("***** WELCOME TO GUJARATI MENU ******");
			System.out.println("PRESS 1 for ROTIES");
			System.out.println("PRESS 2 for SABJI");
			System.out.println("PRESS 3 FOR RICE");
			gchoice = sc.nextInt();
			switch (gchoice) {
			case 1:
				System.out.println("WELCOME TO ROTI SECTION");
				System.out.println("PRESS 1 for FULKA ROTI price = " + frpriceg);
				System.out.println("PRESS 2 for FULKA ROTI without GHEE price =" + frprice);
				rotichoice = sc.nextInt();
				switch (rotichoice) {
				case 1:
					System.out.println("PRESS 1 for confirm order fulka roti");
					isOrder = sc.nextInt();
					System.out.println("Enter quantity :");
					qty = sc.nextInt();
					
					if (isOrder == 1) {
						System.out.println("your order for fulka roti has been placed...");
						amount = frpriceg * qty;
						System.out.println("your net bill = " + amount);
					} else {
						System.out.println("your order for fulka roti has not been placed...");
					}

					break;
				case 2:
					System.out.println("PRESS 1 for confirm order fulka roti with ghee");
					isOrder = sc.nextInt();
					if (isOrder == 1) {
						System.out.println("your order for fulka roti without GHEE has been placed...");
					} else {
						System.out.println("your order for fulka roti without GHEE has not been placed...");
					}

					break;

				}
				// roti choice over....

				break;
			case 2:
				System.out.println("WELCOME TO ROTI SABJIS");
				break;
			case 3:
				System.out.println("WELCOME TO ROTI RICE");
				break;

			default:
				break;
			}
			/// gujarti choice over...

			break;
		case 2:

			System.out.println("***** WELCOME TO PUNJABI MENU ******");

			System.out.println("PRESS 1 for ROTIES-NAAN");
			System.out.println("PRESS 2 for punajbi SABJI");
			System.out.println("PRESS 3 FOR RICE-BIRYANI");
			pchoice = sc.nextInt();

			switch (pchoice) {
			case 1:

				System.out.println("WELCOME TO ROTI-NAAN SECTION");
				break;
			case 2:
				System.out.println("WELCOME TO  PUNJABI SABJIS");
				break;
			case 3:
				System.out.println("WELCOME TO RICE-biryani");
				break;

			default:
				break;
			}

			break;
		case 3:
			System.out.println("***** WELCOME TO SOUTH INDIAN MENU ******");

			break;

		}
		// main switch over....

	}
}
