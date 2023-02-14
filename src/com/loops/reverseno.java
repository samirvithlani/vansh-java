package com.loops;

import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  a no ");
		int no = sc.nextInt();
		int rem =0,sum=0;
		//789    987
		//78
		//7
		//0
		while(no!=0) {
			
			// 0 = 789 % 10 =  rem = 9
			//78 = 78 % 10 = rem 8
			//7 = 7 % 10 rem = 7
			rem = no % 10 ;
			
			// 0 = 0 * 10 + 9 rem = 9
			//9 = 9 *10 + 8 = 90+8 = sum = 98
			//98 = 98 *10 + 7 = sun 980 +7 = 987
			sum = sum *10 +rem;
			
			//789 / 10 = 78
			//78 / 10
			//7 / 10 =0.0
			no = no /10;
			
			
		}
		
		System.out.println("reversed no = "+sum);
	}
}
