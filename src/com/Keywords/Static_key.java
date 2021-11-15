package com.Keywords;

public class Static_key {
	 
	static int a = 20;
	
	public static void add() {
	  System.out.println(a);
		
	
	}
	 static {
		 System.out.println("static block");
	 }
	public static void main(String[] args) {
		// no need to create object 
		add();
	}

}
