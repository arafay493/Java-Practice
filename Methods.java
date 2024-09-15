
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // greetings();
        // int sum = addTwoNumbers();
        // System.out.println("Sum = " + sum);
        int sum = takeParameterAndAddTwoNumbers(20, 5);
        System.out.println("Sum = " + sum);
    }

    public static void greetings() {
        System.out.println("Learning Java Methods");
    }

    public static int addTwoNumbers() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = scanner.nextInt();
            int result = num1 + num2;
            return result;
        }
    }

    public static int takeParameterAndAddTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
