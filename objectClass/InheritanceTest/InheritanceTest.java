package objectClass.InheritanceTest;

import objectClass.MotorCycle.MotorCycle;
import objectClass.TwoWheeler.TwoWheeler;
import objectClass.vehicle.Vehicle;

public class InheritanceTest {

    public static void main(String[] args) {
        MotorCycle motor = new MotorCycle();
        TwoWheeler twoWheeler = new TwoWheeler();
        Vehicle vehicle = new Vehicle();
        // twoWheeler.commute();
        // vehicle.commute();
        // motor.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
    }
}
