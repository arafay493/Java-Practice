
import java.util.Scanner;

public class Task7 {
 public static void main(String[] args) {
    Task7 task = new Task7();
   //  task.multiplicationTable();
   //  task.SumOddNumbers();
   //  task.factorial();
   //  task.sumOfDigits();
   // task.LCM();
   // task.GCD();
   // task.PrimeNumberCheck();
   task.reverse();
 }

 //? Create a Multiplication table of given number 
 private void multiplicationTable(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
 }

 public void table(){
    multiplicationTable();
 }

 //? Create a Program that calculates a sum of 1 to a specified N numbers 
 private void sumOfOddNumbers(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter Number you want to calculate sum from 1 : ");
        int num = scanner.nextInt();
        int sum = 0;
      //   for (int i = 1; i <= num; i++) {
      //       if(i % 2 != 0){
      //           sum += i;
      //       }
      //   }
        for (int i = 1; i <= num; i += 2) {
           sum += i;
        }
        System.out.println("Sum of Odd Numbers = " + sum);
    }
 }

 public void SumOddNumbers(){
    sumOfOddNumbers();
 }

 //? Create a Program that calculates a sum of 1 to a specified N numbers 
 private void calculatesTheFactorial(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter Number you want to calculate the factorial of : ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int j = 1; j <= num; j++) {
            factorial *= j;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
 }

 public void factorial(){
    calculatesTheFactorial();
 }

 //? Create a Program that calculates a sum of digits of a numbers 
 private void sumOfDigitsOfInteger(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter Number you want to calculate the sum of digits of a Number : ");
        int num = scanner.nextInt();
        num = Math.abs(num);
        int sum = 0;
        //? Alternative solution:
      //   while (num > 0) {
      //      int digit = num % 10;  // Extract the last digit
      //      sum += digit;          // Add the digit to sum
      //      num /= 10;             // Remove the last digit
      //   }

        for (; num > 0;  num /= 10) {
           int digit = num % 10;  // Extract the last digit
           sum += digit;          // Add the digit to sum
        }

        System.out.println("Sum of Digits = " + sum);
    }
 }

 public void sumOfDigits(){
    sumOfDigitsOfInteger();
 }

 //? Create a Program that calculates LCM of two numbers 
 private void LCMofTwoNumbers(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();
        int i = 1;
        while (i > 0) {
           if(i % num1 == 0 && i % num2 == 0) {
               System.out.println("Your LCM is = " + i);
              break;            
           }
           i++;
        }
    }
 }

 public void LCM(){
    LCMofTwoNumbers();
 }

 //? Create a Program that calculates GCD of two numbers 
 private void GCDofTwoNumbers(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();
        int i = 2;
        while (i > 1) {
           if(num1 % i == 0 && num2 % i == 0) {
              System.out.println("Your GCD is = " + i);
              break;
           }
           i++;
        }
    }
 }

 public void GCD(){
    GCDofTwoNumbers();
 }

 //? Create a Program that checks the given number is prime or not.
 private void PrimeNumberCheck(){
   //  try (Scanner scanner = new Scanner(System.in)) {
   //      System.out.print("Enter Number: ");
   //      int num = scanner.nextInt();
   //      if(num <= 1){
   //          System.out.println("Not a Prime Number");
   //      }else if(num > 1){
   //         int i = 2;
   //         while (i > 1) {
   //            if(num != i && num % i == 0) {
   //               System.out.println("Not a Prime Number");
   //               break;
   //             }
   //            else if(num == i && num % i == 0) {
   //               System.out.println("Prime Number");
   //               break;
   //             }
   //            i++;
   //         }
   //      }else{
   //        System.out.println("Not a Prime Number");  // Number is greater than or equal to 1
   //      }
   //  }
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        if(num <= 1){
            System.out.println("Not a Prime Number");
        }else if(num == 2){
          System.out.println("Prime Number");
         }else{
           int i = 2;
           while (i < num) {
              if(num % i == 0) {
                 System.out.println("Not a Prime Number");
                 break;
               }
              i++;
           }
           if(i == num && num % i == 0){
              System.out.println("Prime Number");
           }
        }
    }
 }

 public void PrimeNumber(){
    PrimeNumberCheck();
 }
   
   //? Create a Program that reverse a given numbers 
   private void reverseNumber(){
      try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Enter Number you want reverse : ");
         int num = scanner.nextInt();
         num = Math.abs(num);
         int rev = 0;
         while (num > 0) {
            int digit = num % 10;  // Get the last digit
            rev = rev * 10 + digit; // Append the digit to the reversed number
            num /= 10;              // Remove the last digit from the number
        }

        System.out.println("Reversed Number = " + rev);

      }
   }

   public void reverse(){
      reverseNumber();
   }
}