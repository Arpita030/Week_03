package binary_search.problem_04;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 7, 9, 10};
        int target = 10;

        int first = BinarySearchOccurrences.findFirstOccurrence(arr, target);
        int last = BinarySearchOccurrences.findLastOccurrence(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
