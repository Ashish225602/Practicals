package hellow;


import java.util.Scanner;
public class PrimeCubes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		// Input 10 elements into the array
		System.out.println("Enter 10 elements:");
		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
		}
		// Print the cube of prime numbers in the array
		System.out.println("Cubes of prime numbers in the array:");
		for (int num : array) {
			if (isPrime(num)) {
				System.out.println(num + "^3 = " + (num * num * num));
			}
		}
		scanner.close();
	}
	// Method to check if a number is prime
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
