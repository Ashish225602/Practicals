package hellow;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// Write a program that takes a positive integer as input and prints its digits in reverse order.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a= sc.nextInt();
		
		System.out.println("reverse of number is : ");
		for(int i=a;i!=0;i--) {
			System.out.println(i);
		}
		sc.close();

	}

}
