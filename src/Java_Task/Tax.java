package Java_Task;

import java.util.Scanner;

public class Tax {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Tax Slab");
		int salary = sc.nextInt();

		if (salary > 1000000) {
			System.out.println("Tax 30%");
			
			
		}else if (salary > 500000 && salary < 1000000) {
			System.out.println("Tax 20%");
			
		}else {
			System.out.println("Tax 5%");
		}
		
		System.out.println("if Housing loan EMI 15 % & Educational EMI 10%");
		int Hemi = sc.nextInt();
			
		if (Hemi > 1000000) {
			System.out.println("Tax 20 %");
		}else if (Hemi > 500000 && Hemi < 1000000) {
			System.out.println("Tax 5%");
			
		}else {
			System.out.println("Tax free");
		}
		
	}

	
	
}
