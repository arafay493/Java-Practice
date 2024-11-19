package Interface;

public class TestAbstraction {

    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle(4);
        Car car = new Car();
        car.start();
        car.makeStartSound();
        car.getSetGo();
    }

}
