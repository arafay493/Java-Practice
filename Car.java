public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

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
