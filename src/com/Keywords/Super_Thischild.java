package com.Keywords;

public class Super_Thischild extends Super_This {
	
	int a = 2610;
	
	private void madhan() {
		System.out.println(super.a);
		System.out.println(this.a);
	

	}
	private void birth() {
		super.add();
		this.madhan();

	}
public static void main(String[] args) {
	Super_Thischild s = new Super_Thischild();
	s.madhan();
	s.birth();
}
}
