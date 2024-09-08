
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // try (Scanner input = new Scanner(System.in)) {
        //     System.out.print("Enter a name: ");
        //     String name = input.nextLine();
        //     System.out.println("Good Morning " + name);
        // }

        // try (Scanner input = new Scanner(System.in)) {
        //     System.out.print("Enter a number: ");
        //     int number = input.nextInt();
        //     System.out.println("Square of the number: " + number * number);
        // }

        // try (Scanner input = new Scanner(System.in)) {
        //     System.out.print("Enter a number: ");
        //     double number = input.nextDouble();
        //     System.out.println("Square root of the number: " + Math.sqrt(number));
        // }

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("Number must be positive");
            }
            System.out.println("Square of the number: " + number * number);
            // int num = scanner.nextInt();
            // if (num % 2 == 0) {
            //     System.out.println("The number is even.");
            // } else {
            //     System.out.println("The number is odd.");
            // }
        }
    }    
}
