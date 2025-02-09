package problem_03;

public class DemoString {
    public static void checkPerformance(int size) {
        if (size<=100000) {
            java.lang.String str = "";
            long startTime, endTime;
            startTime = System.nanoTime();
            for (int i = 1; i <= size; i++) {
                str+=i;
            }
            endTime = System.nanoTime();
            System.out.println("Time taken by String to perform concatenate operation " + size + " times :" + (endTime - startTime) / 1000 + " microsecond");
            return;
        }
        System.out.println(">1m (Unusable)");
    }
}
