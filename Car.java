public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //? Code Block
    static {
        noOfCarsSold = 0;
        System.out.println("I am in static Block");
    }
    {
        noOfCarsSold++;
        System.out.println("I am in normal Block");
    }

    // //? It is constructor with default values
    // Car(){
    //     noOfWheels = 4;
    //     color = "Blue";
    //     maxSpeed = 250.0f;
    //     currentFuelInLiters = 10.0f;
    //     noOfSeats = 5;
    // }

    //? It is constructor with parametric values
    Car(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 250.0f;
        currentFuelInLiters = 10.0f;
        noOfSeats = 5;
    }

    //? It is constructor without parametric values
    // Car(){
    //     noOfWheels = 4;
    //     this.color = "Black";
    //     maxSpeed = 250.0f;
    //     currentFuelInLiters = 10.0f;
    //     noOfSeats = 5;
    // }
    Car(){
        this("Black");
        currentFuelInLiters = 5.0f;
    }

    // public void Start(){
    //     if(currentFuelInLiters==0){
    //         System.out.println("Car is out of fuel");
    //     }
    //     else if(currentFuelInLiters < 5) {
    //         System.out.println("Car is in reserve mode, please refuel it");
    //     }
    //     else{
    //         System.out.println("Car is starting.... bruhhh!");
    //     }
    // }

    public Car Start(){
        if(currentFuelInLiters==0){
            System.out.println("Car is out of fuel");
        }
        else if(currentFuelInLiters < 5) {
            System.out.println("Car is in reserve mode, please refuel it");
        }
        else{
            System.out.println("Car is starting.... bruhhh!");
        }
        return this;
    }
    
    public void drive(){
        if(currentFuelInLiters==0){
            System.out.println("Car is out of fuel");
        }
        else if(currentFuelInLiters < 5) {
            System.out.println("Car is running low on fuel");
            currentFuelInLiters--;
        }
        else{
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
    }

    // public void addFuel(float fuel){
    //     System.out.println("Car is adding fuel");
    //     currentFuelInLiters += fuel;
    // }

    public void addFuel(float currentFuelInLiters){
        System.out.println("Car is adding fuel");
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    // public static void main(String[] args) {
    //     Car myCar = new Car();
    //     myCar.noOfWheels = 4;
    //     myCar.color = "Red";
    //     myCar.maxSpeed = 200;
    //     myCar.currentFuelInLiters = 10;
    //     myCar.noOfSeats = 5;
    // }
}
