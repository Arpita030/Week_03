package problem_05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class FibonacciPerformanceTest {

    @Test
    void testRecursiveFibonacciPerformance() {
        assertDoesNotThrow(() -> RecursiveFibonacci.checkPerformance(30));
    }

    @Test
    void testIterativeFibonacciPerformance() {
        assertDoesNotThrow(() -> IterativeFibonacci.checkPerformance(50));
    }
}
