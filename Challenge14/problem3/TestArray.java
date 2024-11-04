package Challenge14.problem3;

public class TestArray {

    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations();
        ArrayOperations.Statistics stats = new ArrayOperations.Statistics(new int[]{1, 2, 3, 4, 5});
        System.out.println(stats.mean());
    }
}
