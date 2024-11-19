package Challenge15;

public class Circle extends Shape {

    private final double radius;
    // private double radius;
    double pi;

    public Circle(double radius) {
        this.pi = 3.14159;
        this.radius = radius;
    }

    //getter for the radius
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }
}
