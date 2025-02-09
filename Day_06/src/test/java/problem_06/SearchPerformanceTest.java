package problem_06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchPerformanceTest {

    @Test
    void testArraySearchPerformance() {
        long startTime = System.nanoTime();
        DemoArray.checkPerformance(10000);
        DemoArray.checkPerformance(100000);
        DemoArray.checkPerformance(1000000);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1000000; // Convert to ms
        assertTrue(elapsedTime < 10000, "Array search took too long!");
    }

    @Test
    void testHashSetSearchPerformance() {
        long startTime = System.nanoTime();
        DemoHashSet.checkPerformance(10000);
        DemoHashSet.checkPerformance(100000);
        DemoHashSet.checkPerformance(1000000);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1000000;
        assertTrue(elapsedTime < 5000, "HashSet search took too long!");
    }

    @Test
    void testTreeSetSearchPerformance() {
        long startTime = System.nanoTime();
        DemoTreeSet.checkPerformance(10000);
        DemoTreeSet.checkPerformance(100000);
        DemoTreeSet.checkPerformance(1000000);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1000000;
        assertTrue(elapsedTime < 7000, "TreeSet search took too long!");
    }
}
