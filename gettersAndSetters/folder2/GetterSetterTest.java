package gettersAndSetters.folder2;

import gettersAndSetters.folder1.Car;

public class GetterSetterTest {
    public static void main(String[] args) {
        Car swift = new Car("red", "swift" , 6 , 66 , 245);
        // System.out.println(swift.getColor());
        // System.out.println(swift.getModel());
        System.out.printf("%s %s" , swift.getColor() , swift.getModel());
        swift.setColor("black");
        System.out.printf("%s %s" , swift.getColor() , swift.getModel());
        // swift.getColor();
    }
}
