package hellow;

import java.util.Scanner;  

public class ReverseNumber2 {  

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the numbers for reverse: ");  
        int number = sc.nextInt();  
        System.out.print("Reversed number: "); 
        while (number > 0) {  // Use a while loop to reverse the digits of the number
            int digit = number % 10;  // for last digit of the number
            System.out.print(digit);  // Print the extracted digit
            number /= 10;  
        }
        System.out.println(); 
        sc.close(); 
    }
}

