package hellow;

import java.util.*;

public class ArrayQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//even numbers, displays them, and calculates their sum.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
	    
		//taking input from user
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
			
		}
		
		//Print Even
		for(int i=0;i<size;i++) {
			if(arr[i]%2 == 0) {
				System.out.println("Even is : "+ arr[i]);
				
			}
			
		}
		//calculates their sum.
		int sum = 0;
		int temp = 0;
		for(int i=0;i<size;i++) {
			
			if(arr[i]%2 == 0) {
				 sum = arr[i] + temp;
			}	
		}
		System.out.println("Sum is : "+sum);
		
		

	}

}
