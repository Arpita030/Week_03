package problem_02;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class QuickSort {
    private static final int INSERTION_SORT_THRESHOLD = 100;

    public static void checkPerformance(int size) {
        int[] arr = generateReverseSortedArray(size);
        ForkJoinPool pool = ForkJoinPool.commonPool();

        long startTime = System.nanoTime();
        pool.invoke(new QuickSortTask(arr, 0, arr.length - 1));
        long endTime = System.nanoTime();

        System.out.println("Quick Sort (" + size + "): " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static class QuickSortTask extends RecursiveAction {
        private final int[] arr;
        private final int low, high;

        public QuickSortTask(int[] arr, int low, int high) {
            this.arr = arr;
            this.low = low;
            this.high = high;
        }

        @Override
        protected void compute() {
            if (high - low < INSERTION_SORT_THRESHOLD) {
                insertionSort(arr, low, high);
                return;
            }

            int[] pivots = dualPivotPartition(arr, low, high);
            int leftPivot = pivots[0], rightPivot = pivots[1];

            QuickSortTask leftTask = new QuickSortTask(arr, low, leftPivot - 1);
            QuickSortTask rightTask = new QuickSortTask(arr, rightPivot + 1, high);

            leftTask.fork();
            rightTask.compute();
            leftTask.join();

            insertionSort(arr, leftPivot + 1, rightPivot - 1);
        }
    }

    private static int[] dualPivotPartition(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        swap(arr, mid, low);
        if (arr[low] > arr[high]) swap(arr, low, high);

        int pivot1 = arr[low], pivot2 = arr[high];
        int i = low + 1, j = low + 1, k = high - 1;

        while (j <= k) {
            if (arr[j] < pivot1) swap(arr, i++, j++);
            else if (arr[j] > pivot2) swap(arr, j, k--);
            else j++;
        }

        swap(arr, low, --i);
        swap(arr, high, ++k);

        return new int[]{i, k};
    }

    private static void insertionSort(int[] arr, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= low && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int[] generateReverseSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0, k = size; i < size; i++) {
            arr[i] = k--;
        }
        return arr;
    }
}
