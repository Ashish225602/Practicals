package hellow;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "i am Ashish Kashyap it is my sentence.";

        // using replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("replace: " + replacedStr );

        // using contains
        boolean containsStr = str.contains("test");
        System.out.println("contains: " + containsStr + "\n");

        // implementing replaceAll
        String replaceAllStr = str.replaceAll("is", "was");
        System.out.println("replaceAll: " + replaceAllStr + "\n");

        // implementing indexOf
        int indexOfStr = str.indexOf("test");
        System.out.println("indexOf: " + indexOfStr + "\n");

        // implementing substring
        String substringStr = str.substring(7, 12);
        System.out.println("substring: " + substringStr + "\n");

        // implementing equals
        boolean equalsStr = str.equals("Hello, World! This is a test string.");
        System.out.println("equals: " + equalsStr + "\n");

        // implementing lastIndexOf
        int lastIndexOfStr = str.lastIndexOf("is");
        System.out.println("lastIndexOf: " + lastIndexOfStr + "\n");

        // startsWith
        boolean startsWithStr = str.startsWith("Hello");
        System.out.println("startsWith: " + startsWithStr + "\n");

        // implementing endsWith
        boolean endsWithStr = str.endsWith("string.");
        System.out.println("endsWith: " + endsWithStr + "\n");

        // implementing equalsIgnoreCase
        boolean equalsIgnoreCaseStr = str.equalsIgnoreCase("hello, world! this is a test string.");
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCaseStr + "\n");

        // implementing toLowerCase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("toLowerCase: " + lowerCaseStr + "\n");

        // implementing toUpperCase
        String upperCaseStr = str.toUpperCase();
        System.out.println("toUpperCase: " + upperCaseStr + "\n");

        // implementing isEmpty
        boolean isEmptyStr = str.isEmpty();
        System.out.println("isEmpty: " + isEmptyStr + "\n");

        // implementing length
        int lengthStr = str.length();
        System.out.println("length: " + lengthStr + "\n");

        // implementing split
        String[] splitStr = str.split(" ");
        System.out.print("split: ");
        for (String s : splitStr) {
            System.out.print(s + " | " + "\n");
        }
    }
}
