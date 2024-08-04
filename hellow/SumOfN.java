package hellow;

import java.util.Scanner; 

public class SumOfN {  

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter the number (N): "); 
        int N = sc.nextInt(); 
        
        int sum = 0;  // Initializeing  a variable sum to store the sum of entered numbers
        
        // Useing a for loop to read N numbers
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");  
            int number = sc.nextInt();  // Read the number and store it in the variable number
            sum += number;  // Add the entered number to the sum
        }
        
        System.out.println("The sum of the entered numbers is: " + sum);  // Output 
        
        sc.close(); 
    }
}
