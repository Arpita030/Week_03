package string_buffer.problem_02;
public class StringBuilderPerformance {
    public long measureStringBuilderPerformance(int iterations, String text) {
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        return endTimeBuilder - startTimeBuilder;
    }
}
