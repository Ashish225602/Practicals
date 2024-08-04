package hellow;
import java.util.Scanner;

public class multiplyNum {

	public static void main(String[] args) {
		//Write a program that takes an integer as input and prints its multiplication table up to 10.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a= sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println("multipication tof "+a+" is :"+i*a);
		}
		
		sc.close();

	}

}
