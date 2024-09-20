public class Task8 {
    public static void main(String[] args) {
        Task8 task = new Task8();
        // task.sumAverage();
        // task.occurance();
        task.maxAndmin();
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
}
