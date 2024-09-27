
import java.util.Arrays;


public class Task8 {
    public static void main(String[] args) {
        Task8 task = new Task8();
        // task.sumAverage();
        // task.occurance();
        // task.maxAndmin();
        // task.sorted();
        // task.deleteElement();
        // task.reverse();
        // task.palindrom();
        task.merge();
    }

    // ? Create a program that calculates the sum and average of an ArrayList
    private void SumAndAverageOfArray(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public void sumAverage(){
        SumAndAverageOfArray();
    }

    // ? Create a program that calculates the occurance of an element in an ArrayList
    private void NoOfOccuranceOfAnElement(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4 , 5, 7};
        int target = 5;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("Occurance of " + target + " is: " + count);
    }

    public void occurance(){
        NoOfOccuranceOfAnElement();
    }

    // ? Create a program that find maximum and minimum element in an ArrayList
    private void MaxAndMinElement(){
        int[] arr = {5, 2, 3, 6, 1, 4, 7, 8, 9};
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }

    public void maxAndmin(){
        MaxAndMinElement();
    }

    // ? Create a program that checks the given array is sorted or not.
    private void SortedArray(){
        // int[] arr = {5, 2, 3, 6, 1, 4, 7, 8, 9};
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //? Arrays Sorting
        // Arrays.sort(arr);
        //? Sorting the array in assending order
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Arrays.sort(arr, Collections.reverseOrder());
        boolean isSorted = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        //? Sorting the array in desending order
        Integer[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        // Arrays.sort(arr2, Collections.reverseOrder());
        boolean isSorted2 = true;
        for(int i = 0; i < arr2.length - 1; i++){
            if(arr2[i] < arr2[i+1]){
                isSorted2 = false;
                break;
            }
        }
        if(isSorted == false){
            System.out.println("Array is not sorted.");
        }
        else{
            System.out.println("Array is sorted.");
        }
        if(isSorted2 == false){
            System.out.println("Array 2 is not sorted.");
        }
        else{
            System.out.println("Array 2 is sorted.");
        }

    }

    public void sorted(){
        SortedArray();
    }

    // ? Create a program that deletes apecific elements in an array.
    private void DeleteElementOFArray(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr.length - 1];
        int index = 0;
        int target = 5;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != target){
                // arr2[index] = arr[i];
                // index++;
                // ? OR
                arr2[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    public void deleteElement(){
        DeleteElementOFArray();
    }

    // ? Create a program that reverse an array.
    private void ReverseAnArray(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr.length];
        int index1 = arr.length - 1;
        int index2 = 0;
        for(int i = index1; i >= 0; i--){
            arr2[index2] = arr[i];
            index2++;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public void reverse(){
        ReverseAnArray();
    }

    // ? Create a program that checks the given array is palindrom or not.
    private void CheckPalindromArray(){
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = {5, 2 , 1 , 2 , 5};
        int[] arr2 = new int[arr1.length];
        int index1 = arr1.length - 1;
        int index2 = 0;
        for(int i = index1; i >= 0; i--){
            arr2[index2] = arr1[i];
            index2++;
        }
        // Use Arrays.equals to compare the contents of the two arrays
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Array is Palindrom.");
        }
        else{
            System.out.println("Array is not Palindrom.");
        }
    }

    public void palindrom(){
        CheckPalindromArray();
    }

    // ? Create a program that merge two sorted array.
    private void MergeSortedArray(){
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] < arr2[index2]){
                arr3[index3] = arr1[index1];
                index1++;
            }
            else{
                arr3[index3] = arr2[index2];
                index2++;
            }
            index3++;
        }
        // Copy remaining elements from arr1 (if any)
        while (index1 < arr1.length) {
            arr3[index3] = arr1[index1];
            index1++;
            index3++;
        }

        // Copy remaining elements from arr2 (if any)
        while (index2 < arr2.length) {
            arr3[index3] = arr2[index2];
            index2++;
            index3++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public void merge(){
        MergeSortedArray();
    }
}
