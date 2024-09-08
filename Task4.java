
import java.util.Scanner;

//? Create a program to swap two numbers
// public class Task4 {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 5;
//         int num3 = num2;
//         num2 = num1;
//         num1 = num3;
//         System.out.println("After Swapping:");
//         System.out.println("num1 " + num1);
//         System.out.println("num2 " + num2);
//     }
// }



//? Create a program to swap two numbers with scanner
public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = scanner.nextInt();
            int num3 = num2;
            num2 = num1;
            num1 = num3;
            System.out.println("After Swapping:");
            System.out.println("num1 " + num1);
            System.out.println("num2 " + num2);
            scanner.close();
        }
    }
}
