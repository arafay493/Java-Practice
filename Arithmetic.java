
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.AddValueToPreviousEnteredValue();
        System.out.println("Learning Arithmetic Operators");
        
        int num1 = 5;
        int num2 = 3;

        System.out.println("Sum of Numbers = " + (num1 + num2));
        System.out.println("Subtraction of Numbers = " + (num1 - num2));
        System.out.println("Multiplication of Numbers = " + (num1 * num2));
        System.out.println("Division of Numbers = " + (num1 / num2));
        System.out.println("Modules of Numbers = " + (num1 % num2));
        
        double num3 = 5;
        double num4 = 2;

        System.out.println("Sum of Numbers = " + (num3 + num4));
        System.out.println("Subtraction of Numbers = " + (num3 - num4));
        System.out.println("Multiplication of Numbers = " + (num3 * num4));
        System.out.println("Division of Numbers = " + (num3 / num4));
        System.out.println("Modules of Numbers = " + (num3 % num4));

    }
    private void InnerArtmetic() {
        System.out.println("InnerArtmetic");

        int num1 = 10;

        try (Scanner scanner = new Scanner(System.in)) {
            int num2 = scanner.nextInt();
            num1 = num1 + num2;
            // num1 += num2;
            System.out.println("Sum of Numbers = " + num1);
            int num3 = scanner.nextInt();
            num1 = num1 + num3;
            // num1 += num3;
            System.out.println("Sum of Numbers = " + num1);
            int num4 = scanner.nextInt();
            num1 = num1 + num4;
            // num1 += num4;
            System.out.println("Sum of Numbers = " + num1);
            int num5 = scanner.nextInt();
            num1 = num1 + num5;
            // num1 += num5;
            System.out.println("Final Sum of Numbers = " + num1);
        }
    }

    public void AddValueToPreviousEnteredValue(){
        InnerArtmetic();
    }

    void Operations() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


