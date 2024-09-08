import java.util.Scanner;

// public class Task3 {
//     public static void main(String[] args) {
//         try(Scanner scanner = new Scanner(System.in)){
//             System.out.println("Enter Your Name : ");
//             String name = scanner.nextLine();
//             System.out.println("Welcome " + name + " to KG Coding");
//             scanner.close();
//         }
//     }
// }



// Program to add Two numbers
public class Task3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter First Number : ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = scanner.nextInt();
            int num3 = num1 + num2;
            System.out.println("Sum : " + num3);
            scanner.close();
        }
    }
}
