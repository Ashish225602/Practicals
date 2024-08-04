package hellow;
// Person.java
 class Persoon {
    protected String name;
    protected int age;

    public Persoon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Student.java
 class Studeent extends Persoon {
    private String grade;

    public Studeent(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}

// Main.java
public class SuperKeyword {
    public static void main(String[] args) {
    	Studeent student1 = new Studeent("Ashish", 21, "A");
    	Studeent student2 = new Studeent("Sanika", 28, "A");

        student1.displayInfo();
        student2.displayInfo();
    }
}
