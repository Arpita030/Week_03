package hashmap_and_hashfunction.two_sum_problem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.findTwoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Indices: " + Arrays.toString(TwoSum.findTwoSum(nums2, target2)));
    }
}
