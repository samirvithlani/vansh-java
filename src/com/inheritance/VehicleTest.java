package com.inheritance;

import java.util.Scanner;

class Vehicle{
	
	int wheels;
	String name;
	int makeYear;
}
class Car extends Vehicle{
	
	String carv;
	public void getCarData() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car name");
		name = sc.next();
		System.out.println("enter no of wheels");
		wheels = sc.nextInt();
		System.out.println("enter make year");
		makeYear = sc.nextInt();
				
		
	}
	
	public void printCarData() {
		
		System.out.println("name of car  = "+name);
		System.out.println("veh of cars  = "+wheels);
		System.out.println("make ear of car = "+makeYear);
	}
	
}
class CarVerient extends Car{
	
	
	void getCarv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car varient");
		carv = sc.next();
		System.out.println("car verient = "+carv);
		getCarData();
		printCarData();
	
	}
	
	
}
public class VehicleTest {
	
	public static void main(String[] args) {
		
		CarVerient cv = new CarVerient();
		cv.getCarv();
	}

}
