package hellow;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordSplitter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Create a StringTokenizer to split the string into words
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        // Print each word on a new line
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        
        // Close the scanner
        scanner.close();
    }
}
