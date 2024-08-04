package hellow; 

class Animal {

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
// Define the Dog class that extends Animal
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog always Bark");
    }
}
// Main class to demonstrate inheritance and method overriding
public class InheritanceDemoo {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.makeSound();  // Call the makeSound method
    }
}
