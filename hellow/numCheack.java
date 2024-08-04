package hellow;

import java.util.Scanner;

public class numCheack {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("its a negative number");
		}
		else if (num > 0) {
			System.out.println("its a positive number");
		}
		else {
			System.out.println("Its zero");
		}
		sc.close();
		
	}
}
