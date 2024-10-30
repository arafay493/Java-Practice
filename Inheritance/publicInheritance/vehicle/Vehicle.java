package Inheritance.publicInheritance.vehicle;

public class Vehicle {

    public int numberOfTires;

    public void commute() {
        System.out.printf("I am going from Place A to Place B using %d tires \n", numberOfTires);
    }

    public void startEngine() {
        System.out.println("Starting engine...");
    }
}
