package hellow;

public class Calculator3 {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add a variable number of integers
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator3 cal = new Calculator3();

        // Testing the add methods
        System.out.println("Add two integers: " + cal.add(1, 2)); 
        System.out.println("Add two doubles: " + cal.add(1.5, 2.5)); 
        System.out.println("Add three integers: " + cal.add(1, 2, 3)); 
        System.out.println("Add variable number of integers: " + cal.add(1, 2, 3, 4)); 
    }
}
