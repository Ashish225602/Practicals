package hellow;

interface A {
 default void foo() {
     System.out.println("A's foo");
 }
}


interface B extends A {
 @Override
 default void foo() {
     System.out.println("B's foo");
 }
}


interface C extends A {
 @Override
 default void foo() {
     System.out.println("C's foo");
 }
}


class D implements B, C {

 @Override
 public void foo() {
     // Resolving the ambiguity
     System.out.println("D's own foo");

     // Optionally, you can call specific super-interface methods
     B.super.foo(); // Calls B's foo
     C.super.foo(); // Calls C's foo
 }
}

public class DiamondProblemDemo {
 public static void main(String[] args) {
     D obj = new D();
     obj.foo(); // D's implementation of foo() is called
 }
}
