package packagesAndImports.folder1;
public class AccessTest {
    public static void main(String[] args) {

        //? ****************************
            // Create an instance of the Car class
            Car car = new Car();
            car.color = "red";
            car.model = "Toyota";
    
            // Print car details using the toString() method
            System.out.println(car);
            // Create another instance with parameters
            Car car1 = new Car("blue", "swift", 2.5, 1500L);
    
            // Print car details using the toString() method
            System.out.println(car1);
    }
}
