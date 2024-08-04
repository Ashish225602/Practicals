package hellow;
import java.io.Serializable;

class Cars implements Serializable {
    private String make;
    private String model;
    private int year;
    private String color;

    public Cars() {}

    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }
    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
}

public class tataMoters { // main class
    public static void main(String[] args) {
        // Create an object of Car
        Cars car = new Cars();

        // Seting thepropeerties of car
        car.setMake("Tata");
        car.setModel("Nexon");
        car.setYear(2024);
        car.setColor("Blue");

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Color: " + car.getColor());
    }
}
