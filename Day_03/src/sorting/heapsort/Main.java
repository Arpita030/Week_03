package sorting.heapsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] salaryDemands = {55000, 75000, 48000, 92000, 60000, 51000};

        System.out.println("Original salary demands: " + Arrays.toString(salaryDemands));

        HeapSort.heapSort(salaryDemands);

        System.out.println("Sorted salary demands: " + Arrays.toString(salaryDemands));
    }
}
