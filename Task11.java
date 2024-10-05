
import java.util.Scanner;


public class Task11 {
    public static void main(String[] args) {
        Task11 task = new Task11();
        // task.Checker();
        task.Guess();
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
}
