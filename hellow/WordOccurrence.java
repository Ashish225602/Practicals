package hellow;

public class WordOccurrence {

    public static int countOccurrences(String str, String word) {
    	// lest check first string or word is empty or not
        if (str == null || word == null || str.isEmpty() || word.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;
        
        //whilw loop for finds occurance
        while ((index = str.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "This is a test string. This string is for testing.";
        String word = "is";

        int occurrences = countOccurrences(input, word);
        System.out.println("The word \"" + word + "\" occurs " + occurrences + " times in the given string.");
    }
}
