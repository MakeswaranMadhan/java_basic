package Java_Task;

import java.util.Scanner;

public class Parcel_Transport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("If not Urgent");
		int weight = sc.nextInt();

		if (weight <= 5) {
			System.out.println("post");

		} else if (weight > 5) {
			System.out.println("lorry");

		} else {
			System.out.println("train");
		}

		System.out.println("If not Urgent");
		int distance = sc.nextInt();

		if (distance <= 250) {
			System.out.println("post");

		} else {
			System.out.println("Train");
		}

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Urgent");
		int weight1 = sc1.nextInt();
		
		if (weight1 < 100) {
			System.out.println("van");
			
		}else {
			System.out.println("Train");
		}
		
		System.out.println("Urgent");
		int distance1 = sc1.nextInt();
		
		if (distance1 < 50) {
			System.out.println("van");
			
		}else {
			System.out.println("Train");
		}

	}
}
