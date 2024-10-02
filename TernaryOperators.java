
import java.util.Scanner;

class TernaryOperator{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number 1: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter Number 2");
            int number2 = scanner.nextInt();
            int max = (number1 > number2) ? number1 : number2;
            System.out.println("Max " + max);
        }
    }
}