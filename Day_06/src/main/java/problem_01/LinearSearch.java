package problem_01;

public class LinearSearch {
    public static void checkPerformance(int size, int target) {
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = i;
        }

        double startTime = System.nanoTime();
        for (int n : data) {
            if (n == target) {
                break;
            }
        }
        double endTime = System.nanoTime();

        System.out.println("Time taken for linear search in an array of size " + size +
                ": " + ((endTime - startTime) / 1000) + " microsecond");
    }
}
