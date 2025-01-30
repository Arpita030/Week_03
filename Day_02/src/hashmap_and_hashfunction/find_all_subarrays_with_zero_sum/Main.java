package hashmap_and_hashfunction.find_all_subarrays_with_zero_sum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        List<int[]> subarrays = ZeroSumSubarraysFinder.findZeroSumSubarrays(arr);

        System.out.println("Zero Sum Subarrays (start, end indices):");
        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}
