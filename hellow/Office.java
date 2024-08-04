package hellow;

//Abstract superclass Employee
abstract class Employees {
 // Abstract method to calculate pay that is implemented by subclasses
 public abstract void calculatePay();
}

class SalariedEmployee extends Employees {
 public void calculatePay() {
     System.out.println("Calculating salary for a salaried employee. !");
 }
}

//Subclass HourlyEmployee
class HourlyEmployee extends Employees {
 public void calculatePay() {
     System.out.println("Calculating pay for an hourly employee !");   
 }
}

public class Office {
 public static void main(String[] args) {
     Employees salariedEmp = new SalariedEmployee();
     Employees hourlyEmp = new HourlyEmployee();

     salariedEmp.calculatePay(); //calling methods
     hourlyEmp.calculatePay();
 }
}
