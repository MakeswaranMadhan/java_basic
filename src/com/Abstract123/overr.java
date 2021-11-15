package com.Abstract123;

public class overr extends Abstract_class1 {

	@Override
	public void negative() {
	System.out.println("guru");
		
	}

	@Override
	public void positive() {
		System.out.println("madhan");
		
	}
	private void positive2() {
		System.out.println("siva");

	}
	public static void main(String[] args) {
		overr o = new overr();
		o.negative();
		o.positive();
		o.positive2();
		
	}

}
