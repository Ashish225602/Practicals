package hellow;
import java.util.Scanner;
public class temp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if (age == 18) {
			System.out.println("make your voter id you can vote");
		}
		else if (age<18) {
			System.out.println("You are not eligible for voating");
		}else if (age>18) {
			System.out.println("You are eligible for voating");
		}else {
			System.out.println("inter valid value");
		}
		
		sc.close();
	}
}