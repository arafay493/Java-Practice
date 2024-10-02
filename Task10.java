import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Task10 task = new Task10();
        // task.MinNumber();        
        task.CheckNumber();        
    }
    
    //! Create a program to find the minimum number of two numbers
    private static void MinOfTwoNumbers(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number : ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = scanner.nextInt();
            int min = (num1 < num2)? num1 : num2;
            System.out.println("Minimum Number is : " + min);
        }
    }

    public void MinNumber(){
        MinOfTwoNumbers();
    }

    //! Create a program to check the given number is odd or even.
    private static void CheckEvenOrOddNumbers(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int num = scanner.nextInt();
            String check = (num % 2 == 0 )? "Even" : "Odd";
            System.out.println("Given Number is : " + check);
        }
    }

    public void CheckNumber(){
        CheckEvenOrOddNumbers();
    }
}
