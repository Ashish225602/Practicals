package hellow;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the list
        numbers.add(34);
        numbers.add(7);
        numbers.add(23);
        numbers.add(12);
        numbers.add(5);

        // Print the list before sorting
        System.out.println("ArrayList before sorting:");
        System.out.println(numbers+"\n");

        // Sort the ArrayList
        Collections.sort(numbers);

        // Print the list after sorting
        System.out.println("ArrayList after sorting:");
        System.out.println(numbers);
    }
}
