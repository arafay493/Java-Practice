
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter Day : ");
            String day = scanner.next();
            //!Method 3
            day = day.toLowerCase();
            String output = switch(day.toLowerCase()){
                case "monday" -> "Monday";
                case "tuesday" -> "Tuesday";
                case "wednesday" -> "Wednesday";
                case "thursday" -> "Thursday";
                case "friday" -> "Friday";
                case "saturday" -> "Saturday";
                case "sunday" -> "Sunday";
                default -> "Invalid Day";
            };
            System.out.println(output);
            //!Method 2
            // switch (day.toLowerCase()) {
            //     case "monday" -> System.out.println("Monday");
            //     case "tuesday" -> System.out.println("Tuesday");
            //     case "wednesday" -> System.out.println("Wednesday");
            //     case "thursday" -> System.out.println("Thursday");
            //     case "friday" -> System.out.println("Friday");
            //     case "saturday" -> System.out.println("Saturday");
            //     case "sunday" -> System.out.println("Sunday");
            //     default -> System.out.println("Invalid Day");
            // }

            //! Method 1
            // switch (day.toLowerCase()) {
            //     case "monday":
            //         System.out.println("Monday");
            //         break;
            //     case "tuesday":
            //         System.out.println("Tuesday");
            //         break;
            //     case "wednesday":
            //         System.out.println("Wednesday");
            //         break;
            //     case "thursday":
            //         System.out.println("Thursday");
            //         break;
            //     case "friday":
            //         System.out.println("Friday");
            //         break;
            //     case "saturday":
            //         System.out.println("Saturday");
            //         break;
            //     case "sunday":
            //         System.out.println("Sunday");
            //         break;
            //     default:
            //         System.out.println("Invalid Day");
            //         break;
            // }
        }
    }
}
