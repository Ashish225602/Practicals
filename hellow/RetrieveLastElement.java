package hellow;

import java.util.LinkedList;

public class RetrieveLastElement {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add some integers to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Print the list before retrieving the last element
        System.out.println("LinkedList:");
        System.out.println(list);

        // Retrieve the last element without removing it
        Integer lastElement = list.getLast();

        // Print the last element
        System.out.println("Last element of the LinkedList:");
        System.out.println(lastElement);
    }
}
