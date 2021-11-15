package com.Interface1;

public class Interface_Final implements Interface11, Interface12{

	@Override
	public void bike() {
		// TODO Auto-generated method stub
		System.out.println("cod");
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("bmw");
	}

	@Override
	public void emi() {
		// TODO Auto-generated method stub
		System.out.println("Kavin");
		
	}

	@Override
	public void cash() {
		// TODO Auto-generated method stub
		System.out.println("mani");
		
	}
	
	public static void main(String[] args) {
		Interface_Final i = new Interface_Final();
		i.bike();
		i.car();
		i.emi();
		i.cash();
		
		
	}

}
