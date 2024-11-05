package abstraction;

public abstract class Vehicle {
    private int noOfTires;
    
    //Constructor
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    //getters and setters
    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    
    //Method
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
