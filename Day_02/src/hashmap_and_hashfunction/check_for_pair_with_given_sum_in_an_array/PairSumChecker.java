package hashmap_and_hashfunction.check_for_pair_with_given_sum_in_an_array;

import java.util.*;

public class PairSumChecker {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
