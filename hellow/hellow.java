/* -----age hellow;

//Calculator.java
public class hellow {

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
     Calculator calculator = new Calculator();

     // Testing the overloaded methods
     System.out.println("Adding two integers (10, 5): " + calculator.add(10, 5));
//System.out.println("Adding two doubles (10.5, 5.3): " + calculator.add(10.5, 5.3));
    // System.out.println("Adding three integers (10, 5, 3): " + calculator.add(10, 5, 3));
    // System.out.println("Adding variable number of integers (1, 2, 3, 4, 5): " + calculator.add(1, 2, 3, 4, 5));
 }
}

*/
