package problem_03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringPerformanceTest {

    @Test
    void testStringPerformance() {
        long startTime = System.nanoTime();
        DemoString.checkPerformance(1000);
        DemoString.checkPerformance(10000);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        assertTrue(elapsedTime < 5000, "String concatenation took too long!");
    }

    @Test
    void testStringBufferPerformance() {
        long startTime = System.nanoTime();
        DemoStringBuffer.checkPerformance(1000);
        DemoStringBuffer.checkPerformance(10000);
        DemoStringBuffer.checkPerformance(1000000);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        assertTrue(elapsedTime < 5000, "StringBuffer concatenation took too long!");
    }

    @Test
    void testStringBuilderPerformance() {
        long startTime = System.nanoTime();
        DemoStringBuilder.checkPerformance(1000);
        DemoStringBuilder.checkPerformance(10000);
        DemoStringBuilder.checkPerformance(1000000);
        long endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        assertTrue(elapsedTime < 5000, "StringBuilder concatenation took too long!");
    }
}
