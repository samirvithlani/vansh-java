package com.loops;

public class Noofdig {

	public static void main(String[] args) {
		
		
		
		int no=123;
		
		int rem=0;
		int count=0;
		//no != 0 true
		//12 != 0 true
		//1 != 0 true
		//0!=0 FALSE
		while(no!=0) {
			
			//rem = 123 % 10 = 3
			// 12 % 10 2
			//1 % 10 1
			rem = no %10;
			//123 = 123 / 10 no = 12
			//12 = 12 / 10   = 1
			//1 = 1 / 10  =0
			no = no /10;
			count++; //1+1 = 2+1 = 3
			
			
		}
		System.out.println("count = "+count);
	}
}
