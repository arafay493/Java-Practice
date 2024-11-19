package Challenge15;

public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        double circleArea = circle.calculateArea();
        System.out.println(circleArea);
        Square square = new Square(3 , 2);
        double squareArea = square.calculateArea();
        System.out.println(squareArea);
    }
}
