package com.Java;

public class Constructor_m {
	public Constructor_m() {
		System.out.println("Hello");
	}
	public Constructor_m(int a) {
		System.out.println(a);
	}
	public Constructor_m(int a, int b) {
		System.out.println(a-b);
	}
	public Constructor_m(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Constructor_m m = new Constructor_m();
		Constructor_m m1 = new Constructor_m(100);
		Constructor_m m2 = new Constructor_m(100, 50);
		Constructor_m m3 = new Constructor_m("madhan");
	}
	
}
