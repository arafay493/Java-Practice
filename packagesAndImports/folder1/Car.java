package packagesAndImports.folder1;

public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    // private long costOfPurchase;
    long costOfPurchase;
    protected int number;

    public Car(){
        
    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car [Color: " + color + ", Model: " + model + ", Fuel Level: " + fuelLevel + ", Cost of Purchase: " + costOfPurchase + "]";
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
    }
}
