package problem_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;

public class SortingPerformanceTest {

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }

    @Test
    public void testBubbleSortPerformance() {
        int[] arr = generateRandomArray(10000);
        long startTime = System.nanoTime();
        BubbleSort.checkPerformance(arr.length);
        long endTime = System.nanoTime();

        Arrays.sort(arr);
        assertTrue(isSorted(arr), "Bubble Sort failed to sort the array.");

        System.out.println("Bubble Sort Time: " + (endTime - startTime) / 1000000 + " ms");
    }

    @Test
    public void testMergeSortPerformance() {
        int[] arr = generateRandomArray(100000);
        long startTime = System.nanoTime();
        MergeSort.checkPerformance(arr.length);
        long endTime = System.nanoTime();

        Arrays.sort(arr);
        assertTrue(isSorted(arr), "Merge Sort failed to sort the array.");

        System.out.println("Merge Sort Time: " + (endTime - startTime) / 1000000 + " ms");
    }

    @Test
    public void testQuickSortPerformance() {
        int[] arr = generateRandomArray(100000);
        long startTime = System.nanoTime();
        QuickSort.checkPerformance(arr.length);
        long endTime = System.nanoTime();

        Arrays.sort(arr);
        assertTrue(isSorted(arr), "Quick Sort failed to sort the array.");

        System.out.println("Quick Sort Time: " + (endTime - startTime) / 1000000 + " ms");
    }
}
