package hellow;

class Persson {
    protected String name; // Makeing name protected for access in subclass
    protected int age;
  
    public Persson(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public void display() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    }
  }
  
  class Student extends Persson {
    private String studentID;
  
    public Student(String name, int age, String studentID) {
      super(name, age); // i am Calling superclass constructor to initialize name and age
      this.studentID = studentID;
    }
  
    public void display() {
      super.display(); // i am here Calling superclass method to display name and age
      System.out.println("Student ID: " + studentID);
    }
  }
  
  public class IherDemo {
    public static void main(String[] args) {
      Student student = new Student("Ashish", 21, "Ash123");
      student.display();
    }
  }
  