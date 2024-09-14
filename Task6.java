import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 task = new Task6();
        // task.NumberValue();
        // task.NumberValueOddOrEven();
        // task.NumberGreatest();
        // task.LeapYear();
        // task.Grade();
        task.AgeGroup();
    }
    
    // ? Create a Program that determines if a number is positive negitive or zero
    private void PositiveNegativeZeroChecker(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int num = scanner.nextInt();
            if(num > 0 ){
                System.out.println("Entered Number is Positive");
            }
            else if(num < 0){
                System.out.println("Entered Number is Negative");
            }
            else{
                System.out.println("Entered Number is Zero");
            }
            
        }
    }

    public void NumberValue(){
        try {
            PositiveNegativeZeroChecker();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a Program that determines if a number is odd or even
    private void OddOrEvenChecker(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int num = scanner.nextInt();
            if(num % 2 == 0 ){
                System.out.println("Entered Number is Even");
            }
            else{
                System.out.println("Entered Number is Odd");
            }
            
        }
    }

    public void NumberValueOddOrEven(){
        try {
            OddOrEvenChecker();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a Program that determines the gratest of three numbers
    private void FindGreatestOfThree(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter Third Number: ");
            int num3 = scanner.nextInt();
            if (num1 == num2 && num1 == num3) {
                System.out.println("All Numbers are Same");
            } else if (num1 >= num2 && num1 >= num3) {
                if (num1 == num3) {
                    System.out.println("Both num1 and num3 are Greatest");
                } else {
                    System.out.println("Greatest Number is " + num1);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num2 == num3) {
                    System.out.println("Both num2 and num3 are Greatest");
                } else {
                    System.out.println("Greatest Number is " + num2);
                }
            } else {
                System.out.println("Greatest Number is " + num3);
            }            
        }
    }

    public void NumberGreatest(){
        try {
            FindGreatestOfThree();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a Program that determines the given year is leap year or not
    private void LeapYearDetermination(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Year: ");
            int year = scanner.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    System.out.println(year + " is not a Leap Year");
                } else {
                    System.out.println(year + " is a Leap Year");
                }            
            }else{
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
    public void LeapYear(){
        try {
            LeapYearDetermination();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a Program that calculates the grades on the basis of percentage
    private void GradesCalculation(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Percentage: ");
            float percent = scanner.nextFloat();
            if (percent >= 90) {
                System.out.println("Your Grade is A");            
            }
            else if (percent >= 75 && percent < 90) {
                System.out.println("Your Grade is B");            
            }
            else if (percent >= 60 && percent < 75) {
                System.out.println("Your Grade is C");            
            }
            else if (percent >= 60 && percent < 75) {
                System.out.println("Your Grade is C");            
            }
            else if (percent >= 30 && percent < 60) {
                System.out.println("Your Grade is D");            
            }
            else{
                System.out.println("You Grade is F");
            }
        }
    }
    public void Grade(){
        try {
            GradesCalculation();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    // ? Create a Program that categorize a person into different age groups
    private void AgeGroupCategorization(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            if (age < 13) {
                System.out.println("You are a child");            
            }
            else if (age >= 13 && age < 20) {
                System.out.println("You are teenager");            
            }
            else if (age >= 20 && age < 60) {
                System.out.println("You are Adult");            
            }
            else{
                System.out.println("You are a senior");
            }
        }
    }
    public void AgeGroup(){
        try {
            AgeGroupCategorization();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}

