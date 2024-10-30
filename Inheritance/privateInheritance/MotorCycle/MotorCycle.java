package Inheritance.privateInheritance.MotorCycle;

import Inheritance.privateInheritance.TwoWheeler.TwoWheeler;

public class MotorCycle extends TwoWheeler {

    public double PetrolCapacity;

    //todo: Constructor to set numberOfTires
    public MotorCycle(int numberOfTires) {
        setNumberOfTires(numberOfTires);
    }

    // Default constructor (optional)
    public MotorCycle() {
        setNumberOfTires(4);
    }

    public void Start() {
        System.out.println("Motorcycle is starting...");
    }
}
