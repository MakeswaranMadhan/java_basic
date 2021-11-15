package Java_Task;

import java.util.Scanner;

public class Task_Electricity {
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		System.out.println("Enter Units");
		int electricity = s.nextInt();
	
		if (electricity > 1000) {
			System.out.println("Rs. 10 per Unit");
			
		}else if (electricity > 500 && electricity < 1000) {
			System.out.println("Rs. 5 per Unit");
			
		}else if (electricity > 200 && electricity > 500) {
			System.out.println("Rs. 2 per Unit");
		}else {
			System.out.println("Rs. 1 per Unit");
		}
	 
	 
}
}
