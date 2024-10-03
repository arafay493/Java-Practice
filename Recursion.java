import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long Factorial = factorial(num);
        System.out.println("Factorial of " + num + " is: " + Factorial);
    }

    //? Method 1 Simple function to calculate factorial
    static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long Factorial = 1;
        for (int i = 2; i <= num; i++) {
            Factorial *= i;
        }
        return Factorial;
    }

    //? Method 2 Recursive function to calculate factorial
    // static long factorial(int num) {
    //     if (num == 0 || num == 1) {
    //         return 1;
    //     }
    //     return num * factorial(num - 1);
    // }
}
