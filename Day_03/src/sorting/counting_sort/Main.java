package sorting.counting_sort;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 14, 13, 17, 16, 11, 10, 14, 12, 18};

        System.out.println("Original student ages: " + Arrays.toString(studentAges));

        CountingSort.countingSort(studentAges, 10, 18);

        System.out.println("Sorted student ages: " + Arrays.toString(studentAges));
    }
}
