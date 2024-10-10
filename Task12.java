
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Task12 task = new Task12();
        // task.Concatenate();
        // task.AreaOfCircumference();
        // task.Dice();
        task.NumberGuessingGame();
    }
    
    //? Take two strings, concatenate them and convert the result to uppercase.
    private void Concatenate(){
        String str1 = "Hello";
        String str2 = "World";
        // String concatenation = str1.concat(str2).toUpperCase();
        // System.out.println("Concatenated String: " + concatenation);

        //todo: OR!
        System.out.printf("%S %S" , str1 , str2);
    }

    //? Calculate the area and Circumference of the circle of given radius with Math.PI.
    private void AreaOfCircumference(){
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }

    //? Simulate a dice roll using Math.random and display the outcome (1 to 6).
    private void Dice(){
        // int diceRoll = (int) (Math.random() * 6) + 1;
        //todo: OR
        int diceRoll = (int) Math.ceil((Math.random() * 6));
        System.out.println("Dice Roll: " + diceRoll);
    }

    //? Create a number guessing game where the program selects a random number, and the user has to guess it.
    private void NumberGuessingGame(){
        try (Scanner scanner = new Scanner(System.in)) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            System.out.print("Guess a number between 1 and 10: ");
            int guess = scanner.nextInt();
            if(randomNumber == guess){
                System.out.println("Congratulations! You guessed the correct number.");
            }else{
                System.out.println("Sorry, the correct number was " + randomNumber + ".");
            }
        }
    }
}
