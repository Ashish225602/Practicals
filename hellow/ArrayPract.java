package hellow;

import java.util.*;
public class ArrayPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2.Find the Largest Element using user input.
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
	
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
			
		}
		
		
		//Find large number
		int maxNum = 0;
		for(int i=0;i<size;i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
				}
			}
		System.out.println(maxNum);
		
		

	}

}
