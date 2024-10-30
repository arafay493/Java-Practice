package Inheritance.InheritanceTest;

import Inheritance.publicInheritance.MotorCycle.MotorCycle;
import Inheritance.publicInheritance.TwoWheeler.TwoWheeler;
import Inheritance.publicInheritance.vehicle.Vehicle;

public class InheritanceTest {

    public static void main(String[] args) {
        MotorCycle motor = new MotorCycle();
        TwoWheeler twoWheeler = new TwoWheeler();
        Vehicle vehicle = new Vehicle();
        twoWheeler.commute();
        vehicle.commute();
        motor.commute();
    }
}
