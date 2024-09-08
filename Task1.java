/**
 * Task1
 */
// public class Task1 {

//     public static void main(String[] args) {
//         System.out.print("Subscribe");
//     }
// }


// This Pattern
// *
// **
// ***
// ****
// *****
// public class Task1 {

//     public static void main(String[] args) {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println();
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//         }
//     }
// }



/**
 * Task1
 */
// This Pattern
// *****
// ****
// ***
// **
// *
// public class Task1 {

//     public static void main(String[] args) {
//         for (int i = 5; i >= 1; i--) {
//             System.out.println();
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//         }
//     }
// }


// This Pattern
//      *
//     **
//    ***
//   ****
//  *****
public class Task1 {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
