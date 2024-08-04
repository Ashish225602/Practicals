package hellow;
import java.util.Stack;

public class StringStackExample {
    public static void main(String[] args) {
        // Create a stack of strings
        Stack<String> stack = new Stack<>();

        // Push elements "Apple", "Banana", "Cherry" onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Display the top element using the peek operation
        String topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Find and display the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}
