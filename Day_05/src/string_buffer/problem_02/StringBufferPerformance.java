package string_buffer.problem_02;

public class StringBufferPerformance {
    public long measureStringBufferPerformance(int iterations, String text) {
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        return endTimeBuffer - startTimeBuffer;
    }
}
