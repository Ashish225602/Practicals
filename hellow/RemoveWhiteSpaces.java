package hellow;
import java.util.StringTokenizer;

public class RemoveWhiteSpaces {
    
    public static String removeSpaces(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringTokenizer token = new StringTokenizer(str);
        StringBuilder result = new StringBuilder();

        while (token.hasMoreTokens()) {
            result.append(token.nextToken());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hii i am Ashish, i am a good Coder.";
        String noSpaces = removeSpaces(input);
        System.out.println("Original string: " + input);
        System.out.println("String without spaces: " + noSpaces);
    }
}
