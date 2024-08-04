package hellow;

import java.util.Scanner; 
public class Tableprinting {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);  

		System.out.print("Enter an integer: "); 
		int number = sc.nextInt(); //getting input
		System.out.println("table for " + number + ":");

		// Use a for loop to generate and print the multiplication table up to 10
		for (int i = 1; i <= 10; i++) {
			int result = number * i;  
			System.out.println(number + " x " + i + " = " + result); 
		}

		sc.close();  
	}
}
