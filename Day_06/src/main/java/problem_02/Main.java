package problem_02;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};

        System.out.println("Bubble Sort Performance:");
        for (int size : sizes) {
            BubbleSort.checkPerformance(size);
        }
        System.out.println();

        System.out.println("Merge Sort Performance:");
        for (int size : sizes) {
            MergeSort.checkPerformance(size);
        }
        System.out.println();

        System.out.println("Quick Sort Performance:");
        for (int size : sizes) {
            QuickSort.checkPerformance(size);
        }


    }
}
