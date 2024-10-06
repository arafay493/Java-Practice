
import java.util.Scanner;


public class Task11 {
    public static void main(String[] args) {
        Task11 task = new Task11();
        // task.Checker();
        // task.Guess();
        // task.Table();
        // task.PrimeNumber();
        // task.MaxNumber();
        // task.Occurance();
        // task.ExitOnExitText();
        task.SumOfEveryPositiveNumber();
    }

    //! Create a program to using do While loop to find password checker until a valid password is entered.
    private static void PasswordChecker() {
        // try (Scanner scanner = new Scanner(System.in)) {
        //     String passwords[] = {"1234", "123", "24", "45", "55", "66", "4567", "67"};
        //     boolean correct = false;
        //     String password;
        //     int attempts = 0;
    
        //     while (attempts < passwords.length) {
        //         System.out.print("Enter Password: ");
        //         password = scanner.next();
    
        //         for (String validPassword : passwords) {
        //             if (password.equals(validPassword)) {
        //                 System.out.println("Password is correct");
        //                 correct = true;
        //                 break;
        //             }
        //         }
    
        //         if (correct) {
        //             break;
        //         } else {
        //             System.out.println("Password is incorrect. Try again.");
        //             attempts++;
        //         }
        //     }
    
        //     if (!correct) {
        //         System.out.println("Maximum attempts reached. Exiting.");
        //     }
        // }
        
        try (Scanner scanner = new Scanner(System.in)) {
            String passwords[] = {"1234", "123", "24", "45", "55", "66", "4567", "67"};
            boolean correct = false;
            do {
                System.out.println("Enter Password: ");
                String password = scanner.next();

                int i = 0;
                do {
                    if (password.equals(passwords[i])) {
                        correct = true;
                        break;
                    }
                    i++;
                } while (i < passwords.length);
                
                if (correct) {
                    System.out.println("Password is correct!");
                    break;
                } else {
                    System.out.println("Password is incorrect. Try again.");
                }
            } while (true);
        }
    }
    

    public void Checker(){
        PasswordChecker();
    }

    //! Create a program to using do While loop for number guessing game.
    private static void GuessNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            int numbers[] = {45, 62 , 73, 90, 100, 44, 88};
            boolean correct = false;
            do {
                System.out.println("Enter Number: ");
                int number = scanner.nextInt();

                int i = 0;
                do {
                    if (number == numbers[i]) {
                        correct = true;
                        break;
                    }
                    i++;
                } while (i < numbers.length);
                
                if (correct) {
                    System.out.println("Number Guess Correct!");
                    break;
                } else {
                    System.out.println("Wrong Number.");
                }
            } while (true);
        }
    }
    

    public void Guess(){
        GuessNumber();
    }

    //! Create a program to using do While loop to print multiplication table.
    private static void MultiplicationTable() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number to print multiplication table ");
            int num = scanner.nextInt();
            System.out.print("Enter Number of times to print multiplication table ");
            int times = scanner.nextInt();
            int i = 1;
            do {
                System.out.println(num + " x " + i + " = " + num * i);
                i++;
            } while (i <= times);
        }
    }
    

    public void Table(){
        MultiplicationTable();
    }

    //! Create a program to check the number is prime or not.
    private static void CheckPrimeNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number ");
            int num = scanner.nextInt();
            boolean isPrime = true;
            int i = 2;
            switch (num) {
                case 0, 1 -> isPrime = false;
                case 2 -> isPrime = true;
                default -> {
                    do {
                        if(num % i == 0){
                            isPrime = false;
                        }
                        i++;
                    } while (i < num);
                }
            }
            String result  = isPrime? "Prime number" : "Not a prime number";
            System.out.println(result);
        }
    }

    public void PrimeNumber(){
        CheckPrimeNumber();
    }

    //! Create a program to find the max number with For Each in an integer array.
    private static void FindMaxNumber() {
        int num[] = {1, 5, 9, 2, 3, 7, 8};
        int maxNumber = num[0];
    
        for (int i : num) {
            if (i > maxNumber) { // Compare the value directly
                maxNumber = i;
            }
        }
    
        System.out.println("Max number: " + maxNumber);
    }
    
    public void MaxNumber(){
        FindMaxNumber();
    }

    //! Create a program to find the occurance of a specific number with For Each in an integer array.
    private static void OccuranceOfNumber() {
        int num[] = {1, 5, 9 , 2, 3, 7, 8 , 9 , 5 ,8};
        int sampleNumber  = 8;
        int occurance = 0;
    
        for (int i : num) {
            if (sampleNumber == num[i]) { // Compare the value directly
                occurance++;
            }
        }
    
        System.out.println();
        System.out.println("Occurance of a specific number: " + occurance);
    }
    
    public void Occurance(){
        OccuranceOfNumber();
    }

    //! Create a program to ReadInputInLoopAndExitOnExitText.
    private static void ReadInputInLoopAndExitOnExitText() {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Enter Text: ");
                String text = scanner.nextLine();
                if (text.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting...");
                    break;
                }
            } while (true);
        }
    }
    
    public void ExitOnExitText(){
        ReadInputInLoopAndExitOnExitText();
    }

    //! Create a program that create a sum of every positive number and skiping a negative number.
    private static void SumOfEveryPositiveNumberSkipingNegative() {
        int i = 0;
        int sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Enter Number: ");
                int num = scanner.nextInt();
                if (num < 0) {
                    continue;
                }
                sum += num;
                i++;
            } while (i < 3);
        }
        System.out.println("Sum of every positive number (excluding negative numbers): " + sum);
    }
    
    public void SumOfEveryPositiveNumber(){
        SumOfEveryPositiveNumberSkipingNegative();
    }
}
