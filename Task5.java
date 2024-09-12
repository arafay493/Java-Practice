
import static java.lang.Math.pow;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Task5 task = new Task5();
        // task.Operations();
        // task.Product();
        // task.Perimeter();
        // task.SimpleInterest();
        task.CompoundInterest();
    }
    
    // ? Program wich takes two numbers and perform arthimetic operations(+,-,*,/)
    private void ArithmeticOperations(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = scanner.nextInt();
            
            int sum = num1 + num2;
            int multiplication = num1 * num2;
            int subtraction = num1 - num2;
            float division;
            // Check for division by zero
            if (num2 != 0) {
                division = (float) num1 / num2; // Use float division
                System.out.println("Division : " + division);
            } else {
                System.out.println("Division : Cannot divide by zero");
            }
            System.out.println("Addition : " + sum);
            System.out.println("Multiplication : " + multiplication);
            System.out.println("Subtraction : " + subtraction);
        }
    }

    public void Operations(){
        try {
            ArithmeticOperations();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a program to calculate product of two floating numbers.
    private void ProductOfFloatingNumbers(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            float num1 = scanner.nextFloat();
            System.out.print("Enter Second Number: ");
            float num2 = scanner.nextFloat();
            float product = num1 * num2;
            System.out.println("Product of Floating Numbers : " + product);
        }
    }

    public void Product(){
        try {
            ProductOfFloatingNumbers();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a program to calculate Perimeter of a Rectangle.
    private void PerimeterOfRectangle(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Height: ");
            float height = scanner.nextFloat();
            System.out.print("Enter Width: ");
            float width = scanner.nextFloat();
            float Perimeter = height * 2 + width * 2;
            System.out.println("Perimeter of Rectangle is : " + Perimeter);
        }
    }

    public void Perimeter(){
        try {
            PerimeterOfRectangle();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a program to calculate Area of a Triangle.
    private void AreaOfATriangle(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Height: ");
            float height = scanner.nextFloat();
            System.out.print("Enter Width: ");
            float width = scanner.nextFloat();
            float Area = (height * width)/2;
            System.out.println("Area of a Triangle is : " + Area);
        }
    }

    public void Area(){
        try {
            AreaOfATriangle();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a program to calculate Simple Interest
    private void CalculateSimpleInterest(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Amount: ");
            float PrincipleAmount = scanner.nextFloat();
            System.out.print("Enter Rate Percentage: ");
            float Rate = scanner.nextFloat();
            System.out.print("Enter Years of Time Period: ");
            float TimePeriod = scanner.nextFloat();
            float Interest = (PrincipleAmount * Rate * TimePeriod)/100;
            System.out.println("Amount of Interest is : " + Interest);
        }
    }

    public void SimpleInterest(){
        try {
            CalculateSimpleInterest();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a program to calculate Compound Interest
    private void CalculateCompoundInterest(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Amount: ");
            float PrincipleAmount = scanner.nextFloat();
            System.out.print("Enter Rate Percentage: ");
            float Rate = scanner.nextFloat();
            System.out.print("Enter Years of Time Period: ");
            float TimePeriod = scanner.nextFloat();
            double Amount = PrincipleAmount * pow((1 + Rate/100), TimePeriod);
            double CompoundInterest = Amount - PrincipleAmount;

            System.out.println("Amount of Interest is : " + CompoundInterest);
        }
    }

    public void CompoundInterest(){
        try {
            CalculateCompoundInterest();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
