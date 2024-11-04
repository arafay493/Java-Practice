package Challenge14.problem3;

public class ArrayOperations {

    public static class Statistics {

        private int[] numbers;

        //Constructor
        public Statistics(int[] numbers) {
            this.numbers = numbers;
        }

        public double mean() {
            // Implement mean calculation logic here
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }

        public double median() {
            // Implement median calculation logic here
            return 0;
        }
    }
}
