package hashmap_and_hashfunction.longest_consecutive;

public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        int longestSequence = LongestConsecutiveSequence.findLongestConsecutive(arr);

        System.out.println("Length of the Longest Consecutive Sequence: " + longestSequence);
    }
}
