package com.string;

public class StringTask {

	public static void main(String[] args) {
		
		String name ="hello this is my city";
		int count=0;
		for (int i=0;i<name.length();i++) {
			
			char c = name.charAt(i);
			if(c==' ') {
				count++;
			}
		}
		
		System.out.println("count = "+(count+1));
	}
}
