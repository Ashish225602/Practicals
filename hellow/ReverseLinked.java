package hellow;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinked {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add some integers to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the list before iteration
        System.out.println("LinkedList before reverse iteration:");
        System.out.println(list);

        // Iterate the LinkedList in reverse order
        System.out.println("LinkedList in reverse order:");
        ListIterator<Integer> iterator = list.listIterator(list.size()); // Start from the end
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
