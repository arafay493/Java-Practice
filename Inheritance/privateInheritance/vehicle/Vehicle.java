package Inheritance.privateInheritance.vehicle;

public class Vehicle {

    private int numberOfTires;

    // setter and getter
    public int getNumberOfTires() {
        return numberOfTires;
    }
    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
    public void commute() {
        System.out.printf("I am going from Place A to Place B using %d tires \n", numberOfTires);
    }

    public void startEngine() {
        System.out.println("Starting engine...");
    }
}
