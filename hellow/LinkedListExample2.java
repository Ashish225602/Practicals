package hellow;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Print all elements of the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
