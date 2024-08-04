package hellow;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Create a StringTokenizer to split the string into words
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        // Initialize word count
        int wordCount = 0;
        
        // Count the number of words
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken(); // Move to the next token
            wordCount++;
        }
        
        // Print the number of words
        System.out.println("Number of words: " + wordCount);
        
        // Close the scanner
        scanner.close();
    }
}
