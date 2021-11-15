package com.Java;

import java.util.Scanner;

public class If_Class {
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		System.out.println("Enter Marks");
		int mark = s.nextInt();
		
		if (mark < 50) {
			System.out.println("fail");
			
		}else if (mark > 60 && mark < 70) {
			System.out.println("Grade A");
			
		}else if (mark > 70 && mark < 80 ) {
			System.out.println("Grade B");
			
		}else {
			System.out.println("Top");
		}
	}
	

}
