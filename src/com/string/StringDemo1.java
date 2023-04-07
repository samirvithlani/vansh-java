package com.string;

public class StringDemo1 {

	public static void main(String[] args) {
		
		
		String s ="javav";
		//s = s.concat("-python");
		s = s.toUpperCase();
		System.out.println(s);
		s = s.toLowerCase();
		System.out.println(s);
		int len = s.length();
		System.out.println(len);
		
		
		int ind = s.indexOf('v');
		
		System.out.println("index = "+ind);
		ind = s.lastIndexOf('v');
		System.out.println("index = "+ind);
		
		
		char c = s.charAt(2);
		System.out.println(c);
		
				
		
		
	}
}
