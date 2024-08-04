package hellow;

class Calculator {
    public int add(int a, int b) {
      return a + b; // adding two number
    }
  }
  
  class AdvancedCalculator extends Calculator {
    public int add(int a, int b, int c) {
      //Overloading the add method to handle three integers.
      return a + b + c;
    }
  }
  
  public class Lab3Calculater  {
    public static void main (String[] args) {
      Calculator calculator  = new Calculator();
      AdvancedCalculator advancedCalculator = new AdvancedCalculator();
  
      int sumTwo = calculator.add(20, 30);
      int sumThree = advancedCalculator.add(1, 4, 13);
  
      System.out.println("Sum of two numbers using Calculator is : " + sumTwo);
      System.out.println("Sum of three numbers using AdvancedCalculator: " + sumThree);
    }
  }
  