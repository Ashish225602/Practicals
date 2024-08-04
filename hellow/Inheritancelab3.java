package hellow;

//first Creating a Superclass
class Vehicle1 {
 public void move() {
     System.out.println("Vehicle is moving");
 }
}

//Subclass Car
class Car1 extends Vehicle1 {  //Subclass Bike extends Vehicle
 public void move() {   
     System.out.println("Car is moving");
 }
}


class Bike1 extends Vehicle1 { //Subclass Bike extends Vehicle
 public void move() {
     System.out.println("Bike is moving");
 }
}

//Main class
public class Inheritancelab3 {
 public static void main(String[] args) {
     //Calling move mehod by makuing oblecvt of classes
     Vehicle1 car = new Car1();
     Vehicle1 bike = new Bike1();   

     car.move();
     bike.move();
 }
}
