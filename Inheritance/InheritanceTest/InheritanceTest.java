package Inheritance.InheritanceTest;

//todo: Public
// import Inheritance.publicInheritance.MotorCycle.MotorCycle;
// import Inheritance.publicInheritance.TwoWheeler.TwoWheeler;
// import Inheritance.publicInheritance.vehicle.Vehicle;

//todo: Priate
// import Inheritance.privateInheritance.MotorCycle.MotorCycle;
// import Inheritance.privateInheritance.TwoWheeler.TwoWheeler;
// import Inheritance.privateInheritance.vehicle.Vehicle;

//todo: Default
import Inheritance.defaultInheritance.MotorCycle.MotorCycle;
import Inheritance.defaultInheritance.TwoWheeler.TwoWheeler;
import Inheritance.defaultInheritance.vehicle.Vehicle;

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
