package objectClass.MotorCycle;

import objectClass.TwoWheeler.TwoWheeler;

public class MotorCycle extends TwoWheeler {

    public double PetrolCapacity;

    //todo: Constructor to set numberOfTires
    public MotorCycle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    // Default constructor (optional)
    public MotorCycle() {
        this.numberOfTires = 4; // Default value for a motorcycle
    }

    public void Start() {
        System.out.println("Motorcycle is starting...");
    }
}
