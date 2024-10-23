package gettersAndSetters.folder1;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    // private long costOfPurchase;
    private long costOfPurchase;
    private int number;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getModel(){
        return model;
    }


    public Car(String color, String model, double fuelLevel, long costOfPurchase, int number) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
        this.number = number;
    }
}
