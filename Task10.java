import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Task10 task = new Task10();
        // task.MinNumber();        
        // task.CheckNumber();  
        // task.Absolute();
        // task.Category();
        // task.Month();
        task.Calculator();
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

    //! Create a program to calculate the absolute value of a number.
    private static void AbsoluteOfNumbers(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int num = scanner.nextInt();
            //? Method 1
            // num = Math.abs(num);

            //? Method 2
            // if(num < 0){
            //     num = num * -1;
            // }

            //? Method 3
            num = (num < 0) ? num * -1 : num;
            System.out.println("Absolute value of Number is : " + num);
        }
    }

    public void Absolute(){
        AbsoluteOfNumbers();
    }

    //! Create a program that categorize student performance on the value of his marks.
    private static void CategorizeOfStudent(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Score : ");
            int score = scanner.nextInt();
            String category = (score > 80) ? "High" : (score >= 50) ? "Moderate" : "Low";
            System.out.println("Student Category is : " + category);
        }
    }

    public void Category(){
        CategorizeOfStudent();
    }

    //! Create a program that prints the month of the year based on number (1 - 12).
    private static void MonthOfTheYear(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int num = scanner.nextInt();
            String output = switch(num){
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "Invalid Month";
            };
            System.out.println("Student Category is : " + output);
        }
    }

    public void Month(){
        MonthOfTheYear();
    }

    //! Create a program to create a simple calculator.
    private static void SimpleCalculator(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number : ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = scanner.nextInt();
            System.out.print("Enter Operation Performed : ");
            String operation = scanner.next();
            Object output = switch(operation) {
                case "Add" -> num1 + num2;
                case "Subtract" -> num1 - num2;
                case "Multiply" -> num1 * num2;
                case "Divide" -> (num2 == 0) ? "Error! Division by zero" : num1 / num2;
                default -> "Invalid Operation";
            };            
            System.out.println("Result = " + output);
        }
    }

    public void Calculator(){
        SimpleCalculator();
    }
}
