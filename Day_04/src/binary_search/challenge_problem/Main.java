package binary_search.challenge_problem;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("First missing positive: " + LinearSearch.findFirstMissingPositive(nums));

        int[] sortedNums = {1, 2, 3, 4, 5, 6};
        int target = 4;
        System.out.println("Index of target: " + BinarySearch.binarySearch(sortedNums, target));
    }
}
