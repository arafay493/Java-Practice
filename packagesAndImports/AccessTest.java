package packagesAndImports;
import packagesAndImports.folder1.Car;
// Accessing Car class from the imported package
public class AccessTest {
    public static void main(String[] args) {
        Car farari = new Car("black", "farari", 2.5, 1500L);
        System.out.println(farari);
    }
    

}
