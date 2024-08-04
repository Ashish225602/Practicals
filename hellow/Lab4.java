package hellow;

//Shape.java
 class Shape {
 public void draw() {
     System.out.println("Ashish is Drawing Shape");
 }
}

//Circle.java
 class Circle extends Shape {
 @Override
 public void draw() {
     super.draw(); // Call the draw() method of Shape
     System.out.println("Ashish is Drawing Circle");
 }
}

//Main.java
public class Lab4 {
 public static void main(String[] args) {
	 Circle circle = new Circle();
	 
	// This will call the draw method of Circle
     circle.draw(); 
 }
}
