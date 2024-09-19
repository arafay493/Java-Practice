public class Arrays {
    public static void main(String[] args) {
        int[] myInts = new int[5];
        int[] myArr = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 , 9, 10};
        // System.out.println(myArr[0]);

        // // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // // Access and print elements of the array
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println("Element at index " + i + ": " + numbers[i]);
        // }

        // System.out.println("Array Searching");
        // int i = 0;
        // while(i < numbers.length){
        //     if(numbers[i] == 30){
        //         System.out.println("Element found at index: " + i);
        //         break;
        //     }
        //     i++;
        // }

        // ? Two Dimentional Arrays

        // Declare a 2D array
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Access elements of a 2D array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
