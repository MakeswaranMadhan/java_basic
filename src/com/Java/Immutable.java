package com.Java;

public class Immutable {
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Java");
		
		StringBuffer s1 = new StringBuffer("Java");
			System.out.println(System.identityHashCode(s));
			System.out.println(System.identityHashCode(s1));
			
			s.append(s1);
			System.out.println(s);
			
			System.out.println(System.identityHashCode(s));
			
			
	
	}

}
