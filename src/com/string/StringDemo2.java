package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String str = "Hello this is java and java is java";
		
		String word[] = str.split("java");
		
		for(int i=0;i<word.length;i++) {
			
			System.out.println(word[i]);
		}
		
		String email = "  Samir@gmail.com  ";
		System.out.println(email.length());
		System.out.println(email);
		email = email.trim();
		System.out.println(email);
		System.out.println(email.length());
		
		String name = "royal raj";
		name = name.replace('r', 'R');
		System.out.println(name);
		
		name = name.replace("roayl", "ROYAL");
		System.out.println(name);
		
		String x = String.valueOf('c');
		System.out.println(x);
		String flag = String.valueOf(false);
		//"false"
		System.out.println(flag);
		String age =  String.valueOf(100);
		System.out.println(age);
		
		System.out.println("starts with   "+name.startsWith("R"));
		System.out.println("starts with   "+name.endsWith("R"));
		System.out.println("contains "+name.contains("bomb"));
		
		boolean eq = name.equals("Royal Raj");
		System.out.println(eq);
		
		int ans = name.compareTo("Soyal Raj");
		System.out.println(ans);
				
		
		
		
		
		
		
		
		
		
	}
}
