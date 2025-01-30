package hashmap_and_hashfunction.check_for_pair_with_given_sum_in_an_array;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        boolean result = PairSumChecker.hasPairWithSum(arr, target);

        if (result) {
            System.out.println("Pair with given sum exists.");
        } else {
            System.out.println("No such pair found.");
        }
    }
}
