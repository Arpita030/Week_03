package problem_01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchPerformanceTest {

    @Test
    void testBinarySearchPerformance() {
        long startTime = System.nanoTime();
        BinarySearch.checkPerformance(1000, 999);
        BinarySearch.checkPerformance(10000, 9999);
        BinarySearch.checkPerformance(1000000, 999999);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1000000;
        assertTrue(elapsedTime < 5000, "Binary Search took too long!");
    }

    @Test
    void testLinearSearchPerformance() {
        long startTime = System.nanoTime();
        LinearSearch.checkPerformance(1000, 999);
        LinearSearch.checkPerformance(10000, 9999);
        LinearSearch.checkPerformance(1000000, 999999);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1000000;
        assertTrue(elapsedTime < 10000, "Linear Search took too long!");
    }
}
