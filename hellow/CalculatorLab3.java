package hellow;

// Class Calculator with overloaded add methods
class Calculat {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class to demonstrate method overloading
public class CalculatorLab3 {
    public static void main(String[] args) {
    	Calculat calc = new Calculat();
        
        // Demonstrate adding two integers
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of 5 and 10 (int): " + sum1);

        double sum2 = calc.add(5.5, 10.5);
        System.out.println("Sum of 5.5 and 10.5 (double): " + sum2);
        
        int sum3 = calc.add(1, 2, 3);
        System.out.println("Sum of 1, 2, and 3 (int): " + sum3);
    }
}
