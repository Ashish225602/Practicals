package hellow;

import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the list
        list.add("First");
        list.add("Second");
        list.add("Third");

        // Print the list before replacement
        System.out.println("ArrayList before replacement:");
        System.out.println(list);

        // Define the new element to replace the second element
        String newElement = "New Second Element";

        // Replace the second element (index 1) with the new element
        if (list.size() > 1) { // Ensure there are at least 2 elements
            list.set(1, newElement);
        } else {
            System.out.println("The list does not have a second element.");
        }

        // Print the list after replacement
        System.out.println("ArrayList after replacement:");
        System.out.println(list);
    }
}
