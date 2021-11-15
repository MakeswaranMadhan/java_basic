package com.Java;

public class Over_Riding extends Overloading_Polymorphism{
	@Override
	public void methods_Overloading() {
		super.methods_Overloading();
	}
	@Override
	public void methods_Overloading(int a, int b) {
		super.methods_Overloading(a, b);
	}
	
	
		

	

	public static void main(String[] args) {
		Over_Riding o = new Over_Riding();
		o.methods_Overloading();
		o.methods_Overloading(20, 40);
		
	}
}
