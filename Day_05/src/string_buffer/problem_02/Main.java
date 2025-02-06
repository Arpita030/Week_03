package string_buffer.problem_02;
public class Main {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        StringBufferPerformance bufferTest = new StringBufferPerformance();
        long durationBuffer = bufferTest.measureStringBufferPerformance(iterations, text);

        StringBuilderPerformance builderTest = new StringBuilderPerformance();
        long durationBuilder = builderTest.measureStringBuilderPerformance(iterations, text);

        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");

        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("StringBuffer is faster.");
        }
    }
}
