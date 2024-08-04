package hellow;
import java.util.*;

public class GraterInThree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[3];        // using array for get 3 number

		System.out.println("Enter your 3 number : ");

		for(int i=0;i < arr.length;i++) {  //getting input on each index by loop
			arr [i] = sc.nextInt();
		}

		int grater = arr[0];            // starting with index of zero
		for(int i=0;i<arr.length;i++) {
			if (arr[i]> grater) {       // compareing each value by using for loop
				grater = arr[i];
			}
		}
		
		System.out.println("Grater number is : "+ grater);   //printing grater number
		sc.close();
	}

}
