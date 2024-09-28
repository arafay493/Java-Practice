public class Driver {
    // public static void main(String[] args) {
    //     Car car = new Car();
    //     car.addFuel(6);
    //     car.drive();
    //     car.drive();
    //     car.drive();
    //     System.out.println(car.getCurrentFuelLevel());
    // }
    public static void main(String[] args) {
        Car swift = new Car();
        swift.addFuel(6);
        // swift.Start();
        // swift.drive();
        // Car startedCar = swift.Start();
        // startedCar.drive();
        swift.Start().drive();
    }
}
