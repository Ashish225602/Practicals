package hellow;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String str = "Hello, World! I am Ashish Kashyap";

        // Create a StringTokenizer with the default delimiter (whitespace)
        StringTokenizer tokenizer = new StringTokenizer(str);

        System.out.println("Tokens with default delimiter (whitespace):");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        // Create a StringTokenizer with a custom delimiter
        String customStr = "Hello,World!This,is,a,test,string.";
        StringTokenizer customTokenizer = new StringTokenizer(customStr, ",!");

        System.out.println("\nTokens with custom delimiters (, and !):");
        while (customTokenizer.hasMoreTokens()) {
            System.out.println(customTokenizer.nextToken());
        }
    }
}
