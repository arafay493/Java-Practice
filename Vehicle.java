public class Vehicle {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;
    Number currentFuelInLitters;
    Number noOfSeats;
    
    // Constructor
    Vehicle(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company, Number currentFuelInLitters, Number noOfSeats) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
        this.currentFuelInLitters = currentFuelInLitters;
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        // return super.toString();
        return "My Car name is " + name;
    }

    public static void main(String[] args) {
        Vehicle swift = new Vehicle(4, 4 , 160 , "Swift" , "SW786" , "Suzuki" , 7 , 6);
        System.out.println(swift);
        System.out.println(swift.toString());
    }
}
