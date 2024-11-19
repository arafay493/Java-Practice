package Challenge15;

public class Square extends Shape {

    private int x, y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter and setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double calculateArea() {
        return x * y;
    }

    // @Override
    // public void calculateArea() {
    //     int area = x * y;
    //     System.out.println("Area of the square: " + area);
    // }
}
