package com.ifelse;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter monthly salary:\n");
		double monthlySalary = scnr.nextDouble();
		double yearlySalary = monthlySalary * 12;

		if (yearlySalary > 500000) {
			double tax = yearlySalary * 0.15;
			System.out.println("Tax Paid: " + tax);
			double netSalary = yearlySalary - tax;
			System.out.println("Net Salary: " + netSalary);
		} else if (yearlySalary > 400000 && yearlySalary <= 500000) {
			double tax = yearlySalary * 0.08;
			System.out.println("Tax Paid: " + tax);
			double netSalary = yearlySalary - tax;
			System.out.println("Net Salary: " + netSalary);
		} else if (yearlySalary > 250000) {
			double Returntax = yearlySalary * 0.03;
			System.out.println("Tax return: " + Returntax);
			double netSalary = yearlySalary + Returntax;
			System.out.println("Net Salary: " + netSalary);

		}
	}
}
