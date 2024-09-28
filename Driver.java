public class Driver {
    static int minAgeForDriving = 18;

    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedForDriving(){
        return this.age >= minAgeForDriving;
    }

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

        Driver driver = new Driver();
        driver.name = "John Doe";
        driver.dateOfLicense = "123456789";
        System.out.println(minAgeForDriving);
    }
}
