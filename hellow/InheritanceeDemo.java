package hellow;

import java.io.Serializable;

class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    // creatingg constructor
    public Person() {
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

public class InheritanceeDemo {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();

        person.setFirstName("Ashish");
        person.setLastName("Kashyap");
        person.setAge(21);
        person.setEmail("ashkashyap321");

  
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());
    }
}
