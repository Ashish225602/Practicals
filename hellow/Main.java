package hellow;


class Vehicle {

	void move() {
		System.out.println("The vehicle is moving.");
	}
}


class Car extends Vehicle {
	void move() {
		System.out.println("The car is moving.");
	}
}


class Bike extends Vehicle {
	void move() {
		System.out.println("The bike is moving.");
	}
}

public class Main {
	public static void main(String[] args) {
	
		Vehicle myCar = new Car();
		Vehicle myBike = new Bike();
		myCar.move(); 
		myBike.move(); 
	}
}