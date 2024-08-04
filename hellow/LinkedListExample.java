package hellow;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the beginning of the list
        list.addFirst("First Element");

        // Add elements to the end of the list
        list.addLast("Last Element");

        // Add elements at a specific position (e.g., middle)
        // For this example, we'll add the element at index 1
        list.add(1, "Middle Element");

        // Print the entire LinkedList
        System.out.println("LinkedList contents:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
